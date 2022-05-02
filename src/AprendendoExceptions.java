public class AprendendoExceptions {

    public static void main(String[] args) {


        //   ---- Exemplo de Try Catch Básico ----
        try{
            int resultado = 100/0;
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }

        //   ---- Exemplo de Multi Catch ----
        try{
            int resultado = 100/0;
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }

        //   ---- Exemplo de Finally ----
        try{
            int resultado = 100/0;
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }finally {
            System.out.println("Bloco Finally: Acabou...");
        }


        //Usando Minha Exception Personalizada
        try{
            System.out.println("Começando o bloco");
            throw new MinhaException("Meu erro...");
        } catch (MinhaException e) {
            e.printStackTrace();
        }



        //   ---- Principais Métodos de Exception ----
        MinhaException minhaException = new MinhaException("Meu Erro Personalizado");

        //Pega a mensagem
        minhaException.getMessage();
        //Pega a causa
        minhaException.getCause();
        //Chama o toString
        minhaException.toString();
        //Printa a stack do erro
        minhaException.printStackTrace();
        //Para saber onde exatamente a exception foi lançada
        minhaException.fillInStackTrace();



        // ---- Cenários Comuns ----


        // -> ArithmeticException
        try {
            int a = 50/0;
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }

        // -> NullPointerException
        try {
            String b = null;
            System.out.println(b.length());
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }

        // -> NumberFormatException
        try{
            String abc = "abc";
            int i = Integer.parseInt(abc);
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
        }

        // -> ArrayIndexOutOfBoundsException
        try{
            int vetor[] = new int[5];
            vetor[10] = 50;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }




    }

    //Exemplo de Método com Throw
    void metodoThrow(){
        throw new ArithmeticException("Incorrect");
    }

    //Exemplo de Método com Throws
    void metodoThrows() throws ArithmeticException{

    }

    //Exemplo de Método com Throw e Throws
    void metodoThrowEThrows() throws ArithmeticException{
        throw new ArithmeticException("Incorrect");
    }



}
