package hafta3.proje.mylistclass;


public class BenimListem<T> {
    private T[] array;
    private int size;
    private int capasity;

    public BenimListem(){
        this.capasity = 10;
        this.array = (T[]) new Object[capasity];
        this.size = 0;
    }

    public BenimListem(int capasity){
        this.capasity = capasity;
        this.array = (T[]) new Object[capasity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapasity() {
        return capasity;
    }

    public void add(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Null değer eklenemez.");
        }

        if (this.size == this.capasity) {
            increaseCapacity();
        }

        this.array[this.size++] = data;
    }

    public void increaseCapacity() {
        // Yeni kapasiteyi güncelle
        this.capasity *= 2;

        // Yeni kapasiteye sahip bir dizi oluştur
        T[] newArray = (T[]) new Object[this.capasity];

        // Eski dizideki elemanları yeni diziye kopyala
        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        // Yeni diziyi mevcut dizi olarak ata
        this.array = newArray;
    }

    public T get(int index) {
        // Eğer index negatifse veya mevcut boyuttan büyükse hata fırlat
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }

        // array[index] döndür
        return this.array[index];
    }

    public T remove(int index) {
        // Eğer index geçersizse hata fırlat
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }

        // Silinecek veriyi sakla
        T data = this.array[index];

        // Elemanları sola kaydır
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        // Son elemanı `null` yap (aynı elemanın iki kez görünmesini önler)
        this.array[this.size - 1] = null;

        // Boyutu bir azalt
        this.size--;

        return data;
    }

    public T set(int index, T data) {
        // Eğer index geçersizse hata fırlat
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }

        // Önceki veriyi sakla
        T oldData = this.array[index];

        // Yeni veriyi atama
        this.array[index] = data;

        return oldData;
    }

    public int indexOf(T data) {
        // Eğer `data` null ise, özel bir kontrol yapabiliriz
        if (data == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.array[i] == null) {
                    return i;
                }
            }
        } else {
            // Null olmayan veriler için karşılaştırma yapılır
            for (int i = 0; i < this.size; i++) {
                if (this.array[i].equals(data)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        // Eğer `data` null ise, özel bir kontrol yapabiliriz
        if (data == null) {
            for (int i = this.size - 1; i >= 0; i--) {
                if (this.array[i] == null) {
                    return i;
                }
            }
        } else {
            // Null olmayan veriler için karşılaştırma yapılır
            for (int i = this.size - 1; i >= 0; i--) {
                if (this.array[i].equals(data)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0; // Eğer size 0 ise, liste boştur
    }

    public T[] toArray() {
        // Yeni bir dizi oluşturuluyor, mevcut array'in boyutunda
        T[] newArray = (T[]) new Object[this.size];

        // Elemanlar kopyalanıyor
        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        // Yeni diziyi döndür
        return newArray;
    }

    public void clear() {
        // Tüm elemanları null yap
        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }

        // Boyutu sıfırla
        this.size = 0;
    }

    public BenimListem<T> sublist(int start, int finish){
        //Geçersiz indeks kontrolü
        if (start < 0 || finish > this.size || start >= finish) {
            throw new IndexOutOfBoundsException("Geçersiz indeks aralığı.");
        }
        //Yeni alt liste oluştur
        BenimListem<T> subList = new BenimListem<>(finish - start);

        // Elemanları yeni listeye ekle
        for (int i = start; i < finish; i++) {
            subList.add(this.array[i]);
        }
        return subList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(data)) {
                return true;  // Veri bulundu
            }
        }
        return false;  // Veri bulunamadı
    }

    @Override
    public String toString() {
        // StringBuilder kullanarak listeyi oluştur
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < this.size; i++) {
            sb.append(array[i]);

            // Eğer son eleman değilse, virgül ekle
            if (i < this.size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

}
