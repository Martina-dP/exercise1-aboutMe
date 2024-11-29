import java.util.List;
import java.util.Scanner;

public class DelPinoMartinaMain {
    public static void main(String[] args) {
        DelPinoMartinaMain program = new DelPinoMartinaMain();
        program.inicio();
    }
    public void inicio() {
        List<String> hobbies = List.of("Leer", "Programar", "Viajar");
        List<String> foods = List.of("Asado", "Pasta", "Helado");
        List<String> funFacts = List.of(
                "Water might not be wet",
                "Football teams wearing red kits play better",
                "You can be heavily pregnant and not realise");

        DelPinoMartinaPerfil martina = new DelPinoMartinaPerfil(
                "martina",
                "Entrenando mucho para correr una maraton en el 2025",
                hobbies,
                foods,
                funFacts
        );
        menuOpcions(martina);
    }

    public static void menuOpcions(DelPinoMartinaPerfil delPinoMartinaPerfil){

        int opcion ;
        boolean end = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu AboutMe: " + delPinoMartinaPerfil.getName());

        while (true) {

            System.out.println("1 = Ver la historia");
            System.out.println("2 =  Ver hobbies y foods");
            System.out.println("3 =  Ver fun fact aleatorio");
            System.out.println("4 = Salir");
            System.out.println("seleccione una opcion: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Story " + delPinoMartinaPerfil.getStory());
                    break;
                }
                case 2: {
                    System.out.println("Favorites");
                    System.out.println("Hobbies: " + String.join(", ", delPinoMartinaPerfil.getHobbies()));
                    System.out.println("Foods: " + String.join(", ", delPinoMartinaPerfil.getFoods()));
                    break;
                }
                case 3: {
                    List<String> funFacts = delPinoMartinaPerfil.getFunFacts();
                    String randomFunFact = funFacts.get((int) (Math.random() * funFacts.size()));
                    System.out.println("Fun Fact: " + randomFunFact);
                    break;
                }
                case 4: {
                    System.out.println("saliendo...");
                    end = true;
                    return;
                }
                default: {
                    System.out.println("Opción no válida. Por favor, elige 1, 2, 3 o 4.");
                    break;
                }
            }
        }
    }
}