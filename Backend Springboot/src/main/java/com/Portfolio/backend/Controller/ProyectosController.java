package com.Portfolio.backend.Controller;

import com.Portfolio.backend.Entity.Proyectos;
import com.Portfolio.backend.Interface.IProyectosService;
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
@RequestMapping("/proyectos")
public class ProyectosController {
     @Autowired IProyectosService iproyectosService;
     
     @GetMapping("/ver")
     public List<Proyectos> getProyectos(){
         return iproyectosService.getProyectos();
     }
     @PostMapping("/crear")
     public String createProyectos(@RequestBody Proyectos proyectos){
         iproyectosService.saveProyectos(proyectos);
         return "Proyectos fue creada correctamente";
     }
     @DeleteMapping("/borrar/{id}")
     public String deleteProyectos(@PathVariable Long id){
       iproyectosService.deleteProyectos(id);
       return "Proyectos eliminada correctamente";
     }
     @PutMapping("/editar/{id}")
     public Proyectos editProyectos(@PathVariable Long id,
                                    @RequestParam("nombreProy") String nuevoNombreProy,
                                    @RequestParam("imgProy") String nuevoImgProy,
                                    @RequestParam("descProy") String nuevoDescProy){
         Proyectos proyectos = iproyectosService.findProyectos(id);
         proyectos.setNombreProy(nuevoNombreProy);
         proyectos.setImgProy(nuevoImgProy);
         proyectos.setDescProy(nuevoDescProy);
     
         iproyectosService.saveProyectos(proyectos);
         return proyectos;
     }
}
