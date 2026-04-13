public class MetodosRetornoParametros1 {
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        MetodosRetornoParametros1 calc = new MetodosRetornoParametros1();
        double resultado = calc.multiplicar(40, 5);
        System.out.println("Resultado: " + resultado);
    }
}
