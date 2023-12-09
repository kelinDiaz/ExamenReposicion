package hn.unah.examen.servicios;

import hn.unah.examen.modelos.Equipos;

public interface EquiposService {

    public Equipos crearEquipo(Equipos equipo); 

    public String eliminarEquipo(int codigoequipo); 

    public Equipos buscarEquipo(int codigoequipo); 

    public void simularPartidos();
}
