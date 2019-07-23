package com.devglan.userportal.examples;

import java.util.HashMap;

public class Anagram {

    // get two strings and see if they are anagram of each other using hash map
    // listen, silent are anagram of each other

    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        System.out.println(anagram.checkAnagram("silend", "listen"));
    }

    private String checkAnagram(String first, String second) {


        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();

        HashMap<Character, Integer> anagramHashMap = new  HashMap<Character, Integer> ();
        HashMap<Character, Integer> anagramHashMap2 = new  HashMap<Character, Integer> ();

        for (int i = 0; i < firstCharArray.length; i++) {
                anagramHashMap.put(firstCharArray[i], 1);

        }

        for (int j = 0; j < secondCharArray.length; j++) {
                anagramHashMap2.put(secondCharArray[j], 1);

        }


        System.out.println(anagramHashMap);
        System.out.println(anagramHashMap2);
        if(anagramHashMap.equals(anagramHashMap2)){
            return "true";
        } else {
            return "false";
        }

    }

    // Function to check whether two strings
    // are an anagram of each other
    static boolean areAnagram(String str1, String str2)
    {

        HashMap<Character, Integer> hmap1
                = new HashMap<>();
        HashMap<Character, Integer> hmap2
                = new HashMap<>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Mapping first string
        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Mapping second String
        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int)hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        System.out.println(hmap1);
        System.out.println(hmap2);

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

}
