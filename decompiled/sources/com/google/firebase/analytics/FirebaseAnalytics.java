package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final yw8 a;

    public FirebaseAnalytics(yw8 yw8) {
        z65.k(yw8);
        this.a = yw8;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(yw8.e(context, (Bundle) null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static w49 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        yw8 e = yw8.e(context, bundle);
        if (e == null) {
            return null;
        }
        return new xu8(e);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = ve2.m;
            return (String) b35.c(((ve2) oe2.c().b(we2.class)).c(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        jv8 f = jv8.f(activity);
        yw8 yw8 = this.a;
        yw8.getClass();
        yw8.c(new ov8(yw8, f, str, str2));
    }
}
