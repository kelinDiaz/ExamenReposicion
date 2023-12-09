package hn.unah.examen.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.modelos.Posiciones;
import hn.unah.examen.repositorios.PosicionesRepository;
import hn.unah.examen.servicios.PosicionesService;
@Service
public class PosicionesServiceImpl implements PosicionesService {
    
    @Autowired
private PosicionesRepository posicionesRepository; 

 @Override
 public List<Posiciones> obtenerTablaPosiciones() {
     // TODO Auto-generated method stub
     return posicionesRepository.findAll();
 }

}
