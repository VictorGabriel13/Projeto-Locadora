public class Moto extends Veiculos {
    private final int cilindradas;

    public Moto(String marca, String modelo, int ano, double precoPorDia, int cilindradas) {
        super(marca, modelo, ano, precoPorDia);
        this.cilindradas = cilindradas;
    }

    @Override
    public void setPrecoPorDia(double precoPorDia) {
        super.setPrecoPorDia(precoPorDia);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    // Exibir Informações
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + getCilindradas());
    }
}