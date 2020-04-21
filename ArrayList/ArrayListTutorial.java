import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTutorial {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

 public static void main(String[] args){
    // A List is another form of array. It is an ordered collection of elements and usually allow duplicate elements
    // An array list specifically, is a resizable array. The more elements you add, the capacity grows in the array list
    // In this tutorial, the array list will be used for a grocery list program

    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit){
        System.out.println("Enter your choice:");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2: 
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchForItem();
                break;
            case 6:
                processArrayList();
            case 7:
                quit = true;
                break;    
        }

    }
 }

 public static void printInstructions(){
     System.out.println("\nPress");
     System.out.println("\t 0 - To print the choice options.");
     System.out.println("\t 1 - To print the list of grocery items.");
     System.out.println("\t 2 - To add an item to the list.");
     System.out.println("\t 3 - To modify an item to the list.");
     System.out.println("\t 4 - To remove an item from the list.");
     System.out.println("\t 5 - To search for an item in the list.");
     System.out.println("\t 6 - To quit the application.");

 }

 public static void addItem(){
     System.out.print("Please enter the grocery item: ");
     groceryList.addGroceryItem(scanner.nextLine());
 }

 public static void modifyItem(){
    System.out.print("Current item name: ");
    String itemNum = scanner.nextLine();
    System.out.println("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(itemNum, newItem);
}

public static void removeItem(){
    System.out.print("Enter item: ");
    String itemNum = scanner.nextLine();
    groceryList.removeGroceryItem(itemNum);
    System.out.println("You have now removed " + itemNum + " from your grocery list");
}

public static void searchForItem(){
    System.out.print("Item to search for: ");
    String searchItem = scanner.nextLine();
    if(groceryList.onFile(searchItem)){
        System.out.println("Found " + searchItem + " in your grocery list");
    } else {
        System.out.println(searchItem + " is not in your shopping list");
    }
}

    public static void processArrayList(){
        // You can also copy one array list to another array list
        ArrayList<String> newArray = new ArrayList<String>();
        // The 'addAll' method essentially moves the contents into a brand new array list
        newArray.addAll(groceryList.getGroceryList());

        // A cool shortcut to note, you can also add whatever contents you want into the paranthesis. 
        // This calls on the ArrayList constructor and your content is copied
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // If you ever want to convert the array list into a new array, the code to do that is below
        // Initialize a new array with the size of the array list
        String[] myArray = new String[groceryList.getGroceryList().size()];
        // Reassign that newly created array with the converted array list
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}