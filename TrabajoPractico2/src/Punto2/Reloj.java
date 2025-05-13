package Punto2;



public class Reloj {
    //Atributos.
    int hora;
    int minutos;
    int segundos;

    //Metodos.
    public void establecerHora(int h,int m, int s){
        hora = h;
        minutos = m;
        segundos = s;

    }
    public void mostrarHora(){
        System.out.println("-HORA ACTUAL-");
        System.out.println(""+hora+":"+minutos+":"+segundos);
    }
    public void avanzarSegundos(){
        segundos++;
        if(segundos == 60){
            segundos = 0;
            minutos++;
        }
        if(minutos == 60){
            minutos = 0;
            hora++;
        }
        if(hora == 24){
            hora = 0;

        }

    }
}
