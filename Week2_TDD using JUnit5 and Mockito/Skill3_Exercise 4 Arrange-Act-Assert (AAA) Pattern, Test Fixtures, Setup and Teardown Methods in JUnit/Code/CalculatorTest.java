
package AAA_pattern;

import static org.junit.Assert.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    // Setup method (runs before each test)

    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created");
    }

    // Teardown method (runs after each test)

    void tearDown() {
        calculator.reset();
        System.out.println("Teardown: Calculator reset");
    }

    void testAddPositiveNumbers() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    void testAddZero() {
        // Arrange
        int a = 0;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(10, result);
    }
}
