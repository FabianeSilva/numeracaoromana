package numeracaoromana;

public class Main {

    public static void main(String[] args) {
        ConversorNumeracaoRomana conversor = new ConversorNumeracaoRomana();

        String teste = conversor.converterNumero(25);

        System.out.println(teste);
    }

}
