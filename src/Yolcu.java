


import java.util.Scanner;

class  siyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor");
    }
    
   
    
}

class  vizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println(" gideceğiniz ülkeye vizeninz bulunmuyor...");
    }
    
    
    
}
class  harcException extends Exception{

    @Override
    public void printStackTrace() {
        
        System.out.println("Harcınız eksik yatırılmıştır...");
    }
    
    
}


public class Yolcu {
    
    private  int Harc;
    private  boolean Siyasiyasak;
    private boolean Vizedurum;
    
    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli:");
        this.Harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("yurt dışı yasağınız bulunuyormu(evet yada hayır):");
        String cevap;
        cevap=scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.Siyasiyasak=true;
            
        }else{
            this.Siyasiyasak=false;
        }
        System.out.println("Vizeniz varmı(evet yada hayır):");
        String cevap2=scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.Vizedurum=true;
            
        }else{
            this.Vizedurum=false;
        }
        
    }

    public void yurtdisi_harci() throws harcException  {
        if (this.Harc<15) {
            
           
           throw new harcException();
            
            
        }else{
           
            System.out.println("harcınız tamam");
        }
    }

    public void siyasi_yasak() throws siyasiException {
        if (this.Siyasiyasak==true) {
            
           throw  new siyasiException();
            
        }else{
            
            System.out.println("siyasi yasğınız bulunmuyor");
        }
    }

    public void vize_durumu() throws vizeException {
        if (this.Vizedurum==true) {
            
             System.out.println("vizeniz tamam");
            
        }else{
           
            throw  new vizeException();
        }
        
    }

    public int getHarc() {
        return Harc;
    }

    public void setHarc(int Harc) {
        this.Harc = Harc;
    }

    public boolean isSiyasiyasak() {
        return Siyasiyasak;
    }

    public void setSiyasiyasak(boolean Siyasiyasak) {
        this.Siyasiyasak = Siyasiyasak;
    }

    public boolean isVizedurum() {
        return Vizedurum;
    }

    public void setVizedurum(boolean Vizedurum) {
        this.Vizedurum = Vizedurum;
    }


}
