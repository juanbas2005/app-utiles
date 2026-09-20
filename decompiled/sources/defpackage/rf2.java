package defpackage;

import android.util.AndroidRuntimeException;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: rf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rf2 implements xv0, ul7, ps6 {
    public final /* synthetic */ int w;

    public /* synthetic */ rf2(int i) {
        this.w = i;
    }

    public static void b(String str) {
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void e(int i, int i2, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(("No parameter with index " + i + '+' + i2 + " (name=" + obj + " type=" + obj2 + ") in " + obj3).toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [char, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static /* synthetic */ void f(int r1, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + r1).toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        throw new AndroidRuntimeException("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void j(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [char, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int r5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + r5).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append('/');
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void p(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void r(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void s(String str, Object obj) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void u(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void w(String str, Object obj) {
        throw new Error(str + obj);
    }

    public static /* synthetic */ void x(String str, Object obj) {
        throw new Error(str + obj);
    }

    public static /* synthetic */ void y(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void z(String str, Object obj) {
        throw new AssertionError(str + obj);
    }

    public boolean a() {
        return false;
    }

    public Object apply(Object obj) {
        switch (this.w) {
            case 3:
                nf5 nf5 = (nf5) obj;
                try {
                    int h = nf5.h((og6) null);
                    byte[] bArr = new byte[h];
                    vs0 vs0 = new vs0(bArr, h);
                    nf5.i(vs0);
                    if (h - vs0.d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    String name = nf5.class.getName();
                    throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                dk4 dk4 = (dk4) obj;
                cf4 cf4 = tt5.a;
                cf4.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cf4.e(dk4, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    public Object d(kd6 kd6) {
        switch (this.w) {
            case 1:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(kd6);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(kd6);
        }
    }
}
