/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ufsj.view.login;

import edu.ufsj.controller.UsuarioController;
import edu.ufsj.exception.FalhaAutenticacaoUsuarioException;
import edu.ufsj.service.UserSession;
import edu.ufsj.view.home.JHome;

import javax.swing.*;

/**
 *
 * @author geraldoarthurdetomi
 */
public class JLogin extends javax.swing.JFrame {

    public void abrir() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Creates new form JLogin
     */
    public JLogin() {
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

        jProgramNameLabel = new javax.swing.JLabel();
        jLoginPanel = new javax.swing.JPanel();
        jLoginLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLoginField = new javax.swing.JTextField();
        jLoginButton = new javax.swing.JButton();
        jWelcomeLabel = new javax.swing.JLabel();
        jBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgramNameLabel.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jProgramNameLabel.setText("Clinic Manager");
        getContentPane().add(jProgramNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLoginPanel.setBackground(new java.awt.Color(153, 204, 255));

        jLoginLabel.setText("Login");

        jPasswordLabel.setText("Senha");

        jLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginFieldActionPerformed(evt);
            }
        });

        jLoginButton.setText("Entrar");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jWelcomeLabel.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jWelcomeLabel.setText("Bem vindo ao Clinic Manager!");

        javax.swing.GroupLayout jLoginPanelLayout = new javax.swing.GroupLayout(jLoginPanel);
        jLoginPanel.setLayout(jLoginPanelLayout);
        jLoginPanelLayout.setHorizontalGroup(
            jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginPanelLayout.createSequentialGroup()
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLoginPanelLayout.createSequentialGroup()
                        .addComponent(jWelcomeLabel)
                        .addGap(72, 72, 72))))
            .addGroup(jLoginPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLoginField, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jPasswordField)
                    .addComponent(jPasswordLabel)
                    .addComponent(jLoginLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLoginPanelLayout.setVerticalGroup(
            jLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jWelcomeLabel)
                .addGap(32, 32, 32)
                .addComponent(jLoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 390, 380));

        jBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ufsj/view/images/planodefundo.png"))); // NOI18N
        jBackgroundLabel.setText("jLabel1");
        jBackgroundLabel.setMaximumSize(new java.awt.Dimension(1024, 768));
        jBackgroundLabel.setMinimumSize(new java.awt.Dimension(1024, 768));
        jBackgroundLabel.setName("PlanoDeFundo"); // NOI18N
        jBackgroundLabel.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(jBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 1180, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLoginButtonActionPerformed
		String login = jLoginField.getText();
		String password = jPasswordField.getText();

		if (login.isBlank() || password.isBlank()) {
			JOptionPane.showMessageDialog(null, "Você deve digitar seu login e senha!");
			return;
		}

		UsuarioController usuarioController = new UsuarioController();

		boolean loginRealizadoComSucesso = false;

		try {
			usuarioController.realizarLogin(login, password);
			loginRealizadoComSucesso = true;
		} catch (FalhaAutenticacaoUsuarioException falhaAutenticacaoUsuarioException) {
			JOptionPane.showMessageDialog(null, falhaAutenticacaoUsuarioException.getMessage(), "Erro autenticação",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Houve um erro inesperado no sistema", "Erro Sistema",
					JOptionPane.ERROR_MESSAGE);
		}

		if (loginRealizadoComSucesso) {
            JOptionPane.showMessageDialog(null, "Bem vindo " + UserSession.getInstance().getLoggedUser().getNome());
			JHome jHome = new JHome();
			jHome.abrirDialog();

			this.setVisible(false);
		}
	}// GEN-LAST:event_jLoginButtonActionPerformed

    private void jLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBackgroundLabel;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JTextField jLoginField;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JPanel jLoginPanel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JLabel jProgramNameLabel;
    private javax.swing.JLabel jWelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
