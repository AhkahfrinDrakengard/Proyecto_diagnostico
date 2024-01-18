import java.util.Scanner;

public class RoturaDeClavicula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean roturaclavicula;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Tiene dificultad para mover el hombro o el brazo y dolor al moverlos? (Si/False)");
        boolean roturaclavicula1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Siente un crujido o rechinamiento al levantar el brazo? (Si/No)");
        boolean roturaclavicula2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Ha observado si tiene hematomas, hinchazon o un protuberancia en el hombro? (Si/No)");
        boolean roturaclavicula3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        scanner.close();

    
        if (roturaclavicula1 == true || roturaclavicula2 == true || roturaclavicula3 == true) {
            System.out.println("Posible diagnóstico: Rotura de la clavicula");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
}
