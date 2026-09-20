package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: cu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface cu8 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(ju8 ju8);

    void getAppInstanceId(ju8 ju8);

    void getCachedAppInstanceId(ju8 ju8);

    void getConditionalUserProperties(String str, String str2, ju8 ju8);

    void getCurrentScreenClass(ju8 ju8);

    void getCurrentScreenName(ju8 ju8);

    void getGmpAppId(ju8 ju8);

    void getMaxUserProperties(String str, ju8 ju8);

    void getSessionId(ju8 ju8);

    void getTestFlag(ju8 ju8, int i);

    void getUserProperties(String str, String str2, boolean z, ju8 ju8);

    void initForTests(Map map);

    void initialize(y73 y73, iv8 iv8, long j);

    void initializeWithElapsedTime(y73 y73, iv8 iv8, long j, long j2);

    void isDataCollectionEnabled(ju8 ju8);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, ju8 ju8, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, y73 y73, y73 y732, y73 y733);

    void onActivityCreated(y73 y73, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(jv8 jv8, Bundle bundle, long j);

    void onActivityDestroyed(y73 y73, long j);

    void onActivityDestroyedByScionActivityInfo(jv8 jv8, long j);

    void onActivityPaused(y73 y73, long j);

    void onActivityPausedByScionActivityInfo(jv8 jv8, long j);

    void onActivityResumed(y73 y73, long j);

    void onActivityResumedByScionActivityInfo(jv8 jv8, long j);

    void onActivitySaveInstanceState(y73 y73, ju8 ju8, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(jv8 jv8, ju8 ju8, long j);

    void onActivityStarted(y73 y73, long j);

    void onActivityStartedByScionActivityInfo(jv8 jv8, long j);

    void onActivityStopped(y73 y73, long j);

    void onActivityStoppedByScionActivityInfo(jv8 jv8, long j);

    void performAction(Bundle bundle, ju8 ju8, long j);

    void registerOnMeasurementEventListener(tu8 tu8);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(pu8 pu8);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(y73 y73, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(jv8 jv8, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(tu8 tu8);

    void setInstanceIdProvider(hv8 hv8);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, y73 y73, boolean z, long j);

    void unregisterOnMeasurementEventListener(tu8 tu8);
}
