package com.mycompany.adivinhator;

public class Jogador
{
  private String nome;
  private Integer idade;
  private String timeAtual;
  private String paisQueAtua;
  private String posicao;
  private Boolean eDestro;
  private String timeRevelacao;
  
  public Jogador(String nome, String timeAtual, Integer idade, String paisQueAtua, String posicao, Boolean eDestro, String timeRevelacao)
  {
    this.nome = nome;
    this.idade = idade;
    this.timeAtual = timeAtual;
    this.paisQueAtua = paisQueAtua;
    this.posicao = posicao;
    this.eDestro = eDestro;
    this.timeRevelacao = timeRevelacao;
  }
}
