package Inventory;
public interface InterfaceInventory {

    public Object add(int location, Object productName, int amount);
    
<<<<<<< Updated upstream



=======
    boolean isEmpty();
        
    int size ();
            
    void clear ();
        
    void add (int aisleNumber, String productName, int amount);
        
    Object remove (int aisleNumber, String productName, int amount);
        
    Object find (Object productName);
        
    // String[] getReport();
>>>>>>> Stashed changes

}
