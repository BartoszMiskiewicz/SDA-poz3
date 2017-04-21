package PierwszeZadanie;

import java.util.Random;

/**
 * Created by bartosz on 20.04.2017.
 */
public class Ten {
    public static void main(String[] args) {
//        System.out.println(find("Ala ma kota", 'm'));
//        System.out.println(find("Ala ma kota", 'k'));
//        System.out.println(find("Ala ma kota", 'z'));
//        System.out.println(countAll("Ala ma kota", 'a'));
//        System.out.println(countAll("Ala ma kota", 'm'));
//        System.out.println(countAll("Ala ma kota", 'z'));
//        System.out.println(stringStatistics("Ala ma kota", 'z'));
//        Five.displayArray(stringStatistics("aaabbbbbccccdddzzz"));
//        int[] statistics = stringStatistics("Ala ma kota");
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        printStringStatistics(statistics);
//        printStringStatistics(array);
//        System.out.println(multiplyDigits(123));
//        System.out.println(multiplyDigits(1234));
//        System.out.println(multiplyDigits(12356));
//        int[][] ints = randomMatrix(3,10,-5);
//        System.out.println(avg(ints));
//        avg(randomMatrix(3,10,-5), randomMatrix(3,15,5);
//        System.out.println("4" + find ("ALa ma kota", "ma"));
//        System.out.println("-1"+ find("ALa ma kota", "kota"));
//        System.out.println("7"+ find("ALa ma kota", "kot"));
//        System.out.println("ALa ma kota".substring(4,2));
//        System.out.println(countAll("ALa ma kota oraz ma psa", "ma"));
//        System.out.println(countAll("ALa ma kota", "kot"));
        System.out.println(checkRoundBraces("((2+2)*2)"));
        System.out.println(checkRoundBraces("(2+2)*2)"));
        System.out.println(checkRoundBraces(")(2+2)*2)("));


    }
    //01234
    //Ala ma kota, m -> 4
    public static int find(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int i = 0;
        while (i < charArray.length && charArray[i] != sentence ) {
            i++;
        }
        return (i == charArray.length) ? -1  :  i;



    }
    //01234567
    //Ala ma kota, kota -> 7
    public  static  int find(String message, String sentence) {
        char[] messageArray = message.toCharArray();
        char[] sentenceArray = sentence.toCharArray();
        boolean flag = true;
        int i = 0;
        while(flag && i < messageArray.length - sentenceArray.length) {
            int j = 0;
            while (j < sentenceArray.length && messageArray[i+j] == sentenceArray[j]) {
                j++;
                if (j == sentenceArray.length) {
                    flag = false;
                }
            }
            i++;

        }
        return flag ? -1 : i - 1;

    }

    //Ala ma kota, a -> 3
//    public static int countAll (String message, char sentence) {
//        char[] charArray = message.toCharArray();
//        int counter = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == sentence)}
//            counter++;
//            }
//        }
//        return counter++;
//    }

    //Ala ma kota i ma tez psa, ma ->2
    public static int countAll(String message,String sentence) {
        int counter = 0;
        while (find(message, sentence)!= -1){
            counter++;
            message = message.substring(find(message, sentence) +1 );


        }
        return counter;
    }
    //((2+2)*2) -> true
    //(2+2)*2) -> false
    //)(2+2)*2( -> false
    public static boolean checkRoundBraces(String expression){
        char[] expressionArray = expression.toCharArray();
        int counter = 0;
        int i = 0;
        while (counter >= 0 && i < expressionArray.length){
            if (expressionArray[i] == '('){
                counter++;
            }else if (expressionArray[i] == ')'){
                counter--;
            }
            i++;
        }

        return counter == 0;
    }


    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90 ){
            a += 32;
        }
        return a;

    }




    //aabbbbbccee -> {2, 5, 2, 0, 2, ...}
    //Ala ma kota i borsuka -> {5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, ...}
    public static int[] stringStatistics(String message) {
        char[] charArray = message.toCharArray(); // ala ma kota messeage mamy
        int [] ints = new int [26];//tworzymy tablice
        for (int i = 0; i < charArray.length ; i++){
            char charInLowerCase = toLowerCase(charArray[i]);//obnizamy do male litety i wtedy zliczamy jeje wysapienie
            if(charInLowerCase >= 97 && charInLowerCase <= 122) {//sprawdzamy czy mamy małe litery w wyrazie czyli przedział od 97 do 122
                ints[charInLowerCase-97]++;
            }

        }

        return ints;

    }

    //{2, 4, 2, 0, 2, ...} -> aabbbbbccee
    public static void printStringStatistics(int[] array){

        for (int i = 0; i < array.length; i++) {//bierze kazdy elemetn tablicy array i tworzymy petle numer dwa ktora
            // bedzie sie wykonywala tyle razy ile mamy elementy
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char)(i + 97));//zamienimy cyfry na literki spowrotem i+97 to daje nam litere c

            }

        }



    }
    //123 -> 1 * 2 * 3 = 6
    public static int multiplyDigits(int number){
        int product = 1;
        while (number != 0){//robimy to tak dlugo dopuki number jest rowne lub rozne od zero
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    public static int [][] randomMatrix(int size, int bounds, int offset){
        Random random = new Random();
        int[][] resultMatrix = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultMatrix[i][j] = random.nextInt(bounds) + offset;
            }
        }
        return resultMatrix;

    }


//    public static int avg(int[][] matrix){
//        int sum = sum(matrix);
//        return sum/(double)(matrix.length * matrix[0].length);

//
//    }

    public static int sum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];

            }

        }
        return sum;
    }

    public static double [][] avg(int[][] matrix1, int[][] matrix2){
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = (matrix1[i][j]+ matrix2[i][j]) / 2.0;

            }

        }
        return resultMatrix;
    }





}
