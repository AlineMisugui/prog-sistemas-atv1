package prg.sistemas.atv1.domain;

public class Moto extends Veiculo {

  private Boolean temSidecar;

  public Moto(String marca, String modelo, Integer ano, Boolean temSidecar) {
    super(marca, modelo, ano);
    this.temSidecar = temSidecar;
  }

  @Override
  public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Tem sidecar: " + this.temSidecar);
  }
}
