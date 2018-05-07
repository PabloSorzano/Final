package cecyt9.ipn.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    Intent c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void iniciaDrawable(View view){
        c = new Intent(getApplicationContext(), Drawable.class);
        finish();
        startActivity(c);
    }

    public void iniciaThreads(View view){
        c = new Intent(getApplicationContext(), Threads.class);
        finish();
        startActivity(c);
    }
}
