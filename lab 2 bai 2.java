gói  com.kiet2008110164.tuan02 ;

nhập  java.util.Scanner ;

 lớp  công cộng Lab2Bai2 {
    public  static  void  main ( String [] args ) {
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . println ( " Nhap 3 he so cua phuong trinh bac 2: " );
        Nhân đôi a = sc . nextDouble ();
        Nhân đôi b = sc . nextDouble ();
        Nhân đôi c = sc . nextDouble ();
        gấp đôi  Delta  =  Toán học . pow (b, 2 ) -  4 * a * c;
        Hệ thống . ra ngoài . println ( " Delta = "  +  Delta );
        if (a ==  0 ) {
            nếu (b ==  0 ) {
                if (c ==  0 ) Hệ thống . ra ngoài . println ( " Phương trình vô nghiệm! " );
                khác  Hệ thống . ra ngoài . println ( " Phương trình vô nghiệm! " );
            }
            khác  Hệ thống . ra ngoài . println ( " Phương trình có nghiệm là: "  +  - c / b);
        }
        else  if ( Delta  ==  0 ) Hệ thống . ra ngoài . println ( " Phương trình có kép x1 = x2 = "  +  - b / 2 * a);
        else  if ( Delta  > =  0 )   Hệ thống . ra ngoài . printf ( " x1 =% .2f \ n x2 =% .2f " , ( - b +  Math . sqrt ( Delta )) / 2 * a, ( - b -  Math . sqrt ( Delta )) / 2 * a);
        khác  Hệ thống . ra ngoài . println ( " Phương trình vô nghiệm! " );
        sc . gần();
    }
    
}