import java.util.Scanner;

public class EnfermedadNerviosBrazo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nerviosbrazo;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Presenta una sensacion gradual de entumecimiento, hormigueo o cosquilleo en el brazo? (True/No)");
        boolean nerviosbrazo1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Presenta dolor punzante, agudo o escozor? (True/No)");
        boolean nerviosbrazo2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Presenta sensibilidad extrema al tacto? (True/No)");
        boolean nerviosbrazo3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        scanner.close();

    
        if (nerviosbrazo1 == true || nerviosbrazo2 == true || nerviosbrazo3 == true) {
            System.out.println("Posible diagnóstico: Enfermedad de los nervios del brazo");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
}