import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("lógica-Aula4");
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
         Random random =new Random();
         // criar variável contadores para verificar a distribuição

         int contCoroa=0;
         int contCara = 0;
        String mensagem ="Espaço amostral:{Cara,Coroa}\n"+
                        "Probabilidade de Cara:50%\n" +
                        "Probabilidade de Coroa 50% \n" +
                         "Deseja lançar a moeda";
        // loop de lançamento

        while (true) {
            // interação com o usuário   
            int opcao = JOptionPane.showConfirmDialog(null, mensagem,"Escolha",JOptionPane.YES_NO_OPTION);
            if(opcao!=JOptionPane.YES_NO_OPTION){
                // estatisticas
                String estatisticas = "Jogo finalizado!\n" +
                "Total de lançamentos"+(contCara+contCoroa)+"\n"+
                "Caras:"+contCara+"\n"+ 
                "Coroas:"+contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas);
                break;
            }
            int resultado = random.nextInt(2);// 0-cara 1 coroa
        
         String[]espacoAmostral ={"Cara","Coroa"};
                  if(resultado ==0){
            contCara++;
         }else{
            contCoroa++;
         }
          
         String saida = "Resultado do lançamento"+espacoAmostral[resultado]+
                        "\n (indice gerado:"+resultado+")";
                        JOptionPane.showMessageDialog(null,  saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
