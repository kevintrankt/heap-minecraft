package rip.kevin.heapminecraft;

import com.google.gson.JsonObject;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

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
        String properties = "{ \"Advancement\": \"" + a.getCriteria().toString() + "\", \"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"}";
        api.track("Player: Advancement Done", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerAnimationEvent(PlayerAnimationEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"}";
        api.track("Player: Animation", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e) throws IOException {
        Player p = e.getPlayer();
        Block b = e.getBed();
        String properties = "{\"X\":\"" + b.getX() + "\", \"Y\":\"" + b.getY() + "\", \"Z\":\"" + b.getZ() + "\"}";
        api.track("Player: Leave Bed", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent e) throws IOException {
        Player p = e.getPlayer();
        Block b = e.getBed();
        String properties = "{\"X\":\"" + b.getX() + "\", \"Y\":\"" + b.getY() + "\", \"Z\":\"" + b.getZ() + "\"}";
        api.track("Player: Enter Bed", p.getDisplayName(), properties);
    }

    @EventHandler
    public void onPlayerBucketEvent(PlayerBucketEvent e) throws IOException {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        String properties = "{\"X\":\"" + l.getX() + "\", \"Y\":\"" + l.getY() + "\", \"Z\":\"" + l.getZ() + "\"}";
        api.track("Player: Bucket", p.getDisplayName(), properties);
    }


}
