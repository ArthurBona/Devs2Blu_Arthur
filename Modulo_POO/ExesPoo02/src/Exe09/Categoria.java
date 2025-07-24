package Exe09;

import java.util.Scanner;

public class Categoria {

    private int id;
    private String nome;
    private String habilidadeBasica;
    private String habilidadeEspecial;
    private static int contadorId;

    public Categoria(String nome, String habilidadeBasica, String habilidadeEspecial) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.habilidadeBasica = habilidadeBasica;
        this.habilidadeEspecial = habilidadeEspecial;
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

    public String getHabilidadeBasica() {
        return habilidadeBasica;
    }

    public void setHabilidadeBasica(String habilidadeBasica) {
        this.habilidadeBasica = habilidadeBasica;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
