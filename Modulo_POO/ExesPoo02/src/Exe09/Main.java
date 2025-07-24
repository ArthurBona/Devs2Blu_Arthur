package Exe09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria("Guerreiro", "Ataque Cortante", "Fúria de Batalha"));
        categorias.add(new Categoria("Mago", "Bola de Fogo", "Tempestade Arcana"));
        categorias.add(new Categoria("Arqueiro", "Disparo Preciso", "Chuva de Flechas"));

        Personagem personagem = Personagem.cadastrarPersonagem(scan, categorias);
        personagem.usarHabilidade(scan);
    }
}

