package estruturaDeDados.listaEncadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString() {
        return "No{conteudo=" + this.conteudo + "}";
    }

    public String toStringEncadeado() {
        String str = "No{conteudo=" + this.conteudo + "}";
        if (this.proximoNo != null) {
            str = str + "->";
        }

        return str;
    }
}
