/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jamal
 */
public class Meeting extends javax.swing.JFrame {

    /**
     * Creates new form Meeting
     */
    public Meeting() {
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

        SearchButton = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        Meeting = new javax.swing.JButton();
        Holiday = new javax.swing.JButton();
        AcceptButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MeetingTable = new javax.swing.JTable();
        MOJY = new javax.swing.JLabel();
        Tasks1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchButton.setBackground(new java.awt.Color(102, 102, 102));
        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setText("Search...");
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 25, 100, 48));

        SignOut.setBackground(new java.awt.Color(153, 0, 0));
        SignOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignOut.setText("Sign Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 25, 111, 48));

        SearchText.setBackground(new java.awt.Color(204, 204, 204));
        SearchText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        getContentPane().add(SearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 25, 273, 48));

        Meeting.setBackground(new java.awt.Color(102, 102, 102));
        Meeting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Meeting.setText("Meeting");
        Meeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeetingActionPerformed(evt);
            }
        });
        getContentPane().add(Meeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 139, 57));

        Holiday.setBackground(new java.awt.Color(102, 102, 102));
        Holiday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Holiday.setText("Holiday");
        getContentPane().add(Holiday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 60));

        AcceptButton.setBackground(new java.awt.Color(204, 0, 51));
        AcceptButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AcceptButton.setText("Accept");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AcceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 139, 57));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Reject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 130, 60));

        MeetingTable.setBackground(new java.awt.Color(240, 240, 240));
        MeetingTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MeetingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meeting Topic", "Meeting Date", "Meeting Day", "Meeting Place"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MeetingTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 550, 170));

        MOJY.setFont(new java.awt.Font("Cooper Black", 1, 55)); // NOI18N
        MOJY.setText("MOJY");
        getContentPane().add(MOJY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 60));

        Tasks1.setBackground(new java.awt.Color(102, 102, 102));
        Tasks1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tasks1.setText("Tasks");
        Tasks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tasks1ActionPerformed(evt);
            }
        });
        getContentPane().add(Tasks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 139, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jamal\\Documents\\NetBeansProjects\\SoftProj\\images\\3333.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignOutActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void MeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeetingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeetingActionPerformed

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tasks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tasks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tasks1ActionPerformed

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
            java.util.logging.Logger.getLogger(Meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meeting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton Holiday;
    private javax.swing.JLabel MOJY;
    private javax.swing.JButton Meeting;
    private javax.swing.JTable MeetingTable;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton SignOut;
    private javax.swing.JButton Tasks1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
