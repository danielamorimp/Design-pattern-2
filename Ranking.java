public class Ranking {
    private static Ranking instance;

    private Ranking() {

    }

    public synchronized static Ranking getInstance() {
        if (instance == null) {
            instance = new Ranking();
        }
        System.out.println("=====RANKIG====");
        System.out.println("Daniel 15min");
        System.out.println("Gabriel 17min");
        return instance;
    }
}
