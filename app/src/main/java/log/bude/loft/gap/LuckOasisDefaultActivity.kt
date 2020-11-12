package log.bude.loft.gap

import android.net.Uri
import android.provider.Settings
import android.provider.Settings.Secure.ANDROID_ID
import com.google.androidbrowserhelper.trusted.LauncherActivity

class LuckOasisDefaultActivity: LauncherActivity() {

    override fun getLaunchingUrl(): Uri? {
        val oaiUri = super.getLaunchingUrl()

        val secuSetting = Settings.Secure.getString(applicationContext.contentResolver, ANDROID_ID)
        val builder = oaiUri.buildUpon()
                .appendQueryParameter("bid", secuSetting)
                .appendQueryParameter("country", getLCcountry())
                .appendQueryParameter("device", PhoneDeviceOaiUtil.getPhDdevice())

        return builder.build()
    }
}