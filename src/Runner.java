import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        ArrayList<String> trees= new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees);
        System.out.println(trees.get(0));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths =  names.size()+moreNames.length+names.get(0).length()+moreNames[0].length();
                System.out.println(lengths);
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Tails"));
        cats.add(new Cat("Tail"));
        cats.add(new Cat("Tai"));
        cats.add(new Cat("Ta"));
        Cat newCat = new Cat("New");
        cats.set(2,newCat);
        System.out.println(cats);
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();

    }
}
