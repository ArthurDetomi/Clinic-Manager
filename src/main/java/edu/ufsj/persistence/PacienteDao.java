package edu.ufsj.persistence;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.ufsj.model.Paciente;

public class PacienteDao extends AbstractGenericDao implements GenericDao<Paciente> {

	private PacienteDao() {

	}

	private static PacienteDao instance;

	public static PacienteDao getInstance() {
		if (instance == null) {
			instance = new PacienteDao();
		}
		return instance;
	}

	@Override
	public boolean create(Paciente paciente) {
		final String CREATE_NEW_PACIENTE_QUERY = ""
				+ "INSERT INTO  pacientes (nome, cpf, telefone, cidade, estado, numero, editado) VALUES (?, ?, ?, ?, ?, ?, ?)";

		int result = 0;

		try (Connection connection = getConnection()) {
			PreparedStatement createNewUsuarioStatement = connection.prepareStatement(CREATE_NEW_PACIENTE_QUERY);

			createNewUsuarioStatement.setString(1, paciente.getNome());
			createNewUsuarioStatement.setString(2, paciente.getCpf());
			createNewUsuarioStatement.setString(3, paciente.getTelefone());
			createNewUsuarioStatement.setString(4, paciente.getCidade());
			createNewUsuarioStatement.setString(5, paciente.getEstado());
			createNewUsuarioStatement.setString(6, paciente.getNumero());
			createNewUsuarioStatement.setTimestamp(7, Timestamp.from(Instant.now()));

			result = createNewUsuarioStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return result == 1;
	}

	public boolean existsByCpf(String cpf) {
		final String FIND_BY_CPF_QUERY = "SELECT id FROM pacientes WHERE cpf = ?";

		Integer id = null;

		try (Connection connection = getConnection()) {
			PreparedStatement findByCPFStatement = connection.prepareStatement(FIND_BY_CPF_QUERY);

			findByCPFStatement.setString(1, cpf);

			ResultSet resultSet = findByCPFStatement.executeQuery();

			if (resultSet.next()) {
				id = resultSet.getInt("id");
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return id != null;
	}

	private Paciente extractPacienteByResultSet(ResultSet resultSet) throws SQLException {
		Integer id = resultSet.getInt("id");
		String nome = resultSet.getString("nome");
		String telefone = resultSet.getString("telefone");
		String cidade = resultSet.getString("cidade");
		String estado = resultSet.getString("estado");
		String numero = resultSet.getString("numero");
		Timestamp editadoTimestamp = resultSet.getTimestamp("editado");
		Timestamp cadastradoTimestamp = resultSet.getTimestamp("cadastrado");
		String cpf = resultSet.getString("cpf");

		LocalDateTime cadastrado = (cadastradoTimestamp == null) ? null : cadastradoTimestamp.toLocalDateTime();
		LocalDateTime editado = (editadoTimestamp == null) ? null : editadoTimestamp.toLocalDateTime();

		return new Paciente(id, cpf, nome, telefone, cidade, estado, numero, cadastrado, editado);
	}

	public List<Paciente> findAll() {
		final String FIND_ALL_QUERY = "SELECT * FROM pacientes ORDER BY nome ASC";

		List<Paciente> pacientes = new ArrayList<>();

		try (Connection connection = getConnection()) {
			PreparedStatement findAllStatement = connection.prepareStatement(FIND_ALL_QUERY);

			ResultSet resultSet = findAllStatement.executeQuery();

			while (resultSet.next()) {
				Paciente paciente = extractPacienteByResultSet(resultSet);

				pacientes.add(paciente);
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return pacientes;
	}

	@Override
	public boolean delete(Integer id) {
		final String DELETE_QUERY = "DELETE FROM pacientes WHERE id = ?";

		int result = 0;

		try (Connection connection = getConnection()) {
			PreparedStatement deleteStatement = connection.prepareStatement(DELETE_QUERY);

			deleteStatement.setInt(1, id);

			result = deleteStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return result == 1;
	}

	public List<Paciente> findByNomeOrCpf(String pacienteSearchText) {
		final String FIND_BY_QUERY = "" //
				+ "SELECT   " //
				+ "    *  " //
				+ "FROM  " //
				+ "    pacientes  " //
				+ "WHERE  " //
				+ "    nome LIKE ? OR cpf LIKE ?  " //
				+ "ORDER BY nome";

		String stringSearch = pacienteSearchText + "%";

		List<Paciente> pacientes = new ArrayList<>();

		try (Connection connection = getConnection()) {
			PreparedStatement findByQueryStatement = connection.prepareStatement(FIND_BY_QUERY);

			findByQueryStatement.setString(1, stringSearch);
			findByQueryStatement.setString(2, stringSearch);

			ResultSet resultSet = findByQueryStatement.executeQuery();

			while (resultSet.next()) {
				pacientes.add(extractPacienteByResultSet(resultSet));
			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return pacientes;
	}
}
