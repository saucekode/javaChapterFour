public class NumbersInTables {
    public static void main(String[] args) {
        NumbersInTables numbersTables = new NumbersInTables();

        System.out.println("-------------------------");
        System.out.printf("%s%8s%8s%8s%n", "N", "10*N", "100*N", "1000*N");
        System.out.println("-------------------------");
        int counter = 0;
        while(counter < 5){
            counter++;
            System.out.printf("%s%2s%4s%2s%6s%2s%6s%2s%n", counter, "|", counter * 10, "|" , counter * 100, "|", counter * 1000, "|");
        }
        System.out.println("-------------------------");
    }
}
