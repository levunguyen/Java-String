package _04_strings;

public class MyClass {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));

        String firstName = "Hoang";
        String lastName = "Nguyen";
        System.out.println(firstName.concat(lastName));

        System.out.println("le vu \"nguyen");
        System.out.println("hello \nworld");
        System.out.println("hello \tworld");
        System.out.println("hello \bworld");

//        int x = 10;
//        int y = 20;
//        int z = x + y;;
//        System.out.println(z);

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);
    }
}
