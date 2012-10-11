package de.danoeh.antennapod.service;

public enum PlayerStatus {
	ERROR, 
	PREPARING, 
	PAUSED, 
	PLAYING, 
	STOPPED, 
	PREPARED, 
	SEEKING, 
	AWAITING_VIDEO_SURFACE,	// player has been initialized and the media type to be played is a video.
	INITIALIZED	// playback service was started, data source of media player was set.
}
