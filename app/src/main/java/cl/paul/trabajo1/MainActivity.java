

package cl.paul.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
     ImageButton btSpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSpa=(ImageButton) findViewById(R.id.btSpa);
        Intent intent = new Intent(this, MainActivity2.class);
         btSpa.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(intent);
             }
         });




    }
}