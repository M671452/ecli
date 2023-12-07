package s11_primitiveDataTypesAndAlternativePG;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// Exercise
		// Simple Interest Formula
		// Total Value = principal + principal * interest * noOfYears;

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5); // 5 years
		System.out.println(totalValue);
		// Total Value to return 6187.50000

	}

}
