import java.util.Scanner;

public class ContaBancaria {
    public static Scanner sc = new Scanner(System.in);
    Integer numero;
    double saldo;
    double limite;

    double Saque;
    double Deposito;

    //metodo para realizar saques
    public void sacar(){
        System.out.println("Quanto deseja sacar?");
        Saque = sc.nextDouble();
        saldo = (saldo - Saque);
    }

    //metodo para realizar depositos
    public void depositar(){
        System.out.println("Quanto deseja depositar?");
        Deposito = sc.nextDouble();
        saldo = (saldo + Deposito);
    }

}
