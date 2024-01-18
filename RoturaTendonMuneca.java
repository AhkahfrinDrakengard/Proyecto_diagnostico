import java.util.Scanner;

public class RoturaTendonMuneca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean dolormuneca;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Siente hipersensibilidad o nota la muñeca hinchada? (True/False)");
        boolean dolormuneca1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Siente entumecimiento u hormigueo en la muñeca? (True/No)");
        boolean dolormuneca2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Le cuesta sostener objetos con las manos? (True/No)");
        boolean dolormuneca3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Escucha un chasquido o crujido cuando dobla o flexiona la muñeca? (True/No)");
        boolean dolormuneca4 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        scanner.close();

    
        if (dolormuneca1 == true || dolormuneca2 == true || dolormuneca3 == true || dolormuneca4 == true) {
            System.out.println("Posible diagnóstico: Rotura del tendon de la muñeca");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
}
