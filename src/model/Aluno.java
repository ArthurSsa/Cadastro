package model;

public class Aluno {
    private String nome;
    private String sobrenome;
    private String endereco;
    private Integer matricula;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setMatricula(String matricula) {
        this.sobrenome = sobrenome;
    }

    public String getendereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", matricula=" + matricula +
                ", idade=" + idade +
                '}';
    }

    public Aluno(String nome, String sobrenome, String endereco, Integer matricula, Integer idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.idade = idade;



    }

}

