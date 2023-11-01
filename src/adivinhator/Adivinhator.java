package adivinhator;


import java.util.Scanner;

public class Adivinhator 
{
    public static void main(String[] args) 
    {
        System.out.println("Bem-vindo ao Adivinhator - Jogo de adivinhaÃ§Ã£o dos jogadores da seleÃ§Ã£o brasileira!\n");
      char resposta;
      do
      {
          System.out.println("Deseja jogar com perguntas sequencias ou aleatÃ³rias? (Digite S ou A)\n");
              System.out.println("S - Sequencias?");
              System.out.println("A - AleatÃ³rias?\n");
              Scanner scanner = new Scanner(System.in);
              System.out.print("Sua Resposta: ");
              resposta = scanner.nextLine().charAt(0);
      }
      while(resposta != 'S' && resposta != 'A');
          JogoPerguntas jogo = new JogoPerguntas();
          if(resposta == 'S')
          {
            jogo.iniciarJogoSequencial();
          }
          else if(resposta == 'A')
          {
            jogo.iniciarJogoPerguntasAleatorias();
          }
      System.out.println("\nObrigado por jogar o Adivinhator!");
    }
}