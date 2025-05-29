package hafta2.oop.beyblade;

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarıCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkartıyor");
        System.out.println(getBeybladeci() + "'nın saldırısı: Hayalet kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar ismi : " + kutsalCanavar);
        System.out.println("Gizli Yetenek  : " + gizliYetenek);
    }
}
