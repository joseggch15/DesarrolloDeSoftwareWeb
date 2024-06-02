/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicartagena.desarrolloweb.appcenso.services.lugar;

import co.edu.unicartagena.desarrolloweb.appcenso.models.Lugar;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface LugarService {
    public List<Lugar> listarLugares();
    
    public void guardar(Lugar lugar); 
    
    public void eliminar(Lugar lugar); 
    
    public Lugar buscar(Lugar lugar); 
}
