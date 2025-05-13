import javax.swing.JOptionPane;

public class JardimApp {

    public static void main(String[] args) {
        // 1. Alô, Jardim! - Mensagem de boas-vindas
        JOptionPane.showMessageDialog(null, "Alô, Jardim! Bem-vindo ao sistema!");

        // 2. Cadastro simples de cliente
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");

        JOptionPane.showMessageDialog(null, "Cliente cadastrado:\nNome: " + nome + "\nEndereço: " + endereco);

        // 3. Cálculo da área do jardim
        String larguraStr = JOptionPane.showInputDialog("Digite a largura do jardim (em metros):");
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento do jardim (em metros):");

        // Convertendo as entradas para double
        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);
        double area = largura * comprimento;

        JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " metros quadrados.");
    }
}