package com.github.crazcalm.Bash;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;

/**
 * Created by marcuswillock on 5/18/15.
 */
public class ExecuteShellCommands {
    public static void main(String[] args){
        ExecuteShellCommands com = new ExecuteShellCommands();

        System.out.println(
                com.executeCommands("cd /Users/marcuswillock/Repos/IDE_v1.0.1 && npm start")
        );
        System.out.println(com.executeCommands("ls"));



    }

    public String executeCommands(String command) {

        StringBuffer output = new StringBuffer();

        Process p;
        try{

            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while((line = reader.readLine()) != null){
                output.append(line + "\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return output.toString();
    }

}
