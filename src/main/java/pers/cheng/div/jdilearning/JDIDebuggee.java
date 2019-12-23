package pers.cheng.div.jdilearning;

/**
 * JDIDebuggee
 */
public class JDIDebuggee {
    public static void main(String[] args) {
        JDIDebugger debuggerInstance = new JDIDebugger();
        debuggerInstance.setDebugClass(JDIDebuggee.class);
        int[] breakPoints = { 6, 9 };
        debuggerInstance.setBreakPointLines(breakPoints);
    }
}
