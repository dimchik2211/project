package functions;

public interface IFunction {
    double getFunctionValue(final double x)throws RationalFunction.DenominatorEqualsZero;
    double getA();
    double getB();
}
