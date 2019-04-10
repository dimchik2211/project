package functionals;

import functions.IFunction;
import functions.RationalFunction;

public class Integral <T extends IFunction> implements IFunctional<T>{
    private double a, b;
    private final double SPLITS = 1000;
    public Integral(double a, double b){
        this.a = Math.min(a,b);
        this.b = Math.max(a,b);
    }
    public double solution(T function) throws RationalFunction.DenominatorEqualsZero, IllegalArgumentException {
        if((function.getA() > a && function.getA() != a) || (function.getB() < b && function.getB() != b)) {
            throw new IllegalArgumentException();
        }
        double h = (b - a) / SPLITS, sol = 0;
        for (int i = 1; i < SPLITS; i++) {
            sol += function.getFunctionValue(a + (i - 0.5)*h);
        }
        sol *= h;
        return sol;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
