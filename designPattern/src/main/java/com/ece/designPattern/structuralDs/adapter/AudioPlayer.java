package com.ece.designPattern.structuralDs.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equals("MP4")) {

			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		if (audioType.equals("VLC")) {
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);

		}

		if (audioType.equals("MP3")) {

			System.out.println("Playing Music");

		}

	}

}
