public class Tanaman{
    String nama;
    String warna;
    
    public void nama(){
        System.out.println("Nama Tanaman");
    }
    
    public void warna(){
        System.out.println("Warna Tanaman");
    }
    

}

class Mawar extends Tanaman{

    public void nama(){
        System.out.println("Tanaman Mawar");
    }
    
    public void warna(){
        System.out.println("Merah");
        System.out.println("*****************");
    }
    
}

class PutriMalu extends Tanaman{

    public void nama(){
        System.out.println("Tanaman PutriMalu");
    }
    
    public void warna(){
        System.out.println("Hijau");
        System.out.println("*****************");
    }
    
}

class Anggrek extends Tanaman{

    public void nama(){
        System.out.println("Tanaman Anggrek");
    }
    
    public void warna(){
        System.out.println("Ungu");
        System.out.println("***************");
    }
    
}

class Melati extends Tanaman{

    public void nama(){
        System.out.println("Tanaman Melati");
    }
    
    public void warna(){
        System.out.println("Putih");
        System.out.println("****************");
    }
    
}
