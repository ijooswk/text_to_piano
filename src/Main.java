import java.applet.Applet;
import java.util.Random;

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
		String sentence = "In the General MIDI specificiation, MIDI channel 9 is reserved for the use with percussion instruments. In this context, a percussion instrument means an instrument that has no note-setting or pitch setting";
		try {
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
			synthesizer.open();

			MidiChannel[] channels = synthesizer.getChannels();
			char[] text = sentence.toCharArray();
			int length = text.length;
			for(int i=0;i<length;i++){
				int ascii = (int) text[i];
				Random oRandom = new Random();
				int veloc = oRandom.nextInt(400) + 1;
				if(text[i] == ' '){
					Thread.sleep(400);
				}else{
					channels[0].noteOn(ascii, 70);
					Thread.sleep(veloc);
					channels[0].noteOff(70);	
				}
				
			}
			synthesizer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
