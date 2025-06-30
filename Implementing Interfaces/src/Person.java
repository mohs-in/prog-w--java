abstract class Person {
    protected String name;
    protected int age;

    void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}