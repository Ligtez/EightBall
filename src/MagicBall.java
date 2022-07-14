import java.sql.SQLOutput;

public class MagicBall {
    String answer1 = "It is certain.";
    String answer2 = "It is decidedly so.";
    String answer3 = "Without a doubt.";
    String answer4 = "Outlook good.";
    String answer5 = "Most likely.";
    String answer6 = "Cannot predict now.";
    String answer7 = "My reply is no.";
    String answer8 = "Very doubtful.";

    public MagicBall() {
    }

    public void answer() {
        int numberOfTheAnswer = (int) (Math.random() * 8) + 1;

        if (numberOfTheAnswer == 1) {
            System.out.println(answer1);
        } else if (numberOfTheAnswer==2) {
            System.out.println(answer2);
        } else if (numberOfTheAnswer==3) {
            System.out.println(answer3);
        } else if (numberOfTheAnswer==4) {
            System.out.println(answer4);
        } else if (numberOfTheAnswer==5) {
            System.out.println(answer5);
        } else if (numberOfTheAnswer==6) {
            System.out.println(answer6);
        } else if (numberOfTheAnswer==7) {
            System.out.println(answer7);
        } else if (numberOfTheAnswer==8) {
            System.out.println(answer8);
        } else {
            System.out.println("Erro: o random number está marado");
        }

    }
}
