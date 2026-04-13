public class MetodosComParametros4 {
    public void verificarPositivoNegativo(double numero) {
        if (numero >= 0) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }
    }
    public static void main(String[] args) {
        MetodosComParametros4 verificar = new MetodosComParametros4();
        verificar.verificarPositivoNegativo(7);
        verificar.verificarPositivoNegativo(-3);
    }
}
