
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contImpar = 0;
        int contPar = 0;
        int sumaPar = 0;
        String resp;
        do {
            System.out.print("ingrese un numero:");
            int num  = sc.nextInt();
            sc.nextLine();
            if(num%2==1){
            }else{
                contPar++;
                sumaPar= sumaPar + num;    
            }
            System.out.print("desea continuar si o no ?");
            resp = sc.nextLine(); 
        }while(resp.equals("si"));
        System.out.println("La cantidad de pares es: "+ contPar );
        
        System.out.println("La cantidad de impares es: "+ contImpar );
        
        System.out.println("la suma de pares es: "+ sumaPar );

    }
    
}
