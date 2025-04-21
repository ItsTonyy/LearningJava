package Types;

public class Strings {
  public static void main(String[] args) {
    // string literal
    String myString2 = "Hello world again";

    // concatenating strings
    String one = "foo";
    String two = "bar";

    String FooBar = one + two;
    System.out.println(FooBar); //foobar

    // and of course arrays
    String[] ArrayOfStrings = new String[]{"one", "two", "three"};

    // strings have length
    System.out.println(myString2.length()); // 17
  }
}
