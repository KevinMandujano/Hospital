package com.mycompany.hospital;

import java.util.*;

public class Hospital_Principal {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Doctor> doctores = new ArrayList<>();
    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Cita> citas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Sistema de Administracion de Citas ---");
            System.out.println("1. Alta de doctor");
            System.out.println("2. Alta de paciente");
            System.out.println("3. Crear cita");
            System.out.println("4. Listar citas");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: altaDoctor(); break;
                case 2: altaPaciente(); break;
                case 3: crearCita(); break;
                case 4: listarCitas(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    static void altaDoctor() {
        System.out.print("ID de doctor: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        doctores.add(new Doctor(id, nombre, especialidad));
        System.out.println("Doctor agregado.");
    }

    static void altaPaciente() {
        System.out.print("ID de paciente: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        pacientes.add(new Paciente(id, nombre));
        System.out.println("Paciente agregado.");
    }

    static void crearCita() {
        System.out.print("ID de cita: ");
        int idCita = sc.nextInt(); sc.nextLine();
        System.out.print("Fecha (ej. dd-mm-aaaa): ");
        String fecha = sc.nextLine();
        System.out.print("Hora (ej. 10:00): ");
        String hora = sc.nextLine();
        System.out.print("Motivo de la cita: ");
        String motivo = sc.nextLine();

        System.out.print("ID del doctor: ");
        int idDoctor = sc.nextInt(); sc.nextLine();
        Doctor doctor = buscarDoctor(idDoctor);

        System.out.print("ID del paciente: ");
        int idPaciente = sc.nextInt(); sc.nextLine();
        Paciente paciente = buscarPaciente(idPaciente);

        if (doctor == null) {
            System.out.println("\nDoctor no encontrado.");
            return;
        }
        if (paciente == null) {
            System.out.println("\nPaciente no encontrado.");
            return;
        }

        citas.add(new Cita(idCita, fecha, hora, motivo, doctor, paciente));
        System.out.println("Cita creada.");
    }

    static Doctor buscarDoctor(int id) {
        for (Doctor d : doctores) if (d.getId_Medico() == id) return d;
        return null;
    }

    static Paciente buscarPaciente(int id) {
        for (Paciente p : pacientes) if (p.getId_Paciente() == id) return p;
        return null;
    }

    static void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (Cita c : citas) {
                System.out.println("Cita #" + c.getId_Cita() + " | Fecha: " + c.getFecha() + " Hora: " + c.getHora() +
                        " | Doctor: " + c.getDoctor().getNombre_Completo() + " | Paciente: " + c.getPaciente().getNombre() +
                        " | Motivo: " + c.getMotivo());
            }
        }
    }
}
