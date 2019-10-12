package Ejercitacion3;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio8y9 {

    String reverso(String unaCadenaTexto){
        //Retornar el reverso de una cadena de texto.

        int longitud = unaCadenaTexto.length();
        String cadenaDeTextoAlReves = "";
        for(int i = longitud - 1; i >= 0; i-- ){
            char letra = unaCadenaTexto.charAt(i);
            cadenaDeTextoAlReves = cadenaDeTextoAlReves + letra;
        }

        return cadenaDeTextoAlReves;
    }

    Boolean palindromo(String unaCadenaTexto){
        //Retornar true si la palabra es palíndromo (capicúa).
        //Utilizando la funcion que creamos anteriormente podemos definir si es palindromo

        int longitud = unaCadenaTexto.length();
        String cadenaDeTextoAlReves = "";
        for(int i = longitud - 1; i >= 0; i-- ){
            char letra = unaCadenaTexto.charAt(i);
            cadenaDeTextoAlReves = cadenaDeTextoAlReves + letra;
        }
        if(cadenaDeTextoAlReves.equals(unaCadenaTexto)){
            return true;
        }else{
            return false;
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio8y9 ejercicio8y9 = new Ejercicio8y9();

        System.out.println("Ejercicio 8:");
        System.out.println("El reverso de 'hola' es: "+ ejercicio8y9.reverso("hola"));
        System.out.println("El reverso de 'libreta' es: "+ ejercicio8y9.reverso("libreta"));

        System.out.println("________________________");
        System.out.println("Ejercicio 9:");
        System.out.println("¿Es 'neuquen' un palíndromo?: "+ ejercicio8y9.palindromo("neuquen"));
        System.out.println("¿Es 'multimedia' un palíndromo?: "+ ejercicio8y9.palindromo("multimedia"));
        System.out.println("¿Es 'anana' un palíndromo?: "+ ejercicio8y9.palindromo("anana"));

    }
}
