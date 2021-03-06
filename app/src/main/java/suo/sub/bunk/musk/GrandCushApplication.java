package suo.sub.bunk.musk;

import android.app.Application;
import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;

public class GrandCushApplication extends Application {

    private String DEFAUL_FLYER_KEY = "";

    @Override
    public void onCreate() {
        super.onCreate();

        AppsFlyerConversionListener flApListener = new AppsFlyerConversionListener() {

            @Override
            public void onConversionDataSuccess(Map<String, Object> attrConDData) {
            }

            @Override
            public void onConversionDataFail(String errorMessage) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> attributionData) {
            }

            @Override
            public void onAttributionFailure(String errorMessage) {
            }
        };

        AppsFlyerLib.getInstance().init(DEFAUL_FLYER_KEY, flApListener, this);
        AppsFlyerLib.getInstance().startTracking(this);

    }
}
