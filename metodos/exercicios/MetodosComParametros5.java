public class MetodosComParametros5 {
    public void saudacaoPersonalizada(String nome) {
        System.out.println("Olá, " + nome + " Seja bem-vindo!");
    }
    public static void main(String[] args) {
        MetodosComParametros5 saudacao = new MetodosComParametros5();
        saudacao.saudacaoPersonalizada("Gustavo");
    }
}
