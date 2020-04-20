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
    System.out.print("Enter item number: ");
    int itemNum = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(itemNum-1, newItem);
}

public static void removeItem(){
    System.out.print("Enter item number: ");
    int itemNum = scanner.nextInt();
    scanner.nextLine();
    groceryList.removeGroceryItem(itemNum - 1);
}

public static void searchForItem(){
    System.out.print("Item to search for: ");
    String searchItem = scanner.nextLine();
    if(groceryList.findItem(searchItem) != null){
        System.out.println("Found " + searchItem + " in your grocery list");
    } else {
        System.out.println(searchItem + " is not in your shopping list");
    }
}

}