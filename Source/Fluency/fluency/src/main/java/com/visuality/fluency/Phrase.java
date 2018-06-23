package com.visuality.fluency;

import java.util.ArrayList;

public class Phrase {

    private Sentence[] sentences;

    public Sentence[] getSentences() {
        return this.sentences;
    }

    public Phrase(
            Sentence[] sentences
    ) {
        this.sentences = sentences;
    }

    public static class Builder {

        private ArrayList<Sentence> sentences;

        public Builder addSentence(Sentence sentence) {
            this.sentences.add(sentence);
            return this;
        }

        public Builder() {
            this.sentences = new ArrayList<>();
        }

        public Phrase build() {
            return new Phrase(
                    this.sentences.toArray(
                            new Sentence[]{}
                    )
            );
        }
    }
}
