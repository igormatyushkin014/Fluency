package com.visuality.fluencydemo;

import android.app.Activity;
import android.os.Bundle;

import com.visuality.fluency.Letter;
import com.visuality.fluency.Phrase;
import com.visuality.fluency.Sentence;
import com.visuality.fluency.SoundType;
import com.visuality.fluency.Word;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Letter letter = new Letter(
                "c",
                SoundType.CONSONANT
        );

        Word word = new Word.Builder()
                .addLetter(
                        letter
                )
                .build();

        Phrase phrase = new Phrase.Builder()
                .addSentence(
                        new Sentence()
                )
                .build();
    }
}
