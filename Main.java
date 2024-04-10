import java.util.Random;

public class main {
    public static void main(String[] args){

        //these two state all alphabets which will be used to generate secure password
        String Alphabets = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String alphabets = "qwertyuiopasdfghjklzxcvbnm";
        String Numbers = "1234567890";

        //This is used to create the required string
        StringBuilder sb = new StringBuilder();

        //Creating a class called Randm which is used to generate Random numbers/alphabets etc.
        Random randm = new Random();

        //This tells the int value which will be the length of the password
        int length = 5;
        //int min = 8;

        //i > min; - maybe try adding this
        for(int i = 0; i < length; i++){
            /* here nextInt just chooses the index integer which is randomized by randm. Index number basically tells which
            character to pich of the string. Eg. the alphabets have 0-25 index numbers */
            int indexa = randm.nextInt(alphabets.length());
            int indexA = randm.nextInt(Alphabets.length());
            int indexN = randm.nextInt(Numbers.length());

            //the actual string in terms of index number
            char smallchar = alphabets.charAt(indexa);
            char bigchar = Alphabets.charAt(indexA);
            char numberss = Numbers.charAt(indexN);

            //Appending all characters to string
            sb.append(numberss);
            sb.append(smallchar);
            sb.append(bigchar);

        }
        String password = sb.toString();
        System.out.println("Secure Password for you: " + password);
    }
}