
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
    public static boolean q6(String str){
        int size=str.length();
        String rev="";
        for(int i=size;i>=1;i--){
            rev=rev+str.charAt(i-1);
        }
        return str.equals(rev)?true:false;
    }

   public int mode(int x){
    return x/10;
   }

    int s=0;
    String rev="";
    public boolean q7(String str){
        if(str.equals(rev))
            return true;

        return true;
    }

     public boolean q8(String str){
        if(s >=str.length()/2) return true;

        if(str.charAt(s)!=str.charAt(str.length()-s-1)) return false;
        s++;

        return q8(str);
    }
    int start=0;
    public boolean palindromeCheck(String s) {
        if(start>=s.length()/2) return true;
        if(s.charAt(start)!=s.charAt(s.length()-start-1)) return false;
        start+=1;
        return palindromeCheck(s);

    }

    public static void main(String[]args){
       DayOne obj=new DayOne();

       int x=obj.mode(2);
        System.out.println(x);
    }
    
}