package sample.android.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SampleListAdapter extends ArrayAdapter<SampleListIItem> {


    private int mResource;
    private List<SampleListIItem> mITem;
    private LayoutInflater mInflater;

    public SampleListAdapter(@NonNull Context context, int resource, @NonNull List<SampleListIItem> items) {
        super(context, resource, items);

        mResource = resource;
        mITem = items;
        //mInflaterにデータを入れる
        mInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    //ビューを生成するためのメソッド
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;

        if (convertView != null){
            view = convertView;
        }
        else {
            view = mInflater.inflate(mResource,null);
        }
        //リストビューに表示する要素を取得
        SampleListIItem items = mITem.get(position);

        //サムネイル画像を取得
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageBitmap(items.getmImageview());

        //タイトルを設定
        TextView textView = (TextView)view.findViewById(R.id.textView);
        textView.setText(items.gettext());
        return view;
    }
}
