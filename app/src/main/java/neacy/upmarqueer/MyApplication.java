package neacy.upmarqueer;

import android.app.Application;
import android.content.Context;
import android.widget.ImageView;

import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * 全局APP入口
 *
 * @author HadisNZL on 16.3.18.
 */

public class MyApplication extends Application {
    public static MyApplication app;
    public static ImageOptions imageOptions;
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //初始化xutils3.x
        x.Ext.init(this);
        x.Ext.setDebug(true);// 是否输出debug日志
        context = getApplicationContext();
        imageOptions = new ImageOptions.Builder()
                // 图片大小
//                .setSize(DensityUtil.dip2px(240), DensityUtil.dip2px(200))
//                .setSize(DensityUtil.getScreenWidth(), ((DensityUtil.getScreenWidth() * 9) / 16))
                // ImageView圆角半径
                .setRadius(DensityUtil.dip2px(8))
                        // 如果ImageView的大小不是定义为wrap_content, 不要crop.
                .setCrop(true)
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .setLoadingDrawableId(R.mipmap.ic_launcher)// 加载中默认显示图片
                .setFailureDrawableId(R.mipmap.ic_launcher)// 加载失败后默认显示图片
                .build();
    }

    public static MyApplication getInstance() {
        return app;
    }

    public static Context getMyContext() {
        return context;
    }

    public static ImageOptions getImageOptions() {
        return imageOptions;
    }
}
