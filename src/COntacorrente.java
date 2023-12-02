public class COntacorrente {
    
        private int numero;
        private double saldo;
        private boolean especial;
        private double limite;
    
        public void ContaCorrente(int numero, double saldoInicial, boolean especial, double limite) {
            this.numero = numero;
            this.saldo = saldoInicial;
            this.especial = especial;
            this.limite = limite;
        }
    
        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }
    
        public void sacar(double valor) {
            if (valor > 0) {
                if (this.saldo - valor >= -this.limite || this.especial) {
                    this.saldo -= valor;
                    System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Valor de saque inválido.");
            }
        }
    
        public void consultarSaldo() {
            System.out.println("Saldo da conta " + this.numero + ": R$" + this.saldo);
        }
    
        public boolean usandoChequeEspecial() {
            return this.saldo < 0;
        }
    
        // Exemplo de método para acessar o número da conta
        public int getNumero() {
            return this.numero;
        }
    
        public static void main(String[] args) {
            // Exemplo de uso da classe
            ContaCorrente conta = new ContaCorrente(123, 1000.0, true, 500.0);
            conta.depositar(200.0);
            conta.sacar(1500.0);
            conta.consultarSaldo();
    
            if (conta.usandoChequeEspecial()) {
                System.out.println("A conta está usando cheque especial.");
            } else {
                System.out.println("A conta não está usando cheque especial.");
            }
        }
    
    

}