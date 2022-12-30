package Java;

public class HolaMundo {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo"); //Primer programa en java
        System.out.println("Empezamos con Java");
        System.out.println("Jaime Cabrera Flores");
        
        int entero = 24; //Existen mas variables fe tipo entero, pero int es la mas utilizada,
        float decimal = 23.5f; //Si se emplea float es necesario agregar f.
        double decimal_2 = 0.5; //Variable tipo decimal.
        char caracter = '$'; //Comillas simples.
        
        /*
        Comentar varias lineas de código 


        Imprimir variables primitivas
        */
        System.out.println("El numero entero es: "+entero);
        System.out.println("El numero decimal es: "+ decimal);
        System.out.println("El caracter es: "+caracter);
        System.out.println("El numero decimal 2 es: "+ decimal_2);
        
        //Imprimir variables no primitivas
        
        Integer numero_2 = null;
        System.out.println(numero_2); //Las variables no primitivas tienen métodos.
        
        String frase = "Hola mundo en Java"; //Comillas dobles.
        System.out.println(frase);
        
        
        /*Constantes 
        
        Se declaran constantes mediante la palabra final.
        
        */
        
        final int numero_3= 25; //Se establece una variable de tipo entero constante.
        System.out.println("El numero constante es: "+numero_3); 
        
        
    }
}
