package exercicio5oo.classes;

public class Carro {
        private static final double velo = 10.0;
        private static final double minimo = 0;
        private static final double maximo = 300;
        private String modelo;
        private String marca;
        private int ano;
        private double velocidade;

        @Override
        public String toString() {
                return String.format("Carro [modelo=%s, marca=%s, ano=%d, velocidade=%.1f]",
                        this.modelo, this.marca, this.ano, this.velocidade);
        }

        public Carro() {
        }

        public Carro(String modelo, String marca, int ano, double velocidade) {
                this.modelo = modelo;
                this.marca = marca;
                this.ano = ano;
                this.setVelocidade(velocidade);
        }

        public String getModelo() {
                return this.modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getMarca() {
                return this.marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public int getAno() {
                return this.ano;
        }

        public void setAno(int ano) {
                this.ano = ano;
        }

        public double getVelocidade() {
                return this.velocidade;
        }

        public void setVelocidade(double velocidade) {
                if (velocidade < minimo || velocidade > maximo) {
                        return;
                }
                this.velocidade = velocidade;
        }

        public void acelerar() {
                this.setVelocidade(Math.min(this.velocidade + velo, maximo));
        }

        public void frear() {
                this.setVelocidade(Math.max(this.velocidade - velo, minimo));
        }

        public void imprimirVelocidade() {
                System.out.printf("Velocidade atual: %.1f km/h%n", this.velocidade);
        }

}