package com.londonappbrewery.destini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static com.londonappbrewery.destini.R.string.T1_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button buttonTop;
    Button buttonBottom;
    TextView storyTextView;
    int storyIndex;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        storyIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (storyIndex == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);

                }else if(storyIndex == 2){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(GONE);
                    buttonBottom.setVisibility(GONE);
                    buttonReset.setVisibility(VISIBLE);

                }else if(storyIndex == 3){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(T3_Ans1);
                    buttonBottom.setText(T3_Ans2);

                }else if(storyIndex == 4){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(GONE);
                    buttonBottom.setVisibility(GONE);
                    buttonReset.setVisibility(VISIBLE);
                }
                storyIndex++;
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
         buttonBottom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (storyIndex ==1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);

                }else if(storyIndex == 2){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(GONE);
                    buttonBottom.setVisibility(GONE);
                    buttonReset.setVisibility(VISIBLE);

                }else if(storyIndex ==3){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(GONE);
                    buttonBottom.setVisibility(GONE);
                    buttonReset.setVisibility(VISIBLE);

                }else if(storyIndex == 4){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(GONE);
                    buttonBottom.setVisibility(GONE);
                    buttonReset.setVisibility(VISIBLE);
                }
                storyIndex = storyIndex + 2;
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
    }
}