package chess;

public class chessException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public chessException(String msg) {
        super(msg);
    }
}
