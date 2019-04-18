package backcar.android.autochips.com.audiotest;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mtext,mtext1,mtext2,mtext3;
    private Button mbutton;
    private AudioManager mAudioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello world
        mtext = (EditText)this.findViewById(R.id.edittext);
        mtext1 = (EditText)this.findViewById(R.id.edittext1);
        mtext2 = (EditText)this.findViewById(R.id.edittext2);
        mtext3 = (EditText)this.findViewById(R.id.edittext3);
        mbutton = (Button)this.findViewById(R.id.button);
        mAudioManager = (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
        mbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String text = mtext.getText().toString();
                String text1 = mtext1.getText().toString();
                String text2 = mtext2.getText().toString();
                String text3 = mtext3.getText().toString();


                mAudioManager.setParameters("MIC1_SW_GAIN="+text);
                mAudioManager.setParameters("MIC2_SW_GAIN="+text1);
                mAudioManager.setParameters("MIC1_HW_GAIN="+text2);
                mAudioManager.setParameters("MIC2_HW_GAIN="+text3);
            }
        });
    }
}
