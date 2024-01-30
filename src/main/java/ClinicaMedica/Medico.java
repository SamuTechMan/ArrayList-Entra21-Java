package ClinicaMedica;

import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;

@Data
public class Medico {
    private String nome;
    private String especialidade;
    private String horario;

    public Medico(String nome, String especialidade, String horario) {
        setNome(nome);
        setEspecialidade(especialidade);
        setHorario(horario);
    }

    public void Marcar(ArrayList<Medico> Medicos, Scanner in) {
        String horaMarcada, medicoMarcado, medicoEspecialidade;
        int count = 1;
        int opHour, index;

        System.out.println("Qual horário você gostaria de marcar?");
        for (Medico medico : Medicos) {
            String horario = medico.getHorario();
            System.out.println(count + " - " + horario);
            count++;
        }
        System.out.print(": ");
        opHour = in.nextInt();
        Medico medico = Medicos.get(opHour - 1);
        horaMarcada = medico.getHorario();
        medicoMarcado = this.getNome();
        medicoEspecialidade = this.getEspecialidade();
        System.out.println("\nOK horário marcado para ás " + horaMarcada + " com o médico"
                + medicoMarcado + medicoEspecialidade);
    }
}

