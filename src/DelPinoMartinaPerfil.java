import java.util.List;
import java.util.Random;

public class DelPinoMartinaPerfil {
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    //Creando un constructor para nada mas pasar los valores de cada atributo por parametros en main
    public DelPinoMartinaPerfil(
            String name,
            String story,
            List<String> hobbies,
            List<String> foods,
            List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    //Genero un getter por cada uno de los atributos que quiero generar una lectura de valores.
    public String getName() {
        return name;
    }
    public String getStory() {
        return story;
    }
    public void getHobbies() {
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
    }
    public void getFoods() {
        for (String food : foods) {
            System.out.println(food);
        }
    }
    public String getRandomFact() {
        int index = new Random().nextInt(funFacts.size());
        return funFacts.get((index));
    }

    //Formateo la informacion para facilitar lectura
    // el ":\n" hace un salto de linea depues de cada atributo
    @Override
    public String toString() {
        return "DelPinoMartinaPerfil{" +
                "name='" + name + ":\n" +
                "story='" + story + ":\n" +
                "hobbies=" + (hobbies.isEmpty() ? "No tienes hobbies" : String.join(", ", hobbies)) + ":\n" +
                "foods=" + (foods.isEmpty() ? "No tienes foods" : String.join(", ", foods)) + ":\n" +
                "funFacts=" + (funFacts.isEmpty() ? "No tienes funFacts" : String.join(", ", funFacts)) +
                '}';
    }
}
