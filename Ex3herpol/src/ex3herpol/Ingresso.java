
package ex3herpol;


public class Ingresso {
    public double valor = 150; 
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println("NOTA:"
                + "\nIngresso..................R$"+this.valor);
    }
}
