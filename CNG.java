public class CNG extends Fuel {

    String model;
    int maxPower;
    int maxTorque;
    int weight;
    String comp;
    int displacment;

    public CNG(int maxPower, int maxTorque, int weight, String comp, int displacment, String model){

        this.maxPower=maxPower;
        this.maxTorque=maxTorque;
        this.weight=weight;
        this.comp=comp;
        this.displacment=displacment;
        this.model=model;
    }

    void showSpecs() {
        System.out.println("Engine Type : CNG");
        System.out.println("Power Source : CNG");
        System.out.println("Engine Model : "+model);
    }
}

