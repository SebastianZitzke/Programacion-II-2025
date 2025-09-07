package reservaDeCine;

public class Asiento {

    //Atributos.
    private int numero;
    private boolean ocupado; //True : ocupado / False : libre

    public Asiento(int numero) {
        this.numero = numero;
        this.ocupado = false; //Al crear el objeto el asiento esta libre.
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    // Metodo ocuparAsiento(); El metodo lo que hace es cambiar de false a true el atributo.
    public void ocuparAsiento() throws Exception{
       if(ocupado){
           throw  new Exception("El asiento ya se encuentra ocupado.");
       }else{
        this.ocupado = true;
    }
    }

    //Metodo liberarAsiento(); El metodo lo que hace es cambiar de true a false el atributo.
    public void liberarAsiento(){
        this.ocupado = false;
    }


}
