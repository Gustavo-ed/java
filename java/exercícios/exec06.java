public class exec06 {
    public static void main(String[] args) {

        int distancia;

        System.out.print("Digite x1: ");
        int x1 = new java.util.Scanner(System.in).nextInt();

        System.out.print("Digite y1: ");
        int y1 = new java.util.Scanner(System.in).nextInt();

        System.out.print("Digite x2: ");
        int x2 = new java.util.Scanner(System.in).nextInt();

        System.out.print("Digite y2: ");
        int y2 = new java.util.Scanner(System.in).nextInt();

        distancia = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);

        System.out.println("A Distancia é de: " + distancia);
    }
}
