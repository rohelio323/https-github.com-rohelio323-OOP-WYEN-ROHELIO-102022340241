public class Cat extends Animal {
    private String breed;

    public Cat (String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println(name + "is Meowing");
    }

    public void displayDetails(){
        System.out.println("This is " + name + "!");
        makeSound();
        System.out.println(name + " is eating.");
        eat("fish");
        System.out.println();
        displayBasicInfo();
        System.out.println("Breed: " + breed);
    }

}
