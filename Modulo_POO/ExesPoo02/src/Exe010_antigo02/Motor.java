package Exe010_antigo02;

import java.util.Scanner;

public class Motor {

    private int id;
    private double cilindrada;
    private int qtdCilindros;
    private int potencia;
    private static int contadorId;

    public Motor(double cilindrada, int qtdCilindros, int potencia) {
        contadorId++;
        this.id = contadorId;
        this.cilindrada = cilindrada;
        this.qtdCilindros = qtdCilindros;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getQtdCilindros() {
        return qtdCilindros;
    }

    public void setQtdCilindros(int qtdCilindros) {
        this.qtdCilindros = qtdCilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public static Motor cadastrarMotor(Scanner scan){

        System.out.println("Cilindrada: ");
        double cilindrada = scan.nextDouble();

        System.out.println("Quantidade de cilindros: ");
        int qtdCilindros = scan.nextInt();

        System.out.println("potencia");
        int potencia = scan.nextInt();

        return new Motor(cilindrada, qtdCilindros, potencia);

    }
}
