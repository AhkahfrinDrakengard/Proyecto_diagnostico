import java.util.Scanner;

public class DiagnosticoMedico {

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
                    brazos(args);
                    break;
                case 3:
                    torso(args);
                    break;
                case 4:
                    DiagnosticoPiernas(teclado);
                    break;
                case 5:
                    finalizar();
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
    public static void DiagnosticoPiernas(Scanner teclado) {
        System.out.println("Bienvenido al sistema de diagnóstico de enfermedades en las piernas.");
        System.out.println("Responde 's' para Sí y 'n' para No.");

        boolean desgarroGemelo = hacerPreguntasDesgarroGemelo(teclado);
        boolean roturaMenisco = hacerPreguntasRoturaMenisco(teclado);
        boolean torsionTobillo = hacerPreguntasTorsionTobillo(teclado);
        boolean roturaFemur = hacerPreguntasRoturaFemur(teclado);

        diagnosticar(desgarroGemelo, roturaMenisco, torsionTobillo, roturaFemur);
    }

    private static boolean hacerPreguntasDesgarroGemelo(Scanner teclado) {
        return hacerPregunta(teclado, "¿Experimentas dolor intenso en el gemelo?") &&
                hacerPregunta(teclado, "¿Has notado hinchazón en la zona?");
    }

    private static boolean hacerPreguntasRoturaMenisco(Scanner teclado) {
        return hacerPregunta(teclado, "¿Has tenido recientemente un episodio de bloqueo de la rodilla con dolor?") &&
                hacerPregunta(teclado, "¿Sientes que la rodilla se 'traba' al moverla?");
    }

    private static boolean hacerPreguntasTorsionTobillo(Scanner teclado) {
        return hacerPregunta(teclado, "¿Has experimentado una torsión brusca en el tobillo?") ||
                hacerPregunta(teclado, "¿Hay hinchazón y dolor alrededor del tobillo?");
    }

    private static boolean hacerPreguntasRoturaFemur(Scanner teclado) {
        return hacerPregunta(teclado, "¿Has sufrido un trauma fuerte en la pierna, como una caída desde altura?") &&
                hacerPregunta(teclado, "¿Experimentas dificultad para mover la pierna?");
    }

    private static boolean hacerPregunta(Scanner teclado, String pregunta) {
        System.out.print(pregunta + " ");
        char respuesta = teclado.next().charAt(0);

        return respuesta == 's' || respuesta == 'S';
    }

    private static void diagnosticar(boolean desgarroGemelo, boolean roturaMenisco, boolean torsionTobillo, boolean roturaFemur) {
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

    public static void brazos (String[]args){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Por favor indique que parte de los brazos siente afectado");
            System.out.println("1. Dedos");
            System.out.println("2. Codos");
            System.out.println("3. Brazo en general");
            System.out.println("4. Clavicula");
            System.out.println("5. Muñeca");
            System.out.println("6. Finalizar");
            System.out.print("Introduzca el numero aqui: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ArtrosisDedos(args);
                    break;
                case 2:
                    CodosTenista(args);
                    break;
                case 3:
                    EnfermedadNerviosBrazo();
                    break;
                case 4:
                    RoturaClavicula(args);
                    break;
                case 5:
                    RoturaTendonMuneca(args);
                    break;
                default:
                    break;
            }
        }while(opcion!=6);
    }
    public static void ArtrosisDedos(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean artrosismano;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Presenta una disminucion de la movilidad de la articulacion? (True/No)");
        boolean artrosismano1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Se puede observar una deformidad articular, caracterizada por un aumento de volumen y deformacion de la articulacion? (True/No)");
        boolean artrosismano2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Siente dolor al mover la zona? (True/No)");
        boolean artrosismano3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

    
        if (artrosismano1 == true || artrosismano2 == true || artrosismano3 == true) {
            System.out.println("Posible diagnóstico: Artrosis en los dedos de las manos");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
    public static void CodosTenista(String[] args) {
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

    
        if (dolorCodo1 == true || dolorCodo2 == true || dolorCodo3 == true || dolorCodo4 == true) {
            System.out.println("Posible diagnóstico: Codo de tenista");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
    public static void EnfermedadNerviosBrazo() {
        Scanner scanner = new Scanner(System.in);
        boolean nerviosbrazo;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Presenta una sensacion gradual de entumecimiento, hormigueo o cosquilleo en el brazo? (True/No)");
        boolean nerviosbrazo1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Presenta dolor punzante, agudo o escozor? (True/No)");
        boolean nerviosbrazo2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Presenta sensibilidad extrema al tacto? (True/No)");
        boolean nerviosbrazo3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

    
        if (nerviosbrazo1 == true || nerviosbrazo2 == true || nerviosbrazo3 == true) {
            System.out.println("Posible diagnóstico: Enfermedad de los nervios del brazo");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
    public static void RoturaClavicula(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean roturaclavicula;

        System.out.println("Por favor, responda a las siguientes preguntas para obtener un diagnóstico:");
        System.out.println("¿Tiene dificultad para mover el hombro o el brazo y dolor al moverlos? (Si/False)");
        boolean roturaclavicula1 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Siente un crujido o rechinamiento al levantar el brazo? (Si/No)");
        boolean roturaclavicula2 = "True".equalsIgnoreCase(scanner.nextLine().trim());

        System.out.println("¿Ha observado si tiene hematomas, hinchazon o un protuberancia en el hombro? (Si/No)");
        boolean roturaclavicula3 = "True".equalsIgnoreCase(scanner.nextLine().trim());

    
        if (roturaclavicula1 == true || roturaclavicula2 == true || roturaclavicula3 == true) {
            System.out.println("Posible diagnóstico: Rotura de la clavicula");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
    public static void RoturaTendonMuneca(String[] args) {
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


    
        if (dolormuneca1 == true || dolormuneca2 == true || dolormuneca3 == true || dolormuneca4 == true) {
            System.out.println("Posible diagnóstico: Rotura del tendon de la muñeca");
        } else {
            System.out.println("No está afectado por dicha enfermedad");
        }
    }
    public static void torso (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n*** Menú de Navegación ***");
            System.out.println("¿Que parte es la que le duele/incomoda en este momento?");
            System.out.println("1. Corazón");
            System.out.println("2. Pulmones");
            System.out.println("3. Estomago");
            System.out.println("4. Abdomen (parte inferior derecha)");
            System.out.println("5. Abdomen (parte inferior izquierda)");
            System.out.println("6. Ombligo");
            System.out.println("7. Salir");
            
            System.out.print("Introduzca su caso, por favor: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("(No hay remedio casero salvo en el primero). Puede ser un problema cardiovascular (tomar aspirina) u otro más serio. Si tienes dolor en el pecho, te falta aliento y sientes una fatiga inexplicable, deberías ir a un médico para realizar pruebas y determinar el resultado. En cambio, si sientes una presión en el pecho (hipertensión) o palpitaciones cardiacas, deberías consultar a un cardiólogo. (Para aliviar dolores toma leche de cúrcuma, almendras, compresas frías y ajo)");
                    break;
               
                case 2:
                    System.out.println("Si tienes Tos persistente, bebe mucha agua, un poco de miel al día y descansa en cama. Si padeces de tener dificultades respiratorias, deberías consultar a un médico. Si tienes un ventilador en casa, podrías usarlo para recibir aire extra y aliviarlo en el tiempo que estés en el tratamiento. Si al respirar te duele, puede ser que la costilla se haya desplazado y necesite operación. Por último, si tienes infección respiratoria originada por una gripe grave, se te dará antivirales, en caso contrario, antibióticos. Si la situación se agrava demasiado, puede llegar a necesitar tratamiento de oxigenoterapia. Para calmar la incomodidad toma alimentos con vitaminas A y C, bebe mucho líquido y ventila las habitaciones.");
                    break;

                case 3:
                    System.out.println("Si tienes dolor de estómago, puede ser por no defecar durante mucho tiempo. Si no es eso, puede tratarse de un malestar estomacal. Toma mucha agua y no te acuestes en una cama. Consume jengibres y evita alimentos difíciles de digerir. También puedes tomarte un bicarbonato de sodio para liquidar con la molestia. Si sientes dolor al orinar, se trata de una infección urinaria y debes acudir al médico. Si sientes náuseas y un dolor en la parte derecha superior del abdomen, se trata de una inflamación de la Vesícula Biliar y debes ir al médico.");
                    break;

                case 4:
                    System.out.println("(No hay remedio casero). Si tienes fiebre junto a un dolor del ombligo que se desplaza hacia la derecha, se considera Apendicitis (para calmar el dolor bebe mucha agua, camina un poco todos los días y guarda reposo) y deberías ir al médico. Si sientes un dolor repentino y agudo en el costado y parte baja de la espalda, ve al médico (Cálculo Renal, para aliviar síntomas bebe mucho líquido, come con menos sal y toma 2 o 3 porciones ricas en Calcio junto a alguna limón o naranja). Si eres mujer y tienes dolor en las partes bajas y cambios en la menstruación, debes ir a una evaluación. En caso de ser hombre, si tienes dolor agudo en el escroto y testículos, ve al médico inmediatamente.");
                    break;

                case 5:
                    System.out.println("Si tienes dolor abdominal, sensibilidad y fiebre, ve al médico y toma los antibióticos recetados y sigue una dieta baja en fibra. Si no puedes levantar nada pesado y te duele, es un caso serio, ve al médico (para aliviar los síntomas no fumes, come alimentos altos en fibra y toma los líquidos indicados, no levantes nada o empeorará la situación).");
                    break;

                    case 6: System.out.println("Protuberancias alrededor del ombligo, sensibilidad y dolor vaya inmediatamente al médico para una cirugía(Única forma de aliviar sintomas es con ibuprofeno junto a un cinturón de Hernia Umbilical). Si tiene enrojecimiento e inflamado el ombligo, si es leve, trate de usar alcohol isopropílico tópico, ungüentos antibióticos o antimicóticos, en caso grave hará falta medicamentos orales y tópicos. (Lave suavemente el ombligo con agua y jabón todos los días y asegurese de que este seco al terminar de lavar). Si siente dolor alrededor del ombligo y esta tenso tome analgésicos o medicamentos antiinflamatorios no esteroides como Flanax, lo que le alivia el dolor es el Naproxeno Sódico.");
                    break;

                    case 7:
                    break;

                    default:
                    System.out.println("No se reconoce por lo que queda como opción invalida.");

            }
        }while (opcion!=7);
          
    }
    public static void finalizar() {
        System.out.println("¡Gracias por visitar consulta Iberia!");
    }
}