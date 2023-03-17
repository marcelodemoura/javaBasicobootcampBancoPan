package estruturaDeDados.equalsHashcode;
    public class No<T> {
        private T conteudo;
        private No<T> proximoNo = null;

        public No(T conteudo) {
            this.conteudo = conteudo;
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
            return "No{conteudo='" + this.conteudo + "'}";
        }

}