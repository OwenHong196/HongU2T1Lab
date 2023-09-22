public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("bob", 4, 50);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Sam", 40, 12);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
