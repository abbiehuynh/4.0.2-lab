# Lab 4.0.2

**Objective**

In this lab, you'll create a Java program that calculates the Body Mass Index (BMI) given a person's weight in kilograms
and height in meters. This practical application will help you understand how to use mathematical formulas in
programming and interpret the results in a real-world context.

**Prerequisites**

- Basic understanding of Java programming
- Familiarity with variables, data types, and arithmetic operations in Java
- Knowledge of conditional statements in Java


**What You'll Achieve**

By completing this lab, you will:

- Gain experience in implementing health-related calculations in Java
- Practice using arithmetic operations and Math functions
- Enhance your skills in conditional logic for result interpretation
- Learn to format and display results effectively

**Assignment Instructions**

1. Calculate the BMI using the formula: BMI = weight / (height * height).
2. Round the BMI to one decimal place for display purposes.
3. Interpret the BMI result using the following categories:
    - Below 18.5: Underweight
    - 18.5 - 24.9: Normal weight
    - 25.0 - 29.9: Overweight
    - 30.0 and above: Obese
4. Display the calculated BMI and its interpretation.
5. (Optional) Add input validation to ensure weight and height are positive numbers.

**Example Output**

```
Weight: 70.0 kg
Height: 1.75 m
BMI: 22.9
Interpretation: Normal weight
```

**Starter Code**

```java
package academy.javapro.lab;

public class BMICalculator {
    public static void main(String[] args) {
        // Predefined weight and height
        double weightInKg = 70.0;
        double heightInMeters = 1.75;

        // TODO: Implement BMI calculation and interpretation here
    }
}
```

**Hints**

- Use `Math.pow(height, 2)` as an alternative to `height * height` for squaring.
- Remember to handle potential division by zero if height is zero.
- Use conditional statements (if-else) to determine the BMI category.
- You can use `String.format("%.1f", bmi)` to round the BMI to one decimal place.

