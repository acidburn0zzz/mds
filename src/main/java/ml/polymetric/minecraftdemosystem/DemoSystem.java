package ml.polymetric.minecraftdemosystem;

import java.util.ArrayList;

public class DemoSystem {
	private static boolean recording = false;
	private static boolean playing = false;
	private static boolean rendering = false;
	private static ArrayList<Object> packets = new ArrayList<Object>();

	public static void startDemoRecord(String path) {
		if (recording) {
			// TODO chat error message
			System.out.println("Already recording!");
			return;
		}
		recording = true;
		// TODO Create thread
		// TODO Use thread to loop and get server packets then save them to file
	}

	public static void stopDemoRecord() {
		// TODO Create thread
		// TODO Use thread to loop and get server packets then save them to file
	}

	public static void startDemoPlayback(String path) {
		playing = true;
		if (playing) {
			stopDemoPlayback();
		}
		// TODO playback demo with specified framerate
	}

	public static void stopDemoPlayback() {
		if (!playing) {
			System.out.println("Not currently playing anything");
			return;
		}
		// TODO stop demo playback
	}

	public static void startRendering(String demoPath, String renderPath) {
		startRendering(demoPath, renderPath, 30);
	}

	public static void startRendering(String demoPath, String renderPath, int framerate) {
		// TODO start recording to file
	}

	public static void stopRendering() {
		if (!rendering) {
			System.out.println("Not currently rendering anything");
			return;
		}
		// TODO stop rendering
	}

	// TODO replace object with packet
	public static void savePacket(String path, Object packet) {
		packets.add(packet);
	}
}
