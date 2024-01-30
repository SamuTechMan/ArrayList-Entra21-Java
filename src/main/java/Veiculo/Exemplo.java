package Veiculo;

import java.util.ArrayList;

public class Exemplo {
    public static void main(String args[]) {
        ArrayList<Veiculo> duasRodas = new ArrayList<Veiculo>();

        System.out.println("duas Rodas " + duasRodas.size() + " :" + duasRodas);

        Veiculo primeiro = new Veiculo("Motocross", "bmx", "Preto", 1992);
        System.out.println("\nPrimeira: " + primeiro);
        duasRodas.add(primeiro);
        duasRodas.add(new Veiculo("Gol", "Voyage", "Branco", 2023));
        duasRodas.add(new Veiculo("Opala SS", "Chevolet", "Vermelho", 1990));

        System.out.println("\nEspecificacoes 1");
        for (int i = 0; i < duasRodas.size(); i++) {
            Veiculo rodas = duasRodas.get(i);
            System.out.println("Tipo: " + rodas.getTipo());
            System.out.println("Marca: " + rodas.getMarca());
            System.out.println("Cor: " + rodas.getCor());
            System.out.println("Ano: " + rodas.getAno());
            System.out.println("---------------------------------------------");
        }
        System.out.println("especificacoes 2 ");
        for (Veiculo rodas : duasRodas) {
            System.out.println("Tipo: " + rodas.getTipo());
            System.out.println("Marca: " + rodas.getMarca());
            System.out.println("Cor: " + rodas.getCor());
            System.out.println("Ano: " + rodas.getAno());
            System.out.println("---------------------------------------------");
        }
    }
}

