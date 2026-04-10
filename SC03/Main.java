public class Main {

    public static void main(String[] args) {
        BrowsingHistory animeHistory = new BrowsingHistory();

        animeHistory.visit("gogoanime.id/episode1");
        animeHistory.visit("gogoanime.id/episode2");
        animeHistory.visit("gogoanime.id/episode3");
        System.out.println();

        animeHistory.back();
        animeHistory.back();
        animeHistory.forward();
        System.out.println();

        animeHistory.visit("gogoanime.id/episode4");
        animeHistory.forward();
    }
}
