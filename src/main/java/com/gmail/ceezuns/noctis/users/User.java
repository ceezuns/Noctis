package com.gmail.ceezuns.noctis.users;

import com.gmail.ceezuns.noctis.sets.SetsManager;
import com.gmail.ceezuns.noctis.users.cobble.CobbleManager;
import com.gmail.ceezuns.noctis.users.graves.GravesManager;
import com.gmail.ceezuns.noctis.users.markers.MarkerManager;
import com.gmail.ceezuns.noctis.users.nicknames.NicknameManager;
import com.gmail.ceezuns.noctis.users.ores.OresManager;
import com.gmail.ceezuns.noctis.users.pin.PinManager;
import com.gmail.ceezuns.noctis.utilities.ConfigurationFile;
import org.bukkit.entity.Player;

public class User {

	private Player player;
	private ConfigurationFile configurationFile;
	private MarkerManager markerManager;
	private CobbleManager cobbleManager;
	private GravesManager gravesManager;
	private PinManager pinManager;
	private OresManager oresManager;
	private NicknameManager nicknameManager;
	private SetsManager setsManager;

	public User(Player player) {
		this.player = player;
		this.configurationFile = new ConfigurationFile(this.player.getName());
		this.markerManager = new MarkerManager(this.configurationFile);
		this.cobbleManager = new CobbleManager(this.configurationFile);
		this.gravesManager = new GravesManager(this.configurationFile);
		this.pinManager = new PinManager(this.configurationFile);
		this.oresManager = new OresManager(this.configurationFile);
		this.nicknameManager = new NicknameManager(this.configurationFile);
		this.setsManager = new SetsManager(this.configurationFile);
	}

	public void load() {
		this.markerManager.load();
		this.cobbleManager.load();
		this.gravesManager.load();
		this.pinManager.load();
		this.oresManager.load();
		this.nicknameManager.load();
		this.setsManager.load();
	}

	public void save() {
		this.markerManager.save();
		this.cobbleManager.save();
		this.gravesManager.save();
		this.pinManager.save();
		this.oresManager.save();
		this.nicknameManager.save();
		this.setsManager.save();
	}

	public Player getPlayer() {
		return this.player;
	}

	public MarkerManager getMarkerManager() {
		return this.markerManager;
	}

	public CobbleManager getCobbleManager() {
		return this.cobbleManager;
	}

	public GravesManager getGravesManager() {
		return this.gravesManager;
	}

	public PinManager getPinManager() {
		return this.pinManager;
	}

	public OresManager getOresManager() {
		return this.oresManager;
	}

	public NicknameManager getNicknameManager() {
		return this.nicknameManager;
	}

	public SetsManager getSetsManager() {
		return setsManager;
	}
}
