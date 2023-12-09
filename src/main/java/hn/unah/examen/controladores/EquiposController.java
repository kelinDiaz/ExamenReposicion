package hn.unah.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.modelos.Equipos;
import hn.unah.examen.servicios.impl.EquipoServiceImpl;

@RestController
@RequestMapping("/api/equipos")
public class EquiposController {
    
     @Autowired
    private EquipoServiceImpl equipoServiceImpl; 



   
    @PostMapping("/crearEquipo")
    public Equipos crearEquipo(@RequestBody Equipos equipo) {
        // TODO Auto-generated method stub
        return this.equipoServiceImpl.crearEquipo(equipo); 
    }


    @DeleteMapping("/eliminar/{codigoequipo}")
    public String eliminarEquipo(@PathVariable(name = "codigoequipo")int codigoequipo) {


        return this.equipoServiceImpl.eliminarEquipo(codigoequipo);
    }





@GetMapping("/buscar/{codigoequipo}")
public Equipos buscarEquipo( @PathVariable(name = "codigoequipo")int codigoequipo) {

return this.equipoServiceImpl.buscarEquipo(codigoequipo);

    }


    @PostMapping("/simularpartidos")
    public ResponseEntity<String> simularPartidos() {
        equipoServiceImpl.simularPartidos();
        return ResponseEntity.ok("Simulación de partidos completada");
    }

}

