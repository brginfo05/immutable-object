package com.brgarcia.immutable;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado.Builder(10)
                .opacidade(.2)
                .build();

        Quadrado quadrado2 = quadrado
                .toBuilder()
                .opacidade(.3)
                .tamanho(5)
                .build();
    }
}
