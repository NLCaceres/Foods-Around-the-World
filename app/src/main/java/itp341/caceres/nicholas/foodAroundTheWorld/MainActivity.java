package itp341.caceres.nicholas.foodAroundTheWorld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView americanImageView;
    private String americanURL;
    private ImageView filipinoImageView;
    private String filipinoURL;
    private ImageView mexicanImageView;
    private String mexicanURL;
    private ImageView peruvianImageView;
    private String peruvianURL;
    private ImageView italianImageView;
    private String italianURL;
    private ImageView japaneseImageView;
    private String japaneseURL;
    private Toast americanFoodTst;
    private Toast filipinoFoodTst;
    private Toast mexicanFoodTst;
    private Toast peruvianFoodTst;
    private Toast italianFoodTst;
    private Toast japaneseFoodTst;
    int americanCnt = 1;
    int filipinoCnt = 1;
    int mexicanCnt = 1;
    int peruvianCnt = 1;
    int italianCnt = 1;
    int japaneseCnt = 1;
    private imageClickListener clickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        americanImageView = (ImageView) findViewById(R.id.american_Food_View);
        americanURL = getResources().getString(R.string.american_url);
        filipinoImageView  = (ImageView) findViewById(R.id.filipino_Food_View);
        filipinoURL = getResources().getString(R.string.filipino_url);
        mexicanImageView = (ImageView) findViewById(R.id.mexican_Food_View);
        mexicanURL = getResources().getString(R.string.mexican_url);
        peruvianImageView = (ImageView) findViewById(R.id.peruvian_Food_View);
        peruvianURL = getResources().getString(R.string.peruvian_url);
        italianImageView = (ImageView) findViewById(R.id.italian_Food_View);
        italianURL = getResources().getString(R.string.italian_url);
        japaneseImageView = (ImageView) findViewById(R.id.japanese_Food_View);
        japaneseURL = getResources().getString(R.string.japanese_url);

        Glide.with(this)
                .load(americanURL)
                .override(500,500)
                .into(americanImageView);

        Glide.with(this)
                .load(filipinoURL)
                .override(500,500)
                .into(filipinoImageView);

        Glide.with(this)
                .load(mexicanURL)
                .override(500,500)
                .into(mexicanImageView);

        Glide.with(this)
                .load(peruvianURL)
                .override(500,500)
                .into(peruvianImageView);

        Glide.with(this)
                .load(italianURL)
                .override(500,500)
                .into(italianImageView);

        Glide.with(this)
                .load(japaneseURL)
                .override(500,500)
                .into(japaneseImageView);

        clickListener = new imageClickListener();
        americanImageView.setOnClickListener(clickListener);
        filipinoImageView.setOnClickListener(clickListener);
        mexicanImageView.setOnClickListener(clickListener);
        peruvianImageView.setOnClickListener(clickListener);
        italianImageView.setOnClickListener(clickListener);
        japaneseImageView.setOnClickListener(clickListener);
    }

    private class imageClickListener implements OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.american_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.american_food))
                            .override(500, 500)
                            .into(americanImageView);

                    if (americanCnt > 1) {
                        americanFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_american) + " " + americanCnt + " " + getResources().getString(R.string.toast_ending2), americanFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        americanFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_american) + " " + americanCnt + " " + getResources().getString(R.string.toast_ending), americanFoodTst.LENGTH_SHORT).show();
                    }
                    americanCnt++;
                    break;

                case R.id.filipino_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.filipino_food))
                            .override(500, 500)
                            .into(filipinoImageView);

                    if (filipinoCnt > 1) {
                        filipinoFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_filipino) + " " + filipinoCnt + " " + getResources().getString(R.string.toast_ending2), filipinoFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        filipinoFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_filipino) + " " + filipinoCnt + " "+ getResources().getString(R.string.toast_ending), filipinoFoodTst.LENGTH_SHORT).show();
                    }
                    filipinoCnt++;
                    break;

                case R.id.mexican_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.mexican_food))
                            .override(500,500)
                            .into(mexicanImageView);

                    if (mexicanCnt > 1) {
                        mexicanFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_mexican) + " " + mexicanCnt + " " + getResources().getString(R.string.toast_ending2), mexicanFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        mexicanFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_mexican) + " " + mexicanCnt + " " + getResources().getString(R.string.toast_ending), mexicanFoodTst.LENGTH_SHORT).show();
                    }
                    mexicanCnt++;
                    break;

                case R.id.peruvian_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.peruvian_food))
                            .override(500, 500)
                            .into(peruvianImageView);

                    if (peruvianCnt > 1) {
                        peruvianFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_peruvian) + " " + peruvianCnt + " " + getResources().getString(R.string.toast_ending2), peruvianFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        peruvianFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_peruvian) + " " + peruvianCnt + " " + getResources().getString(R.string.toast_ending), peruvianFoodTst.LENGTH_SHORT).show();
                    }
                    peruvianCnt++;
                    break;

                case R.id.italian_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.italian_food))
                            .override(500,500)
                            .into(italianImageView);

                    if (italianCnt > 1) {
                        italianFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_italian) + " " + italianCnt + " " + getResources().getString(R.string.toast_ending2), italianFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        italianFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_italian) + " " + italianCnt + " " + getResources().getString(R.string.toast_ending), italianFoodTst.LENGTH_SHORT).show();
                    }
                    italianCnt++;
                    break;

                case R.id.japanese_Food_View:

                    Glide.with(MainActivity.this)
                            .load(getResources().getString(R.string.japanese_food))
                            .override(500,500)
                            .into(japaneseImageView);

                    if (japaneseCnt > 1) {
                        japaneseFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_japanese) + " " + japaneseCnt + " " + getResources().getString(R.string.toast_ending2), japaneseFoodTst.LENGTH_SHORT).show();
                    }
                    else {
                        japaneseFoodTst.makeText(MainActivity.this, getResources().getString(R.string.toast_japanese) + " " + japaneseCnt + " " + getResources().getString(R.string.toast_ending), japaneseFoodTst.LENGTH_SHORT).show();
                    }
                    japaneseCnt++;
                    break;
            }
        }
    }
}
