package adivinhator;

import java.util.List;

public class InterfaceJogo extends javax.swing.JFrame 
{
    private List<Pergunta> perguntas;
    private JogoPerguntas jogo;
    private int indiceAtual = 0;
    public InterfaceJogo() 
    {
        initComponents();
    }
    public InterfaceJogo(JogoPerguntas jogo, List<Pergunta> perguntas) 
    {
        this.perguntas = perguntas;
        this.jogo = jogo;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelPergunta = new javax.swing.JLabel();
        btnSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Adivinhator");

        labelPergunta.setText(" ");

        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });

        labelResultado.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnSim)
                        .addGap(18, 18, 18)
                        .addComponent(btnNao)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(labelPergunta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSim)
                    .addComponent(btnNao))
                .addGap(31, 31, 31)
                .addComponent(labelResultado)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void iniciarJogo()
    {
        labelPergunta.setText(this.perguntas.get(indiceAtual).getPergunta());
        labelResultado.setVisible(false);
    }
    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        gerenciarPerguntas(true);
        
    }//GEN-LAST:event_btnSimActionPerformed
    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        gerenciarPerguntas(false);
    }//GEN-LAST:event_btnNaoActionPerformed
    private void gerenciarPerguntas(Boolean resposta)
    {   
        if(indiceAtual >= (perguntas.size() - 1))
        {
            if(jogo.matchJogadores(perguntas.get(indiceAtual), resposta))
            {
                this.mostrarResultado(true);
            }
            else
            {
                this.mostrarResultado(false);
            }
        }
        else
        {
            if(jogo.matchJogadores(perguntas.get(indiceAtual), resposta))
            {
                this.mostrarResultado(true);
            }
            else
            {
                indiceAtual++;
                labelPergunta.setText(perguntas.get(indiceAtual).getPergunta());
            }
        }
    }                                      
    private void mostrarResultado(Boolean resultado)
    {
        if(resultado)
        {
            labelResultado.setText("O jogador escolhido é: "+jogo.getJogador().getNome()+".");
        }
        else
        {
            labelResultado.setText("Não foi possível encontrar um jogador.");
        }
        labelResultado.setVisible(true);
        btnNao.setEnabled(false);
        btnSim.setEnabled(false);
    }
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new InterfaceJogo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPergunta;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}