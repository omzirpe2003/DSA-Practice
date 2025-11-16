
public class DayOne{

    public static void q1(int  n){
        if(n<1)
            return ;

        q1(n-1);
        System.out.println(n);
    }
    public static void q2(int n){
        if(n<1)
            return ;
        System.out.println(n);
        q2(n-1);
    }
    public static int q3(int n){
        if(n<1)
            return 0;
        return n+ q3(n-1);
    }
    public static int q4(int n){
        if(n<=1)
            return 1;
        return n* q4(n-1);
        
    }
    public static void q5(int arr[], int n){
        if(n>=arr.length/2)
            return ;
        
        int temp =arr[n];
        arr[n]=arr[arr.length-n-1];
        arr[arr.length-n-1]=temp;
        q5(arr,n+1);
    }

    public static void main(String[]args){
       int []arr=new int[]{1,2,3,4};
        q5(arr,0);
        for(int x : arr){
            System.out.println(x);
        }
    }
    
}