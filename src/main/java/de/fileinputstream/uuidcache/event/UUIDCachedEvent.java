package de.fileinputstream.uuidcache.event;


import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This class has been generated by Alexander on 30.04.18 20:33
 * You are not allowed to edit this resource or other components of it
 * © 2018 Alexander Fiedler
 */
public class UUIDCachedEvent extends Event implements Cancellable {

    /**
     * Builds up the {@link UUIDEvictEvent} with the cachedName and the cachedUUID
     *
     * @param cachedName
     * @param cachedUUID
     */
    private static final HandlerList handlers = new HandlerList();
    String cachedName;

    public UUIDCachedEvent(String cachedName, String cachedUUID) {
        this.cachedName = cachedName;
        this.cachedUUID = cachedUUID;
    }
    String cachedUUID;
    boolean cancelled;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean b) {
    }

    @Override
    public String getEventName() {
        return super.getEventName();
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Returns the cached uuid that was given in the constructor.
     *
     * @return
     */
    public String getCachedUUID() {
        return cachedUUID;
    }

    /**
     * Returns the cached name that was given in the constructor.
     *
     * @return String
     */
    public String getCachedName() {
        return cachedName;
    }
}
