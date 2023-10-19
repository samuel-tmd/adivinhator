package com.mycompany.adivinhator;

public class Pergunta 
{
    private String pergunta;
    private String atributo;

    public Pergunta(String pergunta, String atributo) 
    {
        this.pergunta = pergunta;
        this.atributo = atributo;
    }
    public String getPergunta() 
    {
        return this.pergunta;
    }
    public String getAtributo() 
    {
        return this.atributo;
    }
}