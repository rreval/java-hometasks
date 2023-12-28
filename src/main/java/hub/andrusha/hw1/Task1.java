package hub.andrusha.hw1;

public class Task1 {

    private static class Foo {
        public String bar;
    }
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        foo1.bar = "Hello, Penis!";

        System.out.println(foo1.bar);
    }
}