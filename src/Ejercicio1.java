public class Ejercicio1 {

    //Lógica
    public static String saludo(String nombre){
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }

    public static void main(String[] args) {
        String nombre = "Tripulante p61";

        String saludoCompleto = saludo(nombre);

        System.out.println(saludoCompleto);
    }
    
}
