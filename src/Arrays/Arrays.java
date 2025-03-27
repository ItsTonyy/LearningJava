package Arrays;

public class Arrays {
    public static void main(String[] args) {
        // instantiating an array
        int[] arrayOfNumbers = new int[10];
        String[] arrayOfStrings = new String[10];

        // array literals
        // obs: in newer versions you can omit the new int[] before the array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"a", "b", "c", "d", "e", "f"};

        // you can print a specified number in an array this way
        System.out.println("number in index 5: " + numbers[5]); // 6

        // you can print every number in an array doing this
        // read as: for each element in the iterable. The element must be the same type of the iterable
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        // numbers length
        System.out.println("numbers length: " + numbers.length);
    }
}