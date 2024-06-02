/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.desarrolloweb.appcenso.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Entity
@Table(name="Personas", catalog="censo")
@Data
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name="DNI", nullable= false)
    private String DNI;
    
    @Column(name="Nombre", nullable= false)
    private String nombre; 
    
    @Column(name="Apellidos", nullable= false)
    private String apellidos;
    
    @Column(name="Fecha_nacimiento", nullable= false)
    private String fechaNacimiento;
    
    @Column(name="Lugar_nacimiento", nullable= false)
    private String lugarNacimiento;
    
    @Column(name="Edad", nullable= false)
    private int edad;
    
    @Column(name="Estatura", nullable= false)
    private Double estatura;
    
    @Column(name="Sexo", nullable= false)
    private String sexo;
    
    @Column(name="Nivel_estudios", nullable= false)
    private String nivelEstudio;
    
    @Column(name="Situacion_militar", nullable= false)
    private String situacionMilitar;
}

