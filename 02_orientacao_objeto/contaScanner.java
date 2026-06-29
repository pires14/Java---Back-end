public class contaScanner{
    double saldo = 500.0;
    double verificarSaldo(){
        return saldo;
    }
    
    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ de: "+ valor "realizado.");
        }
        else{
            System.out.println("Saldo insuficiente para o saque de R$ de: "+ valor);
        }
    }
}
//void não tem retorno. Não tem nada dele próprio para retornar

