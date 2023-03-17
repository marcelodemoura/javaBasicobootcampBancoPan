package estruturaDeDados.fila;



    public class No<T> {
        private T object;
        private estruturaDeDados.fila.No<T> refNo;

        public No() {
        }

        public No(T object) {
            this.refNo = null;
            this.object = object;
        }

        public T getObject() {
            return this.object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public estruturaDeDados.fila.No getRefNo() {
            return this.refNo;
        }

        public void setRefNo(estruturaDeDados.fila.No refNo) {
            this.refNo = refNo;
        }

        public String toString() {
            return "No{object=" + this.object + "}";
        }

}
