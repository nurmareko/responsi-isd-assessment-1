public class Main {

    public static void main(String[] args) {
        Playlist violinPlaylist = new Playlist("Playlist Biola Kaori");

        String piece1 = "Caprice in A minor OP.1 No.5";
        String piece2 = "The Last Rose of Summer, Etude No.6";
        String piece3 = "Introduction and Rondo Capriciosso";

        violinPlaylist.add(piece1);
        violinPlaylist.add(piece2);
        violinPlaylist.add(piece3);
        violinPlaylist.insertBefore(
            piece2,
            "Violin Sonata No.9 in A major OP.47"
        );

        violinPlaylist.show();
        System.out.println();

        violinPlaylist.find("Liebestraum No.3");
        System.out.println();

        violinPlaylist.find(piece2);
    }
}
