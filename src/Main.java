import java.util.*;

public class Main {

    public static void main(String[] args) {
        //reverse a word
        String reverse = "geeks";
        System.out.println(Strings.reverseString(reverse));

        //palindrome
        String palin = "A man a plan, a canal: Panama";
        System.out.println(Strings.palindrome(palin));

        //Count Vowels and Consonants
        String vowConsCount = "HEllo";
        Strings.vowConsCount(vowConsCount);

        //Remove Duplicates from a String:
        String removeDuplicates = "geeksforgeeks";
        System.out.println(Strings.removeDuplicates(removeDuplicates));

        //Find the First Non-Repeating Character:
        String nonRepeatChar = "swiss";
        System.out.println(Strings.nonRepeatChar(nonRepeatChar));

        //anagram
        String s = "listen";
        String t = "silent";
        System.out.println(Strings.anagram(s, t));

        //longest common prefix
        String[] longestPrefix = {"flower", "flow", "flight"};
        System.out.println(Strings.longestPrefix(longestPrefix));

        //rotate String
        String rotateString = "abcde";
        String goal = "cdeab";
        System.out.println(Strings.rotateString(rotateString, goal));

        //sort characters by frequency
        String sortChars = "tree";
        System.out.println(Strings.sortChars(sortChars));

        //	15. Maximum Nesting Depth of the Parenthesis
        String depth = "(1+(2*3)+((8)/4))+1";
        System.out.println(Strings.nestingDepth(depth));

        //Roman to Integer
        String roman = "MCMXCIV";
        System.out.println(Strings.romanToInteger(roman));

        //implement Atoi
        String str = "0-1";
        System.out.println();

        //Arrays
        //Largest element in an array
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(Array.LargestEleArray(arr));

        //Second largest and second smallest
        int[] arr1 = {1, 2, 4, 7, 7, 5};
        Array.secondEle(arr1);

        //sorted or not
        int[] arr2 = {5, 4, 6, 7, 8};
        System.out.println(Array.sortedOrNot(arr2));

        //Remove Duplicates in-place from Sorted Array
        int[] arr3 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        System.out.println(Arrays.toString(Array.removeDuplicates(arr3)));

        //Left Rotate the Array by One
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Array.leftRotate(arr4)));

        //Rotate array by K elements - Left
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7};
        int k = 9;
        System.out.println(Arrays.toString(Array.leftRotateByKplaces(arr5, k)));

        //Rotate array by K elements - Right
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7};
        int d = 9;
        System.out.println(Arrays.toString(Array.rightRotateByDplaces(arr6, d)));

        //Move all Zeros to the end of the array
        int[] arr7 = {1, 0, 2, 3, 0, 4, 0, 1};
        System.out.println(Arrays.toString(Array.moveZeroesToEnd(arr7)));

        //Union of Two Sorted Arrays
        int[] arr_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr_2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = Array.findUnion(arr_1, arr_2);
        System.out.println(union);

        //Intersection of Two Sorted Arrays
        int[] arr$1 = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        int[] arr$2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> result = Array.findIntersection(arr$1, arr$2);
        System.out.println(result);

        //Find the missing number in an array
        int[] arr8 = {3, 0, 1};
        System.out.println(Array.findMissing(arr8));

        //Count Maximum Consecutive One's in the array
        int[] prices = {1, 1, 0, 1, 1, 1};
        System.out.println(Array.countOnes(prices));

        //Find the number that appears once, and the other numbers twice
        int[] arr9 = {4, 1, 2, 1, 2};
        System.out.println(Array.numberTwice(arr9));

        //Longest Subarray with given Sum K(Positives & Negatives)
        int[] arr10 = {2, 3, 5, 1, 9};
        int K = 10;
        System.out.println(Array.longestLenSubArray(arr10, K));

        //inserting element -> right shift
        int[] arr11 = {1, 2, 3, 4, 5};
        int pos = 2;
        int ele = 10;
        System.out.println(Arrays.toString(Array.insertingEle(arr11, pos, ele)));

        //deleting element -> left shift
        int[] arr12 = {1, 2, 3, 4, 5};
        int pos1 = 2;
        int ele1 = 10;
        System.out.println(Arrays.toString(Array.deletingEle(arr12, pos1, ele1)));

        //Two Sum : Check if a pair with given sum exists in Array
        int[] arr13 = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(Array.twoSum(arr13, target)));

        //Sort an array of 0s, 1s and 2s
        int[] arr14 = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(Array.sortArray(arr14)));

        //Find the Majority Element that occurs more than N/2 times
        int[] arr15 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(Array.majorityEle(arr15));

        //Reverse the string a,bc$d with special characters at same position
        //o/p : d,cb$a
        String str2 = "a,bc$d";
        System.out.println(Strings.reverse(str2));

        //Kadane's Algorithm : Maximum Subarray Sum in an Array
        int[] arr16 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Array.maxSubArray(arr16));

        //Stock Buy And Sell
        int[] arr17 = {7, 1, 5, 3, 6, 4};
        System.out.println(Array.stockBuySell(arr17));

        //Top/Max IP address browsed among a list of given addresses
        String[] arr18 = {"10.45.05-ab/cc/xyz", "10.45.05-ab/cc/xyz", "10.34.40-abc/cc/xxx", "10.45.34-acb/vbg/vv"};
        System.out.println(Array.maxIPAddr(arr18));

        //Detect cycle in an array
        int[] arr19 = {1, 2, 3, 4, 5, 6};
        System.out.println(Array.lengthCycle(arr19));

        //DEQUE IMPLEMENTATION
        DequeImpl deque = new DequeImpl();
        DequeImpl.Node node1 = new DequeImpl.Node(1);
        DequeImpl.Node node2 = new DequeImpl.Node(2);
        DequeImpl.Node node3 = new DequeImpl.Node(3);
        DequeImpl.Node node4 = new DequeImpl.Node(4);
        deque.insertFirst(node1);
        deque.insertLast(node2);
        deque.insertFirst(node3);
        deque.insertFirst(node4);
        deque.deleteLast();
        int last = deque.getLast().data;
        System.out.println("Last ele" + last);
        deque.print();

        //Dot product of two arrays along with exception handling
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 7};
        Array.dotProduct(a, b);

        //From the given list of strings find out the Anagram and return it in Set<Set>.
        //Input : Array list {“cat ”, “dog”, “god”, “cat”};
        //Output : {{”cat”},{“dog”, “god”}}
        ArrayList<String> arr20= new ArrayList<>(Arrays.asList("cat","cat", "dog", "god","act"));
        System.out.println(Array.anagramSet(arr20));

        //Check if a given number is a power of 10
        System.out.println(Array.isPowerOfTen(1000));

        //Rearrange Array Elements by Sign
        int[] arr21={1,2,-4,-5};
        System.out.println(Arrays.toString(Array.reArrangePosNeg(arr21)));


        //List.of("1.start.0", "2.start.3", "2.end.5", "3.start.7", "3.end.10", "1.end.15");format description: 1st is function, 2nd is event and 3rd is time. find the individual function time taken
        //o/p : 1st function took time of 15 , 2nd function took time of 2
        List<String> list=List.of("1.start.0", "2.start.3", "2.end.5", "3.start.7", "3.end.10", "1.end.15");
        Array.eventTime(list);

        //Selection Sort
        int[] arr22= {13,46,24,52,20,9};
        System.out.println(Arrays.toString(Array.selectionSort(arr22)));
        //Bubble Sort
        System.out.println(Arrays.toString(Array.bubbleSort(arr22)));
        //Insertion Sort
        System.out.println(Arrays.toString(Array.insertionSort(arr22)));

        //Merge Sort
        int[] arr23={9, 4, 7, 6, 3, 1, 5};
        int n= arr23.length;
        Array.mergeSort(arr23, 0, n-1);
        System.out.println(Arrays.toString(arr23));

        //Quick Sort
        int[] arr24={4,1,7,9,3};
        int len=arr24.length;
        Array.quickSort(arr24, 0, len-1);
        System.out.println(Arrays.toString(arr24));


        //LinkedList
        LL.insertFirst(12);
        LL.insertLast(14);
        LL.insertLast(16);
        LL.insertFirst(10);
        LL.insertLast(17);
        LL.insert(13,2);
//        System.out.println(LL.deleteFirst());
//        System.out.println(LL.deleteLast());
//        System.out.println(LL.delete(1));
//        System.out.println(LL.find(13));
        System.out.println(LL.middleNode());
        LL.display();
    }
}