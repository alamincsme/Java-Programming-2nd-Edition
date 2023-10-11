package chap05;

public class Fibonacci {
    public static void main(String[] args) {

        int [] series = new int[20];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2 ; i < series.length ; i++) {
            series[i] = series[i -1] + series [ i - 2] ;
        }

        for (int x : series )   System.out.println(x);

    }

}
