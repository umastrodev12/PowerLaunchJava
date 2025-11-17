package net.umastrodev.powerlaunchjava

import net.perfect.tea.dreamsbakery.launch;
import net.umastrodev.dreamsbakery.java.launch;
import net.dreamsbakery.mc.powerlaunchjava.plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowerLaunchJava extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("plugin ligado com sucesso!");
        Bukkit.getConsoleSender().sendMessage("Plugin  iniciado com sucesso!");
        // Plugin startup logic

    }

    @Override
    public void onLoad() {
        getLogger().info("Espera! Vou ligar ainda!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Desativado com Sucesso!")
            Bukkit.getConsoleSender().sendMessage("O Plugin foi desativado!")
    }
}
}

public class DreamsBakeryConfig {
    dreams = int(Config)(Bukkit)getConsoleSender().sendMessage("A Configuração do Plugin DreamsBakery foi iniciado e configurado com sucesso!");
    dreamsconfig.finalize.umastrodev {
        System.out.println("A Configuração da DreamsBakery foi finalizada!")
    }

}