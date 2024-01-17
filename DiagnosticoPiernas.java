import java.util.Scanner;

public class DiagnosticoPiernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de diagnóstico de enfermedades en las piernas.");
        System.out.println("Responde 's' para Sí y 'n' para No.");

        boolean desgarroGemelo = hacerPreguntasDesgarroGemelo();
        boolean roturaMenisco = hacerPreguntasRoturaMenisco();
        boolean torsionTobillo = hacerPreguntasTorsionTobillo();
        boolean roturaFemur = hacerPreguntasRoturaFemur();

        
        diagnosticar(desgarroGemelo, roturaMenisco, torsionTobillo, roturaFemur);

        teclado.close();
    }

    private static boolean hacerPregunta(String pregunta) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(pregunta + " ");
        char respuesta = teclado.next().charAt(0);
        
        return respuesta == 's' || respuesta == 'S';
    }

    private static boolean hacerPreguntasDesgarroGemelo() {
        return  hacerPregunta("¿Experimentas dolor intenso en el gemelo?") &&
                hacerPregunta("¿Has notado hinchazón en la zona?");
    }

    private static boolean hacerPreguntasRoturaMenisco() {
        return  hacerPregunta("¿Has tenido recientemente un episodio de bloqueo de la rodilla con dolor?") &&
                hacerPregunta("¿Sientes que la rodilla se 'traba' al moverla?");
    }

    private static boolean hacerPreguntasTorsionTobillo() {
        return  hacerPregunta("¿Has experimentado una torsión brusca en el tobillo?") ||
                hacerPregunta("¿Hay hinchazón y dolor alrededor del tobillo?");
    }

    private static boolean hacerPreguntasRoturaFemur() {
        return  hacerPregunta("¿Has sufrido un trauma fuerte en la pierna, como una caída desde altura?") &&
                hacerPregunta("¿Experimentas dificultad para mover la pierna?");
    }

    private static void diagnosticar(boolean desgarroGemelo, boolean roturaMenisco, boolean torsionTobillo, boolean roturaFemur) {
        System.out.println("\nDiagnóstico:");

        if (desgarroGemelo) {
            System.out.println("Puede haber un desgarro en el gemelo. Se recomienda consultar a un profesional médico.");
        } else if (roturaMenisco) {
            System.out.println("Podría ser una rotura de menisco. Consulta a un médico para obtener un diagnóstico preciso.");
        } else if (torsionTobillo) {
            System.out.println("La torsión en el tobillo puede haber causado lesiones. Consulta a un médico para una evaluación adecuada.");
        } else if (roturaFemur) {
            System.out.println("Dada la posibilidad de una rotura de fémur, es crucial buscar atención médica de inmediato.");
        } else {
            System.out.println("No se puede determinar una enfermedad específica. Consulta a un médico para una evaluación adecuada.");
        }
    }
}
