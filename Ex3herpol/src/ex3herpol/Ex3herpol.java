
package ex3herpol;

import javax.swing.JOptionPane;


public class Ex3herpol {

   
    public static void main(String[] args) {
     int compra;        
        compra = Integer.parseInt(JOptionPane.showInputDialog("Menu de compras:\n"+"Digite 1 para Ingresso Normal" + "\nDigite 2 para Ingresso VIP"));
        switch(compra){
           
            case 1:
                Normal normal = new Normal();
                normal.imprimeValor();
                break;
            
            case 2:
                Vip vip = new Vip();
                vip.vip();
                
                int com;
                com = Integer.parseInt(JOptionPane.showInputDialog("Menu de reservas:\n"+"Digite 1 para reservar um Camarote Superior\nDigite 2 para reservar um Camarote Inferior"));
            switch(com){
                case 1:
                CamaSup supe = new CamaSup();
                supe.vip();
                supe.imprimeValor();
                break;
                case 2:
                CamaInf infe = new CamaInf();
                infe.imprimeValor();
                break;
                                  
                default:
                JOptionPane.showMessageDialog(null,"Erro");
                vip.imprimeValor();
                break;
                        }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Erro");
                System.exit(0);
                break;
    
    
        }
    }
    
}
