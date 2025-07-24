package Exe09;

import java.util.ArrayList;
import java.util.Scanner;

public class Personagem {

    private int id;
    private String nome;
    private Categoria categoria;
    private Arma arma;
    private static int contadorId;

    public Personagem(String nome, Categoria categoria, Arma arma) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.categoria = categoria;
        this.arma = arma;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public static Personagem cadastrarPersonagem(Scanner scan, ArrayList<Categoria> categorias) {
        System.out.println("Nome do personagem: ");
        String nome = scan.nextLine();

        System.out.println("Escolha a categoria:");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println((i + 1) + " - " + categorias.get(i).getNome());
        }

        System.out.println("Qual o índice da categoria?");
        int op = scan.nextInt();
        scan.nextLine();

        Categoria categoria = categorias.get(op - 1);
        Arma arma = Arma.cadastrarArma(scan);

        return new Personagem(nome, categoria, arma);
    }

    public void usarHabilidade(Scanner scan) {
        System.out.println("Escolha a habilidade para usar:");
        System.out.println("1 - Habilidade básica (" + categoria.getHabilidadeBasica() + ")");
        System.out.println("2 - Habilidade especial (" + categoria.getHabilidadeEspecial() + ")");
        System.out.print("Digite a opção: ");

        int opcao = scan.nextInt();
        scan.nextLine(); // limpar buffer

        String habilidadeEscolhida;
        if (opcao == 1) {
            habilidadeEscolhida = categoria.getHabilidadeBasica();
        } else if (opcao == 2) {
            habilidadeEscolhida = categoria.getHabilidadeEspecial();
        } else {
            System.out.println("Opção inválida. Usando habilidade básica por padrão.");
            habilidadeEscolhida = categoria.getHabilidadeBasica();
        }

        System.out.println(nome + " usa a habilidade " + habilidadeEscolhida + " com a arma " +
                arma.getNome() + " (" + arma.getTipo() + "), causando " + arma.getDano() + " de dano!");
    }


}
