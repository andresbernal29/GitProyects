public class Persona {
String nombre;
String apellidos;
int edad;
Carrera carrera;
//contructor
public Persona(String nombre, String apellidos, int edad, String nombreCarrera){
    carrera = new Carrera();
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    carrera.nombre = nombreCarrera;

}

// Metodos (compportasmiento de un objeto)
public String darNombreCompleto(){
return apellidos + ", " + nombre;
}
public String enviarSaludo (String saludado){
    if (edad > 40)return "Buenos días querido " + saludado;      
    return "Hola, Como estas? " + saludado + "?";
}
}


