package acadgild.assignment.session9_assignment_2;



import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnShowalertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowalertDialog = (Button) findViewById(R.id.button);

        btnShowalertDialog.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.create();
        builder.setIcon(getResources().getDrawable(R.drawable.cancel));
        builder.setTitle("Confirm Delete ... ");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked the Yes Button .. ", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You Clicked the No Button ...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        builder.show();
    }
}

