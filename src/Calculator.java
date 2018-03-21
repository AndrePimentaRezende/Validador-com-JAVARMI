import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote
{
    public boolean cpf(String cpf) throws RemoteException; 
    public boolean cnpj(String cnpj) throws RemoteException;
    public boolean RG(String rg) throws RemoteException;
}
