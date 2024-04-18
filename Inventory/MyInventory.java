package Inventory;
import Inventory.Product;

//we can use the remainder as the idle position and the result of the division is the position


public class MyInventory implements InterfaceInventory { 
    
    protected int aisleNumber; // determine the number of Aisle
    protected int size; // size variable

    //Create a Hashtable to store aisles, where each aisle maps to a shelfList of Product Objects

    public boolean isEmpty() {return true;}//checks if inventory is empty

    public int size(){return -1;}// returns the size of the Inventory

    public void clear(){} // Empties MyInventory


    public Object add(int location, Object productName, int amount){
        
           //Method to add a product to a specified aisle

        return null; //If no products is found return null 

  // Returns the size of the inventory
    public int size()
    {
        return size; //returns the number of aisles in the inventory
    }

    /**
     * Adds a product to a specified aisle.
     * @param aisleNumber The aisle number where the product will be added.
     * @param productName The name of the product to be added.
     * @param amount The quantity of the product to be added.
     * @return The added product, or null if the aisle doesn't exist.
     */
    public void add (int aisleNumber, String productName, int amount)
    {
        // Calculate index based on the aisleNumber
        int index = Math.abs(aisleNumber) % table.length;

        // Check if the shelfList at the index is null
        if (table[index] == null) 
        {
            table[index] = new shelfList(); //if it's null create new shelfList
        }

        // Retrieve the shelfList at the index

        shelfList list = table[index];

        // Search for the product in the  shelfList
  
        ProductNode node = (ProductNode) list.findProduct(productName);
        if (node != null && node.name.equals(productName)) 
        {   
            list.addProduct(0, productName, amount);
            //node.amount += amount; //If the product exists, update amount
        }
}

    /**
     * Removes a specified amount of a product from a specified aisle.
     * @param aisleNumber The aisle number from where the product will be removed.
     * @param productName The name of the product to be removed.
     * @param amount The quantity of the product to be removed.
     * @return The removed product, or null if the aisle doesn't exist.
     */
    public Object remove(int aisleNumber, String productName, int amount) 
    {
         // Calculate index based on the aisleNumber
        int index = Math.abs(aisleNumber) % table.length;

        // Check if the shelfList at the index is null
        if (table[index] == null) {
            return null; // Return null if the aisle doesn't exist
        }

        // Retrieve the shelfList at the index
        shelfList list = table[index];

        // Remove the specified amount of the product from the shelfList
        list.removeProduct(productName, amount);

        // Update the size of the inventory
        size--;

        // Return the removed product
        return productName;
    }
    
    
    /**
     * Finds a product by its name within the inventory.
     * @param productName The name of the product to be found.
     * @return The found product, or null if not found.
     */
    public Object find(String productName)
    {
        // Iterate through shelfLists in the inventory
        for (int i = 0; i < size; i++) 
            {
            // Check if the shelfList at the index is not null
            if (table[i] != null) 
                {
                // Retrieve the shelfList at the index
                shelfList list = table[i];
                // Find the product in the current shelfList
                ProductNode product = (ProductNode) list.findProduct(productName);
                if (product != null && product.getName().equals(productName)) 
                    {
                        System.out.println("Product " + productName + " was found");
                        return product; // Return the found product
                    }
                       
            
                }
            }
        // If the product is not found
        System.out.println("Product " + productName + " not found");
        return null;    
     
    }


    public Object remove(int location, int amount){

        // if statement where once it reaches 0 the item should be out of the ShelfList

        return null;
    }


    public Object find(Object productName){


         //Method to find a product by its scanning number within a specified aisle 

          //Retrieve the list of products for the given aisle name 

                // if the aisle does not exist it would be null
        
                //Iterate through products in the aisle

                //Check if the current product's scanning number matches the one we're searching

                //return the product if match is found
           
            //Create a new ShelfList for a new aisle, or get the existing list, and then add the product to it 

        return null;
    }


    public String[] getReport(){

        //Print the report of all the items it should be the name location and current amount

        // Condition where if (product.amount is <= 2) write a status column of "low" else leave status "normal"

        // Columns Array[String Name, Int Location, Int Amount, String Status]

        // Print acordingly make it PRETTYYYYY!!!!!!!

        return null;
    }
       

}
