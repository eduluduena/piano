/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pianito;
import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;
/**
 *
 * @author deipola
 */
public class Pianito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Note note = new Note();
        note.setPitch(JMC.B4);
        Play.midi(note);
        
        
    }
    
}
