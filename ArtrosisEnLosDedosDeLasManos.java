import java.util.Scanner;

public class ArtrosisEnLosDedosDeLasManos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean artrosismano;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Presenta una disminucion de la movilidad de la articulacion? (True/No)");
        boolean artrosismano1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Se puede observar una deformidad articular, caracterizada por un aumento de volumen y deformacion de la articulacion? (True/No)");
        boolean artrosismano2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Siente dolor al mover la zona? (True/No)");
        boolean artrosismano3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        scanner.close();

    
        if (artrosismano1 == true || artrosismano2 == true || artrosismano3 == true) {
            System.out.println("Posible diagnóstico: Artrosis en los dedos de las manos");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
}
