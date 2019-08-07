package app.controllers;

import java.util.Scanner;
import app.models.Aluno;

public class MatriculaController {
  public static void CadastrarAluno() {
    Aluno alunos = new Aluno();
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite a quantidade de alunos para matricular: ");
    alunos.setQtdAlunos(ler.nextInt());

    for (int i = 0; i < alunos.getQtdAlunos(); i++) {
      System.out.print("Nome do aluno: ");
      alunos.setNome(ler.next());
      System.out.print("Nome do responsável: ");
      alunos.setResponsavel(ler.next());
      System.out.print("Endereço do aluno: ");
      alunos.setEndereco(ler.next());
      System.out.print("Descreva se o aluno tem observações: ");
      alunos.setObservacoes(ler.next());
      System.out.print("Qual a data de nascimento do aluno");
      alunos.setDataNascimento(ler.next());
    }

    @Override
    public String toString() {
      return "{" +
        "nome: " + alunos.getNome() + 
        "responsável: " + alunos.getResponsavel() +
        "endereço: " + alunos.getEndereco() + 
        "observações: " + alunos.getObservacoes() + 
        "data de nascimento: " + alunos.getDataNascimento() +
      "}";
    }  
  }
}