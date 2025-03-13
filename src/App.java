        class Asimo {
            public String nama;
        
            // Constructor dengan parameter
            public Asimo(String namaAsimo) {
                this.nama = namaAsimo; // menggunakan 'this' untuk merujuk ke field kelas
            }
        
            // Constructor tanpa parameter (default constructor)
            public Asimo() {
                this.nama = "Asimo Putih";
            }
        
            // Method untuk memperkenalkan diri
            public void kenalkanDiri() {
                System.out.println("Namaku " + nama);
            }
            
            // Method untuk memberi salam
            public String beriSalam(String tamu) {
                return "Hallo " + tamu;
            }
        
            // Main method untuk menjalankan program
            public static void main(String[] args) {
                // Membuat objek menggunakan constructor dengan parameter
                Asimo robot1 = new Asimo("Asimo Merah");
                robot1.kenalkanDiri();
                System.out.println(robot1.beriSalam("Budi"));
        
                // Membuat objek menggunakan constructor tanpa parameter
                Asimo robot2 = new Asimo();
                robot2.kenalkanDiri();
                System.out.println(robot2.beriSalam("Ani"));  
            }
        }


