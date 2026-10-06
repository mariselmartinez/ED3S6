package ed3s6prac1;
import java.util.Scanner;


public class DetectaTipo<T,U> {
    T num1;
            U num2;
            public DetectaTipo(T num1,U num2){
                this.num1 =num1;
                this.num2=num2;
                Detecta();
            }
            private void Detecta (){
                if (num1 instanceof Integer && num2 instanceof Integer){
                    int inum1= Integer.parseInt(num1.toString());
                    int inum2= Integer.parseInt(num2.toString());
                    Scanner teclado = new Scanner (System.in);
                    
                    menu();
                    int opc = teclado.nextInt();
                    switch(opc){
                    case 1: System.out.println("la suma es "+ (inum1+inum2));
                    break;
                    case 2:System.out.println("la resta es :"+ (inum1-inum2));
                    break;
                    case 3: System.out.println("la multiplicacion es :"+(inum1*inum2));
                    default:
                        throw new AssertionError();
                }
                    
                } else if ( num1 instanceof Double && num2 instanceof Double){
                     double inum1= Double.parseDouble(num1.toString());
                    double inum2= Double.parseDouble(num2.toString());
                    Scanner teclado = new Scanner (System.in);
                    
                    menu();
                    int opc = teclado.nextInt();
                    switch(opc){
                    case 1 -> System.out.println("la suma es "+ (inum1+inum2));
                    case 2 -> System.out.println("la resta es :"+ (inum1-inum2));
                    case 3 -> System.out.println("la multiplicacion es :"+(inum1*inum2));
                    default -> throw new AssertionError();
                }
                    
                }else if ( num1 instanceof Float && num2 instanceof Float){
                    float inum1= Float.parseFloat(num1.toString());
                    float inum2= Float.parseFloat(num2.toString());
                    Scanner teclado = new Scanner (System.in);
                    
                    menu();
                    int opc = teclado.nextInt();
                    switch(opc){
                    case 1 -> System.out.println("la suma es "+ (inum1+inum2));
                    case 2 -> System.out.println("la resta es :"+ (inum1-inum2));
                    case 3 -> System.out.println("la multiplicacion es :"+(inum1*inum2));
                    default -> throw new AssertionError();
                    }
                }else if ( num1 instanceof String && num2 instanceof String){
                 
               System.out.print("la union de las cadenas es:" + num1+ "" + num2);
                } else if ( num1 instanceof Character && num2 instanceof Character ){
                System.out.print("el caracter es :" + num1+ "" + num2);     
                }
            }
            private void menu (){
                System.out.println("Menu de opciones");                
                System.out.println("1 suma");
                 System.out.println("2 resta");
                  System.out.println("3 multiplicacion ");
                   System.out.println("escribe la opcion que deseas");
                
            }
                    
}