package javaBasico.smartTv;


public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public SmartTv() {
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void almentarVolume() {
        ++this.volume;
    }

    public void diminuirVolume() {
        --this.volume;
    }

    public void almentarCanal() {
        ++this.canal;
    }

    public void diminuircanal() {
        --this.canal;
    }
}
