package thom9521.learning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGoogle);
                }
            }
        });

        Button ytBtn = (Button) findViewById(R.id.ytBtn);
        ytBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String youtube = "http://www.youtube.com";
                Uri webaddress = Uri.parse(youtube);

                Intent goToYoutube = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToYoutube.resolveActivity(getPackageManager()) != null){
                    startActivity(goToYoutube);
                }
            }
        });

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(secondActivity);
            }
        });
    }
}
