package hafta2.oop.beyblade;

public class Dranza extends Beyblade{

    private String kutsalCanavar;


    public Dranza(String beybladeci, int donusHizi, int saldiriGucu ,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarıCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + "'nın gizli saldırısı: Alev kılıcı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+ kutsalCanavar);
    }
}
