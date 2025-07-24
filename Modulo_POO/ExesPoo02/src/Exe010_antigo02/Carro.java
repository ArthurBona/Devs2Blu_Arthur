package Exe010_antigo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro {

    private int id;
    private String modelo;
    private int ano;
    private Motor motor;
    private Marca marca;
    private Proprietario proprietario;
    private static int contadorId;

    public Carro(String modelo, int ano, Motor motor, Marca marca, Proprietario proprietario) {
        contadorId++;
        this.id = contadorId;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.marca = marca;
        this.proprietario = proprietario;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }


    public static Carro cadastrarCarro(Scanner scan, ArrayList<Marca> marcas){

        System.out.println("Modelo: ");
        String modelo = scan.nextLine();

        System.out.println("Ano: ");
        int ano = scan.nextInt();

        Motor motor = Motor.cadastrarMotor(scan);

        Proprietario proprietario = Proprietario.cadastrarProprietario(scan);

        System.out.println("Escolha a marca");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println((i + 1) + " - " + marcas.get(i).getNome());
        }
        System.out.println("Qual o índice da maraca?");

        int op = scan.nextInt();
        scan.nextLine();

        Marca marca = marcas.get(op - 1);
        return new Carro(modelo, ano, motor, marca, proprietario);
    }

    public void exibirInformacoes() {
        String info = String.format(
                "O Carro é um %s, ano %d, da marca %s (%s).\n" +
                        "Motor: %.1fL, %d cilindros, %d cv.\n" +
                        "Proprietário: %s (CPF: %s)",
                modelo, ano, marca.getNome(), marca.getNacionalidade(),
                motor.getCilindrada(), motor.getQtdCilindros(), motor.getPotencia(),
                proprietario.getNome(), proprietario.getCpf()
        );
        System.out.println(info);
    }
}
