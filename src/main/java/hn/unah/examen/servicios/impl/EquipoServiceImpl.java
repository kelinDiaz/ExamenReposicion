package hn.unah.examen.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.modelos.Equipos;
import hn.unah.examen.repositorios.EquiposRepository;

import hn.unah.examen.servicios.EquiposService;
import java.util.Optional;
import java.util.Random;
import java.util.List;

@Service
public class EquipoServiceImpl implements EquiposService {

    @Autowired
    private EquiposRepository equiposRepository; 


   

    @Override
    public Equipos crearEquipo(Equipos equipo) {
        // TODO Auto-generated method stub
        return this.equiposRepository.save(equipo);
    }

    @Override
    public String eliminarEquipo(int codigoequipo) {
        Optional<Equipos> equipoOptional = this.equiposRepository.findById(codigoequipo);

        if (equipoOptional.isPresent()) {
            Equipos equipoEliminar = equipoOptional.get();
            this.equiposRepository.delete(equipoEliminar);
            return "Equipo eliminado";
        }

        return "Equipo a eliminar no encontrado";
    }


    @Override
    public Equipos buscarEquipo(int codigoequipo) {
        
            return this.equiposRepository.findById(codigoequipo).get();
        }
        
    



        @Override
        public void simularPartidos() {
            // TODO Auto-generated method stub



              List<Equipos> equipos = equiposRepository.findAll();

     
        if (equipos.size() < 6) {
            
            crearEquiposAdicionales();
            equipos = equiposRepository.findAll();
        }

     
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
              
                int golesEquipoLocal = generarGolesAleatorios();
                int golesEquipoVisitante = generarGolesAleatorios();

           
                actualizarPosiciones(equipos.get(i), equipos.get(j), golesEquipoLocal, golesEquipoVisitante);
          
                actualizarPosiciones(equipos.get(j), equipos.get(i), golesEquipoVisitante, golesEquipoLocal);
            }
        }
    }

    private int generarGolesAleatorios() {
        Random random = new Random();
        return random.nextInt(5);
    }

    private void actualizarPosiciones(Equipos equipoLocal, Equipos equipoVisitante, int golesLocal, int golesVisitante) {
      

  
        if (golesLocal > golesVisitante) {
       
        } else if (golesLocal < golesVisitante) {
          
        } else {
       
        }
    }

    private void crearEquiposAdicionales() {
     

        for (int i = 0; i < 6; i++) {
            Equipos equipoNuevo = new Equipos();
          
            this.crearEquipo(equipoNuevo);
        }
    }
            
        }



    
