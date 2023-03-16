public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.deposita(500);

        System.out.println(primeiraConta.saldo);
        boolean marcou = primeiraConta.saca(500);
        System.out.println(marcou);

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);
        if (segundaConta.transfere(1001, primeiraConta)) {
            System.out.println("deu certo");
        } else {
            System.out.println("deu errado");
        }
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

    }
}