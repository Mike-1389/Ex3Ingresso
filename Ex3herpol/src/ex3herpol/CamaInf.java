
package ex3herpol;


public class CamaInf extends Vip{
    
    public String parte = "Inferior";
    
    @Override
    public void imprimeValor(){
        System.out.println("NOTA:"
                + "\nIngresso VIP..................R$"+this.vip()
                + "\nCamarote "+this.parte
                + "\nTOTAL ..........................R$"+this.valor
        );
    }
}
