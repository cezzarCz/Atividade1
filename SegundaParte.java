import java.util.Scanner;

public class SegundaParte {
    
  public static void main(String[] args) {
        Empregado emp1 = new Empregado();
        Scanner receber = new Scanner(System.in);
        System.out.println("Informe o codigo: ");
        emp1.codigo = receber.nextInt();
        System.out.println("Informe o ano de nascimento: ");
        emp1.nasc = receber.nextInt();
        System.out.println("Informe o ano de inicio: ");
        emp1.anoInicial = receber.nextInt();
        emp1.calculaIdade();
        emp1.calculaTempo();
        emp1.validaAp();
        emp1.mostraIdade();
        emp1.mostraTempo();
        System.out.println("Codigo do empregado " + emp1.codigo + " \nAposentadoria: " + emp1.apto);
    }
    
    
}                           