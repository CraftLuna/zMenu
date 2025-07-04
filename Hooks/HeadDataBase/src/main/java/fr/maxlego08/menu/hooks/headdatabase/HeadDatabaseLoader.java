package fr.maxlego08.menu.hooks.headdatabase;

import fr.maxlego08.menu.api.loader.MaterialLoader;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HeadDatabaseLoader extends MaterialLoader {

    public HeadDatabaseLoader() {
        super("hdb");
    }

    @Override
    public ItemStack load(Player player, YamlConfiguration configuration, String path, String materialString) {

        try {

            HeadDatabaseAPI api = new HeadDatabaseAPI();
            return api.getItemHead(materialString);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

}
