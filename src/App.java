import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        


       
        Scanner leia = new Scanner(System.in);

        // Variável : é um espaço reservado na memória do computador
        // variavel serve para guardar valores
        //variavel ela tem um tipo de (texto,numero,lógico)
        /*
         * Ex um crie um algoritimo para o Jstatistics que leia
         * a opção desejada
         * " QUal o conjunto de dados utilizado: 1-Populacional 2- Amostral"
         * o valor recebido deve ser inteiro.
         */
        int opcao;
        /*System.out.println("\t #----- \t #-----\t JEstatistics\t \t#------ \t #----\t"); // tabulação
        System.out.print("\t--Controle de Dados Empresarial -- ");
        System.out.print("\t \t2025\n");
    
        System.out.println(" \t QUal o conjunto de dados utilizado:\n \t1-Populacional 2- Amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);*/
        JOptionPane.showMessageDialog(null ,"O Jogo da estatistica:JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o jogo \n Escolha a estratégia: Populacional 2- Amostral"));
       JOptionPane.showMessageDialog(null,"Você escolheu:" + opcao , "Jstatistics",JOptionPane.DEFAULT_OPTION); 
    
        /*
        Ex 2
         * Voce deve criar um um menu perguntando para o usuario:
         * que tipo de variavel ele deseja cadastrar
         * 1 quantitativa
         * 2 qualitativa
         * 
         * O menu deve ter as qubras de linha conforme o texto acima 
         * tudo em apenas um sysout
         * Mostre a opção escolhida(o numero lido)
         */
        String opcaoVariavel = JOptionPane.showInputDialog("Que tipo de variável você deseja cadastrar: \n 1 Qualitativa \n 2-Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null, leia, opcaoVariavel, opVariavel);
      
        
    }
 
}
    

