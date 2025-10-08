import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// import java.awt.Toolkit;
import java.io.File;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;


    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            
            try {
                Thread.sleep(1000); 

                LocalTime now = LocalTime.now();
                
                // int hours = now.getHour();
                // int minutes = now.getMinute();
                // int seconds = now.getSecond();
                
                // System.out.println(LocalTime.now());
                // System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

                // Prints the output while clearing previous output inline
                // System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
                System.out.printf("\r%02d:%02d:%02d",
                                  now.getHour(),
                                  now.getMinute(), 
                                  now.getSecond());
            
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }

        System.out.println("\n*ALARM NOISES*");
        // Toolkit.getDefaultToolkit().beep();
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            clip.close();
            
            // Thread.sleep(5000);
            scanner.close();
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        }
        catch(LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        }
        catch(Exception e) {
            System.out.println("Error reading audio file");
        }



    }
    
}
