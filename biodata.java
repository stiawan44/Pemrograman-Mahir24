public class Main {
    public static void main(String[] args) {
        String nama = "Dendi Setiawan";
        String hobi = "Membaca Buku";

        String border = "===================================";
        System.out.println(border);
        System.out.println("BIODATA PRIBADI");
        System.out.println(border);
        System.out.printf("%-10s : %s\n", "Nama", nama);
        System.out.printf("%-10s : %s\n", "Hobi", hobi);
        System.out.println(border);
    }
}
