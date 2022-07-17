import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        Engine obj1 =new Engine();

        System.out.println("Enter the model number");

        String modelUlter=sc.nextLine();

        obj1.setModel(modelUlter);
        obj1.setMaxRPM(6000);
        obj1.setMaxPower(50);
        obj1.setMaxTorque(90);
        obj1.setWeight(75);

        Electric obj2 =new Electric();

        obj2.setCurrentType("AC");
        obj2.setVoltage(360);
        obj2.setEngineType("Electric");
        obj2.setModel(obj1.getModel());


        Fuel obj3 =new Fuel();
        obj3.setDisplacment(996);
        obj3.setCylinders(4);
        obj3.setComp("11.0:1");
        obj3.setEngineType("Petrol");
        obj3.setMod(obj1.getModel());
        //obj3.dis();

        Diesel obj4 =new Diesel(obj1.getMaxPower(), obj1.getMaxTorque(), obj1.getWeight(), obj3.getComp(), obj3.getDisplacment(), obj1.getModel());

        Petrol obj5 =new Petrol(obj1.getMaxPower(), obj1.getMaxTorque(), obj1.getWeight(), obj3.getComp(), obj3.getDisplacment(), obj1.getModel());

        CNG obj6 =new CNG(obj1.getMaxPower(), obj1.getMaxTorque(), obj1.getWeight(), obj3.getComp(), obj3.getDisplacment(), obj1.getModel());


        Pattern pObj =Pattern.compile("[A-Z]{1}[0-9]{4}");
        Matcher matcher = pObj.matcher(modelUlter);

        if (matcher.matches())
        {
            if(modelUlter.startsWith("P"))
            {
                System.out.println("Details for the model no. "+modelUlter);
                obj5.showSpecs();
            }
            else if(modelUlter.startsWith("D"))
            {
                System.out.println("Details for the model no. "+modelUlter);
                obj4.showSpecs();
            }
            else if(modelUlter.startsWith("C"))
            {
                System.out.println("Details for the model no. "+modelUlter);
                obj6.showSpecs();
            }
        }
        else if (modelUlter.startsWith("8"))
        {
            System.out.println("Details for the model no. "+modelUlter);
            obj2.showSpecs();
        }
        else
        {
            System.out.println("Invalid model number");
        }

    }

}
