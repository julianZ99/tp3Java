import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante julian = new Estudiante(41669145, "Julian","Zapata","julian@zapata.org","Gianelli 239",2022,11000,"TUP");
        Estudiante martin = new Estudiante(40564987, "Martin","Montagner","mmontagner@gmail.com","ABC 3247",2022,10000,"TUP");
        Estudiante kevin = new Estudiante(43446792, "Kevin","Tolosa","kevin2000@gmail.com","RST 784",2022,10000,"TUP");
        Estudiante franco = new Estudiante(43874122, "Franco","Guidi","guidifranco41@gmail.com","XYZ 8420",2022,10000,"TUP");
        Staff pablo = new Staff(38485165, "Pablo", "Lezcano", "pc@org.net", "rst 489", 128000, "Noche");
        Staff nicolas = new Staff(24892132, "Nicolas", "Lezcano", "nlzz@org.net", "rst 489", 135000, "Noche");

        List <Persona> arreglo = new ArrayList<>();
        arreglo.add(julian);
        arreglo.add(martin);
        arreglo.add(kevin);
        arreglo.add(franco);
        arreglo.add(pablo);
        arreglo.add(nicolas);

        arreglo.forEach(persona -> System.out.println(persona));

    }
}