/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicevariables;

/**
 *
 * @author RSIBS
 */
public class PracticeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        B b = new B();
        b.mul();// 20000
         A a = new A();
        a.add(); // 30, 300 ,110, 3000
        System.out.println(A.p);//25
    }
    
}


class A{
    
    int x = 100;
    int y=200;
    
    
    static int p =1000;
    static int q=2000;
    
    
    void add(){
        int x =10;
        int y =20;
        
        int p =50;
        int q=60;
        
        System.out.println(x+y);//30
        
        System.out.println(this.x + this.y);//300
        
        System.out.println(p+q);//110
        
        System.out.println(A.p+A.q);//3000
        
        System.out.println(A.p);
    }
    
}
    
    class B{
        
        void mul(){
           A a = new A();
            System.out.println(A.p*A.q);//2000000
           A.p =25;
            System.out.println(a.x* a.y);//20000
            System.out.println(A.p*A.q);//50000
           
        }
        
    }
    
    

