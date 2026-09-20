package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaf;

/* renamed from: yn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yn8 {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[RETURN] */
    public static Intent a(Context context, h69 h69) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str = h69.a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent((ComponentName) null);
        }
        if (h69.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                if (acquireUnstableContentProviderClient != null) {
                    bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", (String) null, bundle2);
                    acquireUnstableContentProviderClient.release();
                    if (bundle != null) {
                        Intent intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb = new StringBuilder(str.length() + 72);
                                sb.append("Dynamic lookup for intent failed for action ");
                                sb.append(str);
                                sb.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb.toString());
                                throw new zzaf(new m11(25, pendingIntent, (String) null));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } else {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
            } catch (RemoteException e) {
                e = e;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
                if (bundle != null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        if (intent == null) {
            return new Intent(str).setPackage(h69.b);
        }
        return intent;
    }
}
