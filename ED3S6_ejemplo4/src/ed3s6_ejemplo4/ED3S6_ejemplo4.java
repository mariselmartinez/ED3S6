/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejemplo4;

/**
 *
 * @author marisel
 */
public class ED3S6_ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] entero = new int[5];
        entero[0]=1;
        entero[1]=2;
        entero[2]=3;
        entero[3]=4;
        entero[4]=5;
        System.out.println("el valor en la ultima posicion es: " + entero[2]);
        // entero[5]=6;
        
        int[] entero1 = new int[]{1,2,3,4,5};
        System.out.println("el valor en la ultima posicion es: " + entero1[4]);
        
        String[] cadenas = new String[]{"uno","dos","tres","cuatro","cinco"};
        for (String vcadena : cadenas)
            System.out.println("valor: " + vcadena);
    
        int[][] entero2 = new int[2][2];
        entero2[0][0]=0;
        entero2[0][1]=1;
        entero2[1][0]=2;
        entero2[1][1]=3;
        System.out.println("el valor en la posicion 1,1 es: " + entero2[1][1]);
        
        int[][] entero3 = new int[][]{{00,01},{10,11}};
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
            System.out.println("" + i + j);
             }
        }
            for(int i=0; i<2; i++)
            for(int valor1 : entero3[i])
                System.out.println("valor del arrego: " + valor1);
    }
    
}
    
    

