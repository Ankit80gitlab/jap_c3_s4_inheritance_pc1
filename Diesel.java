public class Diesel extends Fuel {

    String model;
    int maxPower;
    int maxTorque;
    int weight;
    String comp;
    int displacment;

    public Diesel(int maxPower, int maxTorque, int weight, String comp, int displacment, String model){

        this.maxPower=maxPower;
        this.maxTorque=maxTorque;
        this.weight=weight;
        this.comp=comp;
        this.displacment=displacment;
        this.model=model;
    }

    void showSpecs() {
        System.out.println("Engine Type : Diesel");
        System.out.println("Power Source : Diesel");
        System.out.println("Engine Model : "+model);
    }
}

