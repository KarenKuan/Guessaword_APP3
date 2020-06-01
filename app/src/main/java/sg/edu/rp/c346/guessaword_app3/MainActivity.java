package sg.edu.rp.c346.guessaword_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvqns1, tvqns2, tvqns3, tvqns4, tvqns5;
    TextView tvqns6, tvqns7, tvqns8, tvqns9, tvqns10;

    EditText etans1, etans2, etans3, etans4, etans5;
    EditText etans6, etans7, etans8, etans9, etans10;

    ArrayList<String> questions;
    ArrayList<String> answers;

    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Question 1
        tvqns1 = findViewById(R.id.textViewqns1);
        etans1 = findViewById(R.id.editTextans1);

        // Question 2
        tvqns2 = findViewById(R.id.textViewqns2);
        etans2 = findViewById(R.id.editTextans2);

        // Question 3
        tvqns3 = findViewById(R.id.textViewqns3);
        etans3 = findViewById(R.id.editTextans3);

        // Question 4
        tvqns4 = findViewById(R.id.textViewqns4);
        etans4 = findViewById(R.id.editTextans4);

        // Question 5
        tvqns5 = findViewById(R.id.textViewqns5);
        etans5 = findViewById(R.id.editTextans5);

        // Question 6
        tvqns6 = findViewById(R.id.textViewqns6);
        etans6 = findViewById(R.id.editTextans6);

        // Question 7
        tvqns7 = findViewById(R.id.textViewqns7);
        etans7 = findViewById(R.id.editTextans7);

        // Question 8
        tvqns8 = findViewById(R.id.textViewqns8);
        etans8 = findViewById(R.id.editTextans8);

        // Question 9
        tvqns9 = findViewById(R.id.textViewqns9);
        etans9 = findViewById(R.id.editTextans9);

        // Question 10
        tvqns10 = findViewById(R.id.textViewqns10);
        etans10 = findViewById(R.id.editTextans10);

        btnCheck = findViewById(R.id.btncheck);

        // Array of strings for questions...
        questions = new ArrayList<String>();
        String[] questionsarray = {"1.APLEP", "2.MBURLELA", "3.ODG", "4.ARICH", "5.OFOD", "6.COLHSO", "7.TROCYNU",
                "8.ATC", "9.TAE", "10.OHSES"};

        tvqns1.setText(questionsarray[0]);
        tvqns2.setText(questionsarray[1]);
        tvqns3.setText(questionsarray[2]);
        tvqns4.setText(questionsarray[3]);
        tvqns5.setText(questionsarray[4]);
        tvqns6.setText(questionsarray[5]);
        tvqns7.setText(questionsarray[6]);
        tvqns8.setText(questionsarray[7]);
        tvqns9.setText(questionsarray[8]);
        tvqns10.setText(questionsarray[9]);

        // Array of string for answers...
        answers = new ArrayList<String>();
        final String[] answerarray = {"APPLE", "UMBRELLA", "DOG", "CHAIR", "FOOD", "SCHOOL", "COUNTRY", "CAT", "EAT", "SHOES"};

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                String et1 = etans1.getText().toString();
                String et2 = etans2.getText().toString();
                String et3 = etans3.getText().toString();
                String et4 = etans4.getText().toString();
                String et5 = etans5.getText().toString();
                String et6 = etans6.getText().toString();
                String et7 = etans7.getText().toString();
                String et8 = etans8.getText().toString();
                String et9 = etans9.getText().toString();
                String et10 = etans10.getText().toString();
                i.putExtra("answer1", et1);
                i.putExtra("answer2", et2);
                i.putExtra("answer3", et3);
                i.putExtra("answer4", et4);
                i.putExtra("answer5", et5);
                i.putExtra("answer6", et6);
                i.putExtra("answer7", et7);
                i.putExtra("answer8", et8);
                i.putExtra("answer9", et9);
                i.putExtra("answer10", et10);
                startActivity(i);
            }
        });
    }
}
