package ExperimentosSolo.poo.Seminario.Test;

import ExperimentosSolo.poo.Seminario.Domain.Local;
import ExperimentosSolo.poo.Seminario.Domain.Professor;
import ExperimentosSolo.poo.Seminario.Domain.Seminario;
import ExperimentosSolo.poo.Seminario.Domain.Aluno;

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolhaMenu = 0;
        while (escolhaMenu != 6) {
            System.out.println("SISTEMA ESCOLAR");
            System.out.println("1- Cadastrar Local");
            System.out.println("2- Cadastrar Seminário");
            System.out.println("3- Cadastrar Professores");
            System.out.println("4- Cadastrar Alunos");
            System.out.println("5- Seminários Cadastrados");
            System.out.println("6- Sair");
            System.out.println("----------");

            escolhaMenu = input.nextInt();
            input.nextLine();

            switch (escolhaMenu) {
                case 1:
                    String localDigitado;
                    do {
                        System.out.println("Digite o local do seminário:");
                        localDigitado = input.nextLine();
                        if (localDigitado.isEmpty() || localDigitado.length() <= 3) {
                            System.out.println("O local não pode estar vazio ou conter menos de 4 caracteres! Tente novamente");
                        }
                    } while (localDigitado.isEmpty() || localDigitado.length() <= 3);
                    Local local = new Local("");
                    local.setEndereco(localDigitado);
                    System.out.println("------------");
                    System.out.println("lOCAL CADASTRADO COM SUCESSO: " + localDigitado.toUpperCase());
                    System.out.println("------------");
                    break;
                case 2:
                    String tituloSeminario;
                    do {
                        System.out.println("Digite o nome do seminário:");
                        tituloSeminario = input.nextLine();
                        if (tituloSeminario.isEmpty() || tituloSeminario.length() <= 3) {
                            System.out.println("O nome não pode estar vazio ou conter menos de 4 caracteres! Tente novamente");
                        }
                    } while (tituloSeminario.isEmpty() || tituloSeminario.length() <= 3);
                    Seminario seminario = new Seminario("", new Local(""));
                    System.out.println("------------");
                    System.out.println("Seminário cadastrado com sucesso: " + tituloSeminario.toUpperCase());
                    System.out.println("------------");
                    break;
                case 3:
                    String prof;
                    do {
                        System.out.println("Digite o nome do professor:");
                        prof = input.nextLine();
                        if (prof.isEmpty() || prof.length() < 3) {
                            System.out.println("Nome inválido! Tente novamente");
                        }
                    } while (prof.isEmpty() || prof.length() < 3);
                    Professor[] professores = new Professor[2];
                    professores[0] = new Professor("", "");
                    professores[0].setNome(prof);

                    System.out.println("Digite a especialidade do professor:");
                    String especialidade = input.nextLine();
                    professores[0].setEspecialidade(especialidade);
                    System.out.println("------------");
                    System.out.println("Professor(a) cadastrado(a) com sucesso: " + professores[0].getNome().toUpperCase());
                    System.out.println("Especialidade: " + professores[0].getEspecialidade().toUpperCase());
                    System.out.println("------------");
                    break;
                case 4:
                    String alunoCadastro;
                    Seminario seminarios;
                    do {
                        System.out.println("Digite o nome do aluno:");
                        alunoCadastro = input.nextLine();
                        if (alunoCadastro.isEmpty() || alunoCadastro.length() < 3) {
                            System.out.println("Nome inválido! Tente novamente");
                        }
                    } while (alunoCadastro.isEmpty() || alunoCadastro.length() < 3);
                    Aluno[] alunos = new Aluno[2];
                    Local local1 = new Local("");
                    alunos[0] = new Aluno(alunoCadastro, 0, new Seminario("", local1));

                    System.out.println("Digite a idade do aluno:");
                    int idadeAluno = input.nextInt();
                    alunos[0].setIdade(idadeAluno);
                    System.out.println("------------");
                    System.out.println("Aluno(a) cadastrado(a) com sucesso: " + alunos[0].getNome().toUpperCase());
                    System.out.println("Idade: " + alunos[0].getIdade() + " anos");
                    System.out.println("------------");
                    break;
                case 5:
                    System.out.println("AINDA NAO APRENDI A ARMAZENAR TODAS ESSAS INFORMAÇÕES E COLOCAR AQUI KK ");
                    System.out.println("VOLTANDO AO MENU...");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
            }
        }
    }
}
