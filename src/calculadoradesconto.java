import java.util.Scanner;

public class calculadoradesconto {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada: Valor do produto
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Entrada: Porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        // Cálculo do valor do desconto
        double valorDesconto = (valorProduto * porcentagemDesconto) / 100;

        // Cálculo do preço final do produto
        double precoFinal = valorProduto - valorDesconto;

        // Exibição dos resultados
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        // Fechando o Scanner
        scanner.close();
    }
}