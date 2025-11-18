package net.umastrodev.powerlaunchjava.launcher

import net.dreamsbakery.launcher.powerlaunchjava;
import net.umastrodev.powerlaunchjava.launch.utils;
import net.perfect.tea.powerlaunchjava.workflow;
import net.umastrodev.powerlaunchjava.launcher.files;

public class PowerLauncherJavaLauncher {
    public static void(String[] args()) {
   // def ConfigurationFile //
        var ConfigurationFile = launcher.conf.file(System.getProperty("conf") ?: "./launcher.yml");

            if(!configurationFile.exists()) {
            System.out.println("Welcome to PowerLaunchJava :3");
            System.out.println("");
            System.out.println("You Have To Configurate this plugin!");
            System.out.println("");
            System.out.println("In the folder "/launcher" have an archive call "launcher.yml", this is the Configuration File of the Plugin."); 
        }

        val ConfNotExists = launcher.screen.config(power.getScreen("ConfigurationFileNotExistsFile());
            private class ConfigurationFileNotExistsScreen {

            systemScreen.start {
                System.out.println("Welcome to PowerLaunchJava Configuration File Not Exists Screen.");
                System.out.println("");
                System.out.println("Restarting...");
                    
                System.restart(1)
         }
        }
        
            if(!configurationFile.not.exists()) {
                System.out.println("ATTENTION! The Configuration File Not exists! Plesa add "launcher.yml" on the launcher folder!");
                System.out.println("");
                System.out.println("Returning to Configuration File Not Exists Screen...");
                return ConfigurationFileNotExistsScreen
            }       
    }
}
