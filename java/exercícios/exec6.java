public class exec6 {
    public static void main(String[] args) {

        int d;

        System.out.println("Digite x1: ");
        int x1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite y1: ");
        int y1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite x2: ");
        int x2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite y2: ");
        int y2 = new java.util.Scanner(System.in).nextInt();

        d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

        System.out.println("Ponto 1: " + x1 + " e " + y1);
        System.out.println("Ponto 2: " + x2 + " e 67" + y2);
        System.out.println("A distância é: " + d);
    }
}