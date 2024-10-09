import java.util.Scanner;
public class U2T7Lab2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int count = 0;
        System.out.print("Enter first word: ");
        String tempStr = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter next word: ");
            String nextStr = scan.nextLine();
            count +=1;
            int alphaNum = tempStr.compareTo(nextStr);
            if (alphaNum < 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            if (alphaNum > 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            if (tempStr.equals(nextStr)) {
                score -= 10;
                System.out.println("-10 points: current word is same as previous word; SCORE;" + score);
            }
            int templen = tempStr.length() - 2;
            if ((tempStr.substring(templen)).equals(nextStr.substring(0,2))) {
                score +=5 ;
                System.out.println("+5 points: last two letters of previous match first 2 letters of current; SCORE: " + score);
            }
            //previous word = tempStr //// next word = nextStr
            if ((nextStr.indexOf(tempStr.substring(0,1)))!= -1) {
                score +=3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if ((tempStr.length()) == (nextStr.length())) {
                score += 3;
                System.out.println("+3 points: current and previous word are the same length; SCORE: " + score);
            }
                tempStr = nextStr;
        }
        System.out.println("Game Over");
        System.out.println("# of Words: " + count);
    }   
}