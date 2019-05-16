package java8;

public class ClassLoading {

    static {
        System.out.println("I am inside parent's static block and i cannot initialize non static param");
    }

    {
        name = "Geeta";
        System.out.println(String.format("I am parent's default block and i can initialize non static param= %s", getName()));
    }

    private String name;

    ClassLoading() {
        System.out.println(String.format("I am inside parent's default constructor, name = %s", getName()));
    }

    ClassLoading(String name) {
        System.out.println(String.format("I am inside parent's parameterised constructor, name = %s", getName()));
        this.name = name;
        System.out.println(String.format("I am inside parent's parameterised constructor, name = %s", getName()));
    }

    public String getName() {
        return name;
    }
}

class ChildClass extends ClassLoading{
    static {
        System.out.println("I am inside child's static block and i cannot initialize non static param");
    }

    {
        lastName = "Kumari";
        System.out.println(String.format("I am child's default block and i can initialize non static param= %s", getName()));
    }

    private String lastName;

    ChildClass() {
        System.out.println(String.format("I am inside child's default constructor, name = %s", getName()));
    }

    ChildClass (String name) {
        super(name);
        System.out.println(String.format("I am inside child's parameterised constructor, name = %s", getName()));
        this.lastName = name;
        System.out.println(String.format("I am inside child's parameterised constructor, name = %s", getName()));
    }

    @Override
    public String getName() {
        return lastName;
    }

    public static void main(String[] args) {
        ClassLoading c = new ChildClass();
        ClassLoading c1 = new ChildClass("puchu");
    }
}
