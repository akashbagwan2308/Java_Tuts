// Bubble sort
// selection sort
// insertion sort

public class Sorting {
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int arr[]){
        // Bubble Sort
        // time complexity = O(n^2)
        for(int i =0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if ( arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        printArray(arr);
    }

    public static void SelectionSort(int arr[]){
        // SEletion Sort
        //time complexity = O(n^2)
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j =i+1;j< arr.length;j++){
                if(arr[smallest]> arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }printArray(arr);
    }
    public static void InsertionSort(int arr[]){
        //  insertion sort
        // time complexity = O()
        for(int i=1;i< arr.length;i++){
            int current = arr[i];
            int j= i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }arr[j+1]= current;
        }
        printArray(arr);
    }

    public static void main(String[]args){

        int arr[] = {7,8,3,1,2};

        System.out.print("Bubble Sort : ");
        BubbleSort(arr);
        System.out.print("\nSelection Sort : ");
        SelectionSort(arr);
        System.out.print("\nInsertion Sort : ");
        InsertionSort(arr);
}
}
