package com.ece.designPattern.structuralDs.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

		System.out.println("Playing VLC");
		
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing
		
	}



}
