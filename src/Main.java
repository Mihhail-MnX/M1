public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat(); // создали кота из класса Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        System.out.println(bigCat);
        System.out.println(smallCat);
        System.out.println(bigCat);

    }
}