package temp;

/**
 * @author lwx
 * @date 2019/8/11-21:07
 */
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name,int age) {
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("lwx",23);
        System.out.println();
    }
}
