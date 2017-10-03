package come.wordpress.share2study.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    List<Integer> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        images = new ArrayList<>();
        images.add(R.drawable.avata);
        images.add(R.drawable.background);
        images.add(R.drawable.gabi);

        Random random = new Random();
        int vitri = random.nextInt(images.size());
        linearLayout.setBackgroundResource(images.get(vitri));

    }
}
