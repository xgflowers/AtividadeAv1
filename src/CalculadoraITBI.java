import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        // Receber entradas do usuário
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double porcentagemITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI (em %):"));

        // Calcular imposto e exibir o resultado
        double impostoITBI = calcularITBI(valorTransacao, valorVenal, porcentagemITBI);
        JOptionPane.showMessageDialog(null, "O valor do ITBI a ser pago é: R$ " + String.format("%.2f", impostoITBI));
    }

    // Método para calcular o imposto ITBI
    public static double calcularITBI(double valorTransacao, double valorVenal, double porcentagemITBI) {
        double baseCalculo = Math.max(valorTransacao, valorVenal); // Seleciona o maior valor
        return baseCalculo * (porcentagemITBI / 100); // Calcula o ITBI
    }
}

