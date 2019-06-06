package cedula;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/*
@author Roberto
*/
public class verificar {
    
    public String comprobar(String numero){
    
    String cedula ;
    
    char letra ;
    String caracter;
    cedula = numero;
    String array[] =new String[cedula.length()] ;
    
    //EN ESTE CICLO SE SEPARAN POR CARACTERES TODO EL STRING INGRESADO
    for (int i = 0; i < cedula.length(); i++){
        letra = cedula.charAt(i);
        caracter=Character.toString(letra);
        array[i]= caracter;

    }
   
    int sumador=0;
    int multi=0;
    for (int k=1;k<cedula.length();k++){

        if(k%2!=0){
            multi=2*Integer.valueOf(array[k-1]);
            if(multi>9){
                multi=multi-9;
                sumador=sumador+multi;
            }
            else{
                sumador=sumador+multi;
            }

        }else{
        sumador=sumador+Integer.valueOf(array[k-1]);
        }
    }
        
        char digitorestar=Integer.toString(sumador).charAt(0);
        String digitost=Character.toString(digitorestar);
        int digito=Integer.valueOf(digitost);
        int dig=(digito+1)*10;
        int verificador=dig-sumador;
        
        int compara=Integer.parseInt(array[9]);
        if((compara==verificador)){
            System.out.println("Hola el numero de cedula "+cedula+" es correcto");
            
            try
            {
                //Se crea el archivo
                File archivo=new File("digitoverificador.txt");

                //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                FileWriter escribir=new FileWriter(archivo,true);

                //Escribimos en el archivo con el metodo write 
                escribir.append("\r\n");
                escribir.write("Hola  el numero de cedula "+cedula+" es correcto");
                

                //Cerramos la conexion
                escribir.close();
            }
            catch(Exception e)
            {
            System.out.println("Error al escribir");
            }
        } else {
            System.out.println("Hola el numero de cedula "+cedula+" es incorrecto");
             try
            {
                //Se crea el archivo
                File archivo=new File("digitoverificador.txt");

                //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                FileWriter escribir=new FileWriter(archivo,true);

                //Escribimos en el archivo con el metodo write 
                escribir.append("\r\n");
                escribir.write("Hola el numero de cedula "+cedula+" es incorrecto");

                //Cerramos la conexion
                escribir.close();
            }
            catch(Exception e)
            {
            System.out.println("Error al escribir");
            }
        }
        return null;

        
        
    }

    
    
}
