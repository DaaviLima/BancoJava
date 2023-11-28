package Banco;
public class Banco {
    String nome;
    double saldo = 0;

    public Banco(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public Banco(String nome){
        this.nome = nome;
    }
    public double sacar(double valorRetirado) {
        if ((saldo - valorRetirado)<0) {
            System.out.println("Saldo insuficiente!");
        }else{
            saldo = saldo - valorRetirado;
            System.out.println("Saque realizado com sucesso");
        }
        return saldo;
    }
    public double depositar(double valorAdicionado) {
        saldo = saldo + valorAdicionado;
        return saldo;
    }
    public double consultarSaldo(){
        return  saldo;
    }

    public String consultarNome() {
        return nome;
    }
    public void alterarNome(String novoNome) {
        nome = novoNome;

    }
    public void transferir(Banco clienteRecebedor, double valor){
        if ((saldo-valor)<0) {
            System.out.println("Saldo insuficiente");
        }else{
            clienteRecebedor.depositar(valor);
            saldo -= valor;
            System.out.println("Transferecia realizada com sucesso!");
            System.out.println("Seu novo saldo é "+saldo+"reais");
        }

    }
}
