public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Pedro ", " Pascal ", 48, " Mandaloriano",20, true);
        System.out.println(persona1.darNombreCompleto()+ " Tiene" + persona1.edad + " años y está recibieda de " + persona1.carrera.nombre);


    }
}

