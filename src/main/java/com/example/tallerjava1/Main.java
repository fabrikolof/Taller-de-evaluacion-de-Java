package com.example.tallerjava1;

import java.util.Arrays;

public class Main {

    public static void referenciarMetodoStatic() {
        System.out.println("Método Referido static");
    }

    public void referenciarMetodoInstanciadoObjetoArbitrario() {

    }

    public void referenciarMetodoInstanciadoObjetoParticular() {

    }

    public void referenciarConstructor() {

    }

    public void operar() {
//        Operacion op = () -> Main.referenciarMetodoStatic();
//        op.saludar();

        Operacion op2 = Main::referenciarMetodoStatic;
        op2.saludar();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.operar();
    }
}