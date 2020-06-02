package sg.edu.rp.c346.guessaword_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvans;
    TextView tvscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvans = findViewById(R.id.tvans);
        tvscore = findViewById(R.id.tvscore);

        tvans.setText(" 1. APPLE \n 2. UMBRELLA \n 3. DOG \n 4. CHAIR \n 5. FOOD \n 6. SCHOOL \n 7. EAT \n 8. CAT \n 9. EAR \n 10. SHOES");

        score = getIntent().getExtras().getString("score");

        tvscore.setText("The total score is: " + score);

    }
}
