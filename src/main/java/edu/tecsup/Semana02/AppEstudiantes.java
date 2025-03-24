package edu.tecsup.Semana02;

public class AppEstudiantes {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Lucía", 20, 14.5);
        Estudiante e2 = new Estudiante("Carlos", 22, 9.8);

        e1.mostrarDatos();
        System.out.println("¿Aprobado? " + (e1.esAprobado() ? "Sí" : "No"));

        e2.mostrarDatos();
        System.out.println("¿Aprobado? " + (e2.esAprobado() ? "Sí" : "No"));
    }
}

