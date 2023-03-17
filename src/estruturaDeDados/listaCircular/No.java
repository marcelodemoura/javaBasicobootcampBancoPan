package estruturaDeDados.listaCircular;
public class No<T> {
    private T conteudo;
    private No<T> noProximo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return this.noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public String toString() {
        return "No{conteudo=" + this.conteudo + "}";
    }
}
