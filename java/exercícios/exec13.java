public class exec13 {
    public static void main(String[] args) {

        int resultado = 1;

        System.out.print("Base: ");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.print("Expoente: ");
        int y = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= y; i++) {
            resultado = resultado * x;
        }

        System.out.println("Resultado: " + resultado);
    }
}
