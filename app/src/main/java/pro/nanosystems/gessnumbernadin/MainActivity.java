package pro.nanosystems.gessnumbernadin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEnterNum;
    TextView mNumber;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEnterNum=findViewById(R.id.enterNum);
        mNumber=findViewById(R.id.numView);



    }

    public void checkNum(View view) {

        int num1,num2;



        rand=new Random();
        int correctNum=rand.nextInt(10);
        correctNum =correctNum+1;
        mNumber.setText(""+correctNum);

        num1=Integer.parseInt(mEnterNum.getText().toString());
        num2=Integer.parseInt(mNumber.getText().toString());


        if(num1==num2) {
            Toast.makeText(this, "correct", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"InCorrect",Toast.LENGTH_LONG).show();
        }


    }
}
