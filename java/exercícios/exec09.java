public class exec09 {
    public static void main(String[] args) {
        System.out.println("Digite o lado 1: ");
        int lado1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite o lado 2: ");
        int lado2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite o lado 3: ");
        int lado3 = new java.util.Scanner(System.in).nextInt();

        if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
            System.out.println("É equilatero");
        }else
            if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É isóceles");
            } else {
                System.out.println("É escaleno");
            }
    }
}
