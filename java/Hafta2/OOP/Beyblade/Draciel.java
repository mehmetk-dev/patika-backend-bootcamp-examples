package Hafta2.OOP.Beyblade;

public class Draciel extends  Beyblade{
    private String kutsalCanavar;
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar ismi: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarıCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkartıyor...");
        System.out.println(getBeybladeci() + "'nın özel saldırısı: Kaplan Pençesi");
    }
}
