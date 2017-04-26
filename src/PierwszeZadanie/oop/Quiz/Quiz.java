package PierwszeZadanie.oop.Quiz;


import PierwszeZadanie.oop.Quiz.question.MockQuestionsRepository;
import PierwszeZadanie.oop.Quiz.question.Question;
import PierwszeZadanie.oop.Quiz.result.MockResultsRepository;
import PierwszeZadanie.oop.Quiz.result.Result;

/**
 * Created by bartosz on 26.04.2017.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        MockResultsRepository resultsRepository = new MockResultsRepository();
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
