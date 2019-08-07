package models;

import java.util.Scanner;

public class Aluno {
  private int id;
  private String nome;
  private String responsavel;
  private String endereco;
  private String observacoes;
  private Date dataNascimento;

  public Aluno() {
  }

  public Aluno(int id, String nome, String responsavel, String endereco, String observacoes, Date dataNascimento) {
    this.id = id;
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