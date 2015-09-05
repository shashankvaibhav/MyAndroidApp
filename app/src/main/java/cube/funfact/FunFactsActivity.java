package cube.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.*;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mcolour = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare view variables and assign the views.
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
                int colour = mcolour.getColor();
                relativeLayout.setBackgroundColor(colour);
                showFactButton.setTextColor(colour);
            }

        });

    }
}
