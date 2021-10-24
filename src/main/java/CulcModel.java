import org.mariuszgromada.math.mxparser.Expression;

public class CulcModel {
protected String getResult (String textFromTextField){

    Expression e = new Expression();
    e.setExpressionString(textFromTextField);
    Double currentResult = e.calculate();
    String result = currentResult.toString();
    return  result;
}

}
