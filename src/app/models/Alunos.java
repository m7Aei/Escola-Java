package app.models;

import java.util.Scanner;

public class Aluno {
  private int id;
  private int qtdAlunos;
  private String nome;
  private String responsavel;
  private String endereco;
  private String observacoes;
  private String dataNascimento;

  public Aluno(int id, int qtdAlunos, String nome, String responsavel, String endereco, String observacoes,
      String dataNascimento) {
    this.id = id;
    this.qtdAlunos = qtdAlunos;
    this.nome = nome;
    this.responsavel = responsavel;
    this.endereco = endereco;
    this.observacoes = observacoes;
    this.dataNascimento = dataNascimento;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQtdAlunos() {
    return this.qtdAlunos;
  }

  public void setQtdAlunos(int qtdAlunos) {
    this.qtdAlunos = qtdAlunos;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getResponsavel() {
    return this.responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getObservacoes() {
    return this.observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public Date getDataNascimento() {
    return this.dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}