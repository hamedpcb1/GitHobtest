package ir.ubox.githobtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   int a =1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button push ;
    final TextView print ;
   push =  findViewById(R.id.push);
   print =  findViewById(R.id.print);
   push.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
       print.setText(a+"");
       a=a+1;
     }
   });
  }
}
