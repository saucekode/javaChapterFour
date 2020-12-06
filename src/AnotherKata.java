public class AnotherKata {
    public static void main(String[] args) {
        int x = 1; int y = 3; int z;
        //      Here, the operation was carried out and a result gotten before x incremented by 1
//        z = x++ + y;
        //      Here, x incremented by 1 before the operation was carried out and a result gotten
        z = ++x + y;
        System.out.printf("Sum of %d and %d is: %d%n", x,y,z);

        int count = 16;
        if(count > 10){
            System.out.println("Count is greater than 10");
        }

        int total = 4;

        total -= x--;

        System.out.println(total);


    }
}
