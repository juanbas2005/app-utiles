package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;

/* renamed from: i  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final bz2 c = new bz2((String[]) new ArrayList(20).toArray(new String[0]));

    static {
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        b = config;
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || d57.I0(str)) {
            return null;
        }
        int L0 = d57.L0(str, '#', 0, 6);
        if (L0 != -1) {
            str = str.substring(0, L0);
        }
        int L02 = d57.L0(str, '?', 0, 6);
        if (L02 != -1) {
            str = str.substring(0, L02);
        }
        return mimeTypeMap.getMimeTypeFromExtension(d57.d1('.', d57.d1('/', str, str), ""));
    }

    public static final boolean c(Uri uri) {
        if (!sg3.e(uri.getScheme(), "file") || !sg3.e((String) dt0.y0(uri.getPathSegments()), "android_asset")) {
            return false;
        }
        return true;
    }

    public static final int d(mp7 mp7, wf6 wf6) {
        if (mp7 instanceof bv1) {
            return ((bv1) mp7).L;
        }
        int ordinal = wf6.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        h.c();
        return 0;
    }
}
