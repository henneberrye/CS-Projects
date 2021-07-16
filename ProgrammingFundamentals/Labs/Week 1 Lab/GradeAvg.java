// Exercise 1
public class GradeAvg {

  public static void main(String args[]) {

    /////// Declares quiz and test score percentages. //////////
    double QuizScore1=57;
    double QuizScore2=79;
    double QuizScore3=94;
    double TestScore1=90;
    double TestScore2=87;

    /////// Takes the avg of all quiz and test scores /////////
    double QuizScoreAvg=(QuizScore1+QuizScore2+QuizScore3)/3;
    double TestScoreAvg=(TestScore1+TestScore2)/2;

    ////// Prints the Quiz and Test Avg ///////
    System.out.println("Quiz Score Avg :"+QuizScoreAvg);
    System.out.println("Test Score Avg :"+TestScoreAvg);

  }

}
