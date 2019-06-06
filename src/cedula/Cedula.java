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

        verificocedula.comprobar("1717627325");//SE INSTANCIA AL METODO COMPROBAR DE LA CLASE VERIFICAR.
    }
    
}
