public class ContaBancaria
{
    private float saldo;         
    private float limiteCheque;  
    private float chequeUsado;    

    public ContaBancaria(float depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeUsado = 0;

        if (depositoInicial <= 500) {
            this.limiteCheque = 50;
        } else {
            this.limiteCheque = depositoInicial * 0.5f;
        }
    }

    
    public float getSaldo() {
        return saldo;
    }

   
    public float getChequeDisponivel() {
        return limiteCheque - chequeUsado;
    }

   
    public float getSaldoTotal() 
    {
        return saldo + getChequeDisponivel();
    }

    public void depositar(float valor) {
        if (chequeUsado > 0) 
        {

            float taxa = chequeUsado * 0.2f;
            if (valor >= chequeUsado + taxa) 
            {
                valor -= (chequeUsado + taxa);
                chequeUsado = 0;
            } 
            else if (valor >= taxa) 
            {
                chequeUsado -= (valor - taxa);
                valor = 0;
            } 
            else 
            {
                
                chequeUsado -= 0;
                valor = 0;
            }
        }
        saldo += valor;
    }


    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else if (valor <= saldo + getChequeDisponivel()) {
            float restante = valor - saldo;
            saldo = 0;
            chequeUsado += restante;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void pagarBoleto(float valor) {
        sacar(valor);
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeUsado > 0;
    }
}
