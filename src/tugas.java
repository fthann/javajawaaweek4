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

    // Method untuk menanyakan lagi
    public String gambar(String tamu) {
        return "ooalah, iya " + tamu;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor dengan parameter
        Pensil benda1 = new Pensil("Pensil HD");
        benda1.jenisApa();
        System.out.println(benda1.gambar("nyed"));

        // Membuat objek menggunakan constructor tanpa parameter
        Pensil benda2 = new Pensil();
        benda2.jenisApa();
        System.out.println(benda2.gambar("nyong"));  
    }
}



