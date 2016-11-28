package Palindrome;

import org.apache.commons.lang3.StringUtils;

public class PalindromeChecker {
	public boolean isPalindrome(String word) {
		if (word == null || word.trim().isEmpty()) {
			return false;
		}
		word = word.toLowerCase();

		StringBuffer sb = new StringBuffer(word);
		return word.equals(sb.reverse().toString());
	}
}
