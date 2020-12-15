public class PatternOfAsterisk {
    public static void main(String[] args) {
        int counter = 0;
        String asterisk = "";
        while(counter < 16){
            while(counter < 8){
                counter++;
                asterisk += "* ";
            }
            counter++;
            if (counter % 2 == 0) {
                System.out.print(" ");
            }
            System.out.print(asterisk);

            System.out.println();
        }
    }
}
