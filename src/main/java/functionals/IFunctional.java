package functionals;
import functions.IFunction;
import functions.RationalFunction;

public interface IFunctional <T extends IFunction>{
    double solution(T function)throws RationalFunction.DenominatorEqualsZero;
}
