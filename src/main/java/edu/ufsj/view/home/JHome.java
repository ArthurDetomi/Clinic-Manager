/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ufsj.view.home;

import edu.ufsj.controller.MedicoController;
import edu.ufsj.controller.PacienteController;
import edu.ufsj.controller.UsuarioController;
import edu.ufsj.model.Medico;
import edu.ufsj.model.Paciente;
import edu.ufsj.model.TipoUsuario;
import edu.ufsj.model.Usuario;
import edu.ufsj.service.UserSession;
import edu.ufsj.view.table.MedicoTableModel;
import edu.ufsj.view.table.PacienteTableModel;
import edu.ufsj.view.dialogs.JDialogCadastroConsulta;
import edu.ufsj.view.dialogs.JDialogCadastroMedico;
import edu.ufsj.view.dialogs.JDialogCadastroPaciente;
import edu.ufsj.view.dialogs.JDialogCadastroAtendente;
import edu.ufsj.view.table.UsuarioTableModel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.List;

/**
 *
 * @author arthurd
 */
public class JHome extends javax.swing.JFrame {

    private PacienteController pacienteController = new PacienteController();
    private MedicoController medicoController = new MedicoController();
    private UsuarioController usuarioController = new UsuarioController();

    /**
     * Creates new form JHome
     */
    public JHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jListarAgendaButton = new javax.swing.JButton();
        jListarAtendimentosButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaListagens = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jAplicarFiltroBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jListaAtendentesButton = new javax.swing.JButton();
        jListaMedicosButton = new javax.swing.JButton();
        jExcluirRowButton = new javax.swing.JButton();
        jSearchTextField = new javax.swing.JTextField();
        jBuscaDadosButton = new javax.swing.JButton();
        jListaPacientesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jCadastroConsulta = new javax.swing.JMenuItem();
        jCadastroPaciente = new javax.swing.JMenuItem();
        jCadastroMedico = new javax.swing.JMenuItem();
        jCadastroAtendente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1360, 400));
        setMinimumSize(new java.awt.Dimension(1360, 400));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListarAgendaButton.setText("Agenda");
        jListarAgendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarAgendaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jListarAgendaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, -1));

        jListarAtendimentosButton.setText("Lista de Atendimento");
        getContentPane().add(jListarAtendimentosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        jTabelaListagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabelaListagens);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 830, 550));

        jLabel2.setText("FILTROS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jAplicarFiltroBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jAplicarFiltroBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, -1));

        jLabel3.setText("LISTAR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jListaAtendentesButton.setText("Atendentes");
        jListaAtendentesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaAtendentesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jListaAtendentesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, -1));

        jListaMedicosButton.setText("Médicos");
        jListaMedicosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaMedicosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jListaMedicosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, -1));

        jExcluirRowButton.setText("Excluir");
        jExcluirRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirRowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jExcluirRowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 120, 50));

        jSearchTextField.setToolTipText("Pesquise por nome ou CPF");
        getContentPane().add(jSearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 510, 50));

        jBuscaDadosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/lupa.png"))); // NOI18N
        getContentPane().add(jBuscaDadosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 70, 50));

        jListaPacientesButton.setText("Pacientes");
        jListaPacientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaPacientesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jListaPacientesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/background-home.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1360, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1360, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1360, 768));

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jCadastroConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/consulta.png"))); // NOI18N
        jCadastroConsulta.setText("Consulta Médica");
        jCadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroConsultaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadastroConsulta);

        jCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/patient.png"))); // NOI18N
        jCadastroPaciente.setText("Paciente");
        jCadastroPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCadastroPacienteMouseClicked(evt);
            }
        });
        jCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroPacienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadastroPaciente);

        jCadastroMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/doctor.png"))); // NOI18N
        jCadastroMedico.setText("Médico");
        jCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadastroMedico);

        jCadastroAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/atendente.png"))); // NOI18N
        jCadastroAtendente.setText("Atendente");
        jCadastroAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroAtendenteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadastroAtendente);

        jMenuBar1.add(jMenuCadastro);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCadastroPacienteActionPerformed
		if (!UserSession.getInstance().isUsuarioLogadoPodeCadastrarPaciente()) {
			JOptionPane.showMessageDialog(null, "Somente usuário atendente e admin podem cadastrar pacientes",
					"Erro permissão", JOptionPane.ERROR_MESSAGE);
			return;
		}

       JDialogCadastroPaciente jDialogCadastroPaciente = new JDialogCadastroPaciente();
       jDialogCadastroPaciente.abrirDialog();
    }                                                 

    private void jListarAgendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarAgendaButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jListarAgendaButtonActionPerformed
    
    private void jCadastroPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastroPacienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCadastroPacienteMouseClicked


    private void atualizarTabelaComListaDePacientes() {
        List<Paciente> pacientes = pacienteController.listarPacientes();

        PacienteTableModel pacienteTableModel = new PacienteTableModel(pacientes);

        jTabelaListagens.setModel(pacienteTableModel);
    }

    private void atualizarTabelaComListaDeAtendentes() {
        List<Usuario> usuariosAtendentes = usuarioController.listarAtendentes();

        UsuarioTableModel usuarioTableModel = new UsuarioTableModel(usuariosAtendentes);

        jTabelaListagens.setModel(usuarioTableModel);
    }

    private void atualizarTabelaComListaDeMedicos() {
        List<Medico> medicos = medicoController.listarMedicos();

        MedicoTableModel medicoTableModel = new MedicoTableModel(medicos);

        jTabelaListagens.setModel(medicoTableModel);
    }

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroActionPerformed

	private void jCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCadastroMedicoActionPerformed
		if (!UserSession.getInstance().isUsuarioLogadoPodeCadastrarMedico()) {
			JOptionPane.showMessageDialog(null, "Somente usuário admin e atendente podem cadastrar médicos",
					"Permissão Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

        JDialogCadastroMedico jDialogCadastroMedico = new JDialogCadastroMedico();
		jDialogCadastroMedico.abrirDialog();
	}// GEN-LAST:event_jCadastroMedicoActionPerformed

	private void jCadastroAtendenteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCadastroAtendenteActionPerformed
		if (!UserSession.getInstance().isUsuarioLogadoPodeCadastrarAtendente()) {
			JOptionPane.showMessageDialog(null, "Somente usuário admin pode cadastrar atendentes", "Permissão Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

        JDialogCadastroAtendente jDialogCadastroAtendente = new JDialogCadastroAtendente();
        jDialogCadastroAtendente.abrirDialog();
    }                                                  

	private void jCadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCadastroConsultaActionPerformed
		if (!UserSession.getInstance().isUsuarioPodeCadastrarConsultaMedica()) {
			JOptionPane.showMessageDialog(null, "Somente usuário admin e atendente podem registrar consultas",
					"Permissão Error", JOptionPane.ERROR_MESSAGE);
            return;
		}
        JDialogCadastroConsulta jDialogCadastroConsulta = new JDialogCadastroConsulta();
        jDialogCadastroConsulta.abrirDialog();
    }                                                 

    private void jListaPacientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaPacientesButtonActionPerformed
        atualizarTabelaComListaDePacientes();
    }//GEN-LAST:event_jListaPacientesButtonActionPerformed

    private void jListaAtendentesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaAtendentesButtonActionPerformed
        atualizarTabelaComListaDeAtendentes();
    }//GEN-LAST:event_jListaAtendentesButtonActionPerformed

    private void jListaMedicosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaMedicosButtonActionPerformed
        atualizarTabelaComListaDeMedicos();
    }//GEN-LAST:event_jListaMedicosButtonActionPerformed

	private void jExcluirRowButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jExcluirRowButtonActionPerformed
		int selectedRowIndex = jTabelaListagens.getSelectedRow();

		if (selectedRowIndex < 0) {
			JOptionPane.showMessageDialog(null, "Nenhum dado foi selecionado para exclusão", "Exclusão error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		AbstractTableModel currentTableModel = (AbstractTableModel) jTabelaListagens.getModel();

		boolean deletionSuccess;

		if (currentTableModel instanceof UsuarioTableModel) {
			UsuarioTableModel usuarioTableModel = (UsuarioTableModel) jTabelaListagens.getModel();

			Integer idUsuario = usuarioTableModel.getEntityId(selectedRowIndex);

			TipoUsuario tipoUsuario = usuarioTableModel.getTipoUsuario(selectedRowIndex);

			if (!UserSession.getInstance().isUsuarioPodeExcluirByTipo(tipoUsuario)) {
				JOptionPane.showMessageDialog(null, "Você não possui permissão para excluir esse usuário",
						"Permissão Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			deletionSuccess = usuarioController.excluirUsuario(idUsuario);

			String cpf = usuarioTableModel.getValueAt(selectedRowIndex, 1).toString();

			if (deletionSuccess) {
				JOptionPane.showMessageDialog(null, "Usuario com cpf " + cpf + " foi deletado com sucesso");
				atualizarTabelaComListaDeAtendentes();
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao excluir usuário com cpf " + cpf, "Exclusão Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (currentTableModel instanceof MedicoTableModel) {
			MedicoTableModel medicoTableModel = (MedicoTableModel) jTabelaListagens.getModel();

			Integer idUsuario = medicoTableModel.getEntityId(selectedRowIndex);

			TipoUsuario tipoUsuario = medicoTableModel.getTipoUsuario(selectedRowIndex);

			if (!UserSession.getInstance().isUsuarioPodeExcluirByTipo(tipoUsuario)) {
				JOptionPane.showMessageDialog(null, "Você não possui permissão para excluir esse usuário",
						"Permissão Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			deletionSuccess = medicoController.excluirMedico(idUsuario);

			String cpf = medicoTableModel.getValueAt(selectedRowIndex, 1).toString();

			if (deletionSuccess) {
				JOptionPane.showMessageDialog(null, "Usuario com cpf " + cpf + " foi deletado com sucesso");
				atualizarTabelaComListaDeMedicos();
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao excluir usuário com cpf " + cpf, "Exclusão Error",
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (currentTableModel instanceof PacienteTableModel) {
			PacienteTableModel pacienteTableModel = (PacienteTableModel) jTabelaListagens.getModel();

			Integer idPaciente = pacienteTableModel.getEntityId(selectedRowIndex);

			if (!UserSession.getInstance().isUsuarioPodeExcluirPaciente()) {
				JOptionPane.showMessageDialog(null, "Você não possui permissão para excluir esse paciente",
						"Permissão Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			deletionSuccess = pacienteController.excluirPaciente(idPaciente);

			String cpf = pacienteTableModel.getValueAt(selectedRowIndex, 1).toString();

			if (deletionSuccess) {
				JOptionPane.showMessageDialog(null, "Paciente com cpf " + cpf + " foi deletado com sucesso");
				atualizarTabelaComListaDePacientes();
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao excluir paciente com cpf " + cpf, "Exclusão Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
    }                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHome().setVisible(true);
            }
        });
    }

	public void abrirDialog() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jAplicarFiltroBox;
    private javax.swing.JButton jBuscaDadosButton;
    private javax.swing.JMenuItem jCadastroAtendente;
    private javax.swing.JMenuItem jCadastroConsulta;
    private javax.swing.JMenuItem jCadastroMedico;
    private javax.swing.JMenuItem jCadastroPaciente;
    private javax.swing.JButton jExcluirRowButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jListaAtendentesButton;
    private javax.swing.JButton jListaMedicosButton;
    private javax.swing.JButton jListaPacientesButton;
    private javax.swing.JButton jListarAgendaButton;
    private javax.swing.JButton jListarAtendimentosButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchTextField;
    private javax.swing.JTable jTabelaListagens;
    // End of variables declaration//GEN-END:variables
}
