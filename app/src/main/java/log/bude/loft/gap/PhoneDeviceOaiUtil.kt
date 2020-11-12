package log.bude.loft.gap

import android.os.Build

object PhoneDeviceOaiUtil {

    fun getPhDdevice(): String {
        return Build.BRAND.toUpperCase()
    }
}