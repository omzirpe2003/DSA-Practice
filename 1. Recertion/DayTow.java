import java.util.HashMap;
import java.util.Iterator;

public class DayTow {
    public void numAppere(int arr[],int size){

        boolean bollCount[]=new boolean[size];
        for(int i=0;i<size;i++){
            if(bollCount[i]==true)
                continue;
            
            int count=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    bollCount[j]=true;
                    count+=1;
                }
            }
            System.out.println(arr[i]+" Apperes "+count);
        }

    }


    public int count(int arr[],int size){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<size;i++){
            int key=arr[i];
            if(hash.containsKey(key)){
                hash.put(key,hash.get(key)+1);
            }else{
                hash.put(key,1);
            }
        }


        int ele=-1;
        int keyy=0;
        Iterator<Integer> itr=hash.keySet().iterator();
        while(itr.hasNext()){
            int key=itr.next();
            int value=hash.get(key);
            if(value>ele){
                ele=value;
                keyy=key;
            }
        }
        return keyy;
    }


    public static void main(String[] args) {
        DayTow obj=new DayTow();
        int arr[] =new int[]{1,2,2,1,1,3};
        int num= obj.count(arr, arr.length);
        System.out.println(num);
    }
    
}
