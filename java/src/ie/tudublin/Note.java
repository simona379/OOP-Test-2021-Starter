package ie.tudublin;

public class Note {

    private char note;
    private int duration;

    //Getters & Setters for note and duration
    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //Constructor (no default constructor needed)
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
