package hekung.example.com.game2048;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by wenzh on 2018/4/9.
 */

public class Card extends FrameLayout {
    private int num;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        if (num<=0){
            numText.setText("");
        }else{
        numText.setText(num+"");
        }
    }

    private TextView numText;

    public Card(@NonNull Context context) {
        super(context);


        numText=new TextView(getContext());
        numText.setTextSize(32);
        numText.setBackgroundColor(0x33ffffff);
        numText.setGravity(Gravity.CENTER);
        LayoutParams lp=new LayoutParams(-1,-1);
       // lp.gravity= Gravity.CENTER;
        lp.setMargins(10,10,0,0);
        addView(numText,lp);
    }
    public boolean equals(Card card){
        return getNum()==card.getNum();
    }
}
