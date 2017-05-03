package io.github.MathieuJeandron.essaipluginnukkit;

import cn.nukkit.command.CommandSender;
import cn.nukkit.command.Command;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

// on n'avait pas besoint d'import cn.nukkit.event.Listener

// Plein d'infos sur http://bukkit.gamepedia.com/Plugin_Tutorial
// A voir comment on "commit" sur Github ? A poursuivre : aide d'éclipse / e-git !
// on va faire des changements

public class Main extends PluginBase {

  public void onEnable(){
    this.getLogger().info("My First Plugin For Nukkit Was Loaded");
  }

  @Override
      public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "nuke":
        sender.sendMessage(TextFormat.RED + "FactionsNuke");
    }

    return true;
  }

}
