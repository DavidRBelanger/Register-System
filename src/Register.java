
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author drbx3
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tenderButton = new javax.swing.JButton();
        discButton = new javax.swing.JButton();
        voidItem = new javax.swing.JButton();
        subtotalText = new javax.swing.JTextField();
        subtotalText1 = new javax.swing.JTextField();
        subtotalField = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        addItem = new javax.swing.JButton();
        taxButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        deptArea = new javax.swing.JTextField();
        nameArea = new javax.swing.JTextField();
        styleArea = new javax.swing.JTextField();
        priceArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        voidIndexField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transArea = new javax.swing.JTextArea();
        cashButton = new javax.swing.JRadioButton();
        creditButton = new javax.swing.JRadioButton();

        jButton4.setText("Void Item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Department");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("Num             Department      Name            Style           Subtotal        Total           ");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 480, 30);

        tenderButton.setText("Tender Transaction");
        tenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tenderButton);
        tenderButton.setBounds(480, 480, 200, 80);

        discButton.setText("Transaction Discount");
        discButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discButtonActionPerformed(evt);
            }
        });
        getContentPane().add(discButton);
        discButton.setBounds(480, 400, 200, 80);

        voidItem.setText("Void Item");
        voidItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidItemActionPerformed(evt);
            }
        });
        getContentPane().add(voidItem);
        voidItem.setBounds(480, 320, 200, 80);

        subtotalText.setEditable(false);
        subtotalText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotalText.setText("Subtotal:");
        subtotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalTextActionPerformed(evt);
            }
        });
        getContentPane().add(subtotalText);
        subtotalText.setBounds(470, 0, 210, 30);

        subtotalText1.setEditable(false);
        subtotalText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotalText1.setText("Total::");
        subtotalText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalText1ActionPerformed(evt);
            }
        });
        getContentPane().add(subtotalText1);
        subtotalText1.setBounds(480, 100, 200, 30);

        subtotalField.setEditable(false);
        subtotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(subtotalField);
        subtotalField.setBounds(480, 30, 200, 70);

        totalField.setEditable(false);
        totalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(totalField);
        totalField.setBounds(480, 130, 200, 70);

        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        getContentPane().add(addItem);
        addItem.setBounds(480, 240, 200, 80);

        taxButton.setText("Add Item");
        taxButton.setActionCommand("Set Tax");
        taxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxButtonActionPerformed(evt);
            }
        });
        getContentPane().add(taxButton);
        taxButton.setBounds(480, 560, 200, 80);

        cancelButton.setText("Cancel Transaction");
        cancelButton.setActionCommand("Set Tax");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);
        cancelButton.setBounds(480, 640, 200, 80);

        deptArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptAreaActionPerformed(evt);
            }
        });
        getContentPane().add(deptArea);
        deptArea.setBounds(680, 240, 70, 40);

        nameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAreaActionPerformed(evt);
            }
        });
        getContentPane().add(nameArea);
        nameArea.setBounds(680, 280, 70, 40);

        styleArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleAreaActionPerformed(evt);
            }
        });
        getContentPane().add(styleArea);
        styleArea.setBounds(820, 240, 70, 40);
        getContentPane().add(priceArea);
        priceArea.setBounds(820, 280, 70, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Price");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(890, 280, 60, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Department");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 240, 80, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 280, 40, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Style");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(890, 240, 60, 40);
        getContentPane().add(voidIndexField);
        voidIndexField.setBounds(680, 320, 70, 80);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Index");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 320, 26, 80);

        transArea.setColumns(20);
        transArea.setRows(5);
        jScrollPane2.setViewportView(transArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 30, 480, 690);

        cashButton.setText("Cash");
        getContentPane().add(cashButton);
        cashButton.setBounds(680, 490, 90, 30);

        creditButton.setText("Credit");
        getContentPane().add(creditButton);
        creditButton.setBounds(680, 520, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenderButtonActionPerformed
        try {
            myObj = new File("transactions.txt");
            FileWriter fw = new FileWriter("transactions.txt");
            fw.write("\n" + transactionNumber + "\n");
            for (int i = 0; i < list.count(); i++) {
                fw.write(list.toString(i) + "\n"); //code for now just write item details

            }
        } catch (IOException e) {
            System.out.println("An Error has occured.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_tenderButtonActionPerformed

    private void discButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discButtonActionPerformed

    private void voidItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voidItemActionPerformed

    private void subtotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalTextActionPerformed

    private void subtotalText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalText1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        if (!hasStarted) {
            list = new Transaction();
            String data = "";
            try {
                File file = new File("transactions.txt");
                Scanner myReader = new Scanner(file);
                data = "";
                while (myReader.hasNextLine()) {
                    data += myReader.nextLine() + "\n";
                }
            } catch (FileNotFoundException e) {
            }
            while (true) {
                int a = data.indexOf("#");
                if (data.indexOf("#", a+1) == -1) {
                    transactionIndex = a;
                    break;
                }
            }

        }
        Item a = new Item(nameArea.getText(), Integer.valueOf(deptArea.getText()), Integer.valueOf(styleArea.getText()), Double.valueOf(priceArea.getText()));
        list.addItem(a);
        transArea.setText("");
        for (int i = 0; i < list.count(); i++) {
            transArea.append(list.toString(i) + "\n");
        }
        hasStarted = true;
        double subtotal = 0;
        double total = 0;

    }//GEN-LAST:event_addItemActionPerformed

    private void taxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        hasStarted = false;
        transArea.setText("");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAreaActionPerformed

    private void styleAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_styleAreaActionPerformed

    private void deptAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptAreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean hasStarted = false;
    public Transaction list;
    public int transactionNumber;
    public File myObj;
    public int transactionIndex;

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton cashButton;
    private javax.swing.JRadioButton creditButton;
    private javax.swing.JTextField deptArea;
    private javax.swing.JButton discButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField priceArea;
    private javax.swing.JTextField styleArea;
    private javax.swing.JTextField subtotalField;
    private javax.swing.JTextField subtotalText;
    private javax.swing.JTextField subtotalText1;
    private javax.swing.JButton taxButton;
    private javax.swing.JButton tenderButton;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextArea transArea;
    private javax.swing.JTextField voidIndexField;
    private javax.swing.JButton voidItem;
    // End of variables declaration//GEN-END:variables
}
