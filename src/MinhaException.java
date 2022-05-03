public class MinhaException extends Exception {

    private String mensagem;

    public MinhaException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "MinhaException Ocorreru: " + mensagem;
    }
}
