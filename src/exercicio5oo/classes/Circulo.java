package exercicio5oo.classes;

public class Circulo {
    private static final int diametro = 2;
    private static final double minimo = 0;
    private static final double maximo = 1000;
    private double raio;

    @Override
    public String toString() {
        return String.format("Circulo [raio=%.2f]", this.raio);
    }

    public Circulo() {
    }

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        if (raio >= minimo && raio <= maximo) {
            this.raio = raio;
        }
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