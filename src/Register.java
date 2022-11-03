import com.mysql.jdbc.Connection;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    
    Connection cnx = null;
    PreparedStatement ps = null ; 
    ResultSet rs = null;
    

   
    public Register() {
        
        cnx=(Connection) Connexion.cnxdb();
        initComponents();
        Border borderPanel = BorderFactory.createMatteBorder
                (3, 3, 3, 3, Color.black);
        
        panelRegister.setBorder(borderPanel);
        Border borderlabel = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.black);
        lblclose.setBorder(borderlabel);
        lblminimaise.setBorder(borderlabel);
         Border borderTextField = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.white);
         
         cintxt.setBorder(borderTextField);
         nameTxt.setBorder(borderTextField);
         loginTxt.setBorder(borderTextField);
         passwordTxt.setBorder(borderTextField);
        numTxt.setBorder(borderTextField);
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblminimaise = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cintxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        loginTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        numTxt = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        Txtretour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        panelRegister.setBackground(new java.awt.Color(0, 0, 102));
        panelRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegister.setForeground(new java.awt.Color(0, 51, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblclose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 255, 255));
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("X");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcloseMouseExited(evt);
            }
        });

        lblminimaise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblminimaise.setForeground(new java.awt.Color(255, 255, 255));
        lblminimaise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimaise.setText("-");
        lblminimaise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimaiseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminimaiseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminimaiseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisterLayout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(lblminimaise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblclose))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblclose)
                        .addComponent(lblminimaise))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("cin:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("login:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("password:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("phone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("name:");

        cintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cintxtActionPerformed(evt);
            }
        });

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        btncreate.setBackground(new java.awt.Color(0, 0, 153));
        btncreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncreate.setForeground(new java.awt.Color(0, 0, 153));
        btncreate.setText("create account");
        btncreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncreateMouseExited(evt);
            }
        });
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        Txtretour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Txtretour.setForeground(new java.awt.Color(204, 0, 0));
        Txtretour.setText("<< go to login ");
        Txtretour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtretourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cintxt)
                            .addComponent(nameTxt)
                            .addComponent(loginTxt)
                            .addComponent(passwordTxt)
                            .addComponent(numTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btncreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txtretour)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(loginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate)
                    .addComponent(Txtretour))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cintxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void btncreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateMouseEntered
        btncreate.setBackground(Color.red);
    }//GEN-LAST:event_btncreateMouseEntered

    private void btncreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateMouseExited
       btncreate.setBackground(Color.blue);
    }//GEN-LAST:event_btncreateMouseExited

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
         Border borderlabel = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.white);
        lblclose.setBorder(borderlabel);
        lblclose.setForeground(Color.white);
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblminimaiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimaiseMouseEntered
         Border borderlabel = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.white);
        lblminimaise.setBorder(borderlabel);
        
        lblminimaise.setForeground(Color.white);
    }//GEN-LAST:event_lblminimaiseMouseEntered

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        Border borderlabel = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.black);
        lblclose.setBorder(borderlabel);
        
        lblclose.setForeground(Color.black);
    }//GEN-LAST:event_lblcloseMouseExited

    private void lblminimaiseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimaiseMouseExited
        Border borderlabel = BorderFactory.createMatteBorder
                (1, 1, 1, 1, Color.black);
        lblminimaise.setBorder(borderlabel);
      
        lblminimaise.setForeground(Color.black);
    }//GEN-LAST:event_lblminimaiseMouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminimaiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimaiseMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimaiseMouseClicked

    private void TxtretourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtretourMouseClicked
        Login login =new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_TxtretourMouseClicked

    private void btncreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateMouseClicked
        String cin=cintxt.getText();
        String name=nameTxt.getText();
        String pass=passwordTxt.getText();
        String login=loginTxt.getText();
        String num=numTxt.getText(); 
         
        
        String sql="INSERT INTO `user`(`CIN`, `Nom`, `Password`, `Login`, `Num`) "
                + "VALUES (?,?,?,?,?)";
        
        try {
            ps=  cnx.prepareStatement(sql);
            ps.setInt(1,Integer.parseInt(cin.toString()));
            ps.setString(2,name.toString() );
            ps.setString(3,pass.toString() );
            ps.setString(4,login.toString() );
            ps.setInt(5,Integer.parseInt(num.toString()));
            ps.execute();
            JOptionPane.showMessageDialog(null,"Utilisateur Ajouter Avec succes");
  
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cintxt.setText(null);
        
        cintxt.setText(null);
        nameTxt.setText(null);
        passwordTxt.setText(null);
        loginTxt.setText(null);
        numTxt.setText(null);
        
         /* Login login =new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose(); */
    }//GEN-LAST:event_btncreateMouseClicked

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreateActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Txtretour;
    private javax.swing.JButton btncreate;
    private javax.swing.JTextField cintxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblminimaise;
    private javax.swing.JTextField loginTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numTxt;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JTextField passwordTxt;
    // End of variables declaration//GEN-END:variables
}
