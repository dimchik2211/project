package functionals;

import functions.IFunction;
import functions.RationalFunction;

public class FunctionValuesSum <T extends IFunction> implements IFunctional<T>{
    public double solution(T function) throws RationalFunction.DenominatorEqualsZero {
        return function.getFunctionValue(function.getA()) +
                function.getFunctionValue(function.getB()) +
                function.getFunctionValue((function.getA() + function.getB())/2);
    }
}
