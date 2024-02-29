import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText equationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equationEditText = findViewById(R.id.equationEditText);
        Button refreshButton = findViewById(R.id.refreshButton);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num1 = random.nextInt(10);
                int num2 = random.nextInt(10);
                String equation = num1 + " + " + num2 + " = " + (num1 + num2);
                equationEditText.setText(equation);

                equationEditText.setBackgroundColor(Color.WHITE);
            }
        });
    }
}
