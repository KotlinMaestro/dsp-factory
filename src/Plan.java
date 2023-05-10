import java.io.*;
abstract class Plan {
    //define attributes
    protected double rate;
    //
    abstract void getRate();

    //method to calculate the total bill from the units given
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
