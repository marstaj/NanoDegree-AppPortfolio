package cz.marstaj.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main activity with list of buttons.
 */
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button buttonStreamer = (Button) findViewById(R.id.buttonStreamer);
    Button buttonScores = (Button) findViewById(R.id.buttonScores);
    Button buttonLibrary = (Button) findViewById(R.id.buttonLibrary);
    Button buttonBigger = (Button) findViewById(R.id.buttonBigger);
    Button buttonReader = (Button) findViewById(R.id.buttonReader);
    Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

    buttonStreamer.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });

    buttonScores.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });

    buttonLibrary.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });

    buttonBigger.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });

    buttonReader.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });

    buttonCapstone.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showToast(((Button) v).getText().toString());
      }
    });
  }

  /**
   * Shows the toast message.
   *
   * @param appName The application name.
   */
  private void showToast(String appName) {
    Toast.makeText(MainActivity.this, getString(R.string.main_toast_message, appName), Toast
        .LENGTH_SHORT).show();
  }
}
