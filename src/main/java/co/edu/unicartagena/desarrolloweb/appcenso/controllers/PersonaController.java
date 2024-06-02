/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.desarrolloweb.appcenso.controllers;

import co.edu.unicartagena.desarrolloweb.appcenso.models.Lugar;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Persona;
import co.edu.unicartagena.desarrolloweb.appcenso.services.lugar.LugarService;
import co.edu.unicartagena.desarrolloweb.appcenso.services.persona.PersonaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
public class PersonaController {

@Autowired
PersonaService personaService; 

@GetMapping("/listar_persona")
public String listarLugares(Model modelo) {
    List<Persona> listaPersonas = (List<Persona>) personaService.listarPersonas(); 
    modelo.addAttribute("personas", listaPersonas); 
    return "persona/listar";
}

@GetMapping("/agregar_persona")
public String agregar(Persona persona, Model model) {
    return "persona/modificar"; 
}

@PostMapping("/guardar_persona")
public String guardar(Persona persona, RedirectAttributes redirectAttributes) {
    personaService.guardar(persona);
    redirectAttributes.addFlashAttribute("mensaje", "Se realizó con éxito!");
    return "redirect:/listar_persona"; 
}

@GetMapping("/editar_persona/{DNI}") 
public String editar(Persona persona, Model modelo) {
    log.info("Invocando el método editar"); 
    persona = personaService.buscar(persona); 
    modelo.addAttribute("persona", persona); 
    return "persona/modificar";
}

@GetMapping("/eliminar_persona/{DNI}")
public String eliminar(Persona persona) {
    personaService.eliminar(persona);
    return "redirect:/listar_persona"; 
}
}