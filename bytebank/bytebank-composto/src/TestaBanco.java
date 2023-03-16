public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "lucas kato";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        // associa conta do paulo ao titular
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.nome);
    }
}
