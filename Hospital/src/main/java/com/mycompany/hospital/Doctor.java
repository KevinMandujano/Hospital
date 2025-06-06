/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

public class Doctor {
    private int id_Medico;
    private String nombre_Completo;
    private String especialidad;

    public Doctor(int id_Medico, String nombre_Completo, String especialidad) {
        this.id_Medico = id_Medico;
        this.nombre_Completo = nombre_Completo;
        this.especialidad = especialidad;
    }

    public int getId_Medico() { return id_Medico; }
    public String getNombre_Completo() { return nombre_Completo; }
    public String getEspecialidad() { return especialidad; }
}
