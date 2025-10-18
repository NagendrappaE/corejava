package com.ece.designPattern.structuralDs.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer = null;

	public MediaAdapter(String audioType) {
		if (audioType.equals("VLC")) {

			advancedMediaPlayer = new VlcPlayer();

		}
		if (audioType.equals("MP4")) {
			advancedMediaPlayer = new Mp4Player();
		}

	}

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equals("VLC")) {

			advancedMediaPlayer.playVlc(fileName);

		}
		if (audioType.equals("MP4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
