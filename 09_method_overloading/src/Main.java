public class Main {

    public static void main(String[] args) {
        double foot_num = 8;
        double inch_num = 4;

        double cent_num = calcFeetAndInchesToCentimeters(foot_num,inch_num);
        validateParameters(cent_num);

        inch_num = 50;
        cent_num = calcFeetAndInchesToCentimeters(inch_num);
        validateParameters(cent_num);

    }

    public static void validateParameters(double cent_num){
        if(cent_num < 0) {
            System.out.println("Invalid parameters.");
        }else {
            System.out.println("There is a total of: " + cent_num + " centimeters.");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double foot_to_cent = feet * 12 * 2.54;
            double inch_to_cent = inches * 2.54;
            double final_value = foot_to_cent + inch_to_cent;

            return final_value;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double solid_feet = (int) inches /12;
            double remaining_inches = (int) inches % 12;
            System.out.println(inches+" inches is equals to "+solid_feet+" feet and "+
                                remaining_inches+" inches");

//            double inch_to_cent = inches * 2.54;

//            return inch_to_cent;
            return calcFeetAndInchesToCentimeters(solid_feet,remaining_inches);
        }else{
            return -1;
        }
    }
}
