package com.ece.designPattern.structuralDs.adapter;

public class DriverMainAdapter {
public static void main(String[] args) {
	
	MediaPlayer a1=new AudioPlayer();
	
	a1.play("MP3", "song.mp3");
	a1.play("VLC", "VLC.mp4");
	a1.play("MP4", "MP4.mp4");
	
	
}
}
