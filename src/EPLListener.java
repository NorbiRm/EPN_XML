import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class EPLListener implements grammarEPNListener{

    Map<Integer,String> variables =  new HashMap<>();
    Stack<String> stack = new Stack<>();

    int propertyId = 1;
    int ifId = 1;

    String property = "";


    @Override public void enterExpr(grammarEPNParser.ExprContext ctx) { }

    @Override public void exitExpr(grammarEPNParser.ExprContext ctx) {
        for (String x:stack
        ) {
            System.out.println(x);
        }

    }

    @Override public void enterStatement(grammarEPNParser.StatementContext ctx) {
        ifId=1;
    }

    @Override public void exitStatement(grammarEPNParser.StatementContext ctx) { }

    @Override public void enterIf_statement(grammarEPNParser.If_statementContext ctx) {
        propertyId = 1;

        String test = "";

        test += "<test ";

        test +=" group=\"";
        test += ctx.getChild(1).getChild(1)!=null ? ctx.getChild(1).getChild(1).getText().substring(0,8) : "name";

        test +="\"  id="+ ifId +" operator=\"";
        test += ctx.getChild(2)!=null ? ctx.getChild(2).getText() : "AND";

        test+="\" >";

        test+="\n<properties>";

        stack.push(test);
    }
    @Override public void exitIf_statement(grammarEPNParser.If_statementContext ctx) {
        stack.push("</properties> ");
        stack.push("</test>");
        ifId++;

    }
    @Override public void enterCondition(grammarEPNParser.ConditionContext ctx) {
        property = "";

        property+="<property id="+propertyId;
        propertyId++;

    }

    @Override public void exitCondition(grammarEPNParser.ConditionContext ctx) {

        stack.push(property);
        property = "";
    }

    @Override public void enterAny(grammarEPNParser.AnyContext ctx) {
        property+=" nadme=\"";
        property += ctx.getText().substring(0,8) + "\"";

        property+=" qualifier=\"";
        property += "ANY\"";

        property+=" name=\"";
        property += ctx.getText().substring(8) + "\"/>";
    }

    @Override public void exitAny(grammarEPNParser.AnyContext ctx) {
    }

    @Override public void enterHaving(grammarEPNParser.HavingContext ctx) {


        property+=" value="+ctx.getChild(0);


    }

    @Override public void exitHaving(grammarEPNParser.HavingContext ctx) {
    }

    @Override public void enterCampo(grammarEPNParser.CampoContext ctx){}

    @Override public void exitCampo(grammarEPNParser.CampoContext ctx){}


    @Override public void enterWithin(grammarEPNParser.WithinContext ctx) {

    }

    @Override public void exitWithin(grammarEPNParser.WithinContext ctx) {
        stack.push(property);
        //New property
        property = "";
    }

    @Override public void enterOperador(grammarEPNParser.OperadorContext ctx) {

        stack.push(property);
        //New property
        property = "";

        property+="<property id="+propertyId;
        propertyId++;

        property+=" operator=\""+ctx.getChild(0)+"\"";
    }

    @Override public void exitOperador(grammarEPNParser.OperadorContext ctx) {
    }

    @Override
    public void enterValue(grammarEPNParser.ValueContext ctx) {
        property+=" value=\""+ctx.getChild(0)+"\"/>";
    }

    @Override
    public void exitValue(grammarEPNParser.ValueContext ctx) {

    }

    @Override public void enterTime(grammarEPNParser.TimeContext ctx) {
        property+=" name=\"time\"";
        property+=" value=\"";
        property += ctx.getChild(0) + "\"";
    }

    @Override public void exitTime(grammarEPNParser.TimeContext ctx) { }

    @Override public void enterTipo(grammarEPNParser.TipoContext ctx) {
        property+=" unit=\"";
        property += ctx.getChild(0) + "\"/>";
    }

    @Override public void exitTipo(grammarEPNParser.TipoContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}