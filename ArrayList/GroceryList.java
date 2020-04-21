import java.util.ArrayList;

public class GroceryList {
    /* 
        Remember in a typical array, you must specify the return type.
        Ex:
        int[] array = new int[];

        However, with an array list you must do something similar. 
        An array list can hold objects and you must tell it what type of data is going into the array list.
        The <> symbols are used for you to state what type of data will be held in the array list.
        The () signifies that the array list is actually a class and when you initialize an array list, you're calling its constructor as well

    */
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        // To add items, you call a method to add items to the array list class
        // The same goes for removing
        groceryList.add(item);
    }

    // You can also write methods that return array lists
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        // size is a method that returns the length of the array
        System.out.println("You have " + groceryList.size() + " items in your grocery list!");
        for(int i = 0; i < groceryList.size(); i++){
            // Use the get method to retrieve information from an array list
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        // You can also modify a certain element by replacing it with a new element via the set method
        // The new element replaces the old one at the same position as the old one
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        // The contains keyword is a boolean method that returns true or false depending on whether or not the item is in the array list
        // boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }
}