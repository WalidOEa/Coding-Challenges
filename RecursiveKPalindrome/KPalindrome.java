import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.PalindromeChecker;

public class KPalindrome implements PalindromeChecker {

    public static void main(String[] args) {
        KPalindrome kPalindrome = new KPalindrome();
        System.out.println(kPalindrome.isKPalindrome("A Santa dog lived as a devil god at NASA",4));
    }

    public boolean isKPalindrome(String palindrome, int k) {
        String firstChar = palindrome.substring(0, 1);
        String lastChar = palindrome.substring(palindrome.length() - 1);

        if (palindrome.length() == 0 || palindrome.length() == 1) {
            return true;
        } else if (palindrome.length() == 2) {
            if (firstChar.equals(lastChar)) {
                return true;
            } else {
                if (k > 0) {
                    String newPalindrome = palindrome.substring(1);
                    return isKPalindrome(newPalindrome, k-1);
                } else {
                    return false;
                }
            }
        } else {
            if (firstChar.equals(lastChar)) {
                String palindromeTemp = palindrome.substring(1);
                String newPalindrome = palindromeTemp.substring(0, palindromeTemp.length() - 1);
                return isKPalindrome(newPalindrome, k);
            } else {
                if (k == 0) {
                    return false;
                }
                String newPalindrome = palindrome.substring(1);
                if (isKPalindrome(newPalindrome, k-1) == false) {
                    String otherPalindrome = palindrome.substring(0, palindrome.length() - 1);
                    if (isKPalindrome(otherPalindrome, k-1) == false) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
    }
}
