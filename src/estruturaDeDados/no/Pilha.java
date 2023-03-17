package estruturaDeDados.no;

public class Pilha {
    private No refNoEntrePilha = null;

    public Pilha() {
    }

    public void push(No novoNo) {
        No refAuxiliar = this.refNoEntrePilha;
        this.refNoEntrePilha = novoNo;
        this.refNoEntrePilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (this.isEmpty()) {
            No noPoped = this.refNoEntrePilha.getRefNo();
            return noPoped;
        } else {
            return null;
        }
    }

    public No top() {
        return this.refNoEntrePilha;
    }

    public boolean isEmpty() {
        return this.refNoEntrePilha == null;
    }

    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno = stringRetorno + "     Pilha\n";
        stringRetorno = stringRetorno + "-----------------\n";

        for (No noAuxiliar = this.refNoEntrePilha; noAuxiliar != null; noAuxiliar = noAuxiliar.getRefNo()) {
            stringRetorno = stringRetorno + "[No{Dado " + noAuxiliar.getDado() + " }]\n";
        }

        stringRetorno = stringRetorno + "================\n";
        return stringRetorno;
    }
}
