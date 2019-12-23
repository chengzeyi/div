package pers.cheng.div.jdilearning;

import lombok.Data;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.LaunchingConnector;
import com.sun.jdi.connect.Connector;

import java.util.Map;

import com.sun.jdi.Bootstrap;

/**
 * JDIDebugger
 */
@Data
public class JDIDebugger {
    private Class debugClass;
    private int[] breakPointLines;

    public VirtualMachine connectAndLaunchVM() throws Exception{
        LaunchingConnector launchingConnector = Bootstrap.virtualMachineManager().defaultConnector();
        Map<String, Connector.Argument> arguments = launchingConnector.defaultArguments();
        arguments.get("main").setValue(debugClass.getName());
        return launchingConnector.launch(arguments);
    }
}
