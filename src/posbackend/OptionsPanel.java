/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posbackend;

/**
 *
 * @author Tylar
 */
public class OptionsPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    
    public OptionsPanel() {
        initComponents();
    }
    
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newOrderLabel = new javax.swing.JLabel();
        clockInOutLabel = new javax.swing.JLabel();
        managerLabel = new javax.swing.JLabel();
        newOrderButton = new javax.swing.JButton();
        clockInOutButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();
        viewOrdersLabel = new javax.swing.JLabel();
        viewOrdersButton = new javax.swing.JButton();

        newOrderLabel.setText("New order");

        clockInOutLabel.setText("Clock in/out");

        managerLabel.setText("Manager");

        newOrderButton.setText("jButton1");
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        clockInOutButton.setText("jButton1");
        clockInOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInOutButtonActionPerformed(evt);
            }
        });

        managerButton.setText("jButton1");
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerButtonActionPerformed(evt);
            }
        });

        viewOrdersLabel.setText("View Orders");

        viewOrdersButton.setText("jButton1");
        viewOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(newOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(clockInOutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managerLabel)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewOrdersButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(128, 128, 128)
                        .addComponent(clockInOutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(managerButton)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clockInOutLabel)
                    .addComponent(managerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderButton)
                    .addComponent(clockInOutButton)
                    .addComponent(managerButton))
                .addGap(40, 40, 40)
                .addComponent(viewOrdersLabel)
                .addGap(18, 18, 18)
                .addComponent(viewOrdersButton)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        this.mainFrame.newOrder();
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void clockInOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInOutButtonActionPerformed
        this.mainFrame.clockInOut();
    }//GEN-LAST:event_clockInOutButtonActionPerformed

    private void managerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerButtonActionPerformed
        this.mainFrame.manager();
    }//GEN-LAST:event_managerButtonActionPerformed

    private void viewOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersButtonActionPerformed
        this.mainFrame.viewOrders();
    }//GEN-LAST:event_viewOrdersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clockInOutButton;
    private javax.swing.JLabel clockInOutLabel;
    private javax.swing.JButton managerButton;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JLabel newOrderLabel;
    private javax.swing.JButton viewOrdersButton;
    private javax.swing.JLabel viewOrdersLabel;
    // End of variables declaration//GEN-END:variables
}
