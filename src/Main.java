import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //reverse a word
        String reverse="geeks";
        System.out.println(Strings.reverseString(reverse));

        //palindrome
        String palin="A man a plan, a canal: Panama";
        System.out.println(Strings.palindrome(palin));

        //Count Vowels and Consonants
        String vowConsCount= "HEllo";
        Strings.vowConsCount(vowConsCount);

        //Remove Duplicates from a String:
        String removeDuplicates="geeksforgeeks";
        System.out.println(Strings.removeDuplicates(removeDuplicates));

        //Find the First Non-Repeating Character:
        String nonRepeatChar="swiss";
        System.out.println(Strings.nonRepeatChar(nonRepeatChar));

        //anagram
        String s="listen"; String t="silent";
        System.out.println(Strings.anagram(s,t));

        //longest common prefix
        String[] longestPrefix={"flower", "flow", "flight"};
        System.out.println(Strings.longestPrefix(longestPrefix));

        //rotate String
        String rotateString = "abcde";
        String goal="cdeab";
        System.out.println(Strings.rotateString(rotateString,goal));

        //sort characters by frequency
        String sortChars = "tree";
        System.out.println(Strings.sortChars(sortChars));

        //	15. Maximum Nesting Depth of the Parenthesis
        String depth="(1+(2*3)+((8)/4))+1";
        System.out.println(Strings.nestingDepth(depth));

        //Roman to Integer
        String roman="MCMXCIV";
        System.out.println(Strings.romanToInteger(roman));

        //implement Atoi
        String str="0-1";
        System.out.println();

        //Arrays
        //Largest element in an array
        int[] arr={2,5,1,3,0};
        System.out.println(Array.LargestEleArray(arr));

        //Second largest and second smallest
        int[] arr1= {1,2,4,7,7,5};
        Array.secondEle(arr1);

        //sorted or not
        int[] arr2={5,4,6,7,8};
        System.out.println(Array.sortedOrNot(arr2));

        //Remove Duplicates in-place from Sorted Array
        int[] arr3={1,1,1,2,2,3,3,3,3,4,4};
        System.out.println(Arrays.toString(Array.removeDuplicates(arr3)));

        //Left Rotate the Array by One
        int[] arr4={1,2,3,4,5};
        System.out.println(Arrays.toString(Array.leftRotate(arr4)));

        //Rotate array by K elements
        int[] arr5={1,2,3,4,5,6,7} ;
        int k=2;
        System.out.println(Arrays.toString(Array.leftRotateByKplaces(arr5, k)));
    }
}