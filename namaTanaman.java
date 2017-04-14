public class namaTanaman {
    public static void main(String [] args){
        Mawar TanamanMawar = new Mawar();
        PutriMalu TanamanPutriMalu = new PutriMalu();
        Anggrek TanamanAnggrek = new Anggrek();
        Melati TanamanMelati = new Melati();
        
        Tanaman t;
        System.out.println("Mawar");    
        t = TanamanMawar;
        t.nama();
        t.warna();
        

        System.out.println("Anggrek");
        t = TanamanAnggrek;
        t.nama();
        t.warna();
        

        System.out.println("PutriMalu");
        t = TanamanPutriMalu;
        t.nama();
        t.warna();
        

        System.out.println("Melati");
        t = TanamanMelati;
        t.nama();
        t.warna();
        
    }

}

