package sample.android.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //リストビューの取得
        ListView listView = (ListView)findViewById(R.id.listView);

        //リストビューに表示する要素を設定
        ArrayList<SampleListIItem> ListItem = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            //リソースをデコードする
            Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher);
            SampleListIItem item = new SampleListIItem(bmp,"text no " + String.valueOf(i));
            ListItem.add(item);
        }
        //出力結果をリストビューに表示
        SampleListAdapter adapter = new SampleListAdapter(this,R.layout.samplelist_item,ListItem);
        //リストビューにアダプターをセットする
        listView.setAdapter(adapter);

    }
}
