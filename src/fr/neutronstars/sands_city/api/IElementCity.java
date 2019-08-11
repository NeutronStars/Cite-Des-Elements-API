package fr.neutronstars.sands_city.api;

import fr.neutronstars.sands_city.api.display.DisplayManager;
import fr.neutronstars.sands_city.api.entities.IPlayerManager;
import fr.neutronstars.sands_city.api.inventory.*;
import fr.neutronstars.sands_city.api.money.IMoneyManager;
import fr.neutronstars.sands_city.api.sql.ISQLManager;
import fr.neutronstars.sands_city.api.team.ITeamManager;
import fr.neutronstars.sands_city.api.utils.IConfiguration;
import fr.neutronstars.sands_city.api.utils.MessageBuilder;
import fr.neutronstars.sands_city.api.utils.VillagerManager;
import fr.neutronstars.sands_city.api.zone.HouseManager;
import fr.neutronstars.sands_city.api.zone.ZoneArea;
import fr.neutronstars.sands_city.api.zone.ZoneManager;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Logger;

/**
    Cette class sert de point de relais entre toutes les autres.
 */

public abstract class IElementCity
{
    private static IElementCity elementCity;

    /**
     * Récupére l'instance principal de la class.
     * @return sandsCity
     */
    public static IElementCity getElementCity()
    {
        return elementCity;
    }

    /**
     * Permet d'inialiser sandsCity lors du démarrage du server. Il ne dois pas être utiliser dans les projets.
     * @param elementCity
     */
    public static void setElementCity(IElementCity elementCity)
    {
        if(IElementCity.elementCity != null)
            throw new IllegalArgumentException("Cannot be set new Instance of IElementCity !");
        IElementCity.elementCity = elementCity;
    }

    public abstract String getPrefix();

    /**
     * Retourne le logger principal du plugin.
     * @return logger
     */
    public abstract Logger getLogger();

    public abstract JavaPlugin getPlugin();

    /**
     * Retourne le dossier principal de l'API.
     * @return folder
     */
    public abstract File getFolder();

    /**
     * Retourne le fichier de configuration de l'api.
     * @return configuration
     */
    public abstract IConfiguration getConfiguration();

    /**
     * Retourne La gestion de la base de donnée.
     * @return sqlManager
     */
    public abstract ISQLManager getSQLManager();

    /**
     * Retourne la gestion de money
     * @return moneyManager
     */
    public abstract IMoneyManager getMoneyManager();

    /**
     * Retourne une configuration JSON qui s'appelle "name". Si celle ci n'existe pas, elle créer un fichier vide.
     * @param name
     * @return iConfiguration
     */
    public abstract IConfiguration getConfiguration(String name) throws IOException;

    /**
     * Retourne la gestion des joueurs du serveur.
     * @return iPlayerManager
     */
    public abstract IPlayerManager getPlayerManager();

    /**
     * Retourne la gestion des teams du serveur.
     * @return iTeamManager
     */
    public abstract ITeamManager getTeamManager();

    public abstract IInventoryManager getInventoryManager();

    public abstract Optional<String> getArgsDetect(String arg, String... args);

    public abstract Location parseLocation(String location);

    public abstract MessageBuilder createMessageBuilder(String text);

    public abstract MessageBuilder createMessageBuilder(ChatColor color, String text);

    public abstract MessageBuilder createMessageBuilder(BaseComponent component);

    public abstract MessageBuilder createMessageBuilder(MessageBuilder builder);

    public abstract ItemBuilder createItemBuilder(ItemStack itemStack);

    public abstract ItemBuilder createItemBuilder(Material material);

    public abstract ItemBuilder createItemBuilder(Material material, int count);

    public abstract ItemBuilder createItemBuilder(Material material, int count, int data);

    public abstract ItemBuilder createItemBuilder(ItemBuilder builder);

    public abstract IInventory createInventory(String title, int slotCount);

    public abstract IItem createItem(ItemBuilder itemBuilder, IInventory inventory, ItemClick click);

    public abstract ZoneManager getZoneManager();

    public abstract ZoneArea createQuadZone(String name, Location a, Location b);

    public abstract ZoneArea createCircleZone(String name, Location center, int height, int radius);

    public abstract HouseManager getHouseManager();

    public abstract Optional<ZoneArea> parseZoneArea(JSONObject object);

    public abstract VillagerManager getVillagerManager();

    public abstract Block getTargetBlock(Player player, int range);

    public abstract DisplayManager getDisplayManager();

    public abstract boolean hasTeamInfoCredit();

    public abstract void setTeamInfoCredit(boolean teamInfoCredit);

    public abstract boolean canEnteredHouse();

    public abstract void setEnteredHouse(boolean enteredHouse);

    public abstract boolean hasPVPActive();

    public abstract void setPVPActive(boolean active);

    public abstract boolean hasHomeActive();

    public abstract void setHomeActive(boolean active);

    public abstract boolean canEnteredServer();

    public abstract void setEnteredServer(boolean enteredServer);

    public abstract boolean hasFrendlyFire();

    public abstract void setFrendlyFire(boolean frendlyFire);

    public abstract boolean hasBankActive();

    public abstract void setBankActive(boolean bankActive);

    public abstract boolean hasSpleef();

    public abstract void setSpleef(boolean spleef);

    public abstract boolean canKillPig();

    public abstract void setKillPig(boolean killPig);

    public abstract boolean hasDisplay();

    public abstract void setDisplay(boolean display);
}
