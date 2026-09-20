package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* renamed from: ma2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ma2 {
    public static final String a = b26.a.b(ma2.class).A();

    public static int a() {
        d48 d48 = d48.w;
        d48 d482 = hj8.a;
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (d482 != d48) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (d482 != d48) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        } catch (NullPointerException unused3) {
            if (d482 != d48) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        }
    }
}
