import java.util.Scanner;

public class PalindromeString {
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.next();

        //convert string into char array
        char ChArr[] = str.toCharArray();
        //reverse the characters
        for(int i=0,j = ChArr.length-1; i < j;i++,j--){
            char temp = ChArr[i];
            ChArr[i] = ChArr[j];
            ChArr[j] = temp;
        }
        //create new string and assign with reverse char array
        String ReverseString = new String(ChArr); 
        
        // Check if the reversed string is equal to the original string
        if(ReverseString.equals(str)){
            System.out.println("This is a Palindrome String");
        }
        else{
            System.out.println("This is not a Palindrome String");
        }
    }    
}
