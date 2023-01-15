package test;

public class NombreNegatifException extends Exception {
int errorval;
    public NombreNegatifException(String message) {
        super(message);
    }

    public NombreNegatifException(String message, int errorval) {
        super(message);
        this.errorval = errorval;
    }

    public int getErrorval() {
        return errorval;
    }
}
