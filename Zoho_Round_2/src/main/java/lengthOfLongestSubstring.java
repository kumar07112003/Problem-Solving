package solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class lengthOfLongestSubstring  {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		String user=sc.next();
		System.out.println(lengthOfLongestSubstring(user));;
		System.out.println(user.length()-1);
	}
public static int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            System.out.println(set);
            maxLength = Math.max(maxLength, set.size());
        }

        return maxLength;
}
}

