package com.mycompany.adivinhator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class JogoPerguntas extends javax.swing.JFrame
{
    private List<Pergunta> perguntas;
    private List<Jogador> jogadores;
    private int pontuacao;

    public JogoPerguntas()
    {
        perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("O jogador atua no Europa?", "paisQueAtua"));
        perguntas.add(new Pergunta("O jogador atua no Brasil?", "paisQueAtua"));
        perguntas.add(new Pergunta("O jogador atua na Inglaterra?", "paisQueAtua"));
        perguntas.add(new Pergunta("Ele atua na França?", "paisQueAtua"));
        perguntas.add(new Pergunta("O jogador tem mais de 25 anos de idade?", "idade"));
        perguntas.add(new Pergunta("O jogador é atacante?", "posicao"));
        perguntas.add(new Pergunta("O jogador é meio campista?", "posicao"));
        perguntas.add(new Pergunta("O jogador é lateral?", "posicao"));
        perguntas.add(new Pergunta("O jogador é zagueiro?", "posicao"));
        perguntas.add(new Pergunta("O jogador é goleiro?", "posicao"));
        perguntas.add(new Pergunta("O jogador é destro?", "eDestro"));
        perguntas.add(new Pergunta("Ele atua no América-MGrsenal?", "timeAtual"));
        perguntas.add(new Pergunta("Ele atua no Newcastle?", "timeAtual"));
        perguntas.add(new Pergunta("Ele atua no Monaco?", "timeAtual"));
        perguntas.add(new Pergunta("Ele atua no Real Madrid?", "timeAtual"));
        perguntas.add(new Pergunta("O jogador foi revelado no Santos?", "timeRevelacao"));
        jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alisson", "Liverpool", 31, "Inglaterra", "Goleio", true, "Inter"));
        jogadores.add(new Jogador("Bento", "Athletico-PR", 24, "Brasil", "Goleio", true, "Athletico-PR"));
        jogadores.add(new Jogador("Ederson", "Manchester City", 30, "Inglaterra", "Goleio", false, "São Paulo"));
        jogadores.add(new Jogador("Danilo", "Juventus", 32, "Itália", "Lateral", false, "América-MG"));
        jogadores.add(new Jogador("Vanderson", "Monaco", 22, "França", "Lateral", true, "Grêmio"));
        jogadores.add(new Jogador("Caio Henrique", "Monaco", 26, "França", "Lateral", false, "Santos"));
        jogadores.add(new Jogador("Renan Lodi", "Marselha", 25, "França", "Lateral", false, "Athletico-PR"));
        jogadores.add(new Jogador("Ibañez", "Al-Ahli", 24, "Arábia Saudita", "Zagueiro", true, "Fluminense"));
        jogadores.add(new Jogador("Gabriel Magalhães", "Arsenal", 25, "Inglaterra", "Zagueiro", false, "Avaí"));
        jogadores.add(new Jogador("Marquinhos", "PSG", 29, "França", "Zagueiro", true, "Corinthians"));
        jogadores.add(new Jogador("Nino", "Fluminense", 26, "Brasil", "Zagueiro", true, "Fluminense"));
        jogadores.add(new Jogador("André", "Fluminense", 22, "Brasil", "Meio-campista", true, "Fluminense"));
        jogadores.add(new Jogador("Bruno Guimarães", "Newcastle", 25, "Inglaterra", "Meio-campista", true, "Athletico-PR"));
        jogadores.add(new Jogador("Casemiro", "Manchester United", 31, "Inglaterra", "Meio-campista", true, "São Paulo"));
        jogadores.add(new Jogador("Joelinton", "Newcastle", 27, "Inglaterra", "Meio-campista", true, "Sport"));
        jogadores.add(new Jogador("Raphael Veiga", "Palmeiras", 28, "Brasil", "Meio-campista", false, "Coritiba"));
        jogadores.add(new Jogador("Gabriel Jesus", "Arsenal", 26, "Inglaterra", "Atacante", true, "Palmeiras"));
        jogadores.add(new Jogador("Gabriel Martinelli", "Arsenal", 22, "Inglaterra", "Atacante", true, "Ituano"));
        jogadores.add(new Jogador("Matheus Cunha", "Wolverhampton", 24, "Inglaterra", "Atacante", true, "Coritiba"));
        jogadores.add(new Jogador("Neymar", "Al-Hilal", 31, "Arábia Saudita", "Atacante", true, "Santos"));
        jogadores.add(new Jogador("Richarlison", "Tottenham", 26, "Inglaterra", "Atacante", true, "América-MG"));
        jogadores.add(new Jogador("Rodrygo", "Real Madrid", 22, "Espanha", "Atacante", true, "Santos"));
        jogadores.add(new Jogador("Vini Jr", "Real Madrid", 23, "Espanha", "Atacante", true, "Flamengo"));
    }
    public void iniciarJogoSequencial() 
    {
        Scanner scanner = new Scanner(System.in);
        pontuacao = 0;

        for (Pergunta pergunta : perguntas) 
        {
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);
        }
    }
    public void iniciarJogoPerguntasAleatorias() 
    {
        Scanner scanner = new Scanner(System.in);
        pontuacao = 0;
        List<Pergunta> perguntasNaoRespondidas = new ArrayList<>(perguntas); // Copie todas as perguntas inicialmente

        while (!perguntasNaoRespondidas.isEmpty()) 
        {
            int indiceAleatorio = new Random().nextInt(perguntasNaoRespondidas.size());
            Pergunta pergunta = perguntasNaoRespondidas.get(indiceAleatorio);
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);
            // Remova a pergunta da lista de perguntas não respondidas
            perguntasNaoRespondidas.remove(indiceAleatorio);
        }
    }
}

