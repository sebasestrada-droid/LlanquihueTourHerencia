package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    public void mostrarServicios() {

        ServicioTuristico ruta1 =
                new RutaGastronomica(
                        "Sabores de Puerto Varas",
                        4,
                        6);

        ServicioTuristico ruta2 =
                new RutaGastronomica(
                        "Ruta del Chocolate",
                        3,
                        4);

        ServicioTuristico paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        2.5,
                        "Catamarán");

        ServicioTuristico paseo2 =
                new PaseoLacustre(
                        "Todos los Santos",
                        3,
                        "Lancha");

        ServicioTuristico excursion1 =
                new ExcursionCultural(
                        "Museo Colonial Alemán",
                        2,
                        "Frutillar");

        ServicioTuristico excursion2 =
                new ExcursionCultural(
                        "Fuerte San Antonio",
                        2.5,
                        "Ancud");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}