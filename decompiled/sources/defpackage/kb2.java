package defpackage;

import android.util.Log;
import androidx.window.core.WindowStrictModeException;

/* renamed from: kb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kb2 extends z85 {
    public final Object d;
    public final String e;
    public final d48 f;
    public final WindowStrictModeException g;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Throwable, java.lang.Exception, androidx.window.core.WindowStrictModeException] */
    public kb2(Object obj, String str, kw5 kw5, d48 d48) {
        obj.getClass();
        d48.getClass();
        this.d = obj;
        this.e = str;
        this.f = d48;
        ? exc = new Exception(str + " value: " + obj);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        stackTrace.getClass();
        exc.setStackTrace((StackTraceElement[]) qs.R0(2, stackTrace).toArray(new StackTraceElement[0]));
        this.g = exc;
    }

    public final Object f() {
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            throw this.g;
        } else if (ordinal == 1) {
            Object obj = this.d;
            obj.getClass();
            Log.d("zs6", this.e + " value: " + obj);
            return null;
        } else if (ordinal == 2) {
            return null;
        } else {
            h.c();
            return null;
        }
    }

    public final z85 v(String str, vr2 vr2) {
        return this;
    }
}
