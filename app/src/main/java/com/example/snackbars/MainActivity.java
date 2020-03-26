package com.example.snackbars;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button msnackbarButton;
    private FloatingActionButton floatingActionButton;

    /* use this layout to contain the snackbar and make
    the padding between the button and the layout to
    make the button move when the snackbar Appear*/

    private CoordinatorLayout mcoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msnackbarButton = findViewById(R.id.snackBarButton);

        floatingActionButton = findViewById(R.id.floatingActionButton);

        mcoordinatorLayout = findViewById(R.id.snackbar_layout);


        msnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(mcoordinatorLayout, "This Is The SnackBar", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000); // Appear 10 sec on screen
                // snackbar.setAnchorView(floatingActionButton); // not appear on the floating action button
                snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                snackbar.setAction("Dismiss", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //do something here
                    }
                });
                snackbar.show();


            }
        });
    }
}
