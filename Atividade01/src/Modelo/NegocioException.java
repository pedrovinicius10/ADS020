
package Modelo;

public class NegocioException extends Exception {

    public NegocioException(String message) {
        super(message);
    }

    public NegocioException(Throwable cause) {
        super(cause);
    }
    
}
