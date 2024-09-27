import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        // Exemplo: coletar dados de 3 produtos
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o nome do produto:");
            String nome = scanner.nextLine();
            System.out.println("Informe a quantidade do produto:");
            int quantidade = scanner.nextInt();
            System.out.println("Informe o preço unitário do produto:");
            double precoUnitario = scanner.nextDouble();
            scanner.nextLine(); // Consumir o restante da linha

            produtos.add(new Produto(nome, quantidade, precoUnitario));
        }

        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            System.out.println(produto);
            valorTotal += produto.calcularValorTotal();
        }

        System.out.println("Valor total da compra: " + String.format("%.2f", valorTotal));
        scanner.close();
    }
}