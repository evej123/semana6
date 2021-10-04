/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medico;


public class paciente {
    
    private String codigo, fecha, nombre, apellido, sexo, direccion, medico, centro, motivo;

    public paciente(String codigo, String fecha, String nombre, String apellido, String sexo, String direccion, String medico, String centro, String motivo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
        this.medico = medico;
        this.centro = centro;
        this.motivo = motivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
