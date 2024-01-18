import java.util.Scanner;

public class CodosTenista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Experimenta dolor o ardor en la parte externa del codo? (True/False)");
        boolean dolorCodo1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Tiene poca fuerza para agarrar objetos? (True/No)");
        boolean dolorCodo2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Dolor e incompetencia funcional al extender la muñeca y hacer supinación del antebrazo? (True/No)");
        boolean dolorCodo3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Dolor con algunos movimientos fáciles? (True/No)");
        boolean dolorCodo4 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        scanner.close();

    
        if (dolorCodo1 == true || dolorCodo2 == true || dolorCodo3 == true || dolorCodo4 == true) {
            System.out.println("Posible diagnóstico: Codo de tenista");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
}








