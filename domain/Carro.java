package prg.sistemas.atv1.domain;

public class Carro extends Veiculo {

  private Integer numeroDePortas;

  public Carro(String marca, String modelo, Integer ano, Integer numeroDePortas) {
    super(marca, modelo, ano);
    this.numeroDePortas = numeroDePortas;
  }

  @Override
  public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Número de portas: " + this.numeroDePortas);
  }
}
