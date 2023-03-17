package estruturaDeDados.listaEncadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada = null;

    public ListaEncadeada() {
    }

    public void add(T conteudo) {
        No<T> novoNo = new No(conteudo);
        if (this.isEmpty()) {
            this.referenciaEntrada = novoNo;
        } else {
            No<T> noAuxiliar = this.referenciaEntrada;

            for (int i = 0; i < this.size() - 1; ++i) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            noAuxiliar.setProximoNo(novoNo);
        }
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        this.validaIndice(index);
        if (index >= this.size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice" + index + " Esta lista só vai até o indice" + ultimoIndice + ".");
        } else {
            No<T> noAuxiliar = this.referenciaEntrada;
            No<T> noRetorno = null;

            for (int i = 0; i <= index; ++i) {
                noRetorno = noAuxiliar;
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            return noRetorno;
        }
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            this.referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        } else {
            No<T> noAnterior = this.getNo(index - 1);
            noAnterior.setProximoNo(noPivo.getProximoNo());
            return noPivo.getConteudo();
        }
    }

    public int size() {
        int tamanhoLista = 0;

        for (No<T> referenciaAux = this.referenciaEntrada; referenciaAux != null; referenciaAux = referenciaAux.getProximoNo()) {
            ++tamanhoLista;
            if (referenciaAux.getProximoNo() == null) {
                break;
            }
        }

        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= this.size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice" + index + " Esta lista só vai até o indice" + ultimoIndice + ".");
        }
    }

    public boolean isEmpty() {
        return this.referenciaEntrada == null;
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.referenciaEntrada;

        for (int i = 0; i < this.size(); ++i) {
            strRetorno = strRetorno + "[No{conteudo = " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno = strRetorno + "null";
        return strRetorno;
    }
}
