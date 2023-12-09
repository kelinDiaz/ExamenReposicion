package hn.unah.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.modelos.Posiciones;
import hn.unah.examen.servicios.impl.PosicionesServiceImpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionesController {
   
   @Autowired
    private PosicionesServiceImpl posicionesServiceImpl; 

     @GetMapping("/obtenerTablaPosiciones")
    public ResponseEntity<?> obtenerTablaPosiciones() {
        try {
            Iterable<Posiciones> tablaPosiciones = this.posicionesServiceImpl.obtenerTablaPosiciones();
            return new ResponseEntity<>(tablaPosiciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al obtener la tabla de posiciones", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
