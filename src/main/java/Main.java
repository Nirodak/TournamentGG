import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Kolya");
        names.add("Sveta");
        names.add("Ivan");

        for (String name : names){
            System.out.println(name);
        }

    }
}