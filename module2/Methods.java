package module2;

public class Methods {
     
    public static int sum(int ...a){
        int res =0;
        for(int i:a){
            res +=i;
            
        }
        return res;
    }
    public static void main(String args[]){

        System.out.println("Sum is " + sum(1,2,3,4,5,6,7,8,9,10));

    }
    
}
