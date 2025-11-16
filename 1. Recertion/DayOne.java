
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

    public static void main(String[]args){
       int x= q4(5);
        System.out.println(x);
    }
    
}