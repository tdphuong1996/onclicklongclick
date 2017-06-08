package tdp.com.onclicklongclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnResult;
    private TextView txtA;
    private TextView txtB;
    private int numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResult = (Button) findViewById(R.id.btn_Result);
        txtA = (TextView) findViewById(R.id.txtA);
        txtB = (TextView) findViewById(R.id.txtB);

        btnResult.setOnClickListener(this);
//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!txtA.getText().toString().isEmpty() && !txtB.getText().toString().isEmpty()){
//                    numberA=Integer.parseInt(txtA.getText().toString());
//                    numberB=Integer.parseInt(txtB.getText().toString());
//                    int Result;
//                    Result=numberA+numberB;
//                    Toast.makeText(MainActivity.this, "Kêt quả "+numberA+"  + "+numberB+" = "+Result, Toast.LENGTH_SHORT).show();
//
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập sô ", Toast.LENGTH_SHORT).show();
//                }
//
//               }
//        });
        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Đây là sự kiệ longclickListener", Toast.LENGTH_SHORT).show();
                return  false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Result:
                if (!txtA.getText().toString().isEmpty() && !txtB.getText().toString().isEmpty()) {
                    numberA = Integer.parseInt(txtA.getText().toString());
                    numberB = Integer.parseInt(txtB.getText().toString());
                    int Result;
                    Result = numberA + numberB;
                    Toast.makeText(MainActivity.this, "Kêt quả " + numberA + "  + " + numberB + " = " + Result, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập sô ", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;

        }

    }
}

