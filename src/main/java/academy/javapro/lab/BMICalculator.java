package academy.javapro.lab;

public class BMICalculator {
    public static void main(String[] args) {
        // Predefined test cases (weight in kg and height in m)
        double[][] testCases = {
            {70.0, 1.75},  // Test case 1: Normal weight
            {85.0, 1.60},  // Test case 2: Obese
            {50.0, 1.80},  // Test case 3: Underweight
            {95.0, 1.70},  // Test case 4: Overweight
            {120.0, 1.60}, // Test case 5: Obese
            {0.0, 1.75},   // Test case 6: Invalid weight (Zero)
            {70.0, 0.0},   // Test case 7: Invalid height (Zero)
            {-70.0, 1.75}, // Test case 8: Invalid weight (Negative)
            {70.0, -1.75}  // Test case 9: Invalid height (Negative)
        };

        // Iterates through each test case and calculates BMI
        for (double[] testCase : testCases) {
            double weightInKg = testCase[0];
            double heightInMeters = testCase[1];

            // Validates weight and height are positive numbers
            if (weightInKg <= 0) {
                System.out.println("Invalid weight: " + weightInKg + " kg (Weight must be a positive number greater than zero.)");
                // goes to the next test case
                continue;
            }

            if (heightInMeters <= 0) {
                System.out.println("Invalid height: " + heightInMeters + " m (Height must be a positive number greater than zero.)");
                // goes to the next test case
                continue;
            }

            // Calculates BMI using formula
            double bmi = weightInKg / Math.pow(heightInMeters, 2);

            // Rounds BMI to one decimal place
            double roundedBmi = Double.parseDouble(String.format("%.1f", bmi));

            // Displays predefined weight, height, and calculated BMI
            System.out.println("Weight: " + weightInKg + " kg");
            System.out.println("Height: " + heightInMeters + " m");
            System.out.println("BMI: " + roundedBmi);

            // Interprets BMI value and displays interpretation
            if (roundedBmi < 18.5) {
                System.out.println("Interpretation: Underweight");
            } else if (roundedBmi >= 18.5 && roundedBmi <= 24.9) {
                System.out.println("Interpretation: Normal weight");
            } else if (roundedBmi >= 25.0 && roundedBmi <= 29.9) {
                System.out.println("Interpretation: Overweight");
            } else {
                System.out.println("Interpretation: Obese");
            }

            // Adds a blank line between test cases for easier readability
            System.out.println();
        }
    }
}
