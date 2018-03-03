package G2.Lecture03;

public class SelfAss01 {

    public static void main(String[] args) {
        char[] stdAnswer;
        char[] solAnswer;
        stdAnswer = new char [] {'B', 'B', 'C', 'D'};
        solAnswer = new char[] {'B', 'B', 'C', 'D', 'A', 'A', 'A'};
        System.out.println(examChecking(stdAnswer,solAnswer));

    }

    public static int examChecking(char[] stdAnswer, char[] solAnswer) {
        int result = -1;
        if (stdAnswer.length == solAnswer.length) {
            result = 0;
            for (int i = 0; i < stdAnswer.length; i++) {
                if (stdAnswer[i] == solAnswer[i]) {
                    result++;
                }
            }

        }
        return result;
    }
}
