
package ex3herpol;


public class CamaSup extends Vip{
     public String parte = "Superior";
    public double total;
    
    @Override
    public double vip(){
        this.valor = this.valor + 80;
        return this.valor;
    } 
    
    
    
    @Override
    public void imprimeValor(){
        System.out.println("NOTA:"
                + "\nIngresso VIP....................R$"+this.valor
                + "\nCamarote "+this.parte+"...............R$80.00 (Taxa adicional)"
                + "\nTOTAL ..........................R$"+this.vip()
        );
    }
}