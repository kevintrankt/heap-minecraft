package rip.kevin.heapminecraft;

import org.bukkit.Location;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

import java.io.IOException;

public class HeapMinecraft extends JavaPlugin implements Listener {
    HeapConnector api = new HeapConnector("507671635");

    @Override
    public void onEnable() {
        getLogger().info("beep boop - heap hoop.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerAdvancementDone(PlayerAdvancementDoneEvent e) throws IOException {
        Player p = e.getPlayer();
        Advancement a = e.getAdvancement();
        Location l = p.getLocation();

        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"," +
                "\"Advancement\": \"" + a.getCriteria().toString() + "\"" +
                "}";
        api.track("Player: Advancement Done", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerAnimationEvent(PlayerAnimationEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
//        api.track("Player: Animation", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Leave Bed", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Enter Bed", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Bucket Empty", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerBucketFillEvent(PlayerBucketFillEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Bucket Fill", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerChangedMainHandEvent(PlayerChangedMainHandEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Changed Main Hand", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerChangedWorld(PlayerChangedWorldEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Changed World", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerChatEvent(PlayerChatEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Message\":\"" + e.getMessage() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Chat", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerChangedWorld(PlayerCommandSendEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Send Command", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerChangedWorld(PlayerDropItemEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Drop Item", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerEditBookEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Edit Book", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerEggThrowEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Throw Egg", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerExpChangeEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Exp Change", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerFishEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Fish", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerGameModeChangeEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Gamemode Change", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerHarvestBlockEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Harvest Block", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerInteractEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Interact", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerItemBreakEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Break Item", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerItemConsumeEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Consume Item", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerItemDamageEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Item Damage", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerItemHeldEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Item Held", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerItemMendEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Item Mend", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerJoinEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Joined Server", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerKickEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Kicked", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerLevelChangeEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Level Change", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerLocaleChangeEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Locale Change", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerMoveEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
//        api.track("Player: Move", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerPickupItemEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Pick up Item", p.getDisplayName(), properties);
    }


    @EventHandler
    public void onPlayer(PlayerQuitEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Quit", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerShearEntityEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Sheer", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayer(PlayerSpawnLocationEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"," +
                "\"Experience\":\"" + p.getExp() + "\"," +
                "\"Exhaustion\":\"" + p.getExhaustion() + "\"," +
                "\"Allow Flight\":\"" + p.getAllowFlight() + "\"," +
                "\"Food Level\":\"" + p.getFoodLevel() + "\"," +
                "\"Level\":\"" + p.getLevel() + "\"," +
                "\"Health Scale\":\"" + p.getHealthScale() + "\"," +
                "\"Locale\":\"" + p.getLocale() + "\"," +
                "\"Player Time\":\"" + p.getPlayerTime() + "\"," +
                "\"Saturation\":\"" + p.getSaturation() + "\"," +
                "\"Total Experience\":\"" + p.getTotalExperience() + "\"," +
                "\"Walk Speed\":\"" + p.getWalkSpeed() + "\"" +
                "}";
        api.track("Player: Spawn Location", p.getDisplayName(), properties);
    }
}
