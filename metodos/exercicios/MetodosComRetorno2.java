public class MetodosComRetorno2 {
    public String retornarNomeCompleto() {
        return "Gustavo Lopes Abreu";
    }
    public static void main(String[] args) {
        MetodosComRetorno2 dados = new MetodosComRetorno2();
        System.out.println("Nome: " + dados.retornarNomeCompleto());
    }
}
