public class exec05 {
    public static void main(String[] args) {
        System.out.println("Digite a velocidade em km/h: ");
        float km = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Digite o tempo da viagem em horas: ");
        float horas = new java.util.Scanner(System.in).nextFloat();
        System.out.println("A distância percorrida foi de: " + km * horas + " km");
    }
}
