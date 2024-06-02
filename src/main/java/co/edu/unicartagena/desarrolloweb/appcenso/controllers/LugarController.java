/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.desarrolloweb.appcenso.controllers;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Lugar;
import co.edu.unicartagena.desarrolloweb.appcenso.services.lugar.LugarService;
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
public class LugarController {

@Autowired
LugarService lugarService; 

@GetMapping("/listar_lugar")
public String listarLugares(Model modelo) {
    List<Lugar> listaLugares = (List<Lugar>) lugarService.listarLugares(); 
    modelo.addAttribute("lugares", listaLugares); 
    return "lugar/listar";
}

@GetMapping("/agregar_lugar")
public String agregar(Lugar lugar) {
    return "lugar/modificar"; 
}

@PostMapping("/guardar_lugar")
public String guardar(Lugar lugar, RedirectAttributes redirectAttributes) {
    lugarService.guardar(lugar);
    redirectAttributes.addFlashAttribute("mensaje", "Se realizó con éxito!");
    return "redirect:/listar_lugar"; 
}

@GetMapping("/editar_lugar/{id}") 
public String editar(Lugar lugar, Model modelo) {
    log.info("Invocando el método editar"); 
    lugar = lugarService.buscar(lugar); 
    modelo.addAttribute("lugar", lugar); 
    return "lugar/modificar";
}

@GetMapping("/eliminar_lugar/{id}")
public String eliminar(Lugar lugar) {
    lugarService.eliminar(lugar);
    return "redirect:/listar_lugar"; 
}
}
