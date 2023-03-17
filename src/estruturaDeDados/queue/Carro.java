package estruturaDeDados.queue;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Carro carro = (Carro) o;
            return Objects.equals(this.getMarca(), carro.getMarca());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getMarca()});
    }
}
