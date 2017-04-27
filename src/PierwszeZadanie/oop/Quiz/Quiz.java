package PierwszeZadanie.oop.Quiz;

import PierwszeZadanie.oop.Quiz.question.FileQuestionsRepository;
import PierwszeZadanie.oop.Quiz.question.MockQuestionsRepository;
import PierwszeZadanie.oop.Quiz.question.Question;
import PierwszeZadanie.oop.Quiz.question.QuestionsRepository;
import PierwszeZadanie.oop.Quiz.result.FileResultsRepository;
import PierwszeZadanie.oop.Quiz.result.FileResultsRepository;
import PierwszeZadanie.oop.Quiz.result.Result;
import PierwszeZadanie.oop.Quiz.result.ResultsRepository;


/**
 * Created by bartosz on 26.04.2017.
 */
public class Quiz {
    public static void main(String[] args) {
//        QuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuestionsRepository questionsRepository = new FileQuestionsRepository("/Volumes/Dane/JavaProgramowanie/quiz");
        ResultsRepository resultsRepository = new FileResultsRepository("/Volumes/Dane/JavaProgramowanie/results");
        QuizInterface quizInterface = new QuizInterface();


        boolean gameFlag = true;
//        int decision = 0;
//        while(decision != 0) {
        while(gameFlag) {
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:
                    String playerName = quizInterface.insertName();
                    quizInterface.beforeStart();

                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswersCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInterface.showQuestion(questions[i]);
                        if (result) {
                            quizInterface.correctAnswer();
                            correctAnswersCounter++;
                        } else {
                            quizInterface.incorrectAnswer();
                        }
                    }

                    Result result = new Result(playerName, correctAnswersCounter);
                    quizInterface.showResult(result);
                    resultsRepository.add(result);
                    break;
                case 2:
                    quizInterface.showTopResults(resultsRepository.getTopResults(10));
                    break;
                case 0:
                    gameFlag = false;
                    break;
                default:
                    System.out.println("Wrong decision");
            }
        }
        quizInterface.afterGameEnded();
    }
}
