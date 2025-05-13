package Punto1;

public class Calculadora {

    //ATRIBUTOS
    double suma;
    double resta;
    double multiplicacion;
    double division;

    //METODOS
    public void sumar(double numero1 , double numero2){
        suma = numero1 + numero2;
    }
    public void restar(double numero1 , double numero2){
        resta = numero1 - numero2;
    }
    public void multiplicar(double numero1 , double numero2){
        multiplicacion = numero1 * numero2;
    }
    public void dividir(double numero1 , double numero2){
        if(numero2 == 0){
            System.out.println("Error no se puede dividir por 0.");
            return;
        }else{
            division = numero1/numero2;
        }
    }
}


