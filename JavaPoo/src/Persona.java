public class Persona {
String nombre;
String apellidos;
int edad;
Carrera carrera;
//contructor
public Persona(){
    carrera = new Carrera();
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


