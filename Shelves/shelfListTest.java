package Shelves;

public class shelfListTest {

    public static void main(String[] args) {
        shelfListTest test = new shelfListTest();
        test.testAddProduct();
    }

    public void testAddProduct() {  
        // Create a shelfList object
        shelfList myShelf = new shelfList();

         // Add the product to the shelf

        myShelf.addProduct(100,"Apple",20); // location, id, name, amount
        myShelf.addProduct(101,"Juice",20);
        myShelf.addProduct(102,"Bread",40); // this should add the existing value
        myShelf.addProduct(103,"Cheese",80);
        
        // You can perform further tests here, like checking if the product was added correctly

        // For example:
        System.out.println(myShelf.stringReport()); // Print the report to see if the product is added correctly
        System.out.println("---------------------------------------------------");

        myShelf.removeProduct(100, 20);
        myShelf.removeProduct(1, 10);
        myShelf.removeProduct(2, 10);
        myShelf.removeProduct(3, 10);
       
        // System.out.println(myShelf.stringReport()); // Print the report to see if the product deleted correctly
        System.out.println("---------------------------------------------------");

        myShelf.addProduct(100,"Apple",100); // location, id, name, amount
        myShelf.addProduct(101,"Juice",100);
        myShelf.addProduct(102,"Bread",100); // this should add the existing value
        myShelf.addProduct(103, "Cheese",100); // TODO: OPTIONAL: Delete the product when it reaches amount 0 


        System.out.println(myShelf.stringReport()); // Print the report to see if the list is fully deleted
        System.out.println("---------------------------------------------------");

        System.out.println(myShelf.isEmpty()); // false 

    }
}

    


    







