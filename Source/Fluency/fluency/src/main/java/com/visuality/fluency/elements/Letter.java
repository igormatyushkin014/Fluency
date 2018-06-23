package com.visuality.fluency.elements;

public class Letter implements TextElement {

    private String spelling;

    @Override
    public String getSpelling() {
        return this.spelling;
    }

    private SoundType soundType;

    public SoundType getSoundType() {
        return this.soundType;
    }

    public Letter(
            String spelling,
            SoundType soundType
    ) {
        this.spelling = spelling;
        this.soundType = soundType;
    }
}
