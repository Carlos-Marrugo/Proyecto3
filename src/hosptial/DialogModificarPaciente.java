/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hosptial;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Lenovo
 */
public class DialogModificarPaciente extends javax.swing.JDialog {

    /**
     * Creates new form DialogModificarPaciente
     */
    public DialogModificarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        panelGuardarPaciente = new javax.swing.JPanel();
        txtemail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        panelBtnGuardar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        txtSegundoNombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        cbEps = new javax.swing.JComboBox<>();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        txtCelular = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        lblImgUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelGuardarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtemail.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtemail.setBorder(null);
        txtemail.setEnabled(false);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        panelGuardarPaciente.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Primer Nombre*");
        panelGuardarPaciente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, -1));

        txtdireccion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtdireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtdireccion.setBorder(null);
        panelGuardarPaciente.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 215, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 215, 20));

        panelBtnGuardar.setBackground(new java.awt.Color(10, 92, 184));
        panelBtnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBtnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ACTUALIZAR");
        panelBtnGuardar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 170, 30));

        panelGuardarPaciente.add(panelBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 190, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR IMAGEN");
        panelGuardarPaciente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Documento de identidad*");
        panelGuardarPaciente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        cbTipoDocumento.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbTipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        panelGuardarPaciente.add(cbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 20));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 215, 20));

        txtSegundoNombre.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtSegundoNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSegundoNombre.setBorder(null);
        panelGuardarPaciente.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 215, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Segundo Nombre");
        panelGuardarPaciente.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 220, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Primer Apellido*");
        panelGuardarPaciente.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 220, -1));

        txtPrimerApellido.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPrimerApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrimerApellido.setBorder(null);
        panelGuardarPaciente.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 215, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Eps*");
        panelGuardarPaciente.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 105, -1));

        txtSegundoApellido.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtSegundoApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSegundoApellido.setBorder(null);
        panelGuardarPaciente.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 215, 30));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 215, 20));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 215, 20));

        dcFechaNacimiento.setBackground(new java.awt.Color(0, 0, 0, 0));
        panelGuardarPaciente.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 215, 30));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 105, 10));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 215, 20));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setText("Segundo Apellido*");
        panelGuardarPaciente.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 220, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setText("Fecha de Nacimiento*");
        panelGuardarPaciente.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 220, -1));

        cbSexo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        panelGuardarPaciente.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 105, 25));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setText("Sexo*");
        panelGuardarPaciente.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 105, -1));

        cbEps.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbEps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coosalud", "Sanistas", "Comfamiliar", "Nueva Eps" }));
        panelGuardarPaciente.add(cbEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 105, 25));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 105, 10));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setText("Email*");
        panelGuardarPaciente.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 220, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        panelGuardarPaciente.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 215, 25));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 215, 10));

        txtCelular.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelular.setBorder(null);
        panelGuardarPaciente.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 215, 25));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setText("Celular*");
        panelGuardarPaciente.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 220, -1));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 215, 20));

        lblImgUser.setBackground(new java.awt.Color(232, 230, 229));
        lblImgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        lblImgUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgUserMouseClicked(evt);
            }
        });
        panelGuardarPaciente.add(lblImgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void lblImgUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgUserMouseClicked
        // Crea el JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // Abre el JFileChooser
        int resultado = fileChooser.showOpenDialog(this);

        // Si el usuario seleccionó un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                // Obtiene el archivo seleccionado
                File file = fileChooser.getSelectedFile();
                String extension = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                if ((file.isFile() && extension.equals("png")) || (file.isFile() && extension.equals("jpg"))) {
                    // Carga la imagen
                    BufferedImage image = ImageIO.read(file);
                    // Crea una ImageIcon a partir de la imagen
                    ImageIcon icon = new ImageIcon(image);
                    // Asigna la ImageIcon ala etiqueta
                    lblImgUser.setIcon(icon);
                }
            } catch (IOException ex) {
                System.err.print(ex);
            }
        }
    }//GEN-LAST:event_lblImgUserMouseClicked

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
            java.util.logging.Logger.getLogger(DialogModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogModificarPaciente dialog = new DialogModificarPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEps;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblImgUser;
    private javax.swing.JPanel panelBtnGuardar;
    private javax.swing.JPanel panelGuardarPaciente;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
