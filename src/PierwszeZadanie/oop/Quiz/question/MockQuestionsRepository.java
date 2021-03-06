package PierwszeZadanie.oop.Quiz.question;

/**
 * Created by bartosz on 26.04.2017.
 */
public class MockQuestionsRepository implements QuestionsRepository {
    public Question[] getQuestions() {
        Question[] questions = new Question[3];
        String[] answers = {"22", "33", "44", "55"};
        String[] answers2 = {"7", "4", "2", "0"};
        String[] answers3 = {"Lublin", "Warszawa", "Krakow", "Poznan"};
        questions[0] = new Question("Ile lat ma prezydent", 2, answers);
        questions[1] = new Question("Ile jest 2 * 2", 1, answers2);
        questions[2] = new Question("Co jest stolica Wielkopolski", 3, answers3);
        return questions;
    }
}
