package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Equipos;

public interface EquiposRepository extends JpaRepository<Equipos , Integer> {
    
}
