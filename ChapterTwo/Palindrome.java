
public class Palindrome
{
    // instance variables - replace the example below with your own
    public String word;
    private boolean isPalindrome;

   
    public Palindrome(String wd)
    {
        this.word = wd;
    }

    public boolean testWord() {
        //Logic to test palindrome
        for (int i=0; i<word.length(); i++) {
            System.out.println(word.substring(i, i+1));
        }
        //set instance variable
        return isPalindrome;
    }
}

