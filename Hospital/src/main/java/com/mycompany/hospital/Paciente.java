package com.mycompany.hospital;

public class Paciente {
    private int id_Paciente;
    private String nombre;

    public Paciente(int id_Paciente, String nombre) {
        this.id_Paciente = id_Paciente;
        this.nombre = nombre;
    }

    public int getId_Paciente() { return id_Paciente; }
    public String getNombre() { return nombre; }
}
