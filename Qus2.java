import java.util.Scanner;
public class Qus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No.of Coins Collected by Zara:");
        int zara=in.nextInt();
        System.out.print("No.of Coins Collected by Neil:");
        int neil=in.nextInt();
        int omar=0;
        while(zara!=neil){
            int coinsToCollect;
            if(zara>neil){
                coinsToCollect=(int)Math.ceil(zara/2.0);
                zara-=coinsToCollect;
                omar+=coinsToCollect;
            }else{
                coinsToCollect=(int)Math.ceil(neil/2.0);
                neil-=coinsToCollect;
                omar+=coinsToCollect;
            }
        }
        System.out.println("Total coins taken by Omar:"+omar);
        in.close();
    }
}
