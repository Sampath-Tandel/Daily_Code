import java.util.ArrayList;

public class ArrList1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Basic Methods

        // Adds "Apple" and "Banana" to the list
        list.add("Apple");
        list.add("Banana");

        // Inserts "Cherry" at index 1.
        list.add(1, "Cherry");

        // Clears the list.
        list.clear();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Checks if the list contains "Apple".
        boolean containsApple = list.contains("Apple");

        // Gets the element at index 1.
        String fruit = list.get(1);

        // Finds the index of "Banana".
        int indexBanana = list.indexOf("Banana");

        // Checks if the list is empty.
        boolean isEmpty = list.isEmpty();

        // Finds the last index of "Apple".
        list.add("Apple");
        int lastIndexApple = list.lastIndexOf("Apple");

        // Removes the element at index 1.
        list.remove(1);

        // Removes "Apple" from the list.
        list.remove("Apple");

        // update "Orange" at index 0.
        list.set(0, "Orange");

        // Gets the size of the list.
        int size = list.size();

        // Converts the list to an array.
        Object[] array = list.toArray();

        // Converts the list to a typed array.
        String[] stringArray = list.toArray(new String[0]);

    }
}
