class ComplexDemo {
    private double realPart;
    private double imaginaryPart;

    public ComplexDemo() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public ComplexDemo(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}

public class Complex {
    public static void main(String[] args) {
        ComplexDemo complex1 = new ComplexDemo();
        ComplexDemo complex2 = new ComplexDemo(2.5, 3.0);

        System.out.println("Complex 1: Real Part = " + complex1.getRealPart() +
                ", Imaginary Part = " + complex1.getImaginaryPart());

        System.out.println("Complex 2: Real Part = " + complex2.getRealPart() +
                ", Imaginary Part = " + complex2.getImaginaryPart());

        complex1.setRealPart(1.5);
        complex1.setImaginaryPart(-2.0);

        System.out.println("Complex 1 (Updated): Real Part = " +
                complex1.getRealPart() +
                ", Imaginary Part = " +
                complex1.getImaginaryPart());
    }
}
