package part_two;

public class NotFoundAnswerException extends Exception{

    public NotFoundAnswerException(String text) {
        super(text);
    }
}
