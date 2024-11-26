public class PersonPrivate {
    //Private fields
    
    private String name;
    private int age;
    private double height;
    private double weight;


    //Constructor
    public PersonPrivate(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void displayDetails() {
        double bmi = height / (weight + age);
        System.out.println(name + "bmis is: " + bmi);
        /*System.out.println("Name: " + name);
        System.out.println("Age: " + age);*/
        
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("Tan", 30, 175.65, 95.4);
        person.displayDetails();
    }
}
