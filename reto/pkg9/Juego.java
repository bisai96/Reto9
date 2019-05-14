
package reto.pkg9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Juego {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nombre, solicitud;
        int vida = 0, veneno = 0;
        int vidaInicial = 0;
        char[] alimentoBueno = {'a','b','c','d','e','f','g','h','i','j','k','m','n','ñ','l','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.println("Bienvenido al juego ");
        System.out.println("");
        System.out.println("Ingresa el nombre de tu mascota");
        nombre = sc.nextLine();
        System.out.println("");
        System.out.println("Okay, " + nombre + " sera el nombre de tu mascota; Por favor ingrese la vida que deseas para " + nombre +" con numero");
        vidaInicial = sc.nextInt();
        System.out.println("");
        System.out.println("¡Estupendo! La vida inicial para " + nombre + " sera de " + vidaInicial);
        System.out.println("");
        System.out.println("¡Puedes darle de comer ahora!");
        
        int[] niveldevida = new int[4];
        
        for(int i = 0; i < niveldevida.length; i++){
            
            alimentoBueno[i] = sc.next().charAt(0);
            
            if(alimentoBueno[i] == 'a' && alimentoBueno[i] == 'q' && alimentoBueno[i] == 'w' && alimentoBueno[i] == 'e' && alimentoBueno[i] == 'r' && alimentoBueno[i] == 't' && alimentoBueno[i] == 'y' && alimentoBueno[i] == 'u' && alimentoBueno[i] == 'i' && alimentoBueno[i] == 'o' && alimentoBueno[i] == 'p' && alimentoBueno[i] == 'a' && alimentoBueno[i] == 's' && alimentoBueno[i] == 'd' && alimentoBueno[i] == 'f' && alimentoBueno[i] == 'g' && alimentoBueno[i] == 'h' && alimentoBueno[i] == 'j' && alimentoBueno[i] == 'k' && alimentoBueno[i] == 'l' && alimentoBueno[i] == 'ñ' && alimentoBueno[i] == 'z' && alimentoBueno[i] == 'x' && alimentoBueno[i] == 'c' && alimentoBueno[i] == 'v' && alimentoBueno[i] == 'b' && alimentoBueno[i] == 'n' && alimentoBueno[i] == 'm' ){
                System.out.println("Alimentame");
                System.out.println("¡Gracias por alimentarme!");
                System.out.println("");
                vidaInicial ++;
                vida = vida + vidaInicial;
            }if(alimentoBueno[i] == 'a' || alimentoBueno[i] == 'q' || alimentoBueno[i] == 'w' || alimentoBueno[i] == 'e' || alimentoBueno[i] == 'r' || alimentoBueno[i] == 't' || alimentoBueno[i] == 'y' || alimentoBueno[i] == 'u' || alimentoBueno[i] == 'i' || alimentoBueno[i] == 'o' || alimentoBueno[i] == 'p' || alimentoBueno[i] == 'a' || alimentoBueno[i] == 's' || alimentoBueno[i] == 'd' || alimentoBueno[i] == 'f' || alimentoBueno[i] == 'g' || alimentoBueno[i] == 'h' || alimentoBueno[i] == 'j' || alimentoBueno[i] == 'k' || alimentoBueno[i] == 'l' || alimentoBueno[i] == 'ñ' || alimentoBueno[i] == 'z' || alimentoBueno[i] == 'x' || alimentoBueno[i] == 'c' || alimentoBueno[i] == 'v' || alimentoBueno[i] == 'b' || alimentoBueno[i] == 'n' || alimentoBueno[i] == 'm' ){
                System.out.println("¡Gracias por alimentarme!");
                System.out.println("");
                vidaInicial ++;
                vida = vida + vidaInicial;
            }else{
                System.out.println("¡Hey, eso no es comida!");
                System.out.println("");
                veneno ++;
                vida = vida - veneno;
            }
            if(i==3){
                System.out.println("¿Quieres seguir dandole de comer?");
                System.out.println("");
                System.out.println("Escriba 'si' o 'no' ");
                solicitud = sc.next();
                
                switch(solicitud){
                    case "si":
                        i = 0;
                        break;
                        
                    case "no":
                       break;
                    
                }
            }
            
 }
        if(vida > niveldevida.length){
                System.out.println("¡Gracias por cuidarme! :)");
            }if (vida == niveldevida.length){
                System.out.println("Eres bueno pero puedes mejorar :/");
            }if (vida < niveldevida.length){
                System.out.println("¡Oye, cuidame! :(");
            }
        
    }

    }

