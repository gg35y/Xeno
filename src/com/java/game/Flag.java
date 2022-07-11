package com.java.game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Flag extends GameObject {
	private Textures tex = Game.getTextures();

	public Flag(float x, float y, ID id) {
		super(x, y, id);
	}

	public void tick(LinkedList<GameObject> object) {}

	public void render(Graphics g) {
		g.drawImage(tex.item[2], (int)x, (int)y, 32, 32, null);
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
}