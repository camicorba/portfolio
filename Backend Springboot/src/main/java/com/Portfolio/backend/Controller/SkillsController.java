package com.Portfolio.backend.Controller;

import com.Portfolio.backend.Entity.Skills;
import com.Portfolio.backend.Interface.ISkillsService;
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
@RequestMapping("/skills")
public class SkillsController {

     @Autowired ISkillsService iskillsService;
     
     @GetMapping("/ver")
     public List<Skills> getSkills(){
         return iskillsService.getSkills();
     }
     @PostMapping("/crear")
     public String createSkills(@RequestBody Skills skills){
         iskillsService.saveSkills(skills);
         return "Skills fue creada correctamente";
     }
     @DeleteMapping("/borrar/{id}")
     public String deleteSkills(@PathVariable Long id){
       iskillsService.deleteSkills(id);
       return "Skills eliminada correctamente";
     }
     @PutMapping("/editar/{id}")
     public Skills editSkills(@PathVariable Long id,
                                    @RequestParam("nombreSkill") String nuevoNombreSkill,
                                    @RequestParam("imgSkill") String nuevoImgSkill,
                                    @RequestParam("porcentajeSkill") String nuevoPorcentajeSkill){
         Skills skills = iskillsService.findSkills(id);
         skills.setNombreSkill(nuevoNombreSkill);
         skills.setImgSkill(nuevoImgSkill);
         skills.setPorcentajeSkill(nuevoPorcentajeSkill);

         
         iskillsService.saveSkills(skills);
         return skills;
     } 
}
