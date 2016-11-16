package tw.org.iii.christ04;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button test1, test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad","onCreate");

        test1 = (Button)findViewById(R.id.test1);
        test2 = (Button)findViewById(R.id.test2);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad","onDestroy");
    }

    public void test1(View view){
        Intent it = new Intent(this, Page2Activity.class);
        startActivity(it);
        Log.v("brad", "test1 return");
    }

}
