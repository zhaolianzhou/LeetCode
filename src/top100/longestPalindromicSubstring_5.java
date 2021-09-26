package top100;

public class longestPalindromicSubstring_5 {
    public String longestPalindrome(String s) {
        if (s.length()==1)
            return s;
        if (s.length()==2) {
            if (s.charAt(0)==s.charAt(1))
                return s;
            else
                return s.substring(0,1);
        }
        int middle = Math.abs(s.length()/2);
        System.out.println("middle: "+ middle);
        int currentLongest = 1;
        int head = 0, tail = 1;
        for (int i = 1; i <= middle; i++) {
            System.out.println("i: "+ i);
            if (s.charAt(i) == s.charAt(i+1)) {
                System.out.println(s.charAt(i) + " "+ s.charAt(i+1));
                System.out.println("Case1");
                int currentHalfLength = Math.min(i-1, s.length()-i-1);
                System.out.println("current half length: "+ currentHalfLength);
                int currentLength = 2;
                if (currentLength > currentLongest) {
                    currentLongest = currentLength;
                    tail = i+1;
                    head = i;
                }
                for (int j = 1; j <= currentHalfLength; j++) {
                    System.out.println("j: "+ j);
                    if (s.charAt(i+j+1) == s.charAt(i-j)) {
                        currentLength = 2*j+2;
                        System.out.println("Current length");
                        System.out.println(currentLength);
                        if (currentLength > currentLongest) {
                            currentLongest = currentLength;
                            tail = i+j+1;
                            head = i-j;
                        }
                    }
                }
            } else {
                System.out.println("Case2");
                int currentHalfLength = Math.min(i-1, s.length()-i);
                System.out.println("current half length: "+ currentHalfLength);
                int currentLength = 1;
                for (int j = 1; j <=currentHalfLength; j++) {
                    System.out.println("j: "+ j);
                    if(s.charAt(i+j)==s.charAt(i-j)) {
                        currentLength = 2*j + 1;
                        System.out.println("Current length");
                        System.out.println(currentLength);
                        if (currentLength > currentLongest) {
                            currentLongest = currentLength;
                            tail = i+j;
                            head = i-j;
                        }
                    }
                }
            }
        }
        System.out.println(currentLongest);
        return s.substring(head, tail+1);
    }

    public static void main(String[] args) {
        longestPalindromicSubstring_5 test = new longestPalindromicSubstring_5();
        System.out.println(test.longestPalindrome("cbbd"));
    }
}
