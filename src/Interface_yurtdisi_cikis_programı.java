

/* kişinin yurt dışı çıkış işlemi için interface de belirtilen kurallara uyması sağlanacak*/


public class Interface_yurtdisi_cikis_programı {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hava limanına hoşgeldiniz...");
        String islemler="Yurt dışı çıkış kuralları...\n"
                            +"Herhangi bir siyasi yasağınızın bulanmaması gerekiyor...\n"
                            +"15 tl harc paranızı yatırmış olmanız gerekiyor...\n"
                             +"Gidiceğiniz ülkeye vizenizin olması gerekiyor...";
        String message="yurtdışı şartlarının hepsini sağlamanız gerekli. ";
        
        while (true) {            
            
            System.out.println("***********************************");
                System.out.println(islemler);
            System.out.println("***********************************");
            
            
            
            Yolcu yolcu =new Yolcu();
            
            System.out.println("Harc bedeli kontrol ediliyor..");
            Thread.sleep(3000);
            try {
                yolcu.yurtdisi_harci();
            } catch (harcException ex) {
               ex.printStackTrace();
               continue;
            }
            System.out.println("siyasi yasak kontrol ediliyor..");
            Thread.sleep(3000);
            
            try {
                yolcu.siyasi_yasak();
            } catch (siyasiException ex) {
               
               continue;
            }
            
            System.out.println("vize durumu kontrol ediliyor..");
            Thread.sleep(3000);
            
            try {
                yolcu.vize_durumu();
            } catch (vizeException ex) {
                ex.printStackTrace();
                continue;
            }
         
            System.out.println("yurt dışına çıkabilirsiniz..");
            System.out.println("***************************");
            break;
            
            
            
            
        }
        
    }
    
}
