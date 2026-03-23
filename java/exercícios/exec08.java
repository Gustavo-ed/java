public class exec08 {
    public static void main(String[] args) {

        System.out.println("Digite o valor de A: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite o valor de B: ");
        int b = new java.util.Scanner(System.in).nextInt();

        int maior = (a > b) ? a : b;
        System.out.println("O maior é: " + maior);
    }
}
