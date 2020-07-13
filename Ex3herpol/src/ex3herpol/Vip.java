
package ex3herpol;

public class Vip extends Ingresso{
     public double vip;
    
    public double vip(){
        this.valor = this.valor + 100;
        return this.valor;
    }
    
    
    @Override
    public void imprimeValor(){
        System.out.println("NOTA:"
                + "VIP..................R$"+this.valor);
    }
}
