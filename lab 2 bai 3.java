gói  com.kiet2008110164.tuan02 ;

nhập  java.util.Scanner ;

 lớp  công cộng Lab2Bai3 {
    public  static  void  main ( String [] args ) {
        int soDien;
        Hệ thống . ra ngoài . print ( " Nhập số điện: " );
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        soDien = sc . nextInt ();
        if (soDien <=  50  & soDien > =  0 ) Hệ thống . ra ngoài . printf ( " Số tiền là:% .2f " , soDien * 1000 );
        khác  Hệ thống . ra ngoài . printf ( " Số tiền là:% .2f " , 50 * 1000  + (soDien -  50 ) * 1200 );
        sc . gần();
    }
}