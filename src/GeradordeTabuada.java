import javax.swing.JOptionPane;

public class GeradordeTabuada {

    public static void main(String[] args) {
        // Solicita ao usuário um número para gerar a tabuada
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver a sua tabuada:"));

        // Construir a tabuada usando um loop
        StringBuilder tabuada = new StringBuilder("Tabuada do " + numero + ":\n");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        // Exibe a tabuada completa
        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}

