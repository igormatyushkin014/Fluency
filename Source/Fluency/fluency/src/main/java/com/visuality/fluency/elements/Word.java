package com.visuality.fluency.elements;

import java.util.ArrayList;

public class Word implements SentenceElement {

    private Letter[] letters;

    public Letter[] getLetters() {
        return this.letters;
    }

    public Word(
            Letter[] letters
    ) {
        this.letters = letters;
    }

    @Override
    public String getSpelling() {
        StringBuilder builder = new StringBuilder();

        for (Letter letter : this.letters) {
            builder.append(
                    letter.getSpelling()
            );
        }

        return builder.toString();
    }

    public static class Builder {

        private ArrayList<Letter> letters;

        public Builder addLetter(Letter letter) {
            this.letters.add(letter);
            return this;
        }

        public Builder() {
            this.letters = new ArrayList<>();
        }

        public Word build() {
            return new Word(
                    this.letters.toArray(
                            new Letter[]{}
                    )
            );
        }
    }
}
