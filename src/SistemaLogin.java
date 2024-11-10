import javax.swing.JOptionPane;

public class SistemaLogin {

    public static void main(String[] args) {
        // Definindo as credenciais corretas
        final String usuarioCorreto = "Guilherme";
        final String senhaCorreta = "1234";
        boolean acessoConcedido = false;

        // Permitir até 3 tentativas
        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            // Solicitar login e senha
            String usuario = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            // Verificar as credenciais
            if (usuarioCorreto.equals(usuario) && senhaCorreta.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido. Bem-vindo!");
                acessoConcedido = true;
                break;
            } else {
                // Exibir mensagem de erro informativa
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativa " + tentativas + " de 3.");
            }
        }

        // Exibir mensagem caso todas as tentativas falhem
        if (!acessoConcedido) {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas alcançado. Acesso bloqueado.");
        }
    }
}

