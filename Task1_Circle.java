package javaPodstawyProgramowanie;

public class Task1_Circle {
    float diameter;
    float circuit;

    public Task1_Circle(float diameter) {
        this.diameter = diameter;
        //System.out.println("Utworzyłeś okrąg o średnicy: " + diameter);
        circuit = (float) (diameter * Math.PI);
    }

    public float getCircuit() {
        return circuit;
    }
}
