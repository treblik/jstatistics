import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3 switch e Loops");
        // o switch é uma estrutura de seleção multipla
        //um if mais organizado
        //Escolha
        // caso
        // indicado para resolver listas ou constantes.
        // Menu
        //opcao 1
        //opção 2
        String  sair;

        do{
            int op = Integer.parseInt (JOptionPane.showInputDialog(null,"Digite a opção:\n 1-Estatistica Descritiva \n 2-Probabilidade\n 3-Modelos Probabilisticos \n 4-sair"));
        
       
            
            switch (op) {
                case 1:
                
                 JOptionPane.showMessageDialog(null ,"Estatistica Descritiva");  break;
                case 2:
                JOptionPane.showMessageDialog(null, "Probabilidade");   break;
                case 3:
                JOptionPane.showMessageDialog(null,"Modelos Probabilisticos");break;
                default:
                JOptionPane.showMessageDialog(null,"Opção invalida digite de 1 a 3"); break;
            }
            sair = JOptionPane.showInputDialog(null, args,"Sair s ou n");
        }while (!sair.equalsIgnoreCase("sim") );
       
    
    
        

           
       



       
        /*como funciona os loops */
        //WHILE teste no início
        //for compacto
        /*
         * cotador  =1
         * condição = <=5
         * incremento ou decremento i=i+1
         */
       /*int contador = 1;
        while (contador < 5) {
            JOptionPane.showMessageDialog(null, "Senai");
            contador = contador+1;
        }
        int i =1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }

        for (int cont= 1; cont <=10 ; cont++) {
            System.out.println(cont);
        }

        String  sair;
        do{
             
            sair = JOptionPane.showInputDialog(null, args,"Sair s ou n");
        }while (!sair.equalsIgnoreCase("sim") );
        */ 
    }
}
