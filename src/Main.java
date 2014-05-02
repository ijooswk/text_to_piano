import java.applet.Applet;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 * 
 */

/**
 * @author sehunpark
 * 
 */
public class Main extends Applet {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
			synthesizer.open();

			MidiChannel[] channels = synthesizer.getChannels();

			channels[0].noteOn(60, 60);
			Thread.sleep(200);
			channels[0].noteOff(60);
			
			channels[0].noteOn(60, 60);
			Thread.sleep(200);
			channels[0].noteOff(60);
			channels[0].noteOn(60, 60);
			Thread.sleep(200);
			channels[0].noteOff(60);
			channels[0].noteOn(60, 60);
			Thread.sleep(200); 
			channels[0].noteOff(60);
			synthesizer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
