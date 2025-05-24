public class Carro extends Veiculos {
    private final int quantidadePortas;

    // Construtor classe Carro
    public Carro(String marca, String modelo, int ano, double precoPorDia, int quantidadePortas) {
        super(marca, modelo, ano, precoPorDia);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void setPrecoPorDia(double precoPorDia) {
        super.setPrecoPorDia(precoPorDia);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    // Exibir Informações
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + getQuantidadePortas());
    }
}
