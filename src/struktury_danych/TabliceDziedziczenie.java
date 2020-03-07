package struktury_danych;

public class TabliceDziedziczenie extends Tablice {

    private int pole;

    public void metoda(int jakasWartosc) {
        this.metoda(this.pole);

        // dziedziczenie - protected, package, public
        // brak dostępu do private

    }
}