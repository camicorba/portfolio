package com.Portfolio.backend.Controller;

import com.Portfolio.backend.Entity.Educacion;
import com.Portfolio.backend.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/educacion")
public class EducacionController {
     @Autowired IEducacionService ieducacionService;
     
     @GetMapping("/ver")
     public List<Educacion> getEducacion(){
         return ieducacionService.getEducacion();
     }
     @PostMapping("/crear")
     public String createEducacion(@RequestBody Educacion educacion){
         ieducacionService.saveEducacion(educacion);
         return "Educacion fue creada correctamente";
     }
     @DeleteMapping("/borrar/{id}")
     public String deleteEducacion(@PathVariable Long id){
       ieducacionService.deleteEducacion(id);
       return "Edicacion eliminada correctamente";
     }
     @PutMapping("/editar/{id}")
     public Educacion editEducacion(@PathVariable Long id,
                                    @RequestParam("tituloEdu") String nuevoTituloEdu,
                                    @RequestParam("lugarEdu") String nuevoLugarEdu,
                                    @RequestParam("fechaiEdu") String nuevoFechaiEdu,
                                    @RequestParam("fechafEdu") String nuevoFechafEdu,
                                    @RequestParam("descEdu") String nuevoDescEdu,
                                    @RequestParam("certiEdu") String nuevoCertiEdu){
         Educacion educacion = ieducacionService.findEducacion(id);
         educacion.setTituloEdu(nuevoTituloEdu);
         educacion.setLugarEdu(nuevoLugarEdu);
         educacion.setFechaiEdu(nuevoFechaiEdu);
         educacion.setFechafEdu(nuevoFechafEdu);
         educacion.setDescEdu(nuevoDescEdu);
         educacion.setCertiEdu(nuevoCertiEdu);
         
         ieducacionService.saveEducacion(educacion);
         return educacion;
     }
}
