public class primenumber{
    public static void main(String[] args) {
        
        
        int num= 30;
         boolean prime=true;
         if(num%2==0||num%3==0){


            prime = false;

         }
      
      if(prime){
         // int iter=0;
         for (int i=5;i*i<num;i+=6){
            //  iter++;
             if(num%i==0||num%i+2==0){
               prime=false;
               break;
             }
            else{
                      
            }

         }
      }
      //System.out.println("Took:" +iter + "iterations...");
      if(prime){
      System.out.println("number is prime");
      }
      else{
      System.out.println("number is not prime ");
      }
   }
}