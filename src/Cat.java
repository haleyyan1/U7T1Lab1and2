public class Cat {
    private String catName;
    public Cat(String n) {
        catName=n;
    }
    public String getCatName(){
        return catName;
    }
    public void setCatName(String s){
        catName=s;
    }
    public String toString() {
        return "Cat: "+catName;
    }
}
