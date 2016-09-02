/**
 * Created by Gerton on 31-Aug-16.
 */
public class purifyInput {
    private static purifyInput ourInstance = new purifyInput();

    public static purifyInput getInstance() {
        if(ourInstance == null) {
            ourInstance = new purifyInput();
        }
        return ourInstance;
    }

    public String purifyString(String dirty){
        String clean = dirty;

        return clean;
    }

    private purifyInput() {

    }
}
