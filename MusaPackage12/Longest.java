package MusaPackage12;

public class Longest {

    public static void main(String[] args) {
        String arry[] = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};

        String longestString = findLongestString(arry);
        System.out.println("Longest String: " + longestString);


        System.out.println("Length of Longest String: " + longestString.length());
    }

    public static String findLongestString(String[] strings) {

        if (strings.length > 0) {

            String longestString = strings[0];


            for (String str : strings) {
                if (str.length() > longestString.length()) {
                    longestString = str;
                }
            }

            return longestString;
        } else {
            return "Array is empty.";
        }
    }
}


