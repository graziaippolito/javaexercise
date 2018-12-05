package org.demo.lesson2.tasks.inheritance;

public class Gymnast extends Player {

    private String artisticSkill;

    public Gymnast(String nation, int height, String artisticSkill) {
        super(nation, height);
        this.artisticSkill = artisticSkill;
    }

    public String getArtisticSkill() {
        return artisticSkill;
    }

    public void setArtisticSkill(String artisticSkill) {
        this.artisticSkill = artisticSkill;
    }

    @Override
    public String toString() {
        return "\nGymnast {" + super.toString() +
               "\nartistic skill = " + artisticSkill +
               "\n}";
    }
}
