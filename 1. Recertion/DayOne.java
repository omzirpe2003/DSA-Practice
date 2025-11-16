
public class DayOne{

    public static void q1(int  n){
        if(n<1)
            return ;

        q1(n-1);
        System.out.println(n);
    }


    public static void main(String[]args){
        q1(5);

    }
    
}