package com.mycompany.hospital;

public class Cita {
    private int id_Cita;
    private String fecha;
    private String hora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(int id_Cita, String fecha, String hora, String motivo, Doctor doctor, Paciente paciente) {
        this.id_Cita = id_Cita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public int getId_Cita() { return id_Cita; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getMotivo() { return motivo; }
    public Doctor getDoctor() { return doctor; }
    public Paciente getPaciente() { return paciente; }
}