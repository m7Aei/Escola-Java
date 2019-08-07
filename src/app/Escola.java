package app;

import java.util.Scanner;
import app.controllers.*;
import app.models.*;

public class Escola {
  public static void main(String[] args) {
    Aluno alunos = new Aluno();
    MatriculaController matricula = new MatriculaController();

    matricula.CadastrarAluno();
  }
}