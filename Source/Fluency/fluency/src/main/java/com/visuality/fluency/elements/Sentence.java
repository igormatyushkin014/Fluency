package com.visuality.fluency.elements;

import java.util.ArrayList;

public class Sentence implements TextElement {

    private SentenceElement[] elements;

    public SentenceElement[] getElements() {
        return this.elements;
    }

    public Sentence(
            SentenceElement[] elements
    ) {
        this.elements = elements;
    }

    @Override
    public String getSpelling() {
        StringBuilder builder = new StringBuilder();

        for (SentenceElement element : this.elements) {
            builder.append(
                    element.getSpelling()
            );
        }

        return builder.toString();
    }

    public static class Builder {

        private ArrayList<SentenceElement> elements;

        public Builder addElement(SentenceElement element) {
            this.elements.add(element);
            return this;
        }

        public Builder() {
            this.elements = new ArrayList<>();
        }

        public Sentence build() {
            return new Sentence(
                    this.elements.toArray(
                            new SentenceElement[]{}
                    )
            );
        }
    }
}
