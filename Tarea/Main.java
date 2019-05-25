
package main;

public class Main {

   
    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        
        List lista = new List();
        
        float x = 0;
        while ((x < 50) && (x < 100) ){
            float t_n = e_n(x);
            
            lista.insert(t_n);
            
            ++x;
        } 
        
        
        
        float y = List.getSum(lista);
        
        System.out.println(y);
        
        

        
        
        
        
    }
   
    
    
    public static float e_n(float n){
        
        float y = 1;
        // Factorial de n
        while(n>1){
            y *= n;
            --n;
        }
        
        
        
        
        return 1/y;
    }
    
    
}
