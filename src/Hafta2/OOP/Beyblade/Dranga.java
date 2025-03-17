package Hafta2.OOP.Beyblade;

public class Dranga extends Beyblade{

    private String kutsalCanavar;
    public Dranga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar ismi : "+ kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkartıyor");
        System.out.println(getBeybladeci() + "'nın özel saldırısı: Kale Savunması");
    }
}
