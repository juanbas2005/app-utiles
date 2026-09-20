package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzaeg;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: kj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kj6 implements lj6, g61, i07, pf7, jn7, xv0, m78 {
    public static final kj6 A = new kj6(14);
    public static final kj6 B = new kj6(15);
    public static final kj6 x = new kj6(11);
    public static final kj6 y = new kj6(12);
    public static final kj6 z = new kj6(13);
    public final /* synthetic */ int w;

    public /* synthetic */ kj6(kd6 kd6) {
        this.w = 3;
    }

    public static /* synthetic */ void g() {
        throw new zzaeg();
    }

    public static /* synthetic */ void h(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void j(String str, int i, Object obj, Object obj2) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void o(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void p(String str, Object obj) {
        throw new IOException(str + obj);
    }

    public boolean a() {
        return false;
    }

    public Object c(yb9 yb9) {
        boolean z2;
        if (yb9.k()) {
            dz dzVar = (dz) yb9.i();
            g22 g22 = g22.D;
            g22.o("Crashlytics report successfully enqueued to DataTransport: " + dzVar.b);
            File file = dzVar.c;
            z2 = true;
            if (file.delete()) {
                g22.o("Deleted report file: " + file.getPath());
            } else {
                g22.v("Crashlytics could not delete report file: " + file.getPath(), (Exception) null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", yb9.h());
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public Object d(kd6 kd6) {
        switch (this.w) {
            case 17:
                return in7.b((Context) kd6.a(Context.class));
            case 18:
                return in7.b((Context) kd6.a(Context.class));
            default:
                return in7.b((Context) kd6.a(Context.class));
        }
    }

    public tl7 e(vl vlVar) {
        return new tl7(vlVar, u35.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r2.b == r3.b) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (((defpackage.bg7) r11.e).a.a.x.length() != r5.b) goto L_0x011a;
     */
    public jj6 f(zc9 zc9) {
        ij6 ij6;
        ij6 ij62;
        ij6 ij63;
        boolean z2;
        int i;
        ij6 ij64;
        ij6 ij65;
        switch (this.w) {
            case b85.b:
                return f55.a(zc9, pe2.M);
            default:
                jj6 jj6 = (jj6) zc9.y;
                tt2 tt2 = (tt2) zc9.z;
                if (jj6 == null) {
                    return f55.a(zc9, hz2.K);
                }
                ij6 ij66 = jj6.b;
                ij6 ij67 = jj6.a;
                if (zc9.x) {
                    ij63 = f55.b(zc9, tt2, ij67);
                    ij6 ij68 = ij67;
                    ij62 = ij66;
                    ij66 = ij68;
                    ij6 = ij63;
                } else {
                    ij63 = f55.b(zc9, tt2, ij66);
                    ij6 = ij67;
                    ij62 = ij63;
                }
                if (sg3.e(ij63, ij66)) {
                    return jj6;
                }
                boolean z3 = false;
                if (zc9.b() == fc1.w || (zc9.b() == fc1.y && ij6.b > ij62.b)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jj6 jj62 = new jj6(ij6, ij62, z2);
                tt2 tt22 = (tt2) zc9.z;
                ij6 ij69 = jj62.a;
                long j = ij69.c;
                ij6 ij610 = jj62.b;
                if (j == ij610.c) {
                    break;
                } else {
                    boolean z4 = jj62.c;
                    if (z4) {
                        ij64 = ij69;
                    } else {
                        ij64 = ij610;
                    }
                    if (ij64.b == 0) {
                        if (z4) {
                            ij65 = ij610;
                        } else {
                            ij65 = ij69;
                        }
                        break;
                    }
                    return jj62;
                }
                jj6 jj63 = (jj6) zc9.y;
                String str = ((bg7) tt22.e).a.a.x;
                if (!(jj63 == null || str.length() == 0)) {
                    boolean z5 = zc9.x;
                    String str2 = ((bg7) tt22.e).a.a.x;
                    int i2 = tt22.b;
                    int length = str2.length();
                    if (i2 == 0) {
                        int p = t35.p(0, str2);
                        if (z5) {
                            return jj6.a(jj62, f55.d(ij69, tt22, p), (ij6) null, true, 2);
                        }
                        return jj6.a(jj62, (ij6) null, f55.d(ij610, tt22, p), false, 1);
                    } else if (i2 == length) {
                        int q = t35.q(length, str2);
                        if (z5) {
                            return jj6.a(jj62, f55.d(ij69, tt22, q), (ij6) null, false, 2);
                        }
                        return jj6.a(jj62, (ij6) null, f55.d(ij610, tt22, q), true, 1);
                    } else {
                        if (jj63.c) {
                            z3 = true;
                        }
                        if (z5 ^ z3) {
                            i = t35.q(i2, str2);
                        } else {
                            i = t35.p(i2, str2);
                        }
                        if (z5) {
                            return jj6.a(jj62, f55.d(ij69, tt22, i), (ij6) null, z3, 2);
                        }
                        return jj6.a(jj62, (ij6) null, f55.d(ij610, tt22, i), z3, 1);
                    }
                }
                return jj62;
        }
    }

    public /* synthetic */ kj6(int i) {
        this.w = i;
    }

    public void b(Exception exc) {
    }
}
