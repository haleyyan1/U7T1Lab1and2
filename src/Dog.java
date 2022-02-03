public class Dog {
    private String dogName;
    public Dog(String d){
        dogName=d;
    }
    public String getDogName() {
        return dogName;
    }
    public void setDogName(String n) {
        dogName=n;
    }
    public void bark() {
        System.out.println("woof!");
    }
    public String toString() {
        return "Dog: "+dogName;
    }
}
