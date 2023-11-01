package adivinhator;

public class Jogador
{
    private String nome;
    private Integer idade;
    private String timeAtual;
    private String continenteTimeAtual;
    private String paisTimeAtual;
    private String posicao;
    private Boolean isDestro;
    private String timeRevelacao;
      
    public Jogador(String nome, String timeAtual, Integer idade, String continenteTimeAtual, String paisTimeAtual, String posicao, Boolean isDestro, String timeRevelacao)
    {
        this.nome = nome;
        this.idade = idade;
        this.timeAtual = timeAtual;
        this.continenteTimeAtual = continenteTimeAtual;
        this.paisTimeAtual = paisTimeAtual;
        this.posicao = posicao;
        this.isDestro = isDestro;
        this.timeRevelacao = timeRevelacao;
    }
    public String getNome() 
    {
        return this.nome;
    }
    public Boolean matchJogador(Pergunta pergunta, Boolean resposta)
    {
        Boolean resultado = false;
        switch (pergunta.getAtributo()) 
        {
            case "idade":
                resultado = this.handleIdade((int) pergunta.getValor(), resposta);
                break;
            case "timeAtual":
                resultado = this.handleTimeAtual((String) pergunta.getValor(), resposta);
                break;
            case "continenteTimeAtual":
                resultado = this.handleContinenteTimeAtual((String) pergunta.getValor(), resposta);
                break;
            case "paisTimeAtual":
                resultado = this.handlePaisTimeAtual((String) pergunta.getValor(), resposta);
                break;
            case "posicao":
                resultado = this.handlePosicao((String) pergunta.getValor(), resposta);
                break;
            case "isDestro":
                resultado = this.handleIsDestro((Boolean) pergunta.getValor(), resposta);
                break;
            case "timeRevelacao":
                resultado = this.handleTimeRevelacao((String) pergunta.getValor(), resposta);
                break;
            default:
                System.out.println("Atributo de Comparaçãoo Não Encontrado");
        }
        return resultado;
    }
    private Boolean handleIdade(int idadeComparar, Boolean resposta)
    {
        if(this.idade > idadeComparar && resposta) 
            return true;
        else if(this.idade < idadeComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handleTimeAtual(String timeAtualComparar, Boolean resposta)
    {
        if(this.timeAtual == timeAtualComparar && resposta) 
            return true;
        else if(this.timeAtual != timeAtualComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handleContinenteTimeAtual(String continenteTimeAtualComparar, Boolean resposta)
    {
        if(this.continenteTimeAtual == continenteTimeAtualComparar && resposta) 
            return true;
        else if(this.continenteTimeAtual != continenteTimeAtualComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handlePaisTimeAtual(String paisTimeAtualComparar, Boolean resposta)
    {
        if(this.paisTimeAtual == paisTimeAtualComparar && resposta) 
            return true;
        else if(this.paisTimeAtual != paisTimeAtualComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handlePosicao(String posicaoComparar, Boolean resposta)
    {
        if(this.posicao == posicaoComparar && resposta) 
            return true;
        else if(this.posicao != posicaoComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handleIsDestro(Boolean isDestroComparar, Boolean resposta)
    {
        if(this.isDestro == isDestroComparar && resposta) 
            return true;
        else if(this.isDestro != isDestroComparar && !resposta)
            return true;
        return false;
    }
    private Boolean handleTimeRevelacao(String timeRevelacaoComparar, Boolean resposta)
    {
        if(this.timeRevelacao == timeRevelacaoComparar && resposta) 
            return true;
        else if(this.timeRevelacao != timeRevelacaoComparar && !resposta)
            return true;
        return false;
    }
}
