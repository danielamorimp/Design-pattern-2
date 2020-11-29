
package ranking;


public class Tempo {
    private static Tempo instance;

    private Tempo() {

    }

    public synchronized static Tempo getInstance() {
        if (instance == null) {
            instance = new Tempo();
        }
         System.out.println("Daniel 15min");
         System.out.println("Gabriel 17min");
        return instance;
    }
}
