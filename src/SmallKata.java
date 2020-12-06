public class SmallKata {

    public static void main(String[] args) {
        //    four different ways to add 1 to an integer
        SmallKata kata = new SmallKata();

        int anInteger = 2;
        int anotherInteger = 3;
        int thirdInteger = 1;
        int fourthInteger = 0;

//        compound assignment method
        anInteger = anInteger + 1;
        System.out.println(anInteger);
        anotherInteger += 1;
        System.out.println(anotherInteger);

//        increment (pre and post resp.)
        ++thirdInteger;
        System.out.println(thirdInteger);
        fourthInteger++;
        System.out.println(fourthInteger);


    }
}
