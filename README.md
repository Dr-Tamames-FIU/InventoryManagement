# Group 7: Inventory Management Project

Team Members: **Daniel Escobar, Bielky Ruiz, Luisana Barajas**

Project Outline: 

We will be implementing two Data Structures: Hashtable and LinkedList to create an Inventory Management Project.

The Hashtable will store the aisles of the supermarket while the LinkedList store the scanning number of different products within each aisle. If the user inputs a specific scanning number, they will retrieve data of name and quantity in stock of that specific product. 

Project Example: 

<div>
    <a href="https://www.loom.com/share/e1095804ec4848beae61356e1c32129a">
      <p>Cleaning and Computer Demands - Watch Video</p>
    </a>
    <a href="https://www.loom.com/share/e1095804ec4848beae61356e1c32129a">
      <img style="max-width:300px;" src="https://cdn.loom.com/sessions/thumbnails/e1095804ec4848beae61356e1c32129a-with-play.gif">
    </a>
  </div>


Phases of the project:

1. Project initiation: We met on Discord to talk about the ideas we had. We ended up choosing a project that meets the requirement and can be optimized for the future. On this meeting we created our branches and talked about how to push the code into each branch.  
2. Project planning: We agreed to all work on the pseudocode and maintain everyone updated through our Whatsapp groupchat. We all agreed to work on the pseudocode and set the next meeting. 
4. Project execution: We met to review the pseudocode and distribute the work. First, we worked on the LinkedList and then we worked on the Hashtable. Last, we decide to work on testing and debugging any errors.
5. Project monitoring: We had last meetings to overview the code we had. We had a few issues with pushing our code into main, but had meetings and merged the code together and pushed into main.

Project Overview:  
1. ProductNode:
    - Purpose: will store attributes of a product in the inventory
    - Attributes: amount, id and name
    - Methods: constructors, to get and set attributes
2. MyInventory:
    - Purpose: hashtable that manages the aisles and products within the market inventory. It calls some methods from the LinkedList.
    - Attributes: aisles and linkedlist (products)
    - Methods: add product, remove product, find product by id, get report, provide size, clear aisles and check if inventory is empty
3. shelfList:
    - Purpose: LinkedList with collection of products from an aisle
    - Attributes: head, tail and size
    - Methods: add a product, string report, size, check if it is empty, removes a product, find product by name, and remove all
  
Both MyInventory and shelfList have its own Interface and Testing file to make sure that all of the methods were working correctly. 


For optimization:
- Can we speed up product lookup? 
- Identification of products low in stock
- User interface of web
- Delete the products once the amount is 0 

Sketched notes from first meeting: 
[data Structures Project 2 (1).pdf](https://github.com/Dr-Tamames-FIU/cop-3530-group-project-team-7/files/14775995/data.Structures.Project.2.1.pdf)


