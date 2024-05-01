import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperaturaEmCelsius;
        System.out.println("Vamos converter as temperaturas de Celsius para Farenheit\n1º Informe a temperatura em Celsius: ");
        temperaturaEmCelsius = entrada.nextDouble(); //interação com usuário
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        int temperaturaEmFahrenheintinteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahhrenheit é: " + temperaturaEmFahrenheintinteira);

    }
}