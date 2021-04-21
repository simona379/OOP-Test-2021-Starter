package ie.tudublin;

public class Note {

    private char note;
    private int duration;

    //Constructor (not default)
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    //toString() method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }
    
    
}
