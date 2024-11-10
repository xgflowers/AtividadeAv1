import javax.swing.JOptionPane;

public class CircuitoResistencia {

    public static void main(String[] args) {
        // Recebe os valores das quatro resistências
        double resistencia1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 1:"));
        double resistencia2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 2:"));
        double resistencia3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 3:"));
        double resistencia4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 4:"));

        // Calcula a resistência equivalente
        double resistenciaEquivalente = calcularResistenciaEquivalente(resistencia1, resistencia2, resistencia3, resistencia4);

        // Encontra a maior e a menor resistência
        double maiorResistencia = encontrarMaiorResistencia(resistencia1, resistencia2, resistencia3, resistencia4);
        double menorResistencia = encontrarMenorResistencia(resistencia1, resistencia2, resistencia3, resistencia4);

        // Exibe os resultados
        String resultado = "Resistência Equivalente: " + String.format("%.2f", resistenciaEquivalente) + " Ω\n" +
                "Maior Resistência: " + String.format("%.2f", maiorResistencia) + " Ω\n" +
                "Menor Resistência: " + String.format("%.2f", menorResistencia) + " Ω";

        JOptionPane.showMessageDialog(null, resultado);
    }

    // Método para calcular a resistência equivalente em série
    public static double calcularResistenciaEquivalente(double r1, double r2, double r3, double r4) {
        return r1 + r2 + r3 + r4;
    }

    // Método para encontrar a maior resistência usando Math.max()
    public static double encontrarMaiorResistencia(double r1, double r2, double r3, double r4) {
        return Math.max(Math.max(r1, r2), Math.max(r3, r4));
    }

    // Método para encontrar a menor resistência usando Math.min()
    public static double encontrarMenorResistencia(double r1, double r2, double r3, double r4) {
        return Math.min(Math.min(r1, r2), Math.min(r3, r4));
    }
}
