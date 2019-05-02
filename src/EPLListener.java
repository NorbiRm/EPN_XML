import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class EPLListener implements grammarEPNListener{

    Map<Integer,String> variables =  new HashMap<>();
    Stack<String> stack = new Stack<>();
    Stack<String> stackEPL = new Stack<>();

    int ruleId = 1;
    int propertyId = 1;
    int ifId = 1;

    String property = "";

    String from = "";
    String where = "";
    String groupOperator = "";
    String groupOperatorValue = "";
    ArrayList<String> groupNames = new ArrayList<String>();
    ArrayList<String> groupCondition = new ArrayList<String>();



    @Override public void enterExpr(grammarEPNParser.ExprContext ctx) { }

    @Override public void exitExpr(grammarEPNParser.ExprContext ctx) {
        System.out.println("XML Generated: ");
        for (String x:stack
        ) {
            if(!x.equals("")) {
                System.out.println(x);
            }
        }
        System.out.println("EPL Generated: ");
        for (String x:stackEPL
        ) {
            if(!x.equals("")) {
                System.out.println(x);
            }
        }

    }

    @Override public void enterStatement(grammarEPNParser.StatementContext ctx) {
        ifId=1;

        String rule="";
        rule+="<rule id="+ruleId+" group=\"";
        rule+= ctx.getChild(0).getChild(1).getChild(1)!=null ? ctx.getChild(0).getChild(1).getChild(1).getText() : "rule";
        rule += "\">";


        stack.push(rule);

        //EPL Segment
        String line = "";
        line += "@Name'" + ruleId  +" ";
        line += ctx.getChild(0).getChild(1).getChild(1)!=null ? ctx.getChild(0).getChild(1).getChild(1).getText() : "name";
        line += " Rule" + ruleId + "'";

        stackEPL.push(line);

        where += ctx.getChild(0).getChild(1).getChild(1)!=null ? ctx.getChild(0).getChild(1).getChild(1).getText() : "name";



        ruleId++;

    }

    @Override public void exitStatement(grammarEPNParser.StatementContext ctx) {
        stack.push("</rule>");

        //EPL Segment

        String selectLine= "select *from eParsereventStream.win:timebatch("+from+")";
        stackEPL.push(selectLine);

        String whereLine= "where (" + where + ")";
        stackEPL.push(whereLine);

        String groupLine = "group by " + groupNames.get(groupNames.size()-1);

        String oper = "=";


        if (groupOperator.equals("greater than")){
            oper = ">=" + groupOperatorValue;
            groupLine += " having count(*)" +oper ;
        }else if (groupOperator.equals("less than")){
            oper = "<=" + groupOperatorValue;
            groupLine += " having count(*)" +oper ;
        }


        for (String x: groupCondition
        ) {
            if (x.equals("same")) {
                groupLine += " and count(same " + groupNames.get(groupCondition.indexOf(x)) + ")" + oper;
            } else if (x.equals("different")) {
                groupLine += " and count(different " + groupNames.get(groupCondition.indexOf(x)) + ")" + oper;
            }
        }


        stackEPL.push(groupLine);
    }

    @Override public void enterIf_statement(grammarEPNParser.If_statementContext ctx) {
        propertyId = 1;

        String test = "";

        test += "<test ";

        test +=" group=\"";
        test += ctx.getChild(1).getChild(1)!=null ? ctx.getChild(1).getChild(1).getText() : "name";

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
        property+=" name=\"";
        property += ctx.getText() + "\"";

        property+=" qualifier=\"";
        property += "ANY\"";

        property+=" name=\"";
        property += ctx.getText() + "\"/>";
    }
    
    @Override public void exitAny(grammarEPNParser.AnyContext ctx) {
    }
    
    @Override public void enterHaving(grammarEPNParser.HavingContext ctx) {


        property+=" value="+ctx.getChild(0);

        //EPL Segment

        groupCondition.add(ctx.getChild(0).toString());


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

        //EPL Segment
        groupOperator=ctx.getChild(0).toString();
    }

    @Override public void exitOperador(grammarEPNParser.OperadorContext ctx) {
    }

    @Override
    public void enterValue(grammarEPNParser.ValueContext ctx) {
        property+=" value=\""+ctx.getChild(0)+"\"/>";

        //EPL Segment
        String  var = "";
        try{
            var +=Integer.parseInt(ctx.getChild(0).toString());
            groupOperatorValue+=var;
        }catch (NumberFormatException e){
            groupNames.add(ctx.getChild(0).toString());
        }


    }

    @Override
    public void exitValue(grammarEPNParser.ValueContext ctx) {

    }

    @Override public void enterTime(grammarEPNParser.TimeContext ctx) {
        property+=" name=\"time\"";
        property+=" value=\"";
        property += ctx.getChild(0) + "\"";

        //EPL Segment
        from += ctx.getChild(0);
    }

    @Override public void exitTime(grammarEPNParser.TimeContext ctx) { }

    @Override public void enterTipo(grammarEPNParser.TipoContext ctx) {
        property+=" unit=\"";
        property += ctx.getChild(0) + "\"/>";

        //EPL Segment
        from += " " + ctx.getChild(0);
    }

    @Override public void exitTipo(grammarEPNParser.TipoContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}