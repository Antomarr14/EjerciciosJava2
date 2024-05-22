package Ejercicios;

import java.util.Scanner;

public class EjercicioJava {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción:");
        System.out.println("1. Paciente");
        System.out.println("2. Enfermero");
        System.out.println("3. Doctor");

        int opcion = scanner.nextInt();
        padre Clinica = null;

        switch (opcion) {

            case 1:

                System.out.println("Ingresa el Id del paciente:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa el nombre del paciente:");
                String nombre = scanner.nextLine();

                System.out.println("Ingresa el apellido del paciente:");
                String apellido = scanner.nextLine();

                System.out.println("Ingresa la edad del paciente:");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa la historia clínica del paciente:");
                String historiaClinica = scanner.nextLine();

                System.out.println("Ingresa el número de seguro del paciente:");
                String numeroDeSeguro = scanner.nextLine();

                Clinica = new Paciente(id, nombre, apellido, edad, historiaClinica, numeroDeSeguro);

                break;

            case 2:

                System.out.println("Ingresa el Id del enfermero:");
                id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa el nombre del enfermero:");
                nombre = scanner.nextLine();

                System.out.println("Ingresa el apellido del enfermero:");
                apellido = scanner.nextLine();

                System.out.println("Ingresa la edad del enfermero:");
                edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa el turno del enfermero:");
                String turno = scanner.nextLine();

                System.out.println("Ingresa los años de experiencia del enfermero:");
                int aniosExperiencia = scanner.nextInt();

                Clinica = new Enfermero(id, nombre, apellido, edad, turno, aniosExperiencia);

                break;

            case 3:

                System.out.println("Ingresa el Id del doctor:");
                id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa el nombre del doctor:");
                nombre = scanner.nextLine();

                System.out.println("Ingresa el apellido del doctor:");
                apellido = scanner.nextLine();

                System.out.println("Ingresa la edad del doctor:");
                edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingresa la especialidad del doctor:");
                String especialidad = scanner.nextLine();

                System.out.println("Ingresa los años de experiencia del doctor:");
                aniosExperiencia = scanner.nextInt();

                Clinica = new Doctor(id, nombre, apellido, edad, especialidad, aniosExperiencia);

                break;

            default:

                System.out.println("Opción inválida");
                return;

        }

        if (Clinica != null) {

            Clinica.Informacion();
            Clinica.darOpiniones();

        }

    }

}

class padre{
    protected int id;
    protected String nombre;
    protected String apeliido;
    protected int edad;

    public padre() {}

    public padre(int id, String nombre, String apeliido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.edad = edad;
    }

    public void Informacion (){
        System.out.println("Datos");
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apeliido);
        System.out.println("Edad: " + edad);

    }
    public void darOpiniones(){
        System.out.println("Hola mundo");
    }
}
class Paciente extends padre{
    private String historiaClinica;
    private String numeroDeSeguro;

    public Paciente(){}

    public Paciente(int id, String nombre, String apeliido, int edad, String historiaClinica, String numeroDeSeguro) {
        super(id, nombre, apeliido, edad);
        this.historiaClinica = historiaClinica;
        this.numeroDeSeguro = numeroDeSeguro;
    }
    @Override
    public void darOpiniones(){
        System.out.println("Tengo sida, me puede ayudar");
    }
    public void registrarse(){
        System.out.println("Me quiero atender el sida");
    }

    public void solicitarCita(){
        System.out.println("Me puede hacer una cita para tratarme el sida?");
    }
    public void recibirTratamiento(){
        System.out.println("Hay tratamiento para el sida?");
    }
}
class Enfermero extends padre{
    private String turno;
    private int aniosExperiencia;

    public Enfermero(){}

    public Enfermero(int id, String nombre, String apeliido, int edad, String turno, int aniosExperiencia) {
        super(id, nombre, apeliido, edad);
        this.turno = turno;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void darOpiniones(){
        System.out.println("Tengo hambre, me puede ayudar");
    }
    public void aplicarMedicamento(){
        System.out.println("Respire profundo");
    }

    public void asistirPaciente(){
        System.out.println("Me puede hacer una cita para tratarme el sida");
    }
    public void asistirDr(){
        System.out.println("Quiere ayuda gran ijueputa");
    }
}
class Doctor extends padre{
    private String especialidad;
    private int aniosExperiencia;

    public Doctor(){}

    public Doctor(int id, String nombre, String apeliido, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apeliido, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void darOpiniones(){
        System.out.println("Joven mañana se nos muere, no le puedo ayudar");
    }
    public void Diagnosticar(){
        System.out.println("Joven el sida lo va a matar");
    }

    public void prescribirTratamiento(){
        System.out.println("Ya no hay nada que podamos hacer");
    }
    public void darSeguimiento(){
        System.out.println("No hay tratamiento para el sida");
    }
}

