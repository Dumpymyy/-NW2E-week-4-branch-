import java.util.Scanner;

public class Act4B_Cantara {


public static void main(String[] args) {
    Sorting  sortedLinearArray = new Sorting ();
    try (Scanner in = new Scanner(System.in)) {
        String selection;
        while (true) {
        System.out.println(
        "\n1. Insert a value"
        + "\n2. Delete a value"
        + "\n3. Traverse the array"
        + "\n4. Exit");
        System.out.print("Enter your choice: ");
      
        selection = in.nextLine();
        switch (selection) {
        case "1":
        System.out.print("Enter element to inserted: ");
        sortedLinearArray.insertItem(Integer.parseInt(in.nextLine()));
        break;
        case "2":
        System.out.print("Enter the element you want to eliminate: ");
        sortedLinearArray.deleteItem(Integer.parseInt(in.nextLine()));
        break;
        case "3":
        sortedLinearArray.printArray();
        break;
        case "4":
        System.exit(0);
        }
   
        }
    } 
    }
        }
 

    
