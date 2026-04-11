public class Main {

    public static void main(String[] args) {
        Gallery bojongsoang2025 = new Gallery();

        bojongsoang2025.addPicture("foto1.jpg");
        bojongsoang2025.addPicture("foto2.jpg");
        bojongsoang2025.addPicture("foto3.jpg");

        bojongsoang2025.currentPicture();
        bojongsoang2025.nextPicture();
        bojongsoang2025.nextPicture();
        bojongsoang2025.previousPicture();
        bojongsoang2025.previousPicture();
        bojongsoang2025.previousPicture();
        bojongsoang2025.currentPicture();
    }
}
