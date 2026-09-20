package defpackage;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: zf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf extends c1 implements i81 {
    private volatile Object _preHandler = this;

    public zf() {
        super(d63.z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L_0x0030;
     */
    public final void B(e81 e81, Throwable th) {
        Method method;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Object obj2 = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class[]) null);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            if (method != null) {
                obj = method.invoke((Object) null, (Object[]) null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
