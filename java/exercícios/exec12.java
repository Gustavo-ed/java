public class exec12 {
    public static void main(String[] args) {
        int fatorial = 1;
        System.out.println("Digite um numero: ");
        int x = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= x; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial: " + fatorial);
    }
}
