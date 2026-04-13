public class MetodosRetornoParametros2 {
    public String boasVindas(String nome) {
        return "Bem-vindo" + nome + "!";
    }
    public static void main(String[] args) {
        MetodosRetornoParametros2 msg = new MetodosRetornoParametros2();
        System.out.println(msg.boasVindas("Cauã"));
    }
}
