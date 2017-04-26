package PierwszeZadanie.oop.Quiz.result;

/**
 * Created by bartosz on 26.04.2017.
 */
public class MockResultsRepository {

    private Result[] results;

    public MockResultsRepository() {
        this.results = new Result[2];
        this.results[0] = new Result("Andrzej", 3);
        this.results[1] = new Result("Jan", 2);
        //dodac do results dodatkowo 2 wyniki
    }

    public Result[] getAllResults() {
        return results;
    }

    //ZADANIE DOMOWE
    //Napisac metode, podmienic w wyswietlaniu wynikow, i poprawic wyswietlanie wynikow
    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < results.length ? n : results.length;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

}
