package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroParadas;

    public RutaGastronomica(String nombre,
                            double duracionHoras,
                            int numeroParadas) {

        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {
        return "===== RUTA GASTRONÓMICA =====\n"
                + super.toString()
                + "\nNúmero de paradas: "
                + numeroParadas;
    }
}