package com.ece.designPattern.protoTypeds;

public interface Shape extends Cloneable {

	public abstract Shape clone();
	public abstract void draw();

}
