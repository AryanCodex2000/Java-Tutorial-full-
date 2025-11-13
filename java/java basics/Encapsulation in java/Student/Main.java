public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Aryan");
        s1.setAge(25);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        s1.setAge(-5);
        System.out.println("Age after invalid update: " + s1.getAge());
    }
    
}
