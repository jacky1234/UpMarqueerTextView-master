package neacy.upmarqueer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import neacy.upmarqueer.bean.GonggaoBean;
import neacy.upmarqueer.bean.ViewPointBean;
import neacy.upmarqueer.bean.ViewPointDeatils;

/**
 * 模仿淘宝APP 的 淘宝头条
 *
 * @author HadisNZL on 16.3.18.
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.marquee)
    private UpDownTextView mMarqueeTextView;
    @ViewInject(R.id.marquee1)
    private UpDownTextView mMarqueeTextView1;
    private List<GonggaoBean.GongGaoData.GongGaoDetails> list = new ArrayList<>();
    private int index = 0;
    private int TIME = 6 * 1000; //没执行一次所需要的时间
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        initData();

    }

    private void initData() {
        // String requeUrl = "http://www.ubetween.cn/api/article/list/cat/19/pageno/0/pagesize/5";
        String requeUrl = "http://doctor.ubetween.com.cn/api/notice/list/pagesize/2/pageno/0";
        x.http().get(new RequestParams(requeUrl), new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                GonggaoBean parseObject = JSONObject.parseObject(result, GonggaoBean.class);
                list.addAll(parseObject.getData().getData2());
                mMarqueeTextView.setText("① " + list.get(0).getNtitle());
                mMarqueeTextView1.setText("② " + list.get(0).getNcontent());
                handler.postDelayed(runnable, TIME);

                mMarqueeTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this.getApplicationContext(),mMarqueeTextView.getText().toString(),Toast.LENGTH_LONG)
                                .show();
                    }
                });

                mMarqueeTextView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this.getApplicationContext(),mMarqueeTextView1.getText().toString(),Toast.LENGTH_LONG)
                                .show();
                    }
                });
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * handler自带方法实现定时器
     */
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                handler.postDelayed(this, TIME);
                index++;
                if (index > list.size()) {
                    index = 0;
                }
                mMarqueeTextView.setText("① " + list.get(index).getNtitle());
                mMarqueeTextView1.setText("② " + list.get(index).getNcontent());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

}
