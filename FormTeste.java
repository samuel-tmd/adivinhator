package com.mycompany.adivinhator;

public class FormTeste extends javax.swing.JFrame {

    public FormTeste() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbttInstrucoes = new javax.swing.JButton();
        jbttSair = new javax.swing.JButton();
        jbttJogar = new javax.swing.JButton();
        jbttJogar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Adivinhator");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Escolha o tipo de jogo:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Instruções");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Sair");

        jbttInstrucoes.setText("jButton2");

        jbttSair.setText("jButton3");

        jbttJogar.setText("Sequencial");
        jbttJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttJogarActionPerformed(evt);
            }
        });

        jbttJogar1.setText("Aleatório");
        jbttJogar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttJogar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jbttInstrucoes)
                            .addComponent(jbttSair)
                            .addComponent(jbttJogar)
                            .addComponent(jbttJogar1))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbttJogar)
                .addGap(5, 5, 5)
                .addComponent(jbttJogar1)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbttInstrucoes)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbttSair)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbttJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttJogarActionPerformed
        FormPerguntas f = new FormPerguntas();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_jbttJogarActionPerformed

    private void jbttJogar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttJogar1ActionPerformed
        
    }//GEN-LAST:event_jbttJogar1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbttInstrucoes;
    private javax.swing.JButton jbttJogar;
    private javax.swing.JButton jbttJogar1;
    private javax.swing.JButton jbttSair;
    // End of variables declaration//GEN-END:variables
}
