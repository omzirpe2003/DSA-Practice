public class DayThree {
    
    public int[] selectionSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i;j<size;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    
    public static void main(String[]args){
        int arr[]={4,7,9,4,5,1};
        DayThree obj=new DayThree();
        arr=obj.selectionSort(arr, arr.length);
        for(int x: arr){
            System.out.println(x);
        }
    }
}
