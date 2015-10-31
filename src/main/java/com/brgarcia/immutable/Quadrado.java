package com.brgarcia.immutable;

public class Quadrado {

    private final double opacidade;
    private final double tamanho;

    private Quadrado(Builder builder) {
        this.opacidade = builder.opacidade;
        this.tamanho = builder.tamanho;
    }

    public double getOpacidade() {
        return opacidade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {

        private double opacidade;
        private double tamanho;

        public Builder(double tamanho) {
            this.tamanho = tamanho;
        }

        private Builder(Quadrado quadrado) {
            tamanho = quadrado.tamanho;
            opacidade = quadrado.opacidade;
        }

        public Builder opacidade(double opacidade) {
            this.opacidade = opacidade;
            return this;
        }

        public Builder tamanho(double tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public Quadrado build() {
            return new Quadrado(this);
        }
    }
}
