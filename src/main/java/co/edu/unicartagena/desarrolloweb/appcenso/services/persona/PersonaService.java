/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicartagena.desarrolloweb.appcenso.services.persona;

import co.edu.unicartagena.desarrolloweb.appcenso.models.Persona;
import java.util.List;


public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona); 
    
    public void eliminar(Persona persona); 
    
    public Persona buscar(Persona persona); 
}
