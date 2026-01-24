package module2;

public class Methods {
    private int data = 40;
     
    public int sum(int ...a){
        int res =0;
        for(int i:a){
            res +=i;
            
        }
        return res;
    }
    public static void main(String args[]){
        Methods obj = new Methods();
        obj.data =50;
        System.out.println("Data is " + obj.data);
        System.out.println("Sum is " + obj.sum(1,2,3,4,5,6,7,8,9,10));

    }
    
}
