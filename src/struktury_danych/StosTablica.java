package struktury_danych;

public class StosTablica {    // stos w postaci tablicy
    private int[] tab;          // prywatna tablica
    private int top;            // pola top

    public StosTablica(int size) { // tworzymy konstruktor
        tab = new int[size];
        top = -1;
    }

    public void push(int value) {
        // powinno obsluzyc wyjatek jezeli stos pelen
        top++;
        tab[top]=value; // jak value = 5 to przypisze na pierwszym miejscu liczne 5, itd.
                        // [top] -> jest to nasz indeks w tablicy

        // inny szybszy zapis dwoch powyzszych linijek to:
                // tab[++top] = value; // zwiekszamy top i zwracamy

    }

    public int pop() {              //wraca o jedno i wypisuje wartosc z gory
        // powinno obsluzyc wyjatek jezeli stos pusty
        int value = tab[top];
        top--;
        return value;
        // inny szybszy zapis dwoch powyzszych linijek to:
            // tab[top--] = value;
    }

    public int peek() {
        return tab[top];  // czyli zwracamy tab od top zeby zwrocic nam wartosc na ostatniej wartosci w stosie
    }

    public int size() {
        return top + 1;
    }
    public boolean isEmpty(){   //sprawdzenie czy stos jest pusty
        if (top == -1) {
            return true;
        }else {
            return false;
        }
        // mozna to wszystko zapisac w ten sposob:
        // return top == -1;

    }

    public static void main(String[] args) {
        StosTablica stosTablica = new StosTablica(5);

        stosTablica.push(5);
        stosTablica.push(2);
        stosTablica.push(1);

        System.out.println("Pop:  " + stosTablica.pop());   // 1
        System.out.println("Pop:  "+ stosTablica.pop());    // 2
        System.out.println("Peek: "+ stosTablica.peek());  // 5

        System.out.println("Pop:  " + stosTablica.pop());   // 5

        System.out.println("isEmpty: " + stosTablica.isEmpty()); // true

       // stosTablica.pop();
    }
}

