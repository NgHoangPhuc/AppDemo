package hoangphucsvmc.com.appdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnLeft;
    Button btnRight;
    TextView txtScore;
    int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);
        txtScore = (TextView) findViewById(R.id.txtScore);
        point = 0;

        setData();
    }

    private void setData(){
        Random rd = new Random();
        int left = rd.nextInt(9);
        int right = rd.nextInt(9);

        btnLeft.setText(""+left);
        btnRight.setText(""+right);
        txtScore.setText(""+point);
    }

    private void onClickBtnLeft(){
        Toast.makeText(this,"Click Left",Toast.LENGTH_SHORT).show();
    }
    private void onClickBtnRight(){
        Toast.makeText(this,"Click Right",Toast.LENGTH_SHORT).show();
    }
}
