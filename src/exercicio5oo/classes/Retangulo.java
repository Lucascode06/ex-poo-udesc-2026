package exercicio5oo.classes;

public class Retangulo {
    private static final double minima = 0;
    private static final double maxima = 1000;
    private double largura;
    private double altura;

    @Override
    public String toString() {
        return String.format("Retangulo [largura=%.2f, altura=%.2f]", this.largura, this.altura);
    }

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.setLargura(largura);
        this.setAltura(altura);
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (this.dimensaoInvalida(largura)) {
            return;
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (this.dimensaoInvalida(altura)) {
            return;
        }
        this.altura = altura;
    }

    private boolean dimensaoInvalida(double valor) {
        return valor < minima || valor > maxima;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

}