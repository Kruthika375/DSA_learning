public class Array {
    public static int LargestEleArray(int[] arr){
        int largest= arr[0];
        for (int i=1;i<arr.length-1;i++){
            if(arr[i]> largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void secondEle(int[] arr){
        if(arr.length<2){
            System.out.println("-1");;
        }
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                second_smallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }         //{1,2,4,7,7,5};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]<largest){
                second_largest=arr[i];
            }
        }
        System.out.println("Second smallest element in the array: "+second_smallest);
        System.out.println("Second largest element in the array: "+second_largest);

    }

    public static boolean sortedOrNot(int[] arr){
        int left=0;
        if(arr.length<2){
            return true;
        }
        while(left<arr.length-1){       //{1,2,3,4,5}
            if(arr[left]<=arr[left+1]){
                left++;
            }else {
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return arr;
    }

    public static int[] leftRotate(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int temp= arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    public static int[] leftRotateByKplaces(int[] arr,int k){
        int n=arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=arr[]
        }
        for(int i=k;i<n;i++){
            arr[i]=temp[i-k];
        }
        return arr;
    }


}
