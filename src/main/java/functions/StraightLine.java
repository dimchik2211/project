package functions;

public class StraightLine implements IFunction {
    private double a, b, coefA, coefB;
    public StraightLine(double a, double b){
        this.a = Math.min(a,b);
        this.b = Math.max(a,b);
        this.coefA = 1;
        this.coefB = 1;
    }
    public StraightLine(double a, double b, double coefA, double coefB){
        this.a = Math.min(a,b);
        this.b = Math.max(a,b);
        this.coefA = coefA;
        this.coefB = coefB;
    }
    public double getFunctionValue(final double x)throws IllegalArgumentException{
        if(x < a || x > b)throw new IllegalArgumentException("Argument doesn't belong interval");
        return coefA * x + coefB;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getCoefA() {
        return coefA;
    }

    public double getCoefB() {
        return coefB;
    }

    public void setCoefA(double coefA) {
        this.coefA = coefA;
    }

    public void setCoefB(double coefB) {
        this.coefB = coefB;
    }
}
