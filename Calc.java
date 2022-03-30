import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Number n1 = new Number();
        Number n2 = new Number();

        String valid = "s";

        while(valid.toLowerCase().equals("s")){

            //Primeiro valor
            System.out.printf("%nDigite o primeiro valor: ");
            n1.setValor(Double.parseDouble(scanner.nextLine()));
            //Tipo de equacao
            System.out.printf("%nTipo de calculo( + - * /): ");
            String tipoEquacao = scanner.nextLine();
            //Segundo Valor
            System.out.printf("%nDigite o segundo valor: ");
            n2.setValor(Double.parseDouble(scanner.nextLine()));
                    
            switch(tipoEquacao){
                case "+":
                    Equacoes.Soma(n1, n2);
                    System.out.printf("%nA Soma de %.0f com %.0f = %.2f",n1.getValor(), n2.getValor(), Equacoes.result.getValor());
                    break;
                case "-":
                    Equacoes.Subtracao(n1, n2);
                    System.out.printf("%nA Subtração de %.0f com %.0f = %.2f",n1.getValor(), n2.getValor(), Equacoes.result.getValor());
                    break;
                case "*":
                    Equacoes.Multiplicacao(n1, n2);
                    System.out.printf("%nA Multiplicação de %.0f com %.0f = %.2f",n1.getValor(), n2.getValor(), Equacoes.result.getValor());
                    break;
                case "/":
                    Equacoes.Divisao(n1, n2);
                    System.out.printf("%nA Divisão de %.0f com %.0f = %.2f",n1.getValor(), n2.getValor(), Equacoes.result.getValor());
                    break;
                default:
                    System.out.println("Operação não existente!!");
            }

            System.out.printf("%nDeseja realizar outro calculo('S' ou 'N')");
            valid = scanner.nextLine();
        }
    }
    
}