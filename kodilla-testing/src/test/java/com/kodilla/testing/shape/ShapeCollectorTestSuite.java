package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")

 class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test:" + testCounter);
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("The end test number:" + testCounter);
    }

    @Nested
    class Test_Add_and_remove_figure {
        @Test
        @DisplayName("When method addFigure works corectly, test return true ")
        void testAddFigure() {
            Cirkle cirkle = new Cirkle(3);
            Square square = new Square(4, 2);
            Triangle triangle = new Triangle(4, 8);

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(cirkle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            Assertions.assertEquals(3, shapeCollector.getFigureQuantity());
        }

        @Test
        @DisplayName("When method removeFigure works correctly, test return true")
        void removeFigure() {
            Cirkle cirkle = new Cirkle(4);

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(cirkle);
            shapeCollector.removeFigure(cirkle);

            Assertions.assertEquals(0, shapeCollector.getFigureQuantity());
        }
    }

    @Nested
    class Test_Get_And_Show_Figures {

        @Test
        @DisplayName("When method getFigure works correctly, test return true")
        void getFigure() {
            Square square = new Square(4, 4);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(square);
            Shape figures = shapeCollector.getFigure(0);

            Assertions.assertEquals(square, figures);
            //Assertions.assertEquals(0, shapeCollector.getFigureQuantity());
        }

        @Test
        @DisplayName("When method showFigures works correctly, test return true")
        void showFigure() {
            Square square = new Square(8, 8);
            Cirkle cirkle = new Cirkle(2);
            Triangle triangle = new Triangle(2, 2);

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(square);
            shapeCollector.addFigure(cirkle);
            shapeCollector.addFigure(triangle);

            String figuresNames = "Square Cirkle Triangle ";

            String figuresNamesReturn = shapeCollector.showFigures();
            System.out.println(figuresNamesReturn);
            Assertions.assertEquals(figuresNames, figuresNamesReturn);

        }


    }

}

