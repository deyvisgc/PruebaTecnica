package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        tinka();
    }

    static void tinka() {
        List<Equipos> equipo = new ArrayList<>();
        List<Equipos> equiposPar = new ArrayList<>();
        List<Equipos> equiposInpar = new ArrayList<>();
        List<Partidas> partidas = new ArrayList<>();

        Equipos equipoVerde = new Equipos("Equipo verde");
        equipo.add(equipoVerde);

        Equipos equipoRosado = new Equipos("Equipo rosado");
        equipo.add(equipoRosado);

        Equipos equipoAzul = new Equipos("Equipo azul");
        equipo.add(equipoAzul);

        Equipos equipoTurquesa = new Equipos("Equipo turquesa");
        equipo.add(equipoTurquesa);

        for (int i = 0; i < 5; i++) {
            Partidas partidas1 = new Partidas(i, "partida" + i);
            partidas.add(partidas1);
        }

        Integer count = 0;
        for (Partidas p : partidas) {
            if (p.getNumPartidas() <= partidas.size()) {
                for (int i = 0; i < equipo.size(); i++) {
                    // PAR
                    for (int j = 0; j < equipo.size(); j++) {
                        if (equipo.get(i).getDescripcion() != equipo.get(j).getDescripcion()) {
                            Equipos equipos = new Equipos("[ " + equipo.get(i).getDescripcion() + "," + equipo.get(j).getDescripcion() + "]");
                            equiposPar.add(equipos);
                            //System.out.println("el primer participante es: " + equipo.get(i).getDescripcion() + " el segundo participante es: " + equipo.get(j).getDescripcion());
                        }
                        break;

                    }
                    for (int k = 0; k < equipo.size(); k++) {
                        if ( k < 1 && k % 2 == 0) {
                            Equipos equipos1 = new Equipos("[ " + "Descansa" + "," + equipo.get(k).getDescripcion() + "]");
                            equiposInpar.add(equipos1);
                        } else {
                            if (equipo.get(i).getDescripcion() != equipo.get(k).getDescripcion()) {
                                Equipos equipos = new Equipos("[ " + equipo.get(i).getDescripcion() + "," + equipo.get(k).getDescripcion() + "]");
                                equiposInpar.add(equipos);
                            }
                            break;
                        }

                    }
                }
            }
        }
        for (Equipos equipos: equiposPar) {
            System.out.println(equipos.getDescripcion());
        }
        System.out.println("#######################################################");
        for (Equipos equiposImpar: equiposInpar) {
            System.out.println(equiposImpar.getDescripcion());
        }
    }
}