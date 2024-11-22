/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ufsj.view.dialogs;

import java.util.List;

import javax.swing.*;

import edu.ufsj.controller.MedicoController;
import edu.ufsj.controller.PacienteController;
import edu.ufsj.model.Medico;
import edu.ufsj.model.Paciente;
import edu.ufsj.view.table.MedicoTableModel;
import edu.ufsj.view.table.PacienteTableModel;

/**
 *
 * @author arthurdetomi
 */
public class JDialogCadastroConsulta extends JDialogGeneric {

    private MedicoController medicoController = new MedicoController();
    private PacienteController pacienteController = new PacienteController();

    private Paciente pacienteSelected;
    private Medico medicoSelected;

    /**
     * Creates new form JCadastroConsultaDialog
     */
    public JDialogCadastroConsulta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDataTextField = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jHoraTextField = new javax.swing.JFormattedTextField();
        jCadastroConsultaButton = new javax.swing.JButton();
        jMedicoSearchTextField = new javax.swing.JTextField();
        jBuscaMedicoButton = new javax.swing.JButton();
        jPacientSearchTextField = new javax.swing.JTextField();
        jBuscaPacienteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPacienteTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jMedicoTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Consulta Medica");

        jLabel2.setText("Paciente");

        jLabel3.setText("Medico");

        jDataTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));

        jLabel4.setText("Data");

        jLabel5.setText("Hora");

        jHoraTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm"))));

        jCadastroConsultaButton.setBackground(new java.awt.Color(102, 153, 255));
        jCadastroConsultaButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jCadastroConsultaButton.setText("Cadastrar");
        jCadastroConsultaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroConsultaButtonActionPerformed(evt);
            }
        });

        jBuscaMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/lupa.png"))); // NOI18N
        jBuscaMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscaMedicoButtonActionPerformed(evt);
            }
        });

        jPacientSearchTextField.setToolTipText("Busque o paciente por nome ou cpf e selecione com dois cliques ");

        jBuscaPacienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/lupa.png"))); // NOI18N
        jBuscaPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscaPacienteButtonActionPerformed(evt);
            }
        });

        jPacienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jPacienteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPacienteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPacienteTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jPacienteTable);

        jMedicoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jMedicoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMedicoTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jMedicoTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCadastroConsultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jMedicoSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBuscaMedicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPacientSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBuscaPacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jHoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jPacientSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBuscaPacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jMedicoSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBuscaMedicoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jHoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addComponent(jCadastroConsultaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscaMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscaMedicoButtonActionPerformed
        atualizarTabelaComListaDeMedicos();
    }//GEN-LAST:event_jBuscaMedicoButtonActionPerformed

    private void atualizarTabelaComListaDeMedicos() {
        String medicoSearchText = jMedicoSearchTextField.getText();

        List<Medico> medicos = medicoController.buscarMedicosByStringSearch(medicoSearchText);

        MedicoTableModel medicoTableModel = new MedicoTableModel(medicos);

        jMedicoTable.setModel(medicoTableModel);
    }

    private void jBuscaPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscaPacienteButtonActionPerformed
        atualizarTabelaComListaDePacientes();
    }//GEN-LAST:event_jBuscaPacienteButtonActionPerformed

    private void atualizarTabelaComListaDePacientes() {
        String pacienteSearchText = jPacientSearchTextField.getText();

        List<Paciente> pacientes = pacienteController.buscarPacientesByStringSearch(pacienteSearchText);

        PacienteTableModel pacienteTableModel = new PacienteTableModel(pacientes);

        jPacienteTable.setModel(pacienteTableModel);
    }

    private void jCadastroConsultaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroConsultaButtonActionPerformed
        if (this.pacienteSelected == null || this.medicoSelected == null) {
			JOptionPane.showMessageDialog(this, "Deve-se selecionar um médico e um paciente", "Erro cadastro consulta", JOptionPane.ERROR_MESSAGE);
			return;
		}

		String horaText = jHoraTextField.getText();
		String dataText = jDataTextField.getText();

		boolean cadastradoComSucesso = false;

	}//GEN-LAST:event_jCadastroConsultaButtonActionPerformed

	private void jPacienteTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPacienteTableMouseClicked
		if (evt.getClickCount() != 2) {
			return;
		}

		int lineIndex = jPacienteTable.rowAtPoint(evt.getPoint());

		if (lineIndex == -1) {
			return;
		}

		PacienteTableModel pacienteTableModel = (PacienteTableModel) jPacienteTable.getModel();

		this.pacienteSelected = pacienteTableModel.getPaciente(lineIndex);

		if (pacienteSelected == null) {
			JOptionPane.showMessageDialog(null, "Houve algum erro ao selecionar paciente", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
        }

		jPacientSearchTextField.setText(pacienteSelected.getNome());
	}// GEN-LAST:event_jPacienteTableMouseClicked

	private void jMedicoTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMedicoTableMouseClicked
		if (evt.getClickCount() != 2) {
			return;
		}

		int lineIndex = jMedicoTable.rowAtPoint(evt.getPoint());

		if (lineIndex == -1) {
			return;
		}

		MedicoTableModel medicoTableModel = (MedicoTableModel) jMedicoTable.getModel();

		this.medicoSelected = medicoTableModel.getMedico(lineIndex);

		if (medicoSelected == null) {
			JOptionPane.showMessageDialog(null, "Houve algum erro ao selecionar médico", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		jMedicoSearchTextField.setText(medicoSelected.getNome());
	}// GEN-LAST:event_jMedicoTableMouseClicked

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
            java.util.logging.Logger.getLogger(JDialogCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialogCadastroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscaMedicoButton;
    private javax.swing.JButton jBuscaPacienteButton;
    private javax.swing.JButton jCadastroConsultaButton;
    private javax.swing.JFormattedTextField jDataTextField;
    private javax.swing.JFormattedTextField jHoraTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMedicoSearchTextField;
    private javax.swing.JTable jMedicoTable;
    private javax.swing.JTextField jPacientSearchTextField;
    private javax.swing.JTable jPacienteTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
