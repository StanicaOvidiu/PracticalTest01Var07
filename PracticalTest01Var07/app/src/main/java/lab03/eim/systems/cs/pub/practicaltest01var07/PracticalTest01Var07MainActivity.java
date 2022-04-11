package lab03.eim.systems.cs.pub.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {
    private EditText upLeftEditText;
    private EditText upRightEditText;
    private EditText downLeftEditText;
    private EditText downRightEditText;
    private Button setButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);

        upLeftEditText = (EditText)findViewById(R.id.up_left_edit_text);
        upRightEditText = (EditText)findViewById(R.id.up_right_edit_text);
        downLeftEditText = (EditText)findViewById(R.id.down_left_edit_text);
        downRightEditText = (EditText)findViewById(R.id.down_right_edit_text);
        setButton = (Button)findViewById(R.id.set_button);
    }
}