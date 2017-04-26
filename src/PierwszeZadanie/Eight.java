package PierwszeZadanie;

/**
 * Created by bartosz on 13.04.2017.
 */
public class Eight {

    // += dopisuje dodajemy
    public static void maizn(String[] args) {
//        System.out.println(countCharacter("Ala ma kota" , 'a'));
//        System.out.println(countCharacter("Ala ma kota i dwa psy", 'a'));
//        System.out.println(countCharacter("Ala ma kota i dwa pay", 'a'));
//        System.out.println(countCharacter("Ala ma kota i dwa psy", '1'));
//        System.out.println(message);
        String pokemonMessage = "AjhGFhJifFeRyhhjI";
        System.out.println(countCapitalLetters(pokemonMessage));
        System.out.println(countSmallLetters(pokemonMessage));
//        System.out.println(innyZnak);
//        System.out.println(znak);
        System.out.println(countWords("Ala ma kota"));
        System.out.println(switchCase("Ala ma kota"));
        System.out.println(ananimOf("Ala ma kota"));

        //        long a = 2;
//
//        for (int i = 0; i < 64; i++) {
//            if (i == 60) {
//                System.out.println("ASdasdas");
//            }
//            a *= 2;
//        System.out.println(isPalindrome("ala ma KOta "));
//        System.out.println(sumOfNumbers("Ala ma 23 koty i 3 psy i 2 kanarki"));

    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
            // counter += (charArray[i] >= 97 && charArray[i] <= 122) ? (counter +1) ? 1: 0; - operator troj argumentowy, ? to nastepne argumenty

        }
        return String.valueOf(charArray);

    }

    public static int countWords(String message) {
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                counter++;
            }

        }
//        return message.split(" ").length;
        return counter;

    }

    public static int countSmallLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                counter++;
            }
//            counter += (charArray[i] >= 97 && charArray[i] <= 122) ? 1: 0;

        }
        return counter;
    }


    public static String ananimOf(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
//            int a = charArray[i];
//            int b = charArray[charArray.length -1-i];
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];//zyz przepisujemy tablice
            charArray[charArray.length - 1 - i] = tmp;
        }
        return String.valueOf(charArray);

    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i < charArray.length / 2) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
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
        String a = "blabla";
        String b = "blabla";
        return palindrome;
//        return message == ananimOf(message); // do porownywania obiektow - stringow uzywamy equals bo
//        return message.equals(ananimOf(message); // do porownywania obiektow - stringow uzywamy equals bo
    }


    public static boolean startsWith(String message, String someValue) {
        char[] messageCharacters = message.toCharArray();
        char[] someValueCharacters = someValue.toCharArray();
        boolean flag = true;
        int i = 0;
        if (flag && i < someValueCharacters.length) {
            if (someValueCharacters[i] != messageCharacters[i]) {
                flag = false;
            }
//            flag
//            flag = !(someValueCharacters[i] != messegeCharacters[i]);  // wyrzyknik dla boolienow robi tru na fals , fals na true
//            flag = (someValueCharacters[i] == messegeCharacters[i]);
//            i++;
            i++;
        }
        return flag;
        /////////////////////
//        boolean flag = true;
//        int i = 0;
//        while (flag && i < someValue.length()) {
//            flag = !(message.charAt(i) != someValue.charAt(i));
//            i++;
//        }
//        return flag;

    }

    public static String toUpperCase(String message) {
        char[] charArray = message.toCharArray(); // zamiana na tablice znakow
        if (charArray[0] >= 97 && charArray[0] <= 122) {
            charArray[0] = (char) (charArray[0] - 32);// przypisujemy ze napewno checmy zrzutowac liczbe char na char
        }
//        charArray[0] -= (charArray[0] >= 97 && charArray[0] <= 122) ? 32 :0; // sprawdzamy czy pierwszy jest mala litera  jezeli tak to zamien

        return String.valueOf(charArray);
    }

    public static String toLowersCase(String message) {
        char[] charArray = message.toCharArray();
//            char[] charArray = message.toCharArray(); // zamiana na tablice znakow
        if (charArray[0] >= 65 && charArray[0] <= 90) {
            charArray[0] = (char) (charArray[0] + 32);// przypisujemy ze napewno checmy zrzutowac liczbe char na char
        }
//            charArray[0] += (charArray[0] >= 65 && charArray[0] <= 90) ? 32 :0; // sprawdzamy czy pierwszy jest mala litera  jezeli tak to zamien

        return String.valueOf(charArray);

    }

    //Ala ma 2 koty i 3 psy - > (normalna -> 2 + 3 + 5, super -> 2 +35)
    public static int sumOfNumbers(String message) {
        char [] charArray = message.toCharArray();
        int sum =  0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48; // nie musimy robic rzutowania bo int jest mocniejszy od char
//                sum += Character.getNumericValue(charArray[i]);
            }

        }
        return sum;

    }

    //subString("Ala ma kota", 4) -> "ma kota"
    public static String subString(String message, int startIndex) {
        return null;
    }

    //subString("Ala ma kota", 4, 6) -> "ma"
    public static String subString(String message, int startIndex, int endIndex) {
        return null;
    }



    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter= 0 ;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                counter++;
            }

        }
        return counter;
    }

    public static int countCharacterIn(String message, char character) {
//        char[] charArray = message.toCharArray();//zamiana na liczbe
        int counter = 0; //counter zlicza , mozna tez napisac message.charAt(2)
        //charAt()//pobiesz mi wartosc wiadomosc z znaku 2
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == character){
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
//        char[] resultArray = new char[charArray.length];
//        for (int i = 0; i < resultArray.length; i++) {
//            resultArray[i] = charArray[charArray.length - i 1];
//
//        }
//        return String.valueOf(resultArray);
//    }


    public static void charAndStringTest() {
        String message = "Ala ma kota";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(znak + ", ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
    }














}
