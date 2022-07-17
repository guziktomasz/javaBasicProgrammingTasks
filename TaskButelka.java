package javaPodstawyProgramowanie;

/*
Utworz klase Butelka
zmienne klasowe
pojemnosc - ile wody pomiesci
zawartosc - ile wody aktualnie jest w butelce
kod kreskowy

metody
nalejWody
wylejWody
przelejDoInnejButelki

zademonstruj dzialanie programu nalewajac, wylewajac, przelewajac wode:)
 */
public class TaskButelka {
    private final int volume;
    private int volumeNow;
    private final String barCode;

    public TaskButelka(int volume, int volumeNow, String barCode) {
        this.volume = volume;
        this.volumeNow = volumeNow;
        this.barCode = barCode;
    }

    public TaskButelka(int volume, String barCode) {
        this.volume = volume;
        this.barCode = barCode;
    }

    public int pourWater(int addWater) {
        if (addWater > 0) {
            volumeNow = volumeNow + addWater;
            if (volumeNow > volume) {
                volumeNow = volume;
            }
        }
        return volumeNow;
    }

    public int pourOutWater(int outWater) {
        if (outWater > volumeNow) {
            volumeNow = 0;
        } else if (outWater > 0) {
            volumeNow = volumeNow - outWater;
        }
        return volumeNow;
    }

    public void overflow(TaskButelka butelka, int overflowWater) {

        if (overflowWater <= this.volumeNow) {
            System.out.println("Butelka 1: " + this.getVolumeNow());
            System.out.println("Butelka 2: " + butelka.volumeNow);
            this.pourOutWater(overflowWater);
            butelka.pourWater(overflowWater);
            System.out.println("Butelka 1: " + this.getVolumeNow());
            System.out.println("Butelka 2: " + butelka.volumeNow);
        } else if (overflowWater > this.volumeNow) {
            System.out.println("eiButelka 1: " + this.getVolumeNow());
            System.out.println("eiButelka 2: " + butelka.volumeNow);
            int tmpValueNow = this.volumeNow;
            this.pourOutWater(this.volumeNow);
            butelka.pourWater(tmpValueNow);
            System.out.println("eiButelka 1: " + this.getVolumeNow());
            System.out.println("eiButelka 2: " + butelka.volumeNow);
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getVolumeNow() {
        return volumeNow;
    }

    public String getBarCode() {
        return barCode;
    }

    @Override
    public String toString() {
        return "TaskButelka{" +
                "volume=" + volume +
                ", volumeNow=" + volumeNow +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
