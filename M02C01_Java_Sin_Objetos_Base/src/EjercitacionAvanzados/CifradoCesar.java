package EjercitacionAvanzados;

/**
 * Created by digitalhouse on 12/08/16.
 */

import java.util.ArrayList;

/**
 * Created by andres on 31/03/16.
 */
public class CifradoCesar {

    public String cifrar(String texto, Integer desplazamiento){
        //Comenzar a escribir código acá

        //Creo un Array de tipo String con los datos del abecedario
        ArrayList<String> abecedario = new ArrayList<>();
        abecedario.add("a");abecedario.add("b");abecedario.add("c");abecedario.add("d");abecedario.add("e");
        abecedario.add("f");abecedario.add("g");abecedario.add("h");abecedario.add("i");abecedario.add("j");
        abecedario.add("k");abecedario.add("l");abecedario.add("m");abecedario.add("n");abecedario.add("o");
        abecedario.add("p");abecedario.add("q");abecedario.add("r");abecedario.add("s");abecedario.add("t");
        abecedario.add("u");abecedario.add("v");abecedario.add("w");abecedario.add("x");abecedario.add("y");
        abecedario.add("z");
        //Creo un Array de tipo String para agregar el texto del usuario y separarlo en letras
        ArrayList<String> textoSeparado = new ArrayList<>();
        //creo una variable de tipo String para agregar el texto finalizado y cifrado
        String textoFinal = "";
        //creo una variable de tipo int para agregar la longitud de el texto del usuario y usarlo posteriormente
        int logitud = texto.length();
        /*creo una estructura FOR que multiplica una catidad de veces definidas el abecedario , asi el programa nunca
          se queda sin opciones y puede pasar las veces que desea el usuario de la Z a la A */
        int a = 0;
        for(int i = 25; i <= 100020; i++){
            abecedario.add(abecedario.get(a));
            a++;
            if(a >= 26){
                a = 0;
            }
        }
        /*Creo una estructura FOR para poder agregar las letras de la palabra del usuario por separado asi luego las
          puede comparar directamente con el abecedario */
        /*tambien uso el metodo .chartAt() que es para poder agarrar una letra de la variable de tipo String segun el
          indice. Y tambien agrego el metodo String.valueOf() para poder pasar de tipo CHAR a tipo String, ya que sino
          no podria agregarlo al Array*/
        for(int i = 0; i < logitud; i++ ){
            textoSeparado.add(String.valueOf(texto.charAt(i))) ;
        }
        /*Creo una estructura for que se va a repetir las veces que sea necesarias para terminar de cifrar la palabra
          dependiendo de la cantidad de letras de la palabra, por eso agrego el metodo .size()*/
        /*Luego creo otra estructura for que se va a repetir 26 veces(numero de Letras del abecedario) para asi cifrar
          cada letra por separado.*/
        /*Adentro de la estructura FOR creo una estructura IF para poder comparar cada letra de la variable de tipo
          String (textoSeparado) con el metodo .equals() el cual se usa para comparar Array de tipo String y lo comparo
          con el abecedario, el cual pasa por todas sus letras y en algun momento se llega a encontrar con la que es
          igual*/
        /*Dentro de la estructura if lo que sucede es que agrego y concateno al textoFinal el textoFinal mas una letra
          del abecedario ya cifrada que va a variar segun el desplacamiento que alla puesto el user. Esto se va a
          rapetir la cantidad de veces que sea necesario segun la longitud de el texto de inicio hasta por fin llegar a
          cifrarlo por completo  */
        for(int i = 0; i < textoSeparado.size();i++){
            for(Integer b = 0; b < 26; b++){
                if (textoSeparado.get(i).equals(abecedario.get(b))) {
                    textoFinal = textoFinal + abecedario.get(b + desplazamiento);
                }
            }
        }
        //por ultimo lo unico que hago es mostrar el texto ya cifrado y cargado en la variable de tipo String textoFinal
        return textoFinal;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        CifradoCesar cifradoCesar = new CifradoCesar();
        //Test 1
        System.out.println(cifradoCesar.cifrar("santiago gonzalez fernandez",34));
        //Test 2
        System.out.println(cifradoCesar.cifrar("daniela",8));
        //Test 3
        System.out.println(cifradoCesar.cifrar("probando el cifrado cesar", 7));
    }


    public static Integer charToNumberValue(Character word){

        Integer asciiCode = (int) word  - 97;
        return asciiCode;
    }

    public static Character numberValueToChar(Integer numberValue){

        Character word =  Character.toChars(numberValue+97)[0];
        return word;
    }
}