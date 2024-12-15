import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            String a = in.nextLine();
            if(a.equals("ENTER")){
                System.out.println(sum);
                break;
            }
            int b = Integer.parseInt(a);
            sum += b;
        }
    }
}
