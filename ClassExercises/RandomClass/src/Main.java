import java.util.Random;

public class Main {
    public static void main(String[] args) {



        Random rnd=new Random();


        for(int i=0;i<50;i++){
            int x= rnd.nextInt(100);
            System.out.print(rnd.nextInt(100)+"-"+x+"   ");
            if((i+1)%10==0){
                System.out.println();
            }

        }
    }
}