import java.util.*;

public class Strings {
    public static String reverseString(String reverse){
        //return new StringBuilder(reverse).reverse().toString();// time:O(n), space:O(n);

        //2 pointer approach  // time: O(n), space:O(1);
        char[] str= reverse.toCharArray();
        int left=0;
        int right=reverse.length()-1;
        while(left<right){
            char temp= str[left];
            str[left]=str[right];
            str[right]=temp;

            left++;
            right--;
        }
        return new String(str);
    }

    public static boolean palindrome(String pal){

        int left=0;
        int right=pal.length()-1;

        while (left<right){  //time:O(n), space:O(n)
            while (left<right && !Character.isLetterOrDigit(pal.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(pal.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(pal.charAt(left))!= Character.toLowerCase(pal.charAt(right))){
                return false;
            }

           left++;           // time: O(n), space =O(1);
           right--;
        }
        return true;
    }

    //Count Vowels and Consonants:
    public static void vowConsCount(String word){
        int countVow=0;                //time:O(n), space: O(1)
        int countCons=0;
        for(char ch:word.toCharArray()){

            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                countVow++;
            }else countCons++;
        }
        System.out.println("Vowels: "+countVow+" Consonants: "+countCons);
    }

    //Remove Duplicates from a String:
    public static String removeDuplicates(String string){
        //if only alphabetic characters
//        char[] ch = string.toCharArray();
//        Set<Character> set=new LinkedHashSet<>();
//        for (char c:ch){
//            set.add(c);
//        }
//        StringBuilder stringBuilder= new StringBuilder();
//        for(char c:set){
//            stringBuilder=stringBuilder.append(c);
//        }
//        return stringBuilder.toString();
        boolean[] array= new boolean[26];
        StringBuilder str= new StringBuilder();
        for (char c: string.toCharArray()){
            if (!array[c-'a']){
                array[c-'a']=true;
                str.append(c);
            }
        }
        return str.toString();
    }
    public static char nonRepeatChar(String string){
//        Map<Character,Integer> map= new LinkedHashMap<>();
//
//        for(char ch:string.toCharArray()){
//            map.put(ch, map.getOrDefault(ch, 0)+1);
//        }
//        for (char ch:string.toCharArray()){
//            if(map.get(ch)==1){
//                return ch;
//            }
//        }
//        return (char) 0;
        final int MAX_int=26;
        int[] array= new int[MAX_int];

        for(char ch:string.toCharArray()){
            array[ch-'a'] ++;
        }
        for(char ch: string.toCharArray()){
            if(array[ch-'a']==1){
                return ch;
            }
        }
        return '\0';
    }

    public static boolean anagram(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] freq= new int[26];
        for (char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for (char ch: t.toCharArray()){
            freq[ch-'a']--;
        }
        for (int i:freq){
            if(i!=0) return false;
        }
        return true;
    }
    public static String longestPrefix(String[] strings){
//        Arrays.sort(strings);
//        String first=strings[0];
//        String last=strings[strings.length-1];
//        StringBuilder res= new StringBuilder();
//        for (int i=0;i<first.length();i++){
//            if(first.charAt(i)==last.charAt(i)){
//                res=res.append(first.charAt(i));
//            }else {
//                break;
//            }
//        }
//        return res.toString();
        String prefix=strings[0];
        for (int i=1;i<strings.length;i++){
            while (strings[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static boolean rotateString(String s, String goal){
//        StringBuilder str= new StringBuilder(s);
//        int left =0;
//        for(int i=0;i<str.length();i++){
//            char temp=str.charAt(0);
//            while (left<str.length()-1){
//                str.setCharAt(left,str.charAt(left+1));
//                left++;
//            }
//            str.setCharAt(str.length()-1,temp);
//            String res= str.toString();
//            if(res.equals(goal)){
//                return true;
//            }
//            left=0;
//        }
//        return false;
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        if(s.contains(goal)){
            return true;
        }
        return false;
    }

    public static String sortChars(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2)->entry2.getValue().compareTo(entry1.getValue()));
        StringBuilder str= new StringBuilder();
        int first=0;
        for(Map.Entry<Character,Integer> m:list){
            while (first<m.getValue()){
                str.append(m.getKey());
                first++;
            }
            first=0;
        }
        return str.toString();
    }
    public static int nestingDepth(String s){
        int count=0;
        int result = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                count--;
            }
            result= Math.max(count, result);

        }
        return result;
    }

    public static int romanToInteger(String s){
        Map<Character, Integer> map= new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum=0;
        for(int i=s.toCharArray().length-1;i>=0;i--){
            int count=map.get(s.charAt(i));
            if(i>0 && s.charAt(i)=='V' && s.charAt(i-1)=='I'){
                count-=map.get('I');
                i--;
            }else if(i>0 && s.charAt(i)=='X' && s.charAt(i-1)=='I'){
                count-=map.get('I');
                i--;
            }else if(i>0 && s.charAt(i)=='L' && s.charAt(i-1)=='X'){
                count-=map.get('X');
                i--;
            }else if(i>0 && s.charAt(i)=='C' && s.charAt(i-1)=='X'){
                count-=map.get('X');
                i--;
            }else if(i>0 && s.charAt(i)=='D' && s.charAt(i-1)=='C'){
                count-=map.get('C');
                i--;
            }else if(i>0 && s.charAt(i)=='M' && s.charAt(i-1)=='C'){
                count-=map.get('C');
                i--;
            }
            sum+=count;
        }
        return sum;
    }

    public static String reverse(String str){
        char[] arr=str.toCharArray();
        int left=0;
        int right= arr.length-1;

        while(left<right){
            if (!Character.isLetterOrDigit(arr[left])){
                left++;
            }

            else if(!Character.isLetterOrDigit(arr[right])){
                right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String((arr));
    }
}