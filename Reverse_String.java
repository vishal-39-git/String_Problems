import java.util.*;

public class Reverse_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.next();

        System.out.println("This is the original String "+str);
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
    
        System.out.println("This is the reverse String "+ReverseString);
    }
}
