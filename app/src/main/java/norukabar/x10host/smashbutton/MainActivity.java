package norukabar.x10host.smashbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnGenerar;
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGenerar = findViewById(R.id.btnGenerarMain);
        txtShow = findViewById(R.id.txtShowMain);

        txtShow.setText(SmashString());

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtShow.setText(SmashString());
            }
        });

    }


    public String SmashString(){

        String resultado="";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();

        int randomNum;

        for (int i = 0; i < 25; i++) {

            randomNum = (int) (Math.random()*alphabet.length);

            if ((Math.random()*10+1) <= 5) {
                resultado = resultado + alphabet[randomNum];
            }else{
                resultado = resultado + String.valueOf(alphabet[randomNum]).toUpperCase();
            }
        }
        return resultado;

    }


}
