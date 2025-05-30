import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ConversorTemperatura {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");

        // Lê a temperatura em Celsius digitada pelo usuário
        double celsius = scanner.nextDouble();

        // Converte Celsius para Fahrenheit usando a fórmula: F = C * 9/5 + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Converte Celsius para Kelvin usando a fórmula: K = C + 273.15
        double kelvin = celsius + 273.15;

        // Exibe os resultados das conversões
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}