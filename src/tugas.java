class Pensil {
    public String benda;

    // Constructor dengan parameter
    public Pensil(String bendaPensil) {
        this.benda = bendaPensil; // menggunakan 'this' untuk merujuk ke field kelas
    }

    // Constructor tanpa parameter (default constructor)
    public Pensil() {
        this.benda = "Pensil 2B";
    }

    // Method untuk memakai benda apa
    public void jenisApa() {
        System.out.println("aku menggambar menggunakan " + benda);
    }

    // Method untuk meng iyakan
    public String gambar(String panggilan) {
        return "ooalah, iya " + panggilan;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor dengan parameter
        Pensil benda1 = new Pensil("Pensil HD");
        benda1.jenisApa();
        System.out.println(benda1.gambar("bro"));

        // Membuat objek menggunakan constructor tanpa parameter
        Pensil benda2 = new Pensil();
        benda2.jenisApa();
        System.out.println(benda2.gambar("nyong"));  
    }
}



