package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import java.util.concurrent.Executor;

/* renamed from: xb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xb4 implements xv0, a76, d81, rr0, gx6, ba7, j51 {
    public static final i80 A = new i80(1.0f, -1.0f);
    public static final i80 B = new i80(-1.0f, 0.0f);
    public static final i80 C = new i80(0.0f, 0.0f);
    public static final i80 D = new i80(1.0f, 0.0f);
    public static final i80 E = new i80(-1.0f, 1.0f);
    public static final i80 F = new i80(0.0f, 1.0f);
    public static final i80 G = new i80(1.0f, 1.0f);
    public static final h80 H = new h80(-1.0f);
    public static final h80 I = new h80(0.0f);
    public static final h80 J = new h80(1.0f);
    public static final g80 K = new g80(-1.0f);
    public static final g80 L = new g80(0.0f);
    public static final g80 M = new g80(1.0f);
    public static final /* synthetic */ xb4 N = new xb4(2);
    public static final pe0 O = new pe0((Throwable) null);
    public static final xb4 P = new xb4(3);
    public static final xb4 Q = new xb4(4);
    public static final xb4 R = new xb4(5);
    public static final xb4 S = new xb4(6);
    public static final xb4 T = new xb4(7);
    public static final /* synthetic */ xb4 U = new xb4(9);
    public static final xb4 V = new xb4(10);
    public static final xb4 W = new xb4(11);
    public static final ku4 X = new ku4(7);
    public static final xb4 Y = new xb4(13);
    public static final xb4 Z = new xb4(14);
    public static final xb4 a0 = new xb4(15);
    public static final xb4 b0 = new xb4(16);
    public static final xb4 c0 = new xb4(17);
    public static xb4 x;
    public static final i80 y = new i80(-1.0f, -1.0f);
    public static final i80 z = new i80(0.0f, -1.0f);
    public final /* synthetic */ int w;

    public /* synthetic */ xb4(int i) {
        this.w = i;
    }

    public static wp3 b(String str) {
        zo3 zo3;
        char charAt = str.charAt(0);
        zo3[] values = zo3.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                zo3 = null;
                break;
            }
            zo3 = values[i];
            if (zo3.y.charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (zo3 != null) {
            return new vp3(zo3);
        }
        if (charAt == 'V') {
            return new vp3((zo3) null);
        }
        if (charAt == '[') {
            return new tp3(b(str.substring(1)));
        }
        if (charAt == 'L') {
            boolean B0 = d57.B0(str, ';');
        }
        return new up3(str.substring(1, str.length() - 1));
    }

    public static GetCredentialException e(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new NoCredentialException(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new GetCredentialCancellationException(str2);
            }
        }
        return new GetCredentialUnknownException(str2);
    }

    public static void g(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }

    public static String h(wp3 wp3) {
        wp3.getClass();
        if (wp3 instanceof tp3) {
            return "[".concat(h(((tp3) wp3).i));
        }
        if (wp3 instanceof vp3) {
            zo3 zo3 = ((vp3) wp3).i;
            if (zo3 != null) {
                return zo3.y;
            }
            return "V";
        } else if (wp3 instanceof up3) {
            return hl6.o(new StringBuilder("L"), ((up3) wp3).i, ';');
        } else {
            h.c();
            return null;
        }
    }

    public static /* bridge */ en8 i(Object obj) {
        nl8 nl8 = (nl8) obj;
        en8 en8 = nl8.zzc;
        if (en8 != en8.f) {
            return en8;
        }
        en8 a = en8.a();
        nl8.zzc = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[LOOP:0: B:21:0x0048->B:24:0x0055, LOOP_START] */
    public static boolean j(int i, tt2 tt2, Object obj) {
        yk8 yk8 = (yk8) tt2.e;
        int i2 = tt2.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            tt2.w(0);
            ((en8) obj).d(i3 << 3, Long.valueOf(yk8.r()));
            return true;
        } else if (i4 == 1) {
            tt2.w(1);
            ((en8) obj).d((i3 << 3) | 1, Long.valueOf(yk8.t()));
            return true;
        } else if (i4 == 2) {
            ((en8) obj).d((i3 << 3) | 2, tt2.E());
            return true;
        } else if (i4 == 3) {
            en8 a = en8.a();
            int i5 = i3 << 3;
            int i6 = i + 1;
            if (i6 < 100) {
                while (tt2.D() != Integer.MAX_VALUE && j(i6, tt2, a)) {
                }
                if ((i5 | 4) == tt2.b) {
                    if (a.e) {
                        a.e = false;
                    }
                    ((en8) obj).d(i5 | 3, a);
                    return true;
                }
                zz8.b("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        } else if (i4 != 4) {
            if (i4 == 5) {
                tt2.w(5);
                ((en8) obj).d(5 | (i3 << 3), Integer.valueOf(yk8.u()));
                return true;
            }
            kj6.g();
            return false;
        } else if (i != 0) {
            return false;
        } else {
            zz8.b("Protocol message end-group tag did not match expected tag.");
            return false;
        }
    }

    public void D0(j43 j43, a97 a97) {
        Object obj;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                j43.getClass();
                j43.z.f(s53.m, new fa((hs2) a97, (f61) null, 1));
                return;
            default:
                hs2 hs2 = (hs2) a97;
                j43.getClass();
                s63 s63 = t63.b;
                au auVar = z43.a;
                iz0 iz0 = (iz0) j43.D.d(z43.a);
                if (iz0 != null) {
                    obj = iz0.d(t63.c);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    ((t63) obj).a.add(new yi2(hs2, j43, (f61) null));
                    return;
                }
                StringBuilder sb = new StringBuilder("Plugin ");
                sb.append(s63);
                au auVar2 = t63.c;
                sb.append(" is not installed. Consider using `install(");
                sb.append(auVar2);
                sb.append(")` in client config first.");
                throw new IllegalStateException(sb.toString());
        }
    }

    public void a(Drawable drawable, yt2 yt2, int i) {
        int i2;
        boolean z2;
        yt2.g0(257732500);
        if (yt2.i(drawable)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            ml4 l = yu6.l(jl4.w, z51.e);
            boolean i4 = yt2.i(drawable);
            Object Q2 = yt2.Q();
            if (i4 || Q2 == ay0.a) {
                Q2 = new ay5(20, (Object) drawable);
                yt2.o0(Q2);
            }
            mb0.a(pv8.x(l, (vr2) Q2), yt2, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dx4(this, drawable, i, 17);
        }
    }

    public long c(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) > Float.intBitsToFloat((int) (j2 >> 32)) || Float.intBitsToFloat((int) (j & 4294967295L)) > Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            float f = h03.f(j, j2);
            long floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            int i = yf6.a;
            return floatToRawIntBits;
        }
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
        int i2 = yf6.a;
        return floatToRawIntBits2;
    }

    public Object d(kd6 kd6) {
        Object s = kd6.s(new av5(t30.class, Executor.class));
        s.getClass();
        return we.l((Executor) s);
    }

    public int f(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    public String toString() {
        switch (this.w) {
            case h75.g:
                return "Center";
            default:
                return super.toString();
        }
    }
}
