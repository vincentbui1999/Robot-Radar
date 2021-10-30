import java.awt.event.KeyEvent;

public class CommandInterpreter 
{
    /**
     * this function will interpreting Keyevent into command and json package
     * @param evt Keyevent
     * @return json package of evt press
     */
    public String InterpretingCommand(java.awt.event.KeyEvent evt)
    {
        String command = "";

        switch(evt.getKeyCode())
        {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                command = "moveForward";
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                command = "moveBackward";
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                command = "rotateLeft";
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                command = "rotateRight";
                break;
            case KeyEvent.VK_ALT:
                command = "Halt";
                break;
            default:
                break;
        }

        return InterpretingCommand(command);
    }

    /**
     * this function will interpreting command into json package
     * @param command command to be interpreting
     * @return jsonPackage
     */
    public String InterpretingCommand(String command)
    {
        String jsonPackage;

        if(command.indexOf("(") > 0)
        {
            String argument = command.substring(command.indexOf("(") + 1, command.indexOf(")"));
            command = command.substring(0, command.indexOf("("));
            jsonPackage = String.format("{\"command\":\"%s\",\"angle\":%s}", command, argument);
        }
        else
            jsonPackage = String.format("{\"command\":\"%s\"}", command);

        return jsonPackage;
    }

    
}
