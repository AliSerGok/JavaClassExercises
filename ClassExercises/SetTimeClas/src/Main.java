public class Main {
    public static void main(String[] args) {

        long i = 0;
        java.util.Date date = new java.util.Date(i);
        date.setTime(i);

        System.out.println("Date and time: " + date.toString());
        System.out.println();

        for (i = 1000; i < 100000000000L; i *= 10) {


            System.out.println("Time elapsed: " + i + " milliseconds");

        }
        System.out.println("Date and time: " + date.toString());


    }
}