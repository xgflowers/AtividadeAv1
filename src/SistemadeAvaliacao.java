import javax.swing.JOptionPane;

public class SistemadeAvaliacao {

    public static void main(String[] args) {
        // Recebe as notas das duas provas e do trabalho
        double notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 1:"));
        double notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 2:"));
        double notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Trabalho:"));

        // Calcula a média
        double media = calcularMedia(notaProva1, notaProva2, notaTrabalho);

        // Determina se o aluno está aprovado ou reprovado
        String resultado = media >= 6 ? "Aprovado" : "Reprovado";

        // Exibe a média e o resultado final
        JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "\nResultado: " + resultado);
    }

    // Método para calcular a média
    public static double calcularMedia(double notaProva1, double notaProva2, double notaTrabalho) {
        return (notaProva1 + notaProva2 + notaTrabalho) / 3;
    }
}
