import java.util.Scanner;

public class cabeza {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==========BIENVENIDO A LA ENFERMERÍA==========");
            System.out.println("¿Qué parte del cuerpo te duele?");
            System.out.println("1. Cabeza");
            System.out.println("2. Brazos");
            System.out.println("3. Torso");
            System.out.println("4. Piernas");
            System.out.println("5. Finalizar");
            System.out.print("Introduzca aquí el número: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    cabeza(teclado);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
        } while (opcion != 5);

        teclado.close();
    }

    public static void cabeza(Scanner teclado) {
        System.out.println("==========CABEZA==========");
        System.out.println("Le hemos proporcionado una lista con las posibles partes de la cabeza que le pueden afectar:");
        System.out.println("1. Frente");
        System.out.println("2. Nuca");
        System.out.println("3. Temporal");
        System.out.println("4. Otro");
        System.out.println("5. Finalizar");
        int caso;

        do {
            System.out.print("Introduzca aquí el caso: ");
            caso = teclado.nextInt();
            teclado.nextLine();

            switch (caso) {
                case 1:
                    System.out.println("Puede ser tensional. Ante todo descanse y evite el estrés. Recuerde que el estrés, la ansiedad o la depresión a menudo desencadenan dolores de cabeza por tensión, \npero también pueden aparecer debido al cansancio, la mala postura o problemas musculoesqueléticos en el cuello. Para aliviar el dolor provocado por la tensión tome analgésicos \nde venta libre, como ibuprofeno, acetaminofeno o aspirina. Lo siguiente también puede ser útil: recibir un masaje, ejercitar suavemente el cuello, colocar una toalla o un paño \ncaliente en la frente o el cuello");
                    break;
                case 2:
                    System.out.println("Podría ser un problema de postura. Intente mejorar su postura y haga estiramientos. Aplica calor para aliviar los músculos tensionados del cuello y los hombros también es una buena alternativa. La artrosis también es una causa frecuente del dolor de cuello");
                    break;
                case 3:
                    System.out.println("Podría ser un dolor de cabeza por migraña. Las migrañas se pueden desencadenar por alimentos como el chocolate, ciertos quesos o el glutamato monosódico. La abstinencia de \ncafeína, la falta de sueño y el alcohol también pueden desencadenarlos.");
                    break;
                case 4:
                    System.out.print("Por favor, díganos qué parte le duele: ");
                    String otro = teclado.nextLine();
                    String nuevo = otro.toLowerCase().replaceAll(" ", "");
                
                    switch (nuevo) {
                        case "ojos":
                            System.out.println("Los ojos pueden doler por diferentes motivos y causas. Aqui le dejo algunas: \n1.Mal uso de las lentes de contacto. \n2.Conjuntivitits: podría ser conjuntivitis alérgica, conjuntivitis viral o conjuntivitis bacteriana. Para mayor seguridad consulte con su medico. \n3.Algun cuerpo extraño dentro del ojo. \n4.Sequedad ocular: Si trabaja con pantallas o fuertes luces recuerde hidratarse con gotas para los ojos al menos cada 12 horas tras una fuerte exposición.");
                            break;
                        case "nariz":
                            System.out.println("El dolor en la nariz es causado por la Sinusitis Aguda. Este dolor puede desplazarse hasta la cara o la cabeza. El tratamiento principal consiste en la administración de \nantibióticos por vía oral durante un periodo de diez a catorce días");
                            break;
                        case "orejas":
                            System.out.println("El dolor en las orejas esta provocado por: 1.Otitis Media 2.Oido de nadador 3.Otitis externa maligna. En estos casos se debera contactar con su medico. \nAlgunos remedios caseros pueden ser: \n1. Colocar una compresa fría o paños húmedos fríos en el oído externo durante 20 minutos para reducir el dolor. \n2. Masticar puede ayudar a aliviar el dolor y la presión de una infección del oído. \n3. Descansar en una posición erguida en lugar de acostarse puede reducir la presión en el oído medio. \n4. Las gotas óticas de venta libre se pueden emplear para aliviar el dolor siempre y cuando el tímpano no presente ruptura. \n5. Los analgésicos de venta libre, como el paracetamol o el ibuprofeno, pueden proporcionar un alivio en el dolor de oído para los adultos y los niños.");
                            break;
                        case "boca":
                            System.out.println("por bocazas");
                        default:
                            System.out.println("No se ha encontrado dolor o enfermedad alguna relaciona con eso. Por favor visite a su medico o acuda a un profesional.");
                            break;
                    }
                    break;
            }
        } while (caso != 5);
    }
}
