public class MetodosRetornoParametros3 {
    public double calcularDobro(double numero) {
        return numero * 2;
    }
    public static void main(String[] args) {
        MetodosRetornoParametros3 calc = new MetodosRetornoParametros3();
        double resultado = calc.calcularDobro(7);
        System.out.println("Dobro do número: " + resultado);
    }
}
