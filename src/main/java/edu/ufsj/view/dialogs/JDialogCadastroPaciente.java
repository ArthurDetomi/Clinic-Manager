/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ufsj.view.dialogs;

import javax.swing.*;

import edu.ufsj.controller.PacienteController;
import edu.ufsj.exception.PacienteJaExisteException;
import edu.ufsj.model.Paciente;
import edu.ufsj.utils.CpfUtil;

/**
 *
 * @author arthurd
 */
public class JDialogCadastroPaciente extends JDialogGeneric {

    /**
     * Creates new form JDialogCadastroPaciente
     */
    public JDialogCadastroPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jCPF = new javax.swing.JLabel();
        jTelefone = new javax.swing.JLabel();
        JCidade = new javax.swing.JLabel();
        JNumero = new javax.swing.JLabel();
        JEstado = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCadastroPacienteButton = new javax.swing.JButton();
        jCpfTextField = new javax.swing.JFormattedTextField();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 741));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 741));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 741));

        jNome.setText("Nome:");

        jCPF.setText("CPF:");

        jTelefone.setText("Telefone:");

        JCidade.setText("Cidade:");

        JNumero.setText("Numero:");

        JEstado.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel7.setText("Cadastro de Paciente");

        jCadastroPacienteButton.setBackground(new java.awt.Color(102, 153, 255));
        jCadastroPacienteButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jCadastroPacienteButton.setText("Cadastrar");
        jCadastroPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroPacienteButtonActionPerformed(evt);
            }
        });

        try {
            jCpfTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNome)
                    .addComponent(jCPF)
                    .addComponent(jTelefone)
                    .addComponent(JCidade)
                    .addComponent(JNumero)
                    .addComponent(JEstado))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldCidade)
                    .addComponent(jCpfTextField)
                    .addComponent(jTextFieldTelefone))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jCadastroPacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel7)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF)
                    .addComponent(jCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jCadastroPacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jCadastroPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCadastroPacienteButtonActionPerformed
		// TODO add your handling code here:
		String nome = jTextFieldNome.getText();
		String cpf = jCpfTextField.getText();
		String telefone = jTextFieldTelefone.getText();
		String estado = jTextFieldEstado.getText();
		String cidade = jTextFieldCidade.getText();
		String numero = jTextFieldNumero.getText();

		if (nome.isBlank() || cpf.isBlank()) {
			JOptionPane.showMessageDialog(null, "O nome e cpf são obrigatórios");
			return;
		}

		if (!CpfUtil.isValidCpf(cpf)) {
			JOptionPane.showMessageDialog(null, "Cpf inválido", "Revise o cpf informado", JOptionPane.ERROR_MESSAGE);
			return;
		}
		PacienteController pacienteController = new PacienteController();

		Paciente paciente = new Paciente(nome, cpf, telefone, estado, cidade, numero);

		boolean pacienteFoiCadastrado;

		try {
			pacienteFoiCadastrado = pacienteController.cadastrarPaciente(paciente);
		} catch (PacienteJaExisteException pacienteJaExisteException) {
			JOptionPane.showMessageDialog(null, pacienteJaExisteException.getMessage(), "Paciente com mesmo CPF",
					JOptionPane.ERROR_MESSAGE);
            return;
		} catch (Exception exception) {
			mostrarMensagemErroInesperado();
            return;
        }

		if (!pacienteFoiCadastrado) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente", "Erro cadastro paciente",
					JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, paciente.getNome() + " cadastrado com sucesso");
			this.setVisible(false);
		}
	}// GEN-LAST:event_jCadastroPacienteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialogCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCidade;
    private javax.swing.JLabel JEstado;
    private javax.swing.JLabel JNumero;
    private javax.swing.JLabel jCPF;
    private javax.swing.JButton jCadastroPacienteButton;
    private javax.swing.JFormattedTextField jCpfTextField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
