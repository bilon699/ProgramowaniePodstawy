package struktury_danych.stos_lista;

public class StosLista {
    private StosElem top;

    public StosLista() {
        this.top = null; // jest null bo na poczatku nie bedzie nic wskazywal

    }

    public void push(int value) {
        this.top = new StosElem(value, this.top);
        // inaczej:
        // StosElem elem = new StosElem(value, this.top);
        // this.top = elem;
    }
    public int pop() {
        if(top==null) {
            throw new StosPustyException();  // throw -  wyrzuc new - nowy wyjatek
        }

       int value = top.getValue();
       this.top = top.getPrev(); // inaczej:
//        StosElem prev = top.getPrev();
//        this.top = prev;
        return value;
    }
    public int peek() {
        if(top==null) { // jezeli stos pusty to wyrzuc wyjatek
            throw new StosPustyException();  // throw -  wyrzuc new - nowy wyjatek
        }
        return top.getValue();
    }
    public boolean isEmpty() {
        return top == null;
        // inaczej:
//         if(top == null){
//         return true;
//         }else{
//        return false;
//        }
    }
    public void show() {
        StosElem tmp = top;
        while(tmp != null) {
            System.out.print(tmp.getValue() + "; ");
            tmp = tmp.getPrev();
        }
        System.out.println();
    }

    public static void main(String[] args) {
    StosLista stos = new StosLista();
    stos.push(9);
    stos.push(100);
    stos.push(3);

    stos.show();

    stos.pop();
    stos.peek();
    stos.isEmpty();
    }


}
