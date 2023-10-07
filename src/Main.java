import model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("digite o sobrenome do aluno");
        String sobrenome = scanner.nextLine();
        System.out.println("digite o endereço do aluno");
        String endereco = scanner.nextLine();
        System.out.println("digite a matricula do aluno");
        Integer matricula = scanner.nextInt();
        System.out.println("digite a idade do aluno");
        Integer idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome,sobrenome,endereco,matricula, idade);
        System.out.println(aluno.toString());

    }
}

