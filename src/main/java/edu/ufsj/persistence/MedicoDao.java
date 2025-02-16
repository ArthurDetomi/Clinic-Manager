package edu.ufsj.persistence;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.ufsj.model.Medico;
import edu.ufsj.model.TipoUsuario;

public class MedicoDao extends AbstractGenericDao implements GenericDao<Medico> {

	private MedicoDao() {

	}

	private static MedicoDao instance;

	public static MedicoDao getInstance() {
		if (instance == null) {
			instance = new MedicoDao();
		}
		return instance;
	}

	@Override
	public boolean create(Medico medico) {
		final String CREATE_MEDICO_QUERY = "INSERT INTO medicos (id, crm) VALUES (?, ?)";

		int result = 0;

		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(CREATE_MEDICO_QUERY);
			preparedStatement.setInt(1, medico.getId());
			preparedStatement.setString(2, medico.getCrm());
			result = preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return result == 1;
	}

	private Medico extractMedicoFromResultSet(ResultSet resultSet) throws SQLException {
		Integer id = resultSet.getInt("id");

		TipoUsuario tipoUsuario = TipoUsuario.getFromTipo(resultSet.getString("tipo_usuario"));

		Timestamp editadoTimestamp = resultSet.getTimestamp("editado");
		Timestamp cadastradoTimestamp = resultSet.getTimestamp("cadastrado");
		String cpf = resultSet.getString("cpf");
		String telefone = resultSet.getString("telefone");
		String email = resultSet.getString("email");
		String login = resultSet.getString("login");
		String password = resultSet.getString("password");
		String nome = resultSet.getString("nome");
		String crm = resultSet.getString("crm");

		LocalDateTime cadastrado = (cadastradoTimestamp == null) ? null : cadastradoTimestamp.toLocalDateTime();
		LocalDateTime editado = (editadoTimestamp == null) ? null : editadoTimestamp.toLocalDateTime();

		return new Medico(id, tipoUsuario, cpf, telefone, email, login, password, nome, crm, cadastrado, editado);
	}

	public List<Medico> findAll() {
		final String FIND_ALL_QUERY = "SELECT u.*, m.crm "
				+ "FROM usuarios as u INNER JOIN medicos as m on u.id = m.id  ORDER BY crm ASC";

		List<Medico> medicos = new ArrayList<>();

		try (Connection connection = getConnection()) {
			PreparedStatement findAllStatement = connection.prepareStatement(FIND_ALL_QUERY);
			ResultSet resultSet = findAllStatement.executeQuery();

			while (resultSet.next()) {
				medicos.add(extractMedicoFromResultSet(resultSet));
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return medicos;
	}

	@Override
	public boolean delete(Integer idMedico) {
		final String DELETE_QUERY = "DELETE FROM medicos WHERE id = ?";

		int result = 0;

		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
			preparedStatement.setInt(1, idMedico);
			result = preparedStatement.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return result == 1;
	}

	public List<Medico> findByNomeOrCpfOrCrm(String medicoSearchText) {
		final String FIND_BY_QUERY = "" //
				+ "SELECT  " //
				+ "    u.*, m.crm " //
				+ "FROM " //
				+ "    usuarios AS u " //
				+ "        INNER JOIN " //
				+ "    medicos AS m ON u.id = m.id " //
				+ "WHERE " //
				+ "    u.nome LIKE ? OR u.cpf LIKE ? " //
				+ "        OR m.crm LIKE ?"
				+ "    ORDER BY u.nome ASC";

		List<Medico> medicos = new ArrayList<>();

		String stringSearchText = medicoSearchText + "%";

		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_QUERY);
			preparedStatement.setString(1, stringSearchText);
			preparedStatement.setString(2, stringSearchText);
			preparedStatement.setString(3, stringSearchText);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				medicos.add(extractMedicoFromResultSet(resultSet));
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return medicos;
	}
}
