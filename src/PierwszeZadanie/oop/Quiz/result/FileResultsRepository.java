package PierwszeZadanie.oop.Quiz.result;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bartosz on 26.04.2017.
 */
public class FileResultsRepository implements ResultsRepository{ // implementujemy zeby wywolac w main

    private String pathToFile;
    private File fileWithResults;

    public FileResultsRepository(String pathToFile) {//konstruktor
        this.pathToFile = pathToFile;
        this.fileWithResults = new File(pathToFile);
    }

    public int getSize() {
        int counter = 0;
        try {
            Scanner scanner = new Scanner(fileWithResults);
            while (scanner.hasNext()) {
                counter++;
                scanner.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter;

    }


    public Result[] getAllResults() {
        Result[] results = new Result[getSize()];
        try {
            Scanner scanner = new Scanner(fileWithResults);//zczytujemy linie stringa i z takiego stronga robi nam obiekt
            int i = 0;
            while (scanner.hasNextLine()) {//mapowanie jeden obiek zamieniamy na drugi
                results[i] = mapToResult(scanner.nextLine());
                i++;
            }

        } catch (FileNotFoundException e) {//wyjatek dobrze opisywac exception
            e.printStackTrace();
        }
        return results;
    }

    public Result[] getTopResults(int n) {//zwraca nam tablice resultow
        Result[] resultsToReturn = new Result[n];
        try {
            Scanner scanner = new Scanner(fileWithResults);
            int loopSize = n < getSize() ? n : getSize();
            for (int i = 0; i < loopSize; i++) {
                resultsToReturn[i] = mapToResult(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resultsToReturn;
    }


    public void add(Result result) {
        try (FileWriter fw = new FileWriter(fileWithResults, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {//jezezli wystapi blad blik bedzie bledny uruchomi sie CATCH!!!
            out.println(result.toString());//robi adda do pliku zapisuje dana do pliku
        } catch (IOException e) {//lapiemy wyjatek i obslugujemy go
            e.printStackTrace();//wypisanie bledu ale nie bedzie to blad ale program idzie dalej
        }
    }

    //ta metoda mapuje stringa
    private Result mapToResult(String resultString) {// to co otrzymujemy to string spacja 0 wiec robimy to
        String[] split = resultString.split(" ");//split łączy elementy w tablicy i robim
        // naprzykład 3 trzech wyrazow jeden eleemnt w tablicy.
        return new Result(split[0], Integer.valueOf(split[1]));
    }

}

