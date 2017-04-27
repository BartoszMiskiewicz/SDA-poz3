package PierwszeZadanie.oop.Quiz;

import PierwszeZadanie.oop.Quiz.question.FileQuestionsRepository;
import PierwszeZadanie.oop.Quiz.question.Question;
import PierwszeZadanie.oop.Quiz.question.QuestionsRepository;
import PierwszeZadanie.oop.Quiz.result.FileResultsRepository;
import PierwszeZadanie.oop.Quiz.result.Result;

import java.io.FileNotFoundException;

/**
 * Created by bartosz on 26.04.2017.
 */
public class Test {
    public static void main(String[] args) {
//        FileResultsRepository repository = new FileResultsRepository("/Volumes/Dane/JavaProgramowanie/results");
//        Result[] allResults = repository.getAllResults();
//        repository.add(new Result("Agnieszka", 2));
//        Result[] allResults1 = repository.getAllResults();
//        Result[] topResults = repository.getTopResults(10);
//    }
        QuestionsRepository questionsRepository = new FileQuestionsRepository("/Volumes/Dane/JavaProgramowanie/quiz");
    }

}
