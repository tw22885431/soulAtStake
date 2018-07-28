package testfive.testfive;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class soulAtStake implements CommandExecutor {

    public soulAtStake(TestFive testFive) {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player)sender;

        if (command.getName().equalsIgnoreCase("stake")){

            if (args.length == 0)



        }

        return false;

    }


}
