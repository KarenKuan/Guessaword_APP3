package sg.edu.rp.c346.guessaword_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvans = findViewById(R.id.tvans);

        tvans.setText(" 1. APPLE \n 2. UMBRELLA \n 3. DOG \n 4. CHAIR \n 5. FOOD \n 6. SCHOOL \n 7. COUNTRY \n 8. CAT \n 9. EAT \n 10. SHOES");
    }
}
