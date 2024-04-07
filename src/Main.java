import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner inp = new Scanner(System.in);
        int n1=0, n2=1, stage, total, i;
        System.out.print("Fibonacci kaç elemanlı olsun : ");
        stage = inp.nextInt();
        total = n1 +n2;
        System.out.println("1.stage : "+ n1 + " + " + n2 + " = " + total);
        for (i = 1; i < stage; i++) {
            total = n1 + n2;
            n1 = n2;
            n2 = total;
            System.out.println(i+1+".stage : "+n1 + " + " + n2 + " = " + total);
        }
    }
}