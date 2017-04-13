package PierwszeZadanie;

/**
 * Created by bartosz on 13.04.2017.
 */
public class Eight {

// += dopisuje dodajemy
    public static void main(String[] args) {
//        System.out.println(countCharacter("Ala ma kota" , 'a'));
//        System.out.println(countCharacter("Ala ma kota", 'a'));
//        System.out.println(countCharacter("Ala ma kota", 'a'));
//        System.out.println(message);
//        System.out.println(innyZnak);
//        System.out.println(znak);
//        String message = "AsFghHrdfG";
//        System.out.println(couterCapitalLetters(message));
//        System.out.println(couterSamll(message));
//        String message = "AsFghHrdfG AsFghHrdfG AsFghHrdfG";
//        System.out.println(counterWorts(message));

//        System.out.println(switchCase("ala ma KOta"));
//        System.out.println(ananimOf("ala ma KOta"));
        System.out.println(isPalindrome("ala ma KOta "));

    }

    public static int countCharacter(String message, char character) {
        char[] charArray = message.toCharArray();//zamiana na liczbe
        int counter = 0; //counter zlicza , mozna tez napisac message.charAt(2)
        //charAt()//pobiesz mi wartosc wiadomosc z znaku 2
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == character){ //to samo co to
//            if(message.charAt(i) == character){ //to samo co to
                counter++;
            }

        }
        return counter;

    }

//    public static void charAndStringTest() {

//        String message = "Ala ma kota";
//        message += "i dwa psy";
//        char znak = 'e'; // te znaki nie sa zapisywane jako znak tylko jako liczba w tych apostrofach ''  www.bibase.com
//        char innyZnak = 65 ; // te znaki nie sa zapisywane jako znak tylko jako liczba w tych apostrofach ''  www.bibase.com
//        char znak = 'a';
//        for (int i = 0; i < 26; i++) {
//            System.out.println(znak + ",");
//            znak ++;
//        }
//        char[] charArray = message.toCharArray();
//        charArray[]
//        System.out.println(message.length());
//        countCharacter(message, 'a');

//    }
    public static int couterCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter= 0 ;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                counter++;
            }

        }
        return counter;
    }

    public static int couterSamll(String message) {
        char[] charArray = message.toCharArray();
        int counter=0 ;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 97 && charArray[i] <= 122) {
                counter++;
            }

        }
        return counter;
    }

    public static int counterWorts(String message) {
        char[] charArray = message.toCharArray();
        int counter =1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                counter++;
            }

        }
        return  counter;

    }
    
    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] -= 32;
            }
            // counter += (charArray[i] >= 97 && charArray[i] <= 122) ? (counter +1) ? 1: 0; - operator troj argumentowy, ? to nastepne argumenty

        }
        return new String (charArray);

    }

    public static String ananimOf (String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
//            int a = charArray[i];
//            int b = charArray[charArray.length -1-i];
            char tmp = charArray[i];
            charArray[i] =  charArray[charArray.length -1-i];//zyz przepisujemy tablice
            charArray[charArray.length -1 -i] = tmp;
        }
        return String.valueOf(charArray);

//        char[] resultArray = new char[charArray.length];
//        for (int i = 0; i < resultArray.length; i++) {
//            resultArray[i] = charArray[charArray.length - i 1];
//
//        }
//        return String.valueOf(resultArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i< charArray.length /2){
            if (charArray[i] != charArray[charArray.length -i -1]) {
                    palindrome = false;
            }
            i++;
        }
//        for (int i = 0; i < charArray.length / 2; i++) {
//           if(charArray[i] != charArray[charArray.length -i -1]) {
//               palindrome = false;
//               break;
//           }
//
//        }
        return palindrome;
//        return message == ananimOf(message); // do porownywania obiektow - stringow uzywamy equals bo
    }




}
