/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000_1500;

/**
 *
 * @author Micro
 */import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner
        (System.in);
        
            int i;

            i = 1000;
            do{
            i = i + 2;
            System.out.println(i);
            }while (i<1500);

        }
    }
    
}
