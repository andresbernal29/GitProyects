public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Andres";
        persona1.apellidos = "Alvares";
        persona1.edad = 25;  
        persona1.carrera.nombre = "musica";    

        System.out.println(persona1.darNombreCompleto() + ", "+ " Tiene " + persona1.edad
                + " Años y esta recibido de:." + persona1.carrera.nombre);
        

    }
}