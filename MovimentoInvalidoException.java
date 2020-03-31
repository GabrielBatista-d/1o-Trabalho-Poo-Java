package atv1;
public class MovimentoInvalidoException extends Exception{
    protected int m;

    public MovimentoInvalidoException(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Este movimento é inválido";
    }
    
    
}
