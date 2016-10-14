package my.edu.tarc.myhello;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMessage;
    ImageView imageViewHappy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Show UI
        setContentView(R.layout.activity_main);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        imageViewHappy=(ImageView)findViewById(R.id.imageView);
    }

    public void showMessage(View view){
        textViewMessage.setText("Welcome to Android.");
    }

    public void hidePicture(View v){
        //image.setVisibility()
        imageViewHappy.setVisibility(View.GONE);


    }

    public void appearPicture(View v){
        //image.setVisibility()

        imageViewHappy.setVisibility(View.VISIBLE);

    }
}

