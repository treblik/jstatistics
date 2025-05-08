import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // classe é um conjunto de objetos 
        // nosso objetivo é entender a diferenca entre método com tipo void e método com o tipo string
        Mamifero m1 =new Mamifero();

        m1.setNomeCientifico("Bos taurus");
        System.out.println("O nome científico da vaca é : " +m1.getNomeCientifico());

        Mamifero m2 = new Mamifero();
        Mamifero m3 = new Mamifero();

        m2.setNomeCientifico("Macropus ");
        m3.setNomeCientifico("Trichechus");

      System.out.println("O nome científico do Canguru é :"  + m2.getNomeCientifico());
      System.out.println("O nome científico do Peixe boi é: " + m3.getNomeCientifico());

    }
}
