package log.bude.loft.gap

import android.app.Activity
import android.content.Context
import android.os.Build
import android.telephony.TelephonyManager
import java.util.*

 fun Activity.getLCcountry(): String {
    val telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager?
    var service = ""
    if (telephonyManager != null) {
        service = telephonyManager.simCountryIso.toUpperCase()

        if (service.isEmpty()) {
            service = telephonyManager.networkCountryIso.toUpperCase()
        }
    }
    if (service.isEmpty()) {
        service = Locale.getDefault().isO3Country.toUpperCase()
    }
    if (service.isEmpty()) {
        service = Locale.getDefault().country.toUpperCase()
    }
    if (service.isEmpty() && Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        if (resources.configuration.locales.size() > 0) {
            service = resources.configuration.locales[0].isO3Country
        }
    }
    return service
}