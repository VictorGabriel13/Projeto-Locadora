public class Veiculos {
    private final String marca; // Atributos
    private final String modelo; // Atributos
    private final int ano; // Atributos
    public double precoPorDia; // Atributos

    // Construto Classe Veiculos
    public Veiculos(String marca, String modelo, int ano, double precoPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoPorDia = precoPorDia;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    // Calcula o preço por Dia
    public double CalcularAluguel(int dias) {
       return precoPorDia * dias;
    }

    // Exibir Informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());

    }
}