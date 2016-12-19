import java.io.*;

public class StreamUtils {

    public static void rewriteInDiffEncoding(String sourceFile, String sourceEncoding,
                                             String rewritableFile, String rewritbleEncoding) {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(sourceFile), sourceEncoding));
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(rewritableFile), rewritbleEncoding));

            String str = reader.readLine();
            while (str != null) {
                writer.write(str + "\n");
                str = reader.readLine();

            }
            reader.close();
            writer.close();

        } catch (UnsupportedEncodingException e) {
            System.exit(0);
        } catch (FileNotFoundException e) {
            System.exit(0);
        } catch (IOException e) {
            System.exit(0);
        }
    }

}
