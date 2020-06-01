package sg.edu.rp.c346.guessaword_app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvshow;
    String et1, et2, et3, et4, et5, et6, et7, et8, et9, et10;
    Button btnCalculate;

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

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });
    }
}
