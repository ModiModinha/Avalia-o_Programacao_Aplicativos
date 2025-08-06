
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     Integer MenuConta = 0;
     Integer MenuCliente = 0;

        //criação de clientes
        Cliente cliente;
        cliente = new Cliente();
        cliente.nome = "Carlos";
        cliente.cpf = "123456789";
        cliente.cnpj =" - ";

        Cliente jessica;
        jessica = new Cliente();
        jessica.nome = "Jessica";
        jessica.cpf = "987654321";
        jessica.cnpj =" - ";

        Cliente davy;
        davy = new Cliente();
        davy.nome = "Davy";
        davy.cpf = "987654321";
        davy.cnpj =" - ";

        //criação de contasbancarias
        ContaBancaria carlos;
        carlos = new ContaBancaria();
        carlos.numero = 1;
        carlos.saldo = 3000;
        carlos.limite = 1000;

        ContaBancaria jessicaB;
        jessicaB = new ContaBancaria();
        jessicaB.numero = 2;
        jessicaB.saldo = 6000;
        jessicaB.limite = 2000;

        ContaBancaria davyB;
        davyB = new ContaBancaria();
        davyB.numero = 3;
        davyB.saldo = 10000;
        davyB.limite = 1000;

//menu pra escolher o cliente
    do {
        System.out.println("Bem vindo qual conta gostaria de acessar nesse momento");
        System.out.println("Digite ao Numero que corresponda ao da conta");
        System.out.println("Numero da Conta: " + "1 " + cliente.nome);
        System.out.println("Numero da Conta: " + "2 " + jessica.nome);
        System.out.println("Numero da Conta: " + "3 " + davy.nome);
        System.out.println("4 - Encerrar Programa");
        MenuConta = sc.nextInt();

//switch com o menu pra cada cliente
        switch (MenuConta) {
            case 1:
                do {
                    System.out.println("Voce Acessou a conta do Carlos");
                    System.out.println(" ");
                    System.out.println("Numero da conta: " + carlos.numero);
                    System.out.println("Nome: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println("Saldo: " + carlos.saldo);
                    System.out.println(" ");
                    System.out.println("O que deseja fazer nesta conta?");
                    System.out.println("1 - Saque ");
                    System.out.println("2 - Deposito");
                    System.out.println("3 - Voltar");
                    MenuCliente = sc.nextInt();

                    if (MenuCliente == 1) {
                        carlos.sacar();
                    }
                    if (MenuCliente == 2) {
                        carlos.depositar();
                    }
                 } while (MenuCliente != 3);
                break;


        case 2:
        do {
            System.out.println("Voce Acessou a conta da Jessica ");
            System.out.println(" ");
            System.out.println("Numero da conta: " + jessicaB.numero);
            System.out.println("Nome: " + jessica.nome);
            System.out.println("CPF: " + jessica.cpf);
            System.out.println("Saldo: " + jessicaB.saldo);
            System.out.println(" ");
            System.out.println("O que deseja fazer nesta conta?");
            System.out.println("1 - Saque ");
            System.out.println("2 - Deposito");
            System.out.println("3 - Voltar");
            MenuCliente = sc.nextInt();

            if (MenuCliente == 1) {
                jessicaB.sacar();
            }
            if (MenuCliente == 2) {
                jessicaB.depositar();
            }
        } while (MenuCliente != 3);
        break;


        case 3:
        do {
            System.out.println("Voce Acessou a conta da Davy ");
            System.out.println(" ");
            System.out.println("Numero da conta: " + davyB.numero);
            System.out.println("Nome: " + davy.nome);
            System.out.println("CPF: " + davy.cpf);
            System.out.println("Saldo: " + davyB.saldo);
            System.out.println(" ");
            System.out.println("O que deseja fazer nesta conta?");
            System.out.println("1 - Saque ");
            System.out.println("2 - Deposito");
            System.out.println("3 - Voltar");
            MenuCliente = sc.nextInt();

            if (MenuCliente == 1) {
                davyB.sacar();
            }
            if (MenuCliente == 2) {
                davyB.depositar();
            }
        } while (MenuCliente != 3);
    }}while (MenuConta != 4);




        }

    }
