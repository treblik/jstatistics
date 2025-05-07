import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("lógica-Aula5");
        // cara ou coroa
        // variável que receba a iteração do jogo
        //Ramdom
        //switch
        //for ,do while e while
        /*
         * public class CaraOuCoroa {

          
        // espaço amostral
         */

         //ArrayList lista =new ArrayList<>();
        // sorteio
         Random random = new Random();
         // criar variável contadores para verificar a distribuição

      int resultado=0;
        String mensagem ="Espaço amostral:{1,2,3,4,5,6}\n"+
                        "Probabilidade de numero par:50%\n" +
                        "Probabilidade de numero impar 50% \n" +
                         "Deseja lançar o Dado";
        // loop de lançamento

        while (true) {
            // interação com o usuário   
            int opcao = JOptionPane.showConfirmDialog(null, mensagem,"Jogar Dados",JOptionPane.YES_NO_OPTION);
            if(opcao!=JOptionPane.YES_NO_OPTION){
                // estatisticas
                String estatisticas = "Jogo finalizado!\n" ;
               // "Caras:"+contCara+"\n"+ 
                //"Coroas:"+contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas);
                break;
            }
            int resultado = random.nextInt(6);// Lançamento do dado
        
         String[]espacoAmostral ={"1","2","3","4","5","6"};
                  switch () {
                    case 1:
                        resultado;
                        break;
                    case 2:
                        resultado;
                    case 3:
                        resultado;
                    case 4:
                        resultado;
                    case 5:
                        resultado;
                    case 6:
                        resultado;
                    default:
                        break;
                  }
          
         String saida = "Resultado do lançamento"+espacoAmostral[resultado]+
                        "\n (indice gerado:"+resultado+")";
                        JOptionPane.showMessageDialog(null,  saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
