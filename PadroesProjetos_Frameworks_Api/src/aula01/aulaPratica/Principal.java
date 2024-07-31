package aula01.aulaPratica;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente_01 = new Cliente();
        cliente_01.setCpf("02850435902");
        cliente_01.setAnoNascimento(1980);
        cliente_01.setNome("marcos da Rocha Souza");
        cliente_01.setEmail("mr_souza@gmail.com");

        Conta conta_01 = new Conta();
        conta_01.setNumero(1512);
        conta_01.setSaldo(750.63);

        System.out.println(cliente_01.toString());
        System.out.println(conta_01.toString());

        Cliente cliente_02 = new Cliente();
        cliente_02.setCpf("03510400902");
        cliente_02.setAnoNascimento(1985);
        cliente_02.setNome("Maria Julia Almeida");
        cliente_02.setEmail("maria@gmail.com");

        System.out.println(cliente_02.toString());

        conta_01.creditaSaldo(100);
        System.out.println(conta_01.toString());

        conta_01.debitaSaldo(1000);
        System.out.println(conta_01.toString());

        Cliente cliente_03 = new Cliente("023544578", 1998, "Carolina Santos", "anaSantos21@gmail.com", conta_01);
        System.out.println(cliente_03.toString());
    }
}
