package adivinhator;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class InterfaceMenu extends javax.swing.JFrame 
{
    public InterfaceMenu() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSequencial = new javax.swing.JButton();
        btnAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Adivinhator");

        jLabel2.setText("Escolha o modo de jogo:");

        btnSequencial.setText("Sequencial");
        btnSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSequencialActionPerformed(evt);
            }
        });

        btnAleatorio.setText("Aleatório");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAleatorio)
                            .addComponent(btnSequencial)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(btnSequencial)
                .addGap(33, 33, 33)
                .addComponent(btnAleatorio)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSequencialActionPerformed
        JogoPerguntas jogo = new JogoPerguntas();
        jogo.iniciarJogoPerguntasAleatorias();
        List<Pergunta> perguntas = jogo.getPerguntas();
        InterfaceJogo interfacePerguntas = new InterfaceJogo(jogo, perguntas);
        this.dispose();
        interfacePerguntas.setVisible(true);
        interfacePerguntas.iniciarJogo();
    }//GEN-LAST:event_btnSequencialActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        JogoPerguntas jogo = new JogoPerguntas();
        jogo.iniciarJogoPerguntasAleatorias();
        List<Pergunta> perguntas = new ArrayList();
        while (!jogo.getPerguntasNaoRespondidas().isEmpty()) 
        {
            int indiceAleatorio = new Random().nextInt(jogo.getPerguntasNaoRespondidas().size());
            perguntas.add(jogo.getPerguntasNaoRespondidas().get(indiceAleatorio));
        }
        InterfaceJogo interfacePerguntas = new InterfaceJogo(jogo, perguntas);
        this.dispose();
        interfacePerguntas.setVisible(true);
        interfacePerguntas.iniciarJogo();
    }//GEN-LAST:event_btnAleatorioActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new InterfaceMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnSequencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

