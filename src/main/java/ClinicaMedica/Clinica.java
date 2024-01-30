package ClinicaMedica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<Medico> Medicos = new ArrayList<Medico>();

        int opcao, opMedico, opHour = 0;

        Medicos.add(new Medico(" José", " Odontologista", "1350"));
        Medicos.add(new Medico(" Rodrigo", " Terapeuta", "400"));
        Medicos.add(new Medico(" Jeff", " Patologista", "930"));

        for (Medico medico : Medicos) {
            SimpleDateFormat Format = new SimpleDateFormat("HHmm");
            int hora = Integer.parseInt(medico.getHorario());
            String horaFix = "";
            if (hora < 1000) {
                horaFix = "0" + hora;
                Date date = Format.parse(horaFix);
                SimpleDateFormat FormatHour = new SimpleDateFormat("HH:mm");
                medico.setHorario(FormatHour.format(date));
            } else {
                Date date = Format.parse(medico.getHorario());
                SimpleDateFormat FormatHour = new SimpleDateFormat("HH:mm");
                medico.setHorario(FormatHour.format(date));
            }
        }
        do {
            System.out.println("Seja Bem vindo!");
            System.out.print("Gostaria de marcar uma consulta? (1-Sim ou 2-Não) \n: ");
            opcao = in.nextInt();
            if (opcao == 2) {
                break;
            }
            System.out.println("Com qual medico você gostaria de marcar?");
            int count = 1;
            for (Medico medico : Medicos) {
                String nome = medico.getNome() + " -" + medico.getEspecialidade();
                System.out.println(count + " -" + nome);
                count++;
            }
            System.out.print(": ");
            opMedico = in.nextInt();
            switch (opMedico) {
                case 1: {
                    Medicos.get(0).Marcar(Medicos, in);
                    break;
                }
                case 2:{
                    Medicos.get(1).Marcar(Medicos, in);
                    break;
                }
                case 3:{
                    Medicos.get(2).Marcar(Medicos, in);
                    break;
                }
            }
            break;
        } while (opHour == 0);
        System.out.println("\nTenha um bom dia!");
    }
}