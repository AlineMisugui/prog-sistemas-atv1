package prg.sistemas.atv1;

import prg.sistemas.atv1.domain.Carro;
import prg.sistemas.atv1.domain.Moto;
import prg.sistemas.atv1.domain.Veiculo;

public class Main {
  public static void main(String[] args) {
    // Instanciando um veiculo
    Veiculo veiculo = new Veiculo("Chevrolet", "Cruze", 2020);

    // Instanciando um carro
    Carro carro = new Carro("Toyota", "Corolla", 2020, 4);

    // Instanciando uma moto
    Moto moto = new Moto("Honda", "CB500", 2019, false);

    System.out.println("\nDetalhes do veículo:");
    veiculo.exibirDetalhes();

    System.out.println("\nDetalhes do carro:");
    carro.exibirDetalhes();

    System.out.println("\nDetalhes da moto:");
    moto.exibirDetalhes();
  }
}
