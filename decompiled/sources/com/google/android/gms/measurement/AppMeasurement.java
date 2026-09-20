package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final ws8 a;

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(y19 y19) {
        this.a = new oi8(y19);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (b == null) {
                        w49 w49 = (w49) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", new Class[]{Context.class, Bundle.class}).invoke((Object) null, new Object[]{context, null});
                        if (w49 != null) {
                            b = new AppMeasurement(w49);
                        } else {
                            b = new AppMeasurement(y19.m(context, new iv8(0, 0, true, (Bundle) null, (String) null), (Long) null, (Long) null));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.m(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.n(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.l(str);
    }

    public long generateEventId() {
        return this.a.i();
    }

    public String getAppInstanceId() {
        return this.a.q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i;
        List<Bundle> o = this.a.o(str, str2);
        if (o == null) {
            i = 0;
        } else {
            i = o.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle bundle : o) {
            ? obj = new Object();
            z65.k(bundle);
            Class<String> cls = String.class;
            obj.mAppId = (String) p25.I(bundle, "app_id", cls, (Object) null);
            obj.mOrigin = (String) p25.I(bundle, "origin", cls, (Object) null);
            obj.mName = (String) p25.I(bundle, "name", cls, (Object) null);
            obj.mValue = p25.I(bundle, "value", Object.class, (Object) null);
            obj.mTriggerEventName = (String) p25.I(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            obj.mTriggerTimeout = ((Long) p25.I(bundle, "trigger_timeout", cls2, 0L)).longValue();
            obj.mTimedOutEventName = (String) p25.I(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            obj.mTimedOutEventParams = (Bundle) p25.I(bundle, "timed_out_event_params", cls3, (Object) null);
            obj.mTriggeredEventName = (String) p25.I(bundle, "triggered_event_name", cls, (Object) null);
            obj.mTriggeredEventParams = (Bundle) p25.I(bundle, "triggered_event_params", cls3, (Object) null);
            obj.mTimeToLive = ((Long) p25.I(bundle, "time_to_live", cls2, 0L)).longValue();
            obj.mExpiredEventName = (String) p25.I(bundle, "expired_event_name", cls, (Object) null);
            obj.mExpiredEventParams = (Bundle) p25.I(bundle, "expired_event_params", cls3, (Object) null);
            obj.mActive = ((Boolean) p25.I(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) p25.I(bundle, "creation_timestamp", cls2, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) p25.I(bundle, "triggered_timestamp", cls2, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.j();
    }

    public String getCurrentScreenName() {
        return this.a.e();
    }

    public String getGmpAppId() {
        return this.a.r();
    }

    public int getMaxUserProperties(String str) {
        return this.a.p(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.s(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.f(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        z65.k(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            p25.H(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.k(bundle);
    }

    public AppMeasurement(w49 w49) {
        this.a = new ar8(w49);
    }
}
