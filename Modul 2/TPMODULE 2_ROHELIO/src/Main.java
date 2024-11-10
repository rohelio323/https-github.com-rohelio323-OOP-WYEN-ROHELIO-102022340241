public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Animal Details\n");

        Cat cat = new Cat("Memo", 2, "Persian");
        cat.displayDetails();

        System.out.println();

        Bird bird = new Bird("Rio", 1, "Green");
        bird.displayDetails();
        
        
    }
}
