import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CharFinder {
    // find first non-repeated character
    // a green apple , and after iterations we will have
    // a=2 , =2 , g=1,e=3 .... etc. g should be the non-repeated character
    //
    public char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>(); // our keys should be characters and values integers
    var chars = str.toCharArray(); // to convert only one time and use memory efficiently
        for (var ch : chars) { // we can not iterate over strings in java instead we converted to character array
            //in each iteration we have to see if we had this char in our hash table , if we have it then increment its count by one
            //otherwise will insert in hash table
            if (map.containsKey(ch)) {
                var count = map.get(ch);
                map.put(ch , count + 1 );
            }else{
                map.put(ch , 1);
            }
            // equivalent logic
          /* var count = map.containsKey(ch) ? map.get(ch) :  0;
            map.put(ch , count + 1);*/
        }
        // to see what we have in our hash table
       // System.out.println(map);

        for (var ch: chars)
            if (map.get(ch) == 1) // return first non-repeated character
                return ch;
        return Character.MIN_VALUE;

    }

    //opposite to it find the first repeated character , suitable DS is Hash Set
    public char findFirstRepeatingCharacter (String str){
        HashSet set = new HashSet<>(); // create instance of hash set

        for (var ch : str.toCharArray()){
            if (set.contains(ch))
                return ch;
            else
                set.add(ch);

        }
        return Character.MIN_VALUE;

    }

}


/*
{ =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}
{ =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}*/
