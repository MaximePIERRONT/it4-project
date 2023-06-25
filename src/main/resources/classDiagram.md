classDiagram
    class BasicCalculator
    class ScientificCalculator
    class ProfessionalCalculator
    class GeometricCalculator
    BasicCalculator --|> Calculator
    ProfessionalCalculator --|> Calculator
    GeometricCalculator --|> Calculator
    ScientificCalculator --|> Calculator
    GeometricFeatures <|.. GeometricCalculator: Implements
    ScientificFeatures <|.. ScientificCalculator: Implements
    GeometricFeatures <|.. ProfessionalCalculator: Implements
    ScientificFeatures <|.. ProfessionalCalculator: Implements

    class Calculator {
        +double add(double, double)
        +double subtract(double, double)
        +double multiply(double, double)
        +double divide(double, double)
    }
    
    class GeometricFeatures {
        <<interface>>
        +double square(double)
        +double sqrt(double)
        +double abs(double)
        +double log(double)
        +double e()
    }
    
    class ScientificFeatures {
        <<interface>>
        +double cos(double)
        +double sin(double)
        +double tan(double)
        +double pi()
    }
