public class InvalidValueException extends Exception
{
    public int value;
    
    public InvalidValueException(int value) {
        super("*** invalid rating!");
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
