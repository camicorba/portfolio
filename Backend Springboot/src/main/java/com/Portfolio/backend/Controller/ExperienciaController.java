package com.Portfolio.backend.Controller;

import com.Portfolio.backend.Entity.Experiencia;
import com.Portfolio.backend.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("/experiencia")
public class ExperienciaController {
     @Autowired IExperienciaService iexperienciaService;
     
     @GetMapping("/ver")
     public List<Experiencia> getExperiencia(){
         return iexperienciaService.getExperiencia();
     }
     @PostMapping("/crear")
     public String createExperiencia(@RequestBody Experiencia experiencia){
         iexperienciaService.saveExperiencia(experiencia);
         return "Experiencia fue creada correctamente";
     }
     @DeleteMapping("/borrar/{id}")
     public String deleteExperiencia(@PathVariable Long id){
       iexperienciaService.deleteExperiencia(id);
       return "Experiencia eliminada correctamente";
     }
     @PutMapping("/editar/{id}")
     public Experiencia editExperiencia(@PathVariable Long id,
                                    @RequestParam("tituloExp") String nuevoTituloExp,
                                    @RequestParam("puestoExp") String nuevoPuestoExp,
                                    @RequestParam("fechaiExp") String nuevoFechaiExp,
                                    @RequestParam("fechafExp") String nuevoFechafExp,
                                    @RequestParam("descExp") String nuevoDescExp,
                                    @RequestParam("linkExp") String nuevoLinkExp){
         Experiencia experiencia = iexperienciaService.findExperiencia(id);
         experiencia.setTituloExp(nuevoTituloExp);
         experiencia.setPuestoExp(nuevoPuestoExp);
         experiencia.setFechaiExp(nuevoFechaiExp);
         experiencia.setFechafExp(nuevoFechafExp);
         experiencia.setDescExp(nuevoDescExp);
         experiencia.setLinkExp(nuevoLinkExp);
         
         iexperienciaService.saveExperiencia(experiencia);
         return experiencia;
     }
         @GetMapping("/traer/experiencia")
    public Experiencia findPersona(){
        return iexperienciaService.findExperiencia((long)1);
    }
}
