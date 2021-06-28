import java.util.Scanner;

public class Ejercicios {

    //Ejercicio1
    public static String saludo(String nombre){
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }

    public static void Ejercicio1(){
        String nombre = "Tripulante p61";
        String saludoCompleto = saludo(nombre);
        System.out.println(saludoCompleto);
    }

    /*Ejericio Hola Quien*/
    public static void HolaQuien(){
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");

        /*
        Otra forma
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese su nombre");
        String nombre = br.readLine();
        */
    }

    public static int numeroDigitos(int numero) {
        int digitos = 0;

        while(numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }

    public static void Ejercicio2(){
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero");
        int numero = sc.nextInt();    
        int digitos = numeroDigitos(numero);
        System.out.println("Número con " + digitos + " cifras");
    }

    public static void Ejercicio3(){
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero");
        int numero = sc.nextInt();    
        System.out.println("El doble del número " + numero + " es: " + (numero*2) + " y el tripe es: "+ (numero*3));
    }

    public static float centigradosFarenheit(float centigrados){
        float farenheit = (9 * centigrados/ 5) + 32;
        return farenheit;
    }

    public static void Ejercicio4(){
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese los grados centígrados a convertir");
        float centigrados = sc.nextFloat();   
        float farenheit = centigradosFarenheit(centigrados);
        System.out.println("Grados centigrados: " + centigrados + " || Grados Farenheit: " + farenheit);
    }

    public static void Ejercicio5(){
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0 ? " es par" : " es impar");
        System.out.println("El número " + numero + resultado);
    }

    public static void main(String[] args) {

        //Ejercicio1();

        //HolaQuien();

        //Ejercicio2();

        //Ejercicio3();

        //Ejercicio4();

        Ejercicio5();

    }
    
}
