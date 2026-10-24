package exercicio4oo.classes;

public class Circulo {
    private static final int diametro = 2;

    private double raio;

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return diametro * this.raio;
    }

    public double calcularPerimetro() {
        return Math.PI * this.calcularDiametro();
    }

    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }
}