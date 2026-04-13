public class MetodosComParametros2 {
    public void imprimirSoma(double a, double b) {
        System.out.println("Soma de " + a + " + " + b + " = " + (a + b));
    }
    public static void main(String[] args) {
        MetodosComParametros2 calc = new MetodosComParametros2();
        calc.imprimirSoma(25.5, 37);
    }
}
