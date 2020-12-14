import java.util.Arrays;

public class ThirdKata {
    public static void main(String[] args) {
//        int sum = 0;
//        int x = 1;

//        calculate and print sum of integers from 1 to 10
//        while(x <= 10){
//            sum += x;
//            x++;
//        }
//        System.out.println(sum);

        int row = 10;
        while (row >= 1){
            int column = 1;

            while(column <= 10){
                System.out.println(row % 2 == 1 ? "<" : ">");
                ++column;
            }

            --row;
            System.out.println();
        }
    }
}
