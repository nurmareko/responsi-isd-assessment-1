import java.util.LinkedList;
import java.util.ListIterator;

public class Gallery {

    private LinkedList<String> pictures;
    private ListIterator<String> pictureIterator;
    private boolean isGoingForward;

    public Gallery() {
        pictures = new LinkedList<>();
        isGoingForward = true;
    }

    public void addPicture(String picture) {
        pictures.add(picture);
        pictureIterator = pictures.listIterator();
    }

    public void currentPicture() {
        // Untuk kasus ketika galeri nya kosong
        if (pictures.isEmpty()) {
            System.out.println("Galeri kosong.");
            return;
        }

        // Variable untuk mendeteksi galeri pertamakali dibuka.
        // Karena ListIterator selalu mulai tepat SEBELUM foto pertama,
        // kondisi ini memastikan iterator maju selangkah
        // agar foto pertama bisa ditampilkan.
        boolean hasNotViewedFirstPhoto =
            isGoingForward &&
            !pictureIterator.hasPrevious() &&
            pictureIterator.hasNext();

        // Untuk kasus ketika baru pertama kali galerinya dibuka
        if (hasNotViewedFirstPhoto) {
            System.out.println("Foto saat ini: " + pictureIterator.next());
            return;
        }

        // Kasus normal ;)
        String current = peekCurrentPicture();
        if (current != null) {
            System.out.println("Foto saat ini: " + current);
        }
    }

    // Fungsi helper buat lihat foto saat ini tanpa ngerusak posisi iteratornya.
    // Ibaratnya kita maju/mundur selangkah cuma buat ngecek, terus balik lagi ke tempat semula.
    private String peekCurrentPicture() {
        if (isGoingForward && pictureIterator.hasPrevious()) {
            String current = pictureIterator.previous();
            pictureIterator.next();
            return current;
        } else if (!isGoingForward && pictureIterator.hasNext()) {
            String current = pictureIterator.next();
            pictureIterator.previous();
            return current;
        } else {
            return null;
        }
    }

    public void nextPicture() {
        if (pictures.isEmpty()) {
            System.out.println("Galeri kosong.");
            return;
        }

        // Untuk skip foto saat ini agar foto yang sama tidak muncul 2x
        if (!isGoingForward) {
            if (pictureIterator.hasNext()) {
                pictureIterator.next();
            }
            isGoingForward = true;
        }

        if (pictureIterator.hasNext()) {
            System.out.println("Next -> " + pictureIterator.next());
        } else {
            System.out.println("Next -> Tidak ada foto selanjutnya");
        }
    }

    public void previousPicture() {
        if (pictures.isEmpty()) {
            System.out.println("Galeri kosong.");
            return;
        }

        // Untuk skip foto saat ini agar foto yang sama tidak muncul 2x
        if (isGoingForward) {
            if (pictureIterator.hasPrevious()) {
                pictureIterator.previous();
            }
            isGoingForward = false;
        }

        if (pictureIterator.hasPrevious()) {
            System.out.println("Previous -> " + pictureIterator.previous());
        } else {
            System.out.println("Previous -> Tidak ada foto sebelumnya");
        }
    }
}
