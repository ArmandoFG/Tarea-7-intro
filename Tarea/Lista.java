
package main;

import main.Nodo;


public class List {
    public Nodo head;
    
    public List(){
    }
    
    
    public void insert(float x){
      Nodo newnodo = new Nodo(x);
      newnodo.next = null;
      
      if (head == null){
          head = newnode;
      }else{
          Nodo last = head;
          while(last.next != null){
              last =  last.next;
          }
          last.next = newnodo;          
      }       
    }
    
    public void printList() { 
        Nodo currNodo = head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNodo != null) { 
            // Print the data at current node 
            System.out.print(currNodo.data + " "); 
   
            // Go to next node 
            currNodo = currNodo.next; 
        }
        System.out.println("");
    } 
    
    public static float getSum(List lista){
        Nodo current = lista.head;
        
        float result = 0;
        
        while(current != null){
            result += current.data;
            
            current = current.next;
        }
        
        
        return result;
    }
    
    
    
}