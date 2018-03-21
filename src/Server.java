import java.rmi.Naming;

public class Server
{
    Server()
    {
        try
        {
            System.out.print("Server aberto!");
            Calculator c = new Implementation();
            Naming.rebind("rmi://127.0.0.1:1099/CalculatorService", c);
        }
        catch (Exception e)
        {
            System.out.print("Erro! Server fechado!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new Server();
    }
}
