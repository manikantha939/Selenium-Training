package in.at.testData;

public class POJOExample {
    public static void main(String[] args) {
        Person person=new Person("Tom","Jerry",30);
        System.out.println("First name: "+person.getFirstName());
        System.out.println("Last name: "+person.getLastName());
        System.out.println("Age: "+person.getAge());
        person.setAge(40);
        System.out.println("Modified Age: "+person.getAge());
    }
}
