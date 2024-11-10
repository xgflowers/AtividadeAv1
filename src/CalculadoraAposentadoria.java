import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        // Recebe os dados de idade, sexo e anos de contribuição
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M para Masculino, F para Feminino):").toUpperCase();
        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite seus anos de contribuição:"));

        // Verifica a possibilidade de aposentadoria
        String resultado = verificarAposentadoria(idade, sexo, anosContribuicao);

        // Exibe o resultado final
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Método para verificar a possibilidade de aposentadoria
    public static String verificarAposentadoria(int idade, String sexo, int anosContribuicao) {
        int idadeMinima = sexo.equals("M") ? 65 : 62; // Idade mínima para homens e mulheres
        int tempoContribuicaoMinimo = sexo.equals("M") ? 35 : 30; // Tempo mínimo de contribuição para homens e mulheres

        if (idade >= idadeMinima || anosContribuicao >= tempoContribuicaoMinimo) {
            return "Você já pode se aposentar!";
        } else {
            int anosFaltantesIdade = idadeMinima - idade;
            int anosFaltantesContribuicao = tempoContribuicaoMinimo - anosContribuicao;

            String mensagem = "Você ainda não pode se aposentar.\n";
            mensagem += "Faltam " + (anosFaltantesIdade > 0 ? anosFaltantesIdade : 0) + " anos para atingir a idade mínima.\n";
            mensagem += "Faltam " + (anosFaltantesContribuicao > 0 ? anosFaltantesContribuicao : 0) + " anos de contribuição para atingir o mínimo.";

            return mensagem;
        }
    }
}
