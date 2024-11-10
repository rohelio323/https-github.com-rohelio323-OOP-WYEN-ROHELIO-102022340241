public class Bird  extends Animal{
    private String featherColor;
    
    public Bird (String name, int age, String featherColor){
        super(name, age);
        this.featherColor = featherColor;
        }
    public void makeSound(){
        System.out.println(name + " is Chirping");
        }
    
    public void displayDetails(){
        System.out.println("This is " + name + "!");
        makeSound();
        System.out.println(name + " is eating.");
        eat("seeds");
        System.out.println();
        displayBasicInfo();
        System.out.println("FeatherColor: " + featherColor);
        }
    }
    

