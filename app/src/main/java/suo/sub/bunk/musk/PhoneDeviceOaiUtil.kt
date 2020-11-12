package suo.sub.bunk.musk

import android.os.Build

object PhoneDeviceOaiUtil {

    fun getPhDdevice(): String {
        return Build.BRAND.toUpperCase()
    }
}