import java.util.*;

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
//        int left=0;
//        if(arr.length<2){
//            return true;
//        }
//        while(left<arr.length-1){       //{1,2,3,4,5}
//            if(arr[left]<=arr[left+1]){
//                left++;
//            }else {
//                return false;
//            }
//        }.l
//        return true;
        boolean flag= true;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                flag=false;
            }
        }
        return flag;
    }

    public static int[] removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        int[] res=new int[i+1];
        for (int k=0;k<i+1;k++){
            res[k]=arr[k];
        }
        return res;
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

    public static int[] leftRotateByKplaces(int[] arr, int k){
        int n= arr.length;
        if(n==0){
            return new int[0];
        }
        k=k%n;
        int[] temp= new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        return arr;
    }

    public static int[] rightRotateByDplaces(int[] arr, int d){
        int n=arr.length;
        d=d%n;
        if (n == 0) {
            return new int[0];
        }
        int[] temp= new int[d];
        for(int i=n-d;i<n;i++){
            temp[i-(n-d)]=arr[i];
        }

        for(int i=n-d-1;i>=0;i--){
            arr[i+d]= arr[i];
        }


        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
        return arr;
    }

    public static int[] moveZeroesToEnd(int[] arr) {
//        int j=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                j=i;
//                break;
//            }
//        }
//        if(j==-1){
//            return arr;
//        }
//
//        for(int i=j+1;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                j++;
//            }
//        }
//        return arr;
        // easy way
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int i=0;
        int j=0;
        ArrayList<Integer> union= new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                    i++;
                }
            }else{
                if(union.isEmpty() || union.get(union.size()-1)!=b[j])
                    union.add(b[j]);
                j++;
            }
        }
        while(j<b.length){
            if(union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            if(union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
                i++;
            }
        }
        return union;
    }

    public static ArrayList<Integer> findIntersection(int[] a, int[] b){
//        ArrayList<Integer> intersection= new ArrayList<>();
//        int[] vis= new int[b.length];
//        for(int i=0;i<a.length;i++){
//            for (int j=0;j<b.length;j++){
//                if(a[i] == b[j] && vis[j]==0){
//                        intersection.add(a[i]);
//                        vis[j]=b[j];
//                        break;
//                }
//                if(b[j]>a[j]) break;
//            }
//        }
//        return intersection;
        //optimal soln

        ArrayList<Integer> intersection= new ArrayList<>();
        int i=0; int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                intersection.add(a[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static int findMissing(int[] arr){
        //brute force
//        for (int i=arr[0];i<arr.length;i++){
//            int flag=0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]==i){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                return i;
//            }
//        }
//        return 0;
        // Hashing method
//        int[] hash = new int[arr.length+2];
//        for (int i=0;i<arr.length;i++){
//            hash[arr[i]]++;
//        }
//        for(int i=1;i<=arr.length+1;i++){
//            if(hash[i]==0){
//                return i;
//            }
//        }
//        return -1;

        //optimal -- summation
        int n= arr.length;
        int sum = (n*(n+1))/2;
        int add =0;
        for(int i=0;i<arr.length;i++){
            add+=arr[i];
        }
        return sum-add;
    }

    public static int countOnes(int[] arr){
        int count=0; int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count=0;
            }else {
                count++;
            }
            res=Math.max(res,count);
        }
        return res;
    }

    public static int numberTwice(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }

    public static int longestLenSubArray(int[] arr, int k){
        //Brute Force approach
//        int len=0;
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int sum=arr[i];
//            for(int j=i+1;j<n;j++){
//                sum+=arr[j];
//                if(sum==k){
//                    len=Math.max(len, j-i+1);
//                }
//            }
//        }
//        return len;

        //optimal approach
        int prefixSum=0; int len=0;
        int n= arr.length;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i <n;i++){
            prefixSum+=arr[i];
            if(prefixSum==k){
                len=i+1;
            }else if(map.containsKey(prefixSum-k)){
                len=Math.max(len,i- map.get(prefixSum-k));
            }
            if(!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }
        return len;
    }

    public static int[] insertingEle(int[] arr, int pos, int ele){
        for(int i=arr.length-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]= ele;
        return arr;
    }

    public static int[] deletingEle(int[] arr, int pos, int ele){
        for(int i=pos;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        return arr;
    }

    public static int[] twoSum(int[] arr, int target) {
        //Brute force approach - O(n2), O(1)
//        int[] res= new int[2];
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+ arr[j] == target){
//                    res[0]= i;
//                    res[1]=j;
//                }
//            }
//        }
//        return res;

        // Hashing approach
        Map<Integer, Integer> map= new HashMap<>();
        int[] res= new int[2];
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                res[0]=i;
                res[1]= map.get(comp);
            }else{
                map.put(arr[i], i);
            }
        }
        return res;
        // 2 Pointers approach
//        Arrays.sort(arr);
//        int left=0;
//        int right=arr.length-1;
//        int[] res= new int[2];
//        while(left<right){
//            int sum= arr[left]+arr[right];
//            if(sum==target) {
//                res[0] = left;
//                res[1] = right;
//                return res;
//            }else if(sum<target)
//                left++;
//            else
//                right--;
//        }
//        return new int[] {-1,-1};
    }
    public static int[] sortArray(int[] arr){
//        int cnt_0=0;
//        int cnt_1=0;
//        int cnt_2=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0)
//                cnt_0++;
//            else if(arr[i]==1)
//                cnt_1++;
//            else
//                cnt_2++;
//        }
//
//        for(int i=0;i<cnt_0;i++){
//            arr[i]=0;
//        }
//        for(int i=cnt_0;i<cnt_0+cnt_1;i++){
//            arr[i]=1;
//        }
//        for(int i=cnt_0+cnt_1;i<arr.length;i++){
//            arr[i]=2;
//        }
//        return arr;

        //Dutch National Flag Algorithm  -> TC: O(n), SC: O(1)
        int low=0; int mid=0; int high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        return arr;
    }

    public static int majorityEle(int[] arr){
        //Brute Force approach
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count> arr.length/2){
//                return arr[i];
//            }
//        }
//        return -1;

        // Better approach
//        Map<Integer,Integer> map= new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//
//        for(Map.Entry<Integer, Integer> e:map.entrySet()){
//            if(e.getValue()> arr.length/2){
//                return e.getKey();
//            }
//        }
//        return -1;

        // Moore's Voting Algorithm
        int count=0;
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            if(count==0){
                ele=arr[i];
            }
            if(arr[i]==ele)
                count++;
            else count--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele) count++;
        }
        if(count>arr.length/2){
            return ele;
        }else
            return -1;
    }

    public static int maxSubArray(int[] arr){
//        int max= Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum+=arr[j];
//                max=Math.max(sum, max);
//            }
//        }
//        return max;

        //Kadane's algorithm
//        int max = Integer.MIN_VALUE;
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            max=Math.max(sum, max);
//            if(sum<0){
//                sum=0;
//            }
//        }
//        return max;

        //Followup quest: starting and ending index
        int max = Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int startIndex=-1; int endIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];

            if(sum>max){
                max=sum;

                startIndex=start;
                endIndex=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Starting Index: "+startIndex+ " Ending Index: "+endIndex);
        return max;
    }

    public static int stockBuySell(int[] nums){
        //BruteForce
//        int maxPro=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]>nums[i]){
//                    maxPro= Math.max(maxPro, nums[j]-nums[i]);
//                }
//            }
//        }
//        return maxPro;
        //Optimal approach
        int minPrice=nums[0]; int maxPro=0;
        for(int i=1;i<nums.length;i++){
            minPrice=Math.min(minPrice, nums[i]);
            maxPro= Math.max(maxPro, nums[i]-minPrice);
        }
        return maxPro;
    }

    public static String maxIPAddr(String[] arr){
        Map<String, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<String, Integer> ele:map.entrySet()){
            if( ele.getValue()>1){
                return ele.getKey();
            }
        }
        return " ";
    }

    public static int lengthCycle(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int slow = arr[0];
        int fast= arr[slow];

        int count=0;


        while (fast!=slow){
            if(fast<0 ||  fast>=arr.length || arr[fast]>=arr.length  || arr[fast]<0)
                return 0;
            slow = arr[slow];
            fast=arr[arr[fast]];
            count++;

            if(fast<0 || fast>=arr.length || arr[fast]>=arr.length  || arr[fast]<0)
                return 0;
        }
        return count;
    }

    public static void dotProduct(int[] a, int[] b){
        int dp=0;
        try {
            if(a.length!=b.length){
                System.out.println("should be of same length!");
            }else if(a.length==0 || b.length==0){
                System.out.println("array size can’t be zero");
            }else{
                for(int i=0;i<a.length;i++){
                    dp+=a[i]*b[i];
                }
                System.out.println(dp);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Set<Set<String>> anagramSet(ArrayList<String> arr){
        Set<Set<String>> set = new HashSet<>();

        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            Set<String> tempSet= new HashSet<>();
            if(arr.get(i)==arr.get(i+1)){
                tempSet.add(arr.get(i));
            }else {
                char[] c1= arr.get(i).toCharArray();
                char[] c2 = arr.get(i+1).toCharArray();
                if(c1.length == c2.length){
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    if(Arrays.equals(c1,c2)){
                        tempSet.add(arr.get(i));
                        tempSet.add(arr.get(i+1));
                    }
                }
            }
            if(!tempSet.isEmpty()){
                set.add(tempSet);
            }
        }
        return set;
    }

    public static boolean isPowerOfTen(int num){
        if(num<=0){
            return false;
        }
        while (num%10==0){
            num/=10;
        }
        return num==1;
    }

    public static int[] reArrangePosNeg(int[] arr){
//        ArrayList<Integer> pos= new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                pos.add(arr[i]);
//            }else{
//                neg.add(arr[i]);
//            }
//        }
//
//        for(int i=0;i<arr.length/2;i++){
//            arr[2*i]=pos.get(i);
//            arr[2*i+1]=neg.get(i);
//        }
//        return arr;

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length,0));
        int posIndex=0; int negIndex=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans.set(posIndex, arr[i]);
                posIndex+=2;
            }else{
                ans.set(negIndex, arr[i]);
                negIndex+=2;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void eventTime(List<String> list) {
        Map<Integer, Integer> startEvent = new HashMap<>();
        Map<Integer, Integer> endEvent = new HashMap<>();
//List.of("1.start.0", "2.start.3", "2.end.5", "3.start.7", "3.end.10", "1.end.15");

        for (String str : list) {
            String[] parts = str.split("\\.");
            int function = Integer.parseInt(parts[0]);
            String event = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (event.equals("start")) {
                startEvent.put(function, time);
            } else if (event.equals("end")) {
                int duration= time-startEvent.get(function);
                endEvent.put(function, duration);
            }
        }

        for (Map.Entry<Integer, Integer> entry : endEvent.entrySet()) {
            System.out.println(entry.getKey() + " took time " + entry.getValue());
        }
    }

    public static int[] selectionSort(int[] arr){
        int n= arr.length;
        for(int i=0; i<=n-2;i++){
            int mini=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j] < arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=n-1;i<=1;i--){
            int didSwap=0;
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                    didSwap++;
                }
            }
            if(didSwap==0)
                break;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        return arr;
    }

    public static void mergeSort(int[] arr, int low,int high){
        if(low>=high) return ;
        int mid= low+(high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp= new ArrayList<>();
        int i= low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=high){
            temp.add((arr[j]));
            j++;
        }

        for(int k=low;k<=high;k++){
            arr[k]=temp.get(k-low);
        }
    }

    //Quick Sort
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pIndex= partition(arr,low,high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot= arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while (arr[i]<=pivot && i<high){
                i++;
            }
            while (arr[j]> pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        int temp= arr[j];
        arr[j]=pivot;
        pivot= temp;
        return j;
    }
}
