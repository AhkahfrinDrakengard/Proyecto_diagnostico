import java.util.Scanner;

public class torso {
    public static void main(String[] args) {
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
        scanner.close();
    }
}
