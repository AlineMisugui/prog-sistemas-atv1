package prg.sistemas.atv1.domain;


public class Veiculo {
  private String marca;
  private String modelo;
  private Integer ano;

  public Veiculo(String marca, String modelo, Integer ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public Integer getAno() {
    return ano;
  }

  public void exibirDetalhes() {
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano: " + this.ano);
  }
}
