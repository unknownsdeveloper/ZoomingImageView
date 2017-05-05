package ankit.developer.unknowns.zoomingimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView photoView = (ImageView) findViewById(R.id.imageview);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(photoView);
        photoViewAttacher.update();
    }
}
