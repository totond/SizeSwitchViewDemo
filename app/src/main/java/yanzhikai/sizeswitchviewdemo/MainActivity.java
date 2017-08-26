package yanzhikai.sizeswitchviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.widget.Toast;

import java.util.List;

import yanzhikai.sizeswitchview.BigDirectionKey;
import yanzhikai.sizeswitchview.SizeSwitchView;

public class MainActivity extends AppCompatActivity implements BigDirectionKey.OnKeyClickListener{
    private SizeSwitchView mSizeSwitchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSizeSwitchView = (SizeSwitchView) findViewById(R.id.ssv);
        mSizeSwitchView.setOnBigKeyClickListener(this);

    }



    @Override
    public void onKeyClick(int index) {
        switch (index){
            case 0:
                mSizeSwitchView.toSmallMode();
                break;
            case 1:
                makeToast("1");
                break;
            case 2:
                makeToast("2");
                break;
            case 3:
                makeToast("3");
                break;
            case 4:
                makeToast("4");
                break;
        }
    }

    private void makeToast(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
