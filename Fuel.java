public class Fuel extends Engine {


    private String mod;
    private int displacment;
    private int cylinders;
    private String comp;
    private String engineType;

    public String getMod() {
        return mod;
    }


    public void setMod(String mod) {
        this.mod = mod;
    }
    public int getDisplacment() {
        return displacment;
    }

    public void setDisplacment(int displacment) {
        this.displacment = displacment;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void dis () {
        System.out.println(getMod());
    }

}
