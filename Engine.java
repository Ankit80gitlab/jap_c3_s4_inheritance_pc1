public class Engine {

    private String model;
    private int maxPower;
    private double maxRPM;
    private int maxTorque;
    private int weight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public double getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(double maxRPM) {
        this.maxRPM = maxRPM;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
