/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ugi;

/**
 *
 * @author ghael
 */
public class login extends javax.swing.JFrame
{

    /**
     * Creates new form login
     */
    public login()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        PanelInicio = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        barralat = new javax.swing.JPanel();
        txtContra = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        Btningresar = new javax.swing.JButton();
        barrasup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setText("Usuario:");
        txtUsuario.setFocusable(false);
        PanelInicio.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 30));

        barralat.setBackground(new java.awt.Color(51, 153, 255));
        barralat.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout barralatLayout = new javax.swing.GroupLayout(barralat);
        barralat.setLayout(barralatLayout);
        barralatLayout.setHorizontalGroup(
            barralatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        barralatLayout.setVerticalGroup(
            barralatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        PanelInicio.add(barralat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 230, 510));

        txtContra.setText("Contraseña: ");
        PanelInicio.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 20));

        contraseña.setForeground(new java.awt.Color(153, 153, 153));
        contraseña.setText("jPasswordField1");
        contraseña.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                contraseñaActionPerformed(evt);
            }
        });
        PanelInicio.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 260, 30));

        usuario.setForeground(new java.awt.Color(153, 153, 153));
        usuario.setText("Ingrese su usuario");
        usuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                usuarioActionPerformed(evt);
            }
        });
        PanelInicio.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 260, 30));

        Btningresar.setBackground(new java.awt.Color(0, 153, 255));
        Btningresar.setText("Ingresar");
        Btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelInicio.add(Btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        barrasup.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout barrasupLayout = new javax.swing.GroupLayout(barrasup);
        barrasup.setLayout(barrasupLayout);
        barrasupLayout.setHorizontalGroup(
            barrasupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        barrasupLayout.setVerticalGroup(
            barrasupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanelInicio.add(barrasup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_usuarioActionPerformed
    {//GEN-HEADEREND:event_usuarioActionPerformed
       String textoActual = usuario.getText();

    // Aquí puedes realizar alguna lógica si es necesario antes de cambiar el texto.

    // Cambiar el texto del campo de texto al texto ingresado por el usuario
    usuario.setText("Nuevo texto: " + textoActual);
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_contraseñaActionPerformed
    {//GEN-HEADEREND:event_contraseñaActionPerformed
        // Obtener el texto actual del campo de contraseña
    String textoActual = contraseña.getText();

    // Cambiar el texto del campo de contraseña al texto ingresado por el usuario
    contraseña.setText(textoActual);
    }//GEN-LAST:event_contraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btningresar;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel barralat;
    private javax.swing.JPanel barrasup;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
