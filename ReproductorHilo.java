import java.io.*;
import javax.sound.sampled.*;

public class ReproductorHilo extends Thread {
 
    @Override 
 
    public void run() {
        try {
            // Cargar archivo de audio y crear Clip
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("cancion.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);

            // Reproducir música y esperar a que termine
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}