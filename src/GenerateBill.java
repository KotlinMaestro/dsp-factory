import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        //Gather user input
        System.out.println("Which plan do you use?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //save input
        String planName = br.readLine();
        System.out.println("Enter the number of units used:");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        //Now we call the getRate() method and calculateBill() methods of DomesticPlan
        System.out.println("Bill Name: " + planName + "\n" + "Number of Units: " + units + "\n");
        p.getRate();
        p.calculateBill(units);
        }
}