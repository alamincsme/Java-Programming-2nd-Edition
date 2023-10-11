package chap07;

import java.text.DecimalFormat;

public class BMI {
    private static final double KILOGRAMS_PER_POUND = 0.45359237 ;
    private static final double METERS_PER_INCHES = 0.0254;

    private String name;
    private double weigth;
    private double height;

    public BMI(String name, double weigth, double height) {
        this.name = name;
        this.weigth = weigth;
        this.height = height;
    }

    public String getBMI() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format((weigth * KILOGRAMS_PER_POUND) / (((height * METERS_PER_INCHES) ) * (height * METERS_PER_INCHES) ));
    }

    public String BMI_Status() {
        double bmi = Double.parseDouble(getBMI());
        if (bmi < 18.5) {
            return "UnderWeight";
        } else if (bmi < 25) {
            return "Normal" ;
        } else {
            return "OverWeight.";
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BMI bmi = new BMI("Mohammad",145, 70);
        System.out.println("the bmi for " + bmi.getName() + " is (" + bmi.getBMI() + ") " + bmi.BMI_Status() );
    }
}