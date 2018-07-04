package monopolybankir.com.monopolybank;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import monopolybankir.com.monopolybank.newgamesettings.NewGameFrag;

public class MainActivity extends AppCompatActivity implements NewGameFrag.onNewGameListener
{

    BottomAppBar bottomAppBar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomAppBar = findViewById(R.id.bar);
        fab = findViewById(R.id.fab);

        setSupportActionBar(bottomAppBar);

    }

    @Override
    public void onGameCreated() {

    }
}
