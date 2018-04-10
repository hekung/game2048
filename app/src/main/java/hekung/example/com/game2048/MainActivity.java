package hekung.example.com.game2048;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreText;
    private int score=0;
    private static MainActivity mainActivity=null;
    public MainActivity(){
        mainActivity=this;
    }
    public static MainActivity getActivity(){
        return mainActivity;
    }
    public void clearScore(){
        score=0;
        showScore();
    }
    public void addScore(int s){
        score+=s;
        showScore();
    }
    public void showScore(){
        scoreText.setText(score+"");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreText=(TextView)findViewById(R.id.score_text);
    }
}
