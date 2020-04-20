import java.util.Scanner;

public class ArrayListTutorial {

 public static void main(String[] args){
    // A List is another form of array. It is an ordered collection of elements and usually allow duplicate elements
    // An array list specifically, is a resizable array. The more elements you add, the capacity grows in the array list
    // In this tutorial, the array list will be used for a grocery list program

    GroceryList groceryList = new GroceryList();
    String[] list = {"Milk", "Cheese", "Beef", "Chicken", "Salt", "Crackers", "Orange Juice"};
    for(String item: list){
        groceryList.addGroceryItem(item);
    }

    groceryList.printGroceryList();
 }
}