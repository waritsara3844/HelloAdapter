import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Golden golden1 = new Golden();
        dogs.add(golden1);
        Golden golden2 = new Golden();
        dogs.add(golden2);

        Scottish scottish = new Scottish();
        CatAdapter adapter = new CatAdapter(scottish);
        dogs.add(adapter);

        Parrot parrot = new Parrot();
        BirdAdapter adapter1 = new BirdAdapter(parrot);
        dogs.add(adapter1);

        for(Dog dog : dogs){
            dog.run();
            dog.bark();
        }
    }
}