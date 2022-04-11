package lab03.eim.systems.cs.pub.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {
    private EditText upLeftEditText;
    private EditText upRightEditText;
    private EditText downLeftEditText;
    private EditText downRightEditText;
    private Button sumButton;
    private Button productButton;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.sum_button:
                    setResult(RESULT_OK, null);
                    break;
                case R.id.product_button:
                    setResult(RESULT_CANCELED, null);
                    break;
            }
            finish();
        }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_secondary);
    }
}