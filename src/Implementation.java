import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementation extends UnicastRemoteObject implements Calculator
{
    protected Implementation() throws RemoteException
    {
        super();
    }
    public boolean cnpj(String s) throws RemoteException{
      int digitoV1;
      int digitoV2;
      boolean teste = true;
      int cons=10;
      double guarda=0;
      
      //cuidar de numeros repetidos ex: 111.111.111-11
      if((((int)(s.charAt(0))-48)*cons)==(((int)(s.charAt(1))-48)*cons)&&(((int)(s.charAt(1))-48)*cons)==(((int)(s.charAt(2))-48)*cons)&&(((int)(s.charAt(2))-48)*cons)==(((int)(s.charAt(4))-48)*cons)&&(((int)(s.charAt(4))-48)*cons)==(((int)(s.charAt(5))-48)*cons)&&(((int)(s.charAt(5))-48)*cons)==(((int)(s.charAt(6))-48)*cons)&&(((int)(s.charAt(6))-48)*cons)==(((int)(s.charAt(8))-48)*cons)&&(((int)(s.charAt(8))-48)*cons)==(((int)(s.charAt(9))-48)*cons)&&(((int)(s.charAt(9))-48)*cons)==(((int)(s.charAt(10))-48)*cons)){
         teste=false;
      }
      else{
      //SETA VETOR
         int[] vetor= {5,4,3,2,9,8,7,6,5,4,3,2,6};
         int indice =0;
         for(int a=0;a<15;a++) {
            if(a!=2&&a!=6&&a!=10) {
               guarda=guarda+(((int)(s.charAt(a))-48)*vetor[indice]);
               indice++;
            }
         }
         int resto=(int)guarda%11;
         if(resto<2){
            digitoV1=0;
         }
         else{
            digitoV1=11-resto;
         }
         if(digitoV1!=s.charAt(16)-48){
            teste=false;
         }
         else{
            indice =0;
            guarda=0;
            for(int a=1;a<17;a++) {
               if(a!=2&&a!=6&&a!=10&&a!=15) {
                  guarda=guarda+(((int)(s.charAt(a))-48)*vetor[indice]);
                  indice++;
               }
            }
            guarda=guarda+(((int)(s.charAt(0))-48)*vetor[indice]);
            resto=(int)guarda%11;
            if(resto<2){
               digitoV2=0;
            }
            else{
               digitoV2=11-resto;
            }
            if(digitoV2!=s.charAt(17)-48){
               teste=false;
            }
         }
      }
        return teste;
    }
    
    public boolean cpf(String s) throws RemoteException {
      int digitoV1;
      int digitoV2;
      boolean teste = true;
      int cons=10;
      double guarda=0;
      //cuidar de numeros repetidos ex: 111.111.111-11
      if((((int)(s.charAt(0))-48)*cons)==(((int)(s.charAt(1))-48)*cons)&&(((int)(s.charAt(1))-48)*cons)==(((int)(s.charAt(2))-48)*cons)&&(((int)(s.charAt(2))-48)*cons)==(((int)(s.charAt(4))-48)*cons)&&(((int)(s.charAt(4))-48)*cons)==(((int)(s.charAt(5))-48)*cons)&&(((int)(s.charAt(5))-48)*cons)==(((int)(s.charAt(6))-48)*cons)&&(((int)(s.charAt(6))-48)*cons)==(((int)(s.charAt(8))-48)*cons)&&(((int)(s.charAt(8))-48)*cons)==(((int)(s.charAt(9))-48)*cons)&&(((int)(s.charAt(9))-48)*cons)==(((int)(s.charAt(10))-48)*cons)){
         teste=false;
      }
      else{
         for(int a=0;a<11;a++) {
            if(a!=3&&a!=7) {
               guarda=guarda+(((int)(s.charAt(a))-48)*cons);
               cons--;
            }
         }
         double resto =(int)((guarda*10)%11);
         if(resto==10){
            digitoV1=0;
         }
         else{
            digitoV1=(int)resto;
         }
         if((s.charAt(12)-48)!=digitoV1){
            teste=false;
         }
         else{
            cons=11;
            guarda=0;
            for(int a=0;a<11;a++) {
               if(a!=3&&a!=7) {
                  guarda=guarda+(((int)(s.charAt(a))-48)*cons);
                  cons--;
               }
            }
            guarda=guarda+(digitoV1*cons);
            resto =(guarda*10)%11;
            if(resto==10){
               digitoV2=0;
            }
            else{
               digitoV2=(int)resto;
            }
            if((s.charAt(13)-48)!=digitoV2){
               teste=false;
            }
         }
      }
      return teste;
    }
    public boolean RG(String s){
        int digitoV1;
      int digitoV2;
      boolean teste = true;
      int cons=10;
      double guarda=0;
      
      //cuidar de numeros repetidos ex: 111.111.111-11
      if((((int)(s.charAt(0))-48)*cons)==(((int)(s.charAt(1))-48)*cons)&&(((int)(s.charAt(1))-48)*cons)==(((int)(s.charAt(2))-48)*cons)&&(((int)(s.charAt(2))-48)*cons)==(((int)(s.charAt(4))-48)*cons)&&(((int)(s.charAt(4))-48)*cons)==(((int)(s.charAt(5))-48)*cons)&&(((int)(s.charAt(5))-48)*cons)==(((int)(s.charAt(6))-48)*cons)&&(((int)(s.charAt(6))-48)*cons)==(((int)(s.charAt(8))-48)*cons)&&(((int)(s.charAt(8))-48)*cons)==(((int)(s.charAt(9))-48)*cons)&&(((int)(s.charAt(9))-48)*cons)==(((int)(s.charAt(10))-48)*cons)){
         teste=false;
      }
      else{
      //SETA soma
         guarda = ((((s.charAt(0))-48) * 2) +
             (((s.charAt(1))-48) * 3) +
             (((s.charAt(3))-48) * 4) +
             (((s.charAt(4))-48) * 5) +
             (((s.charAt(5))-48) * 6) +
             (((s.charAt(7))-48) * 7) +
             (((s.charAt(8))-48) * 8) +
             (((s.charAt(9))-48) * 9)) ;
             
         
         int resto=(int)guarda%11;
         if(resto==0){
            digitoV1=0;
         }
         else{
            digitoV1=11-resto;
         }
         if(digitoV1!=s.charAt(11)-48){
            teste=false;
         }
      }
      return teste;
    }
    
}
