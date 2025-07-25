//2. Can we override private method, constructor, static method, 
//final method? Illustrate with an example.

 class OverLoad {

    OverLoad(){
      System.out.println("Constructor");
    }
    
    private  void privateMethod(){
        System.out.println("Private Method");
    }

    final  void finalMethod(){
        System.out.println("Private Method");
    }
     static void staticMethod(){
        System.out.println("Private Method");
    }
}

class Child extends Question2{

    OverLoad()
    {
        System.out.println("Helo from Child"); 
        /* error: invalid method declaration; return type required */
    }
    
  
    

    private void privateMethod(){  

         /*privateMethod() has private access in Child child.privateMethod() */

     System.out.println("Override  Private Method");
    }  

    final  void finalMethod(){  
        
        /*finalMethod() in Child cannot override finalMethod() in Over final  void finalMethod() */

        System.out.println("final Method Override");
  }

     static void staticMethod(){

        System.out.println("static  Method Override");   // not override it hide

    } 

}

class AccessOver{
   public static void main(String []args){
     Child child =new Child();
     child.finalMethod();
     child.privateMethod();
     child.staticMethod();
     child.Over();
   }
     

}
