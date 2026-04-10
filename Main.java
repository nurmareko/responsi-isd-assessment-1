public class Main {

    public static void main(String[] args) {
        Playlist violinPlaylist = new Playlist("Playlist Biola Kaori");

        String piece1 = "Caprice in A minor OP.1 No.5";
        String piece2 = "The Last Rose of Summer, Etude No.6";
        String piece3 = "Introduction and Rondo Capriciosso";

        violinPlaylist.add(piece1);
        violinPlaylist.add(piece2);
        violinPlaylist.add(piece3);
        System.out.println();

        violinPlaylist.show();
        System.out.println();

        violinPlaylist.remove(piece1);
        System.out.println();

        violinPlaylist.show();
        System.out.println();

        violinPlaylist.find(piece1);
        violinPlaylist.find(piece2);
        System.out.println();

        violinPlaylist.insertBefore(
            piece3,
            "Violin Sonata No.9 in A major OP.47"
        );
        System.out.println();
        violinPlaylist.show();
    }
}
