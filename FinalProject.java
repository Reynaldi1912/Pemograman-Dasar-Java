import java.util.Scanner;

/**
 * FinalProject
 */
public class FinalProject {

    static int ongkir []= new int[3];
    static int Harga_Packaging[]={3000,5000,7000};
    static String Provinsi[] = {"Jawa Timur","Jawa Tengah","Jawa Barat"};
    static String Kota[][]={
        {"Banyuwangi","Jember","Lumajang","Probolinggo","Pasuruan","Malang","Surabaya"},//Jawatimur
        {"Sragen","Surakarta","Boyolali","Salatiga","Semarang","Yogyakarta"},//JawaTengah
        {"Cirebon","Tasikmalaya","Bandung","Sukabumi","Bogor","Bekasi",}//JawaBarat
    };
    static String Kecamatan[][][]={
        {
            {"Pesanggaran","Bangorejo","TegalDlimo","Glagahagung","Genteng"},//Banyuwangi
            {"Ambulu","Kencong","Kaliwates","Tanggul","Umbulsari"},//Jember
            {"Jatiroto","Sukodono","Kedungjajang","Pasirian","Klakah"},//Lumajang
            {"Bantaran","Banyuanyar","Besuk","Dringu","Gading"},//Probolinggo
            {"Bangil","Beji","Gempol","Grati","Pandaan"},//Pasuruan
            {"Blimbing","Kedungkandang","Klojen","Lowokwaru","Sukun"},//Malang
            {"Asemrowo","Benowo","Dukuh Pakis","Gayungan","Gubeng"}//Surabaya
        },//Jawa Timur
        {
            {"Gemolong","Gesi","Gondang","Jenar","kalijambe"},//Sragen
            {"Banjarsari","jebres","Laweyan","Pasar Kliwon","Serengan"},//Surakarta
            {"Ampel","Andong","Banyudono","Boyolali","Cepogo"},//Boyolali
            {"Banjarmangu","Purwanegara","Bawang","Kalibening","Madukara"},//Banjarnegara
            {"Banyumanik","Candisari","Genuk","Gunungpati","Mijen"},//Semarang
            {"Bantul","Dlingo","Kretek","Pajangan","Pandak"}//Yogyakarta
        },
        {
            {"Babakan","Arjawinangun","Bulak","Geyongan","Jungjang"},//Cirebon
            {"Bungursari","Cihideung","Kawalu","Mangkubumi","Tawang"},//Tasikmalaya
            {"Andir","Astana Anyar","Antapani","Arcamanik","Cibiru"},//Bandung
            {"Bantargadung","Caringin","Ciambar","Cibadak","Cibitung"},//Sukabumi
            {"Babakan Madang","Bojong Gede","Caringin","Cibinong","Ciawi"},//Bogor
            {"Bantar Gebang","Bekasi barat","Bekasi Timur","Jatisampur","Jatiasih"},//Bekasi
            
        }
        
    };

    static Double Koordinat_Kecamatan[][][][]={
        {
            {
                {-8.589310, 114.082932},{-8.467500, 114.163530},{-8.521620, 114.296921},{-8.512040, 114.241250},{-6.631300, 106.805649}//BANYUWANGI
            },
            {
                {-8.331020, 113.618401},{-8.254550, 113.386726},{-8.186000, 113.662550},{-8.167240, 113.463410},{-8.258930, 113.467613}//Jember
            },
            {
                {-8.116640, 113.320640},{-8.077830, 113.236500},{-8.043310, 113.245260},{-8.207980, 113.116380},{-7.989910, 113.268700}//Lumajang
            },
            {
                {-7.882710, 113.191580},{-7.829900, 113.293400},{-7.749670, 113.448020},{-7.753410, 113.253050},{-7.871510, 113.495350}//Probolinggo
            },
            {
                {-7.604870, 112.823959},{-7.595570, 112.765180},{-7.713440, 112.980000},{-7.747310, 112.991510},{-7.650300, 112.705704},//Pasuruan
            },
            {
                {-7.950610, 112.642670},{-8.000520, 112.652786},{-7.985020, 112.629097},{-7.960300, 112.632988},{-7.985540, 112.623947},//Malang
            },
            {
                {-7.246010, 112.707080},{-7.249860, 112.643356},{-7.295510, 112.712288},{-7.331170, 112.724800},{-7.273960, 112.748177}//Surabaya
            }//Jawa Timur
        },
        {
            {
                {-7.397030, 110.826650},{-7.330880, 111.007470},{-7.408240, 111.113240},{-7.302960, 111.127150},{-7.435370, 110.808120},//Sragen
            },
            {
                {-7.552300, 110.821280},{-7.564630, 110.857170},{-7.547210, 110.779350},{-7.579680, 110.830719},{-7.580825, 110.815079},//Surakarta
                
            },
            {
                {-7.511905, 110.514703},{-7.364868, 110.751744},{-7.544279, 110.328306},{-7.534408, 110.604194},{-7.497270, 110.522507}//Boyolali
            },
            {
                {-7.368539, 109.683318},{-7.360793, 109.657177},{-7.397463, 109.624881},{-7.249652, 109.646395},{-7.364246, 109.747309}//Banjarnegara
            },
            {
                {-7.068023, 110.420127},{-7.014316, 110.430838},{-6.965503, 110.477727},{-7.092624, 110.354571},{-7.065660, 110.33701}//Semarang
            },
            {
                {-7.885930, 110.330490},{-7.950800, 110.469500},{-7.992490, 110.315190},{-7.872480, 110.289710},{-7.917390, 110.284460}//Yogyakarta
            }//Jawatengah
        },
        {
            {
                {-6.848980, 108.722954},{-6.652540, 108.411470},{-6.668620, 108.442890},{-6.668120, 108.410330},{-6.649800, 108.424250}//Cirebon
            },
            {
                {-7.302730, 108.165352},{-7.348260, 108.217667},{-7.371360, 108.216570},{-7.360740, 108.197441},{-7.655930, 108.312897}//Tasikmalaya
            },
            {
                {-6.909290, 107.576591},{-6.938620, 107.602150},{-6.917840, 107.660492},{-6.914300, 107.674377},{-6.915000, 107.724281}//Bandung
            },
            {
                {-6.979230, 106.701820},{-6.783540, 106.764920},{-6.825125, 106.786768},{-6.877660, 106.776413},{-7.359320, 106.657250}//Sukabumi
            },
            {
                {-6.560040, 106.867523},{-6.508180, 106.783142},{-6.707790, 106.822731},{-6.483290, 106.851051},{-6.640210, 106.834450}//Bogor
            },
            {
                {-6.351890, 107.018539},{-6.243310, 106.993721},{-6.241080, 107.034126},{-6.361000, 106.926300},{-6.310138, 106.953568}//Bekasi
            },//JawaBarat
        }
        //Provinsi
    };

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    boolean ulang_pembayaran = false , lanjut = false;
    char lanjut1 , lanjut2 ;
    String Nama_Pengirim , No_Hp_Pengirim,Nama_Penerima , No_Hp_Penerima , Jenis_Barang , Alamat_Detail1 , Alamat_Detail2;
    int Provinsi_Pengirim , Kota_Pengirim , Kecamatan_Pengirim , Provinsi_Penerima , Kota_Penerima , Kecamatan_Penerima , Pilih_Jasa,Jenis_Packaging ,total=0 , uang ,
    ongkir1 =0 , ongkir2 =0 , ongkir3 =0 , kembalian;
    String Jasa_Pengiriman[]={"Kilat Express(1-4 hari)","Kilat(2-7 hari)        ","Regular(3-10 hari)     "};
    String Packaging []= {"Kardus                 ","Kayu                   ","Bubblewrap             "};
        
       
        do{
           
            sc.nextLine();
            System.out.println("__________DATA PENGIRIM__________");
            System.out.print("Masukan Nama Pengirim :");
            Nama_Pengirim = sc.nextLine();
            System.out.print("Masukan No.Hp Pengirim :+62");
            No_Hp_Pengirim = sc.nextLine();

            do{
                for (int i = 0; i < Provinsi.length; i++) {
                    System.out.println((i+1)+"."+Provinsi[i]);   
                }
                System.out.print("Masukan Provinsi Pengirim :");
                Provinsi_Pengirim = sc.nextInt();
                    if(Provinsi_Pengirim > 0 && Provinsi_Pengirim <= Provinsi.length){
                        lanjut = false;
                    }else{
                        System.out.println("________________________________");
                        System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                            lanjut = true;
                    }
            }while(lanjut);

            do{
                System.out.println();
                    for (int i = 0; i < Kota[Provinsi_Pengirim-1].length; i++) {
                        System.out.println((i+1)+"."+Kota[Provinsi_Pengirim-1][i]);
                    }
                System.out.print("Masukan Kota Pengirim     :");
                    Kota_Pengirim = sc.nextInt();
                if(Kota_Pengirim > 0 && Kota_Pengirim <= Kota[Provinsi_Pengirim-1].length){
                    lanjut = false;
                }else{
                    System.out.println("________________________________");
                    System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                        lanjut = true;
                }
            }while(lanjut);
            System.out.println();
            
            do{
                for (int i = 0; i < Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1].length; i++) {
                    System.out.println((i+1)+"."+Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1][i]);
                }
                System.out.print("Masukan Kecamatan Pengirim  :");
                    Kecamatan_Pengirim = sc.nextInt();
                if(Kecamatan_Pengirim > 0 && Kecamatan_Pengirim <= Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1].length){
                    lanjut = false;
                }else{
                    System.out.println("________________________________");
                    System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                        lanjut = true;
                }
            }while(lanjut);
            sc.nextLine();
            System.out.print("Alamat Detail (kelurahan/desa/jalan/no.rumah) :");
            Alamat_Detail1 = sc.nextLine();

            System.out.println();
            System.out.println("-----------------------------------------------------------");
            printData(Nama_Pengirim, No_Hp_Pengirim, Alamat_Detail1, Provinsi_Pengirim , Kota_Pengirim , Kecamatan_Pengirim);

            System.out.print("Apakah Anda Yakin dengan data diatas ?(y/t) :");
            lanjut1 = sc.next().charAt(0);
    
        }while(lanjut1=='t');

//--------------------------------------------------------------------------------------------------------------------//
        do{
            sc.nextLine();
            System.out.println();
            System.out.println("__________DATA PENERIMA__________");
            System.out.print("Masukan Nama Penerima :");
            Nama_Penerima = sc.nextLine();
    
            System.out.print("Masukan No.Hp Penerima :+62");
            No_Hp_Penerima = sc.nextLine();
            do{
                for (int i = 0; i < Provinsi.length; i++) {
                    System.out.println((i+1)+"."+Provinsi[i]);   
                }
                System.out.print("Masukan Provinsi Penerima :");
                Provinsi_Penerima = sc.nextInt();
                    if(Provinsi_Penerima > 0 && Provinsi_Penerima <= Provinsi.length){
                        lanjut = false;
                    }else{
                        System.out.println("________________________________");
                        System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                            lanjut = true;
                    }
                }while(lanjut);
        
        do{
                System.out.println();
                for (int i = 0; i < Kota[Provinsi_Penerima-1].length; i++) {
                    System.out.println((i+1)+"."+Kota[Provinsi_Penerima-1][i]);
                }
                System.out.print("Masukan Kota Penerima     :");
                    Kota_Penerima = sc.nextInt();
                if(Kota_Penerima > 0 && Kota_Penerima <= Kota[Provinsi_Penerima-1].length){
                    lanjut = false;
                }else{
                    System.out.println("________________________________");
                    System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                        lanjut = true;
                }
        }while(lanjut);
            
            System.out.println();
            do{
                for (int i = 0; i < Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1].length; i++) {
                    System.out.println((i+1)+"."+Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1][i]);
                }
                System.out.print("Masukan Kecamatan Penerima  :");
                    Kecamatan_Penerima = sc.nextInt();
                if(Kecamatan_Penerima > 0 && Kecamatan_Penerima <= Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1].length){
                    lanjut = false;
                }else{
                    System.out.println("________________________________");
                    System.out.println("Pilihan Tidak Ada , Masukan Lagi");
                        lanjut = true;
                }
            }while(lanjut);

            sc.nextLine();
            System.out.print("Alamat Detail (kelurahan/desa/jalan/no.rumah) :");
            Alamat_Detail2 = sc.nextLine();

            System.out.println();
    
            printData(Nama_Penerima, No_Hp_Penerima, Alamat_Detail2, Provinsi_Penerima , Kota_Penerima , Kecamatan_Penerima);
    
            System.out.println();
            System.out.print("Apakah Anda Yakin dengan data diatas ?(y/t) :");
            lanjut2 = sc.next().charAt(0);

        }while(lanjut2=='t');

        double lat1 = Koordinat_Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1][Kecamatan_Pengirim-1][0];
        double lon1 = Koordinat_Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1][Kecamatan_Pengirim-1][1];
        double lat2 = Koordinat_Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1][Kecamatan_Penerima-1][0];
        double lon2 = Koordinat_Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1][Kecamatan_Penerima-1][1];

        //Perhitungan jarak
        double hasil =(int) distance_Between_LatLong(lat1, lon1, lat2, lon2);
        double doubleValue = hasil;
        long Ongkir_Long = Math.round(doubleValue);
        int intValue = (int) Ongkir_Long;
      
        //perhitungan obgkir
        ongkir1 = intValue*50;
        ongkir2 = intValue*80;
        ongkir3 = intValue*100;

        ongkir[0]=ongkir3;
        ongkir[1]=ongkir2;
        ongkir[2]=ongkir1;

    do{
            for (int i = 0; i < Jasa_Pengiriman.length; i++) {
                System.out.println((1+i)+"."+Jasa_Pengiriman[i]+" Rp."+ ongkir[i]);
            }
        System.out.print("Masukan Jasa Pengiriman : ");
        Pilih_Jasa = sc.nextInt();
        if(Pilih_Jasa > 0 && Pilih_Jasa <= Jasa_Pengiriman.length){
            lanjut = false;
        }else{
            System.out.println("Pilihan Tidak Ada , Masukan Lagi");
            lanjut = true;
        }
    }while(lanjut);

        System.out.println();
        System.out.print("Masukan Jenis Barang yang akan dikirim :");
        Jenis_Barang = sc.next();
        System.out.print("Masukan Berat Barang (kg): ");
        float Berat_Barang = sc.nextFloat();

        float Berat =Math.round(Berat_Barang);
        int hasil_berat = (int)Berat;
        int Biaya_Berat = hasil_berat*2000;
    
    do{
        System.out.println();
            for (int i = 0; i < Packaging.length; i++) {
                System.out.println((1+i)+"."+Packaging[i]+" Rp."+Harga_Packaging[i]);
            }
        System.out.print("Pilih Jenis Packaging   : ");
        Jenis_Packaging = sc.nextInt();
        if(Jenis_Packaging > 0 && Jenis_Packaging <= Packaging.length){
            lanjut = false;
        }else{
            System.out.println("Pilihan Salah , Masukan Pilihan Yang Benar");
            lanjut = true;
        }
    }while(lanjut);

        total = Total_Biaya(Jenis_Packaging, ongkir, Biaya_Berat , Pilih_Jasa);

        System.out.println();
        System.out.println("********************************************************************");
        System.out.println("Nama Pengirim     :"+Nama_Pengirim);
        System.out.println("No.HP pengirim    :+62"+No_Hp_Pengirim);
        System.out.println("Alamat Pengirim   :"+Alamat_Detail1);
        System.out.println("                   "+Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1][Kecamatan_Pengirim-1]+","+Kota[Provinsi_Pengirim-1][Kota_Pengirim-1]+","+Provinsi[Provinsi_Pengirim-1]);
        System.out.println("*********************************************************************");
        System.out.println("Nama Penerima     :"+Nama_Penerima);
        System.out.println("No.HP Penerima    :+62"+No_Hp_Penerima);
        System.out.println("Alamat Penerima   :"+Alamat_Detail2);
        System.out.println("                   "+Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1][Kecamatan_Penerima-1]+","+Kota[Provinsi_Penerima-1][Kota_Penerima-1]+","+Provinsi[Provinsi_Penerima-1]);
        System.out.println("*********************************************************************");
        System.out.println("Jenis Barang      :"+Jenis_Barang);
        System.out.println("Berat             :"+Berat_Barang+"kg                   : Rp"+Biaya_Berat);
        System.out.println("Jenis Packaging   :"+Packaging[Jenis_Packaging-1]+" : Rp"+Harga_Packaging[Jenis_Packaging-1]);
        System.out.println("Jasa Pengiriman   :"+Jasa_Pengiriman[Pilih_Jasa-1]+" : Rp"+ongkir[Pilih_Jasa-1]);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total                                      : Rp"+total);
        
        
    do{
        System.out.println();
        System.out.print("Masukan Uang Anda : Rp.");
        uang = sc.nextInt();

        kembalian = uang - total ;
        if(uang >= total){
            if(uang >= total){
            System.out.println();
            System.out.println("********************************************************************");
            System.out.println("Nama Pengirim     :"+Nama_Pengirim);
            System.out.println("No.HP pengirim    :+62"+No_Hp_Pengirim);
            System.out.println("Alamat Pengirim   :"+Alamat_Detail1);
            System.out.println("                   "+Kecamatan[Provinsi_Pengirim-1][Kota_Pengirim-1][Kecamatan_Pengirim-1]+","+Kota[Provinsi_Pengirim-1][Kota_Pengirim-1]+","+Provinsi[Provinsi_Pengirim-1]);
            System.out.println("*********************************************************************");
            System.out.println("Nama Penerima     :"+Nama_Penerima);
            System.out.println("No.HP Penerima    :+62"+No_Hp_Penerima);
            System.out.println("Alamat Penerima   :"+Alamat_Detail2);
            System.out.println("                   "+Kecamatan[Provinsi_Penerima-1][Kota_Penerima-1][Kecamatan_Penerima-1]+","+Kota[Provinsi_Penerima-1][Kota_Penerima-1]+","+Provinsi[Provinsi_Penerima-1]);
            System.out.println("*********************************************************************");
            System.out.println("Jenis Barang      :"+Jenis_Barang);
            System.out.println("Berat             :"+Berat_Barang+"kg                   : Rp."+Biaya_Berat);
            System.out.println("Jenis Packaging   :"+Packaging[Jenis_Packaging-1]+" : Rp."+Harga_Packaging[Jenis_Packaging-1]);
            System.out.println("Jasa Pengiriman   :"+Jasa_Pengiriman[Pilih_Jasa-1]+" : Rp."+ongkir[Pilih_Jasa-1]);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total                                      : Rp."+total);
            System.out.println("Bayar                                      : Rp."+uang);
            System.out.println("Kembalian                                  : Rp."+kembalian);
                break;
            }
        }else{
            System.out.print("Maaf uang anda kurang , Masukan uang yang sesuai");
            ulang_pembayaran = true;
        }
    }while(ulang_pembayaran);
}

    static void printData(String Nama_Penerima, String No_Hp_Penerima, String Alamat_Detail, int Provinsi_index ,int Kota_index ,int Kecamatan_index){
        
        System.out.println("Nama  : "+Nama_Penerima);
        System.out.println("No.Hp : +62"+No_Hp_Penerima);
        System.out.println("Tujuan: "+Alamat_Detail);
        System.out.println("        "+Provinsi[Provinsi_index-1]+","+Kota[Provinsi_index-1][Kota_index-1]+","+Kecamatan[Provinsi_index-1][+Kota_index-1][Kecamatan_index-1]);

    }
   
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));

    }   

    static int Total_Biaya(int Jenis_Packaging ,int[] ongkir , int Biaya_Berat , int Pilih_Jasa){
        return Harga_Packaging[Jenis_Packaging-1]+ongkir[Pilih_Jasa-1]+Biaya_Berat;
     }

       
}
