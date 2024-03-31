package Shelves; // its inside this folder
import Inventory.Product;
import Shelves.shelfList;
// this is a reference to the ShelfList

public class shelfList implements shelfListInterface{

   protected int size;
   protected ProductNode head;
   protected ProductNode tail;

    class ProductNode { // product will have 3 parameters, product (ProductName), amount of the product, and the next link
        Object product;
        int amount;
        ProductNode next;

        // constructor

        ProductNode(Object p,int a){ // default template for a element in a linkedList
            product = p;
            amount = a;
            next = null; 

        }

    }

    //METHODS FOR THE SHELFS

    public Object getProduct(int i){ // search for the product 
        
        if(i >= 0 && i < size){ // evaluate if i is in list
            ProductNode current = head;
            int n = 0;
            
            // loop through the linkedList to find the index related to the next link
            while (n < i){
                current = current.next;
                n++;
            }
            return current.product;     
        }
         else {
            // throw new ListIndexOutOfBoundsException("Index " + index + " out of bounds in get()"); // error
        }

        return null; // temp return TODO fix later

    }

    public String stringReport(){ // prints the report fo the linkedList

        String r = "Report:\n";
        ProductNode current = head;
        while (current != null) {
            r = r + ((Product)current.product).getName() + "\t" + current.amount + " Units";
            if (current.next != null)
                r = r + "\n";
            current = current.next;
        }
        return r;

    }

    public int size() { // return size fo shelf
        return size;
    }

    public boolean isEmpty() { //checks if the shelf is empty
        if (size == 0)
            return true;
        else
            return false;
    }

    public void addProduct(int i, Object product, int amount){ // adds a product to the shelf
        if (i >= 0 && i >= size){

            
            if (i == 0){ // if index is in the beginning
                ProductNode newNode = new ProductNode(product, amount); // initialize the new product()
                newNode.next = head; //adds the next value of the new node as the head (top of the list)
                head = newNode; // TODO understand this...

                if (tail == null){
                    tail = newNode;
                }
            }
            else if (i == size) { // if index is in the end
                ProductNode newNode = new ProductNode(product, amount); // initialize the new product()
                newNode.next = head; //adds the next value of the new node as the head (top of the list)
                newNode = head; // TODO understand this...

            }

            else { // if it is in the middle of the list

                int n = 0;
                ProductNode current = head;
                while (n < i - 1){
                    current = current.next;
                    i++;
                }
                
                ProductNode newNode = new ProductNode(product, amount);
                newNode.next = current.next;
                current.next = newNode; // TODO understand this...
                
            }
            size++;
        }
        
    }

    public void removeProduct(int i, Object product, int amount){ // removes a product from the shelf
        if (i >= 0 && i >= size){

            if (i == 0){ // if index is in the beginning
               head = head.next;
               if (head== null){
                tail = null;
               }
        
            }
            else if (i == size - 1) {
                // Removing the last element of the list
                ProductNode current = head;
                for(int n = 0; n < size - 1; n++) {
                    current = current.next;
                }
               
                tail.amount -= amount;

                if (amount <= 0){ // condition to make sure if the amount is less or equal to 0 it will delete the item
                    tail = current;
                    tail.next = null;

                } 
                
            }
            else {
                // Removing an element from the middle of the list
                ProductNode prev = head;
                for(int n = 1; n < i; n++) {
                    prev = prev.next;
                }
                prev.next = prev.next.next;
            }
            size--;
        }
        else {
            // throw new ListIndexOutOfBoundsException("Index " + index + " out of bounds in remove()");
        }
    }

    public int findProduct(Object product){ //finds the product 
        ProductNode current = head;
        int i = -1;

        while(current != null){
            i++;
            if(current.product.equals(product)){
                return i;
            }
            else{
                current = current.next;

            }
        }
        return -1;

    }

    public void removeAll() {// cleans the shelf from products
        size = 0;
        head = null;
        tail = null;
    }

    // constructor LinkedList Shelves 

    public shelfList(){
        size = 0;
        head = null;
        tail = null;
    }


}




