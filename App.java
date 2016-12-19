public class App {

    public static void main(String[] args) {
        StreamUtils.rewriteInDiffEncoding(args[0], "UTF-16", args[1], "Cp1251");
    }
}
