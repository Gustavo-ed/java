public class MetodosComParametros1 {
    public void imprimirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }
    public static void main(String[] args) {
        MetodosComParametros1 imp = new MetodosComParametros1();
        imp.imprimirMensagem("Esta é uma mensagem personalizada!");
    }
}
