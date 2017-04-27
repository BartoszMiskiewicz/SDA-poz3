package PierwszeZadanie.oop.Quiz.result;

/**
 * Created by bartosz on 27.04.2017.
 */
public interface ResultsRepository {
    Result[] getAllResults();
    Result[] getTopResults(int n);
    void add(Result result);
}
