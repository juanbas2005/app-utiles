package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fz8 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final br4 a;

    public fz8(br4 br4) {
        this.a = br4;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        z65.k(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        z65.f(z);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.U()) {
            return str;
        }
        return g(str, r16.Y, r16.T, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.U()) {
            return str;
        }
        return g(str, b96.v, b96.u, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.U()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return f21.h("experiment_id(", str, ")");
        }
        return g(str, ar7.z0, ar7.y0, d);
    }

    public final String d(zr8 zr8) {
        String str;
        br4 br4 = this.a;
        if (!br4.U()) {
            return zr8.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zr8.y);
        sb.append(",name=");
        sb.append(a(zr8.w));
        sb.append(",params=");
        ur8 ur8 = zr8.x;
        if (ur8 == null) {
            str = null;
        } else if (!br4.U()) {
            str = ur8.w.toString();
        } else {
            str = e(ur8.l());
        }
        sb.append(str);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.a.U()) {
            return bundle.toString();
        }
        StringBuilder o = b81.o("Bundle[{");
        for (String next : bundle.keySet()) {
            if (o.length() != 8) {
                o.append(", ");
            }
            o.append(b(next));
            o.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = f((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = f(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            o.append(str);
        }
        o.append("}]");
        return o.toString();
    }

    public final String f(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder o = b81.o("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = e(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (o.length() != 1) {
                    o.append(", ");
                }
                o.append(str);
            }
        }
        o.append("]");
        return o.toString();
    }
}
