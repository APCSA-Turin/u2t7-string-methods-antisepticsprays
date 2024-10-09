import java.util.Scanner;
public class U2T7Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        int len1 = str1.length();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int len2 = str2.length();
        if (len1 > len2) {
            System.out.println(str1 + " is longer");
        }
        if (len1 < len2) {
            System.out.println(str2 + " is longer");
        }
        if (len1 == len2) {
            System.out.println("Both strings have the same length");
        }
        System.out.println("First half: " + str1.substring(0,(len1/2)));
        System.out.println("Second half: " + str1.substring((len2/2)));
        System.out.println("First half: " + str2.substring(0,(len1/2)));
        System.out.println("Second half: " + str2.substring((len2/2)));
        
        int index = str1.indexOf(str2);
        if (index != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        } else {
            System.out.println(str2 + " is NOT found in " + str1);
        }
    }
}
