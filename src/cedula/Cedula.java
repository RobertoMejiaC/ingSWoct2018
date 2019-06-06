/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Cedula {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        verificar verificocedula=new verificar();//CREAMOS YN OBJETO LLAMADO verificodecula QYE INSTANCIARÁ A LA CLASE VERIFICAR
        System.out.println("Ingrese su cedula: ");//SE PIDE EL VALOR A INGRESA QUE ES LA CEDULA
        String numero=teclado.nextLine();//SE INGRESA POR TECLADO LA CEDULA
        verificocedula.comprobar(numero);//SE INSTANCIA AL METODO COMPROBAR DE LA CLASE VERIFICAR.
    }
}
