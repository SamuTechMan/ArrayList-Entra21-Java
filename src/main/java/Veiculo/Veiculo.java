package Veiculo;

import lombok.Data;

@Data
public class Veiculo {
    private String tipo;
    private String marca;
    private String cor;
    private Integer ano;

    public Veiculo(String tipo, String marca,String cor, Integer ano) {
        setTipo(tipo);
        setMarca(marca);
        setCor(cor);
        setAno(ano);
    }

    public void setAno(Integer ano) {
        if (ano < 1990) {
            ano = 1990;
        } else {
            this.ano = ano;
        }
    }

    public String toString() {
        return marca + "-" + tipo + "-" + ano;
    }
}