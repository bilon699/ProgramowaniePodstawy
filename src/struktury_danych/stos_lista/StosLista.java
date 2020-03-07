package struktury_danych.stos_lista;

public class StosLista {
    private StosElem top;

    public StosLista() {
        top = null; // jest null bo na poczatku nie bedzie nic wskazywal

    }

    public void push(int value) {
        StosElem elem = new StosElem(value, top);
        top = elem;
    }
}
