gói  com.kiet2008110164.tuan02 ;

nhập  java.util.Scanner ;

 lớp  công cộng Lab2Bai1 {
    public  static  void  main ( String [] args ) {
        Hệ thống . ra ngoài . println ( " Nhập hệ thống số a và b: " );
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        float a = sc . nextFloat ();
        float b = sc . nextFloat ();
        if (a ==  0 ) {
            if (b ==  0 ) Hệ thống . ra ngoài . println ( " Phương trình vô nghiệm! " );
            khác  Hệ thống . ra ngoài . println ( " Phương trình vô nghiệm! " );
        }
        khác  Hệ thống . ra ngoài . println ( " Phương trình có nghiệm là: "  +  - b / a);
        sc . gần();
    }
    
}