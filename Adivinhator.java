package com.mycompany.adivinhator;

import java.util.Scanner;

public class Adivinhator 
{
    public static void main(String[] args) 
    {
        System.out.println("Bem-vindo ao jogo de perguntas e respostas!\n");
        System.out.println("Deseja jogar com perguntas sequencias ou aleatórias? (Digite S ou A)\n");
        System.out.println("S - Sequencias?");
        System.out.println("A - Aleatórias?\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua Resposta: ");
        char resposta = scanner.nextLine().charAt(0);
        JogoPerguntas jogo = new JogoPerguntas();
        if(resposta == 'S')
        {
          jogo.iniciarJogoSequencial();
        }
        else if(resposta == 'A')
        {
          jogo.iniciarJogoPerguntasAleatorias();
        }
    }
}
