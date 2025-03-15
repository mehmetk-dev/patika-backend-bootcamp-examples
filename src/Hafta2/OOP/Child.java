package Hafta2.OOP;

public class Child extends Parent {

    String message = "Message From Child";

    public Child(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
