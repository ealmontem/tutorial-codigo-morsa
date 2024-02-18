package com.codigomorsa.tutorial;

import com.codigomorsa.tutorial.models.Libro;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {
    private final Logger logger = LoggerFactory.getLogger(Startup.class);
    @GetMapping("/hola")
    public String saluda(){
       return "Hola, Mundo desde Spring Controller :)";
    }
    @GetMapping("/libro/{id}/editorial/{editorial}")
    public String leerLibro(@PathVariable int id, @PathVariable String editorial){
        String msg = null;
        int num = id;
        if (num==2){
            logger.info("Ingresando al mensaje que dice ahora si es verdad....con id: " + num + " editorial: " + editorial);
            msg = "Bueno ahora si es verdad que se está leyendo el número id: " + num + " editorial: " + editorial;
        }else {
            logger.info("diferente de id: 2" );
            msg = "leyendo el número id: " + num + " editorial: " + editorial;
        }
        return msg;
    }

    @GetMapping("/libro/{id}")
    public String leerLibroQryParams(@PathVariable int id, @RequestParam String params){
        String msg = null;
        int num = id;
        if (num==2){
            logger.info("Ingresando al mensaje que dice ahora si es verdad....con id: " + num + " editorial: " + params);
            msg = "Bueno ahora si es verdad que se está leyendo el número id: " + num + " editorial: " + params;
        }else {
            logger.info("diferente de id: 2" );
            msg = "leyendo el número id: " + num + " editorial: " + params;
        }
        return msg;
    }


    @PostMapping("/libro")
    String guardarLibro(@RequestBody Libro libro){
         logger.info("isbn: " +libro.getIsbn()+ " Nombre del libro: " + libro.getNombre() + " Editorial: " + libro.getEditorial());
        return "Libro guardado";
    }


}
