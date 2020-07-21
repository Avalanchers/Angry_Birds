package com.mygdx.game.desktop.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
public class Blocks {
	Texture vblock,hblock;
	Sprite svblock,shblock;
	public Blocks()
	{
		vblock=new Texture("veeticalblock.png");
		hblock=new 	Texture("horizentalblock.png");
		svblock = new Sprite(vblock);
		shblock = new Sprite(hblock);
		svblock.setOrigin(0, 0);
		shblock.setOrigin(0, 0);
	}
	public Texture getHblock() {
		return hblock;
	}public Sprite getShblock() {
		return shblock;
	}public Sprite getSvblock() {
		return svblock;
	}public Texture getVblock() {
		return vblock;
	}public void setHblock(Texture hblock) {
		this.hblock = hblock;
	}public void setShblock(Sprite shblock) {
		this.shblock = shblock;
	}public void setSvblock(Sprite svblock) {
		this.svblock = svblock;
	}public void setVblock(Texture vblock) {
		this.vblock = vblock;
	}
}
