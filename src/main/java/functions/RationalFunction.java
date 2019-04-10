package functions;

public class RationalFunction implements IFunction {
    private double coefA ,coefB ,coefC , coefD, a, b;
    public class DenominatorEqualsZero extends Throwable{
        public DenominatorEqualsZero(){}
        public DenominatorEqualsZero(String message){
            super(message);
        }
    }

    public RationalFunction(double a, double b){
        this.a = Math.min(a,b);
        this.b = Math.max(a,b);
        coefA = 1;
        coefB = 1;
        coefC = 1;
        coefD = 1;
    }
    public RationalFunction(double a, double b, double A, double B, double C, double D){
        this.a = Math.min(a,b);
        this.b = Math.max(a,b);
        coefA = A;
        coefB = B;
        coefC = C;
        coefD = D;
    }
    public double getFunctionValue(final double x)throws IllegalArgumentException, DenominatorEqualsZero{
        if(x < a || x > b)throw new IllegalArgumentException("Argument doesn't belong interval");
        if(coefC * x + coefD == 0)throw new DenominatorEqualsZero("Denominator is zero.");
        return (coefA * x + coefB)/(coefC* x + coefD);
    }
    public double getA(){return a;}
    public double getB(){return b;}

    public double getCoefA() {
        return coefA;
    }

    public void setCoefA(double coefA) {
        this.coefA = coefA;
    }

    public double getCoefB() {
        return coefB;
    }

    public void setCoefB(double coefB) {
        this.coefB = coefB;
    }

    public double getCoefC() {
        return coefC;
    }

    public void setCoefC(double coefC) {
        this.coefC = coefC;
    }

    public double getCoefD() {
        return coefD;
    }

    public void setCoefD(double coefD) {
        this.coefD = coefD;
    }
}
