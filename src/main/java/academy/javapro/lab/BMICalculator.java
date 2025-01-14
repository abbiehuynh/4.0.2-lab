package academy.javapro.lab;

public class BMICalculator {
    public static void main(String[] args) {
        // Predefined weight and height
        double weightInKg = 70.0;
        double heightInMeters = 1.75;

        // Validates weight and height are positive numbers
        if (weightInKg <= 0) {
            System.out.println("Weight must be a positive number greater than zero.");
            return;
        }

        if (heightInMeters <= 0) {
            System.out.println("Height must be a positive number greater than zero.");
            return;
        }

        // Calculates BMI using formula
        double bmi = weightInKg / Math.pow(heightInMeters, 2);

        // Rounds BMI to one decimal place
        double roundedBmi = Double.parseDouble(String.format("%.1f", bmi));

        // Display predefined weight and height
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.println("Height: " + heightInMeters + " m");

        // Display calculated BMI
        System.out.println("BMI: " + roundedBmi);

        // Interpret BMI value and display interpretation
        if (roundedBmi < 18.5) {
            System.out.println("Interpretation: Underweight");
        } else if (roundedBmi >= 18.5 && roundedBmi <= 24.9) {
            System.out.println("Interpretation: Normal weight");
        } else if (roundedBmi >= 25.0 && roundedBmi <= 29.9) {
            System.out.println("Interpretation: Overweight");
        } else {
            System.out.println("Interpretation: Obese");
        }

    }
}
