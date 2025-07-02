public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome não pode ser vazio");
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa");
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos de idade");
    }

}
