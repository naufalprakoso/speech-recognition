package latihanbro.latihanspeech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button speechtotext, texttospeech, draganddrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        speechtotext = (Button) findViewById(R.id.speechtotext);
        texttospeech = (Button) findViewById(R.id.texttospeech);
        draganddrop = (Button) findViewById(R.id.draganddrop);

        draganddrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, draganddrop.class);
                startActivity(i);
            }
        });

        speechtotext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, MainActivity.class);
                startActivity(i);
            }
        });

        texttospeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, main.class);
                startActivity(i);
            }
        });
    }
}