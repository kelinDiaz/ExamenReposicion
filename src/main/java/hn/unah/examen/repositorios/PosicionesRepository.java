package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Posiciones;

public interface PosicionesRepository  extends JpaRepository<Posiciones, Integer>{
    
}
