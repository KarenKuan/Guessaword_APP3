package sg.edu.rp.c346.guessaword_app3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView tvshow;
    ArrayList<String> answers;
    ArrayList<String> useranswers;
    String et1, et2, et3, et4, et5, et6, et7, et8, et9, et10;
    Button btnCalculate;
    int score = 0;
    String strScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvshow = findViewById(R.id.tvshow);
        btnCalculate = findViewById(R.id.btnCalculate);

        et1 = getIntent().getExtras().getString("answer1");
        et2 = getIntent().getExtras().getString("answer2");
        et3 = getIntent().getExtras().getString("answer3");
        et4 = getIntent().getExtras().getString("answer4");
        et5 = getIntent().getExtras().getString("answer5");
        et6 = getIntent().getExtras().getString("answer6");
        et7 = getIntent().getExtras().getString("answer7");
        et8 = getIntent().getExtras().getString("answer8");
        et9 = getIntent().getExtras().getString("answer9");
        et10 = getIntent().getExtras().getString("answer10");

        tvshow.setText(" 1. " + et1 + "\n 2. " + et2 + "\n 3. " + et3 + "\n 4. " + et4 + "\n 5. " + et5
                        + "\n 6. " + et6 + "\n 7. " + et7 + "\n 8. " + et8 + "\n 9. " + et9 + "\n 10. " + et10);

        // Array of string for answers...
        answers = new ArrayList<String>();
        final String[] answerarray = {"APPLE", "UMBRELLA", "DOG", "CHAIR", "FOOD", "SCHOOL", "EAT", "CAT", "EAR", "SHOES"};

        // Array of string for user answers...
        useranswers = new ArrayList<String>();
        final String[] useranswerarray = {et1, et2, et3, et4, et5, et6, et7, et8, et9, et10};

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i = 0; i < 10; i++) {
                    String ans = answerarray[i];
                    String uans = useranswerarray[i];
                    if (ans.equalsIgnoreCase(uans)) {
                        score++;
                    }
                }

//                for (int x = 0; x < answerarray.length; x++) {
//                    for (int z = 0; z < useranswerarray.length; z++) {
//                        String ans = answerarray[x];
//                        String uans = useranswerarray[z];
//                        if (answerarray[x].equalsIgnoreCase(useranswerarray[z])) {
//                            score += 1;
//                            System.out.println(answerarray[x] + " " +  useranswerarray[z]);
//                            System.out.println(score);
//                        }
//                    }
//                }
                strScore = Integer.toString(score);
                Log.d("score_test", strScore);
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("score", strScore);
                startActivity(i);
            }
        });
    }
}
