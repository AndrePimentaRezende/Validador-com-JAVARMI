import java.rmi.Naming;
import java.util.Scanner;
public class CalculatorClient
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        try
        {
            int escolha = 0;
            String validar;
            while(escolha!=1 && escolha!=2){
                System.out.printf("DESEJA VALIDAR: \n1 - CNPJ\n2 - CPF\n");
                escolha = ler.nextInt();
            }
            if(escolha==1){
                System.out.printf("Digite o cnpj: ");
                validar = ler.next();
                Calculator c = (Calculator) Naming.lookup("//127.0.0.1:1099/CalculatorService");
                System.out.println("Seu cnpj e: " + c.cnpj(validar));
            }
            else if(escolha==2){
                System.out.printf("Digite o cpf: ");
                validar = ler.next();
                Calculator c = (Calculator) Naming.lookup("//127.0.0.1:1099/CalculatorService");
                System.out.println("Seu cpf e: " + c.cpf(validar));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
