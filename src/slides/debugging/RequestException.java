package slides.debugging;

public class RequestException extends RuntimeException {

    public RequestException(String type, Throwable throwable) {
        super("Request failed: "+ type, throwable);
    }
}
