package Aula7.codigoMorse;

public class program {
    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(parser.parse(".... --- .-.. .-"));
        System.out.println(parser.parse("-- . .-. -.-. .- -.. ---   .-.. .. -... .-. ."));
        System.out.println(parser.parse("... .--. .-. .. -. --."));
    }
}
