package br.com.treinaweb.gridviewexemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

/**
 * Created by Tony on 15/05/2016.
 */
public class FullImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        Intent i = getIntent();

        if(i.hasExtra("id")){
            int position = i.getExtras().getInt("id");

            ImageView imageView = (ImageView) findViewById(R.id.full_image);
            imageView.setImageResource(ImageAdapter.imagens[position]);
        }
    }
}
