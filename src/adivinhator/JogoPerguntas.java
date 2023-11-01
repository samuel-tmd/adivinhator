package adivinhator;

import java.util.ArrayList;
import java.util.List;

public class JogoPerguntas
{
    private Jogador jogador;
    private final List<Jogador> jogadores;
    private List<Jogador> jogadoresPossiveis;
    private final List<Pergunta> perguntas;
    private List<Pergunta> perguntasNaoRespondidas;
    public Jogador getJogador() 
    {
        return jogador;
    }
    public List<Pergunta> getPerguntas() 
    {
        return perguntas;
    }
    public List<Pergunta> getPerguntasNaoRespondidas() 
    {
        return perguntasNaoRespondidas;
    }
    public JogoPerguntas()
    {
        perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("O jogador atua no Europa?", "continenteTimeAtual", "Europa"));
        perguntas.add(new Pergunta("O jogador atua no Brasil?", "paisTimeAtual", "Brasil"));
        perguntas.add(new Pergunta("O jogador atua na Inglaterra?", "paisTimeAtual", "Inglaterra"));
        perguntas.add(new Pergunta("O jogador atua na França?", "paisTimeAtual", "França"));
        perguntas.add(new Pergunta("O jogador tem mais de 25 anos de idade?", "idade", 25));
        perguntas.add(new Pergunta("O jogador é atacante?", "posicao", "Atacante"));
        perguntas.add(new Pergunta("O jogador é meio campista?", "posicao", "Meio-campista"));
        perguntas.add(new Pergunta("O jogador é lateral?", "posicao", "Lateral"));
        perguntas.add(new Pergunta("O jogador é zagueiro?", "posicao", "Zagueiro"));
        perguntas.add(new Pergunta("O jogador é goleiro?", "posicao", "Goleiro"));
        perguntas.add(new Pergunta("O jogador é destro?", "isDestro", true));
        perguntas.add(new Pergunta("O jogador atua no América-MG?", "timeAtual", "América-MG"));
        perguntas.add(new Pergunta("O jogador atua no Arsenal?", "timeAtual", "Arsenal"));
        perguntas.add(new Pergunta("O jogador atua no Newcastle?", "timeAtual", "Newcastle"));
        perguntas.add(new Pergunta("O jogador atua no Monaco?", "timeAtual", "Monaco"));
        perguntas.add(new Pergunta("O jogador atua no Real Madrid?", "timeAtual", "Real Madrid"));
        perguntas.add(new Pergunta("O jogador foi revelado no Santos?", "timeRevelacao", "Santos"));
        jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alisson", "Liverpool", 31, "Europa", "Inglaterra", "Goleiro", true, "Inter"));
        jogadores.add(new Jogador("Bento", "Athletico-PR", 24, "América do Sul", "Brasil", "Goleiro", true, "Athletico-PR"));
        jogadores.add(new Jogador("Ederson", "Manchester City", 30, "Europa", "Inglaterra", "Goleiro", false, "São Paulo"));
        jogadores.add(new Jogador("Danilo", "Juventus", 32, "Europa", "Itália", "Lateral", false, "América-MG"));
        jogadores.add(new Jogador("Vanderson", "Monaco", 22, "Europa", "França", "Lateral", true, "Grêmio"));
        jogadores.add(new Jogador("Caio Henrique", "Monaco", 26, "Europa", "França", "Lateral", false, "Santos"));
        jogadores.add(new Jogador("Renan Lodi", "Marselha", 25, "Europa", "França", "Lateral", false, "Athletico-PR"));
        jogadores.add(new Jogador("Ibanêz", "Al-Ahli", 24, "Ásia", "Arábia Saudita", "Zagueiro", true, "Fluminense"));
        jogadores.add(new Jogador("Gabriel Magalhães", "Arsenal", 25, "Europa", "Inglaterra", "Zagueiro", false, "Avaí­"));
        jogadores.add(new Jogador("Marquinhos", "PSG", 29, "Europa", "França", "Zagueiro", true, "Corinthians"));
        jogadores.add(new Jogador("Nino", "Fluminense", 26, "América do Sul", "Brasil", "Zagueiro", true, "Fluminense"));
        jogadores.add(new Jogador("André", "Fluminense", 22, "América do Sul", "Brasil", "Meio-campista", true, "Fluminense"));
        jogadores.add(new Jogador("Bruno Guimarães", "Newcastle", 25, "Europa", "Inglaterra", "Meio-campista", true, "Athletico-PR"));
        jogadores.add(new Jogador("Casemiro", "Manchester United", 31, "Europa", "Inglaterra", "Meio-campista", true, "São Paulo"));
        jogadores.add(new Jogador("Joelinton", "Newcastle", 27, "Europa", "Inglaterra", "Meio-campista", true, "Sport"));
        jogadores.add(new Jogador("Raphael Veiga", "Palmeiras", 28, "América do Sul", "Brasil", "Meio-campista", false, "Coritiba"));
        jogadores.add(new Jogador("Gabriel Jesus", "Arsenal", 26, "Europa", "Inglaterra", "Atacante", true, "Palmeiras"));
        jogadores.add(new Jogador("Gabriel Martinelli", "Arsenal", 22, "Europa", "Inglaterra", "Atacante", true, "Ituano"));
        jogadores.add(new Jogador("Matheus Cunha", "Wolverhampton", 24, "Europa", "Inglaterra", "Atacante", true, "Coritiba"));
        jogadores.add(new Jogador("Neymar", "Al-Hilal", 31, "Ásia", "Arábia Saudita", "Atacante", true, "Santos"));
        jogadores.add(new Jogador("Richarlison", "Tottenham", 26, "Europa", "Inglaterra", "Atacante", true, "América-MG"));
        jogadores.add(new Jogador("Rodrygo", "Real Madrid", 22, "Europa", "Espanha", "Atacante", true, "Santos"));
        jogadores.add(new Jogador("Vini Jr", "Real Madrid", 23, "Europa", "Espanha", "Atacante", true, "Flamengo"));
    }
    public void iniciarJogoSequencial() 
    {
        this.jogadoresPossiveis = this.jogadores;
    }
    public void iniciarJogoPerguntasAleatorias() 
    {
        this.perguntasNaoRespondidas = new ArrayList<>(this.perguntas);
        this.jogadoresPossiveis = this.jogadores;
    }
    public Boolean matchJogadores(Pergunta pergunta, Boolean resposta)
    {
        Boolean encontrouJogador = false;
        for(int i = 0; i < this.jogadoresPossiveis.size(); i++)
        {
            Jogador jogadorPossivel = this.jogadoresPossiveis.get(i);
            Boolean match = jogadorPossivel.matchJogador(pergunta, resposta);
            if(!match)
            {
                this.jogadoresPossiveis.remove(i);
                i--;
            }
        }
        if(this.jogadoresPossiveis.size() == 1)
        {
            encontrouJogador = true;
            this.jogador = this.jogadoresPossiveis.get(0);
        }
        return encontrouJogador;
    }
}
