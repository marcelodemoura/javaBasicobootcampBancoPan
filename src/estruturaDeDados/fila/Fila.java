package estruturaDeDados.fila;

public class Fila<T> {
    private No<T> refNoEntradaFilas = null;

    public Fila() {
    }

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(this.refNoEntradaFilas);
        this.refNoEntradaFilas = novoNo;
    }

    public T frist() {
        if (!this.isEmpty()) {
            return null;
        } else {
            No primeiroNo;
            for (primeiroNo = this.refNoEntradaFilas; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
            }

            return (T) primeiroNo.getObject();
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            No primeiroNo = this.refNoEntradaFilas;

            No noAuxilliar;
            for (noAuxilliar = this.refNoEntradaFilas; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
                noAuxilliar = primeiroNo;
            }

            noAuxilliar.setRefNo((No) null);
            return (T) primeiroNo.getObject();
        }
    }

    public boolean isEmpty() {
        return this.refNoEntradaFilas == null;
    }

    public String toString() {
        String stringRetorno = "";
        No noAlxiliar = this.refNoEntradaFilas;
        if (this.refNoEntradaFilas != null) {
            while (true) {
                stringRetorno = stringRetorno + "[No{objeto = }] " + noAlxiliar.getObject() + "}} ----->";
                if (noAlxiliar.getRefNo() == null) {
                    break;
                }

                noAlxiliar = noAlxiliar.getRefNo();
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
