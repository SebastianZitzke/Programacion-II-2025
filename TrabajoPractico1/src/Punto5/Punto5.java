package Punto5;

import java.util.Scanner;
public class Punto5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("EJE CARTESIANO");
        System.out.println("-Nota: La coordenada ingresada debe ser diferente de 0 y entera");
        System.out.println("Ingrese una coordenada x: ");
        int x=sc.nextInt();
        System.out.println("Ingrese una coordenada y: ");
        int y=sc.nextInt();

        if(x==0||y==0){
            System.out.println("La coordenada ingresada no es valida.");
        }else if(x>0 && y>0){
            System.out.println("La coordenada X="+x+" Y="+y);
            System.out.println("Se encuentra en el primer cuadrante.");
        }else if(x<0 && y>0){
            System.out.println("La coordenada X="+x+" Y="+y);
            System.out.println("Se encuentra en el segundo cuadrante.");
        }else if(x<0 && y<0){
            System.out.println("La coordenada X="+x+" Y="+y);
            System.out.println("Se encuentra en el tercer cuadrante.");
        }else{
            System.out.println("La coordenada X="+x+" Y="+y);
            System.out.println("Se encuentra en el cuarto cuadrante.");
        }
    }
}
