import java.util.LinkedList;

public class Playlist {

    private String playlistName;
    private LinkedList<String> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        playlist = new LinkedList<>();
    }

    public void show() {
        System.out.println(playlistName + ":");

        int n = 1;
        for (String piece : playlist) {
            System.out.println(n + ". " + piece);
            n++;
        }
    }

    public void add(String piece) {
        playlist.add(piece);
    }

    public void remove(String piece) {
        boolean success = playlist.remove(piece);

        if (success) {
            System.out.println(piece + " dihapus dari " + playlistName + " :(");
        } else {
            System.out.println("gagal menghapus! data tidak ditemukan");
        }
    }

    public void find(String piece) {
        System.out.println("Mencari: " + piece);

        if (playlist.contains(piece)) {
            System.out.println("Piece ketemu!");
            int position = playlist.indexOf(piece) + 1;
            System.out.println(position + ". " + piece);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }

    public void insertBefore(String targetPiece, String newPiece) {
        int targetIndex = playlist.indexOf(targetPiece);

        if (targetIndex == -1) {
            System.out.println(
                "gagal menyisipkan! " + targetPiece + " tidak ditemukan"
            );
            return;
        }

        playlist.add(targetIndex, newPiece);
        System.out.println(newPiece + " ditambahkan sebelum " + targetPiece);
    }
}
