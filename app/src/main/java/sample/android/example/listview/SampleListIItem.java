package sample.android.example.listview;

import android.graphics.Bitmap;

public class SampleListIItem {

    private Bitmap mImageview = null;
    private String mtext = null;

    //空のコンストラクタ
    public SampleListIItem() {};

    //コンストラクタ　画像とテキスト
    public SampleListIItem (Bitmap bitmap , String text){
        mImageview = bitmap;
        mtext = text;
    }
    //画像を設定
    public void setmImageview (Bitmap bitmap){
        mImageview = bitmap;
    }
    //テキストを設定
    public void settext(String text){
        mtext = text;
    }

    //画像を取得
    public Bitmap getmImageview() {
        return mImageview;
    }
    //テキストを取得
    public String gettext(){
        return mtext;
    }
}
