package adivinhator;

public class Pergunta 
{
    private String pergunta;
    private String atributo;
    private Object valor;

    public Pergunta(String pergunta, String atributo, Object valor) 
    {
        this.pergunta = pergunta;
        this.atributo = atributo;
        this.valor = valor;
    }
    public String getPergunta() 
    {
        return this.pergunta;
    }
    public String getAtributo() 
    {
        return this.atributo;
    }
    public Object getValor() 
    {
        return this.valor;
    }
    public void exibirPergunta() 
    {
        System.out.println(this.pergunta);
        System.out.println("S - Sim");
        System.out.println("N - NÃ£o");
    }
}
