public class Task8 {
    public static void main(String[] args) {
        int a = 1, sum = 0;
        while (a <= 100) {
            if(a % 3 ==0){
                a++;
                continue;
            }
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
