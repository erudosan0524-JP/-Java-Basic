package com.github.hirotask;

import java.awt.Color;
import java.awt.Graphics;

public class Rect {

	private static final int SIZE = 10;
	private int x, y;
	protected int vx, vy;
	private int width, height;

	public Rect(int x, int y, int vx, int vy, int width, int height) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.width = width;
        this.height = height;
    }

	public void move() {
		x += vx;
		y += vy;

		if (x < 0 || x > width - SIZE) {
			vx = -vx;
		}

		if (y < 0 || y > height - SIZE) {
			vy = -vy;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(x, y, 50, 50);
	}
}
