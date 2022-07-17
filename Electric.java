public class Electric extends Engine {

    private String model;
    private String currentType;
    private int voltage;
    private String engineType;


    public String getModel(String model) {
        return model;
    }

    public void setModel()
    {
        this.model = model;
    }

    public String getCurrentType() {
        return currentType;
    }

    public void setCurrentType(String currentType) {
        this.currentType = currentType;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    void showSpecs() {
        System.out.println("Engine Type : Electric");
        System.out.println("Power Source : Electric");
        System.out.println("Engine Model : "+getModel());
    }
}

