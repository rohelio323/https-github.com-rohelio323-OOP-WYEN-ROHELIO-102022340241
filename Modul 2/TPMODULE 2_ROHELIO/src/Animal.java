public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayBasicInfo(){
        System.out.println("Name: "+ name + ", Age: "+ age + "Years." );
    }
    public void eat(String food){
        System.out.println(name +" is Eating "+ food +".");
    }    
    
}
