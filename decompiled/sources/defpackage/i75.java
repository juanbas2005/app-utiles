package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.EOFException;
import java.util.ArrayList;
import kotlinx.serialization.json.JsonObject;

/* renamed from: i75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i75 {
    public static x83 a;
    public static x83 b;
    public static final /* synthetic */ int c = 0;
    public static x83 d;

    public static final void a(boolean z, p56 p56, ze7 ze7, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        cg7 d2;
        int i3;
        int i4;
        int i5;
        boolean z5 = z;
        ze7 ze72 = ze7;
        yt2 yt22 = yt2;
        int i6 = i;
        yt22.g0(-1344558920);
        if ((i6 & 6) == 0) {
            if (yt22.h(z5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.e(p56.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 384) == 0) {
            if (yt22.i(ze72)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            int i7 = i2 & 14;
            if (i7 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean g = z3 | yt22.g(ze72);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                Q = new we7(ze72, z5);
                yt22.o0(Q);
            }
            wd7 wd7 = (wd7) Q;
            boolean i8 = yt22.i(ze72);
            if (i7 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | i8;
            Object Q2 = yt22.Q();
            if (z6 || Q2 == d63) {
                Q2 = new af7(ze72, z5);
                yt22.o0(Q2);
            }
            x35 x35 = (x35) Q2;
            boolean g2 = lg7.g(ze72.n().b);
            if (z5) {
                j = ze72.n().b >> 32;
            } else {
                j = ze72.n().b & 4294967295L;
            }
            int i9 = (int) j;
            u44 u44 = ze72.d;
            float f = 0.0f;
            if (!(u44 == null || (d2 = u44.d()) == null)) {
                bg7 bg7 = d2.a;
                if (i9 >= 0) {
                    ag7 ag7 = bg7.a;
                    pn4 pn4 = bg7.b;
                    if (ag7.a.x.length() != 0) {
                        int min = Math.min(pn4.d(i9), Math.min(pn4.b - 1, pn4.f - 1));
                        if (i9 <= pn4.c(min, false)) {
                            pn4.m(min);
                            ArrayList arrayList = pn4.h;
                            jc5 jc5 = (jc5) arrayList.get(tf4.q(min, arrayList));
                            f = jc5.a.d.h(min - jc5.d);
                        }
                    }
                }
            }
            float f2 = f;
            boolean i10 = yt22.i(wd7);
            Object Q3 = yt22.Q();
            if (i10 || Q3 == d63) {
                Q3 = new wf(9, wd7);
                yt22.o0(Q3);
            }
            r16.q(x35, z5, p56, g2, 0, f2, d97.a(jl4.w, wd7, (PointerInputEventHandler) Q3), yt22, (i2 << 3) & 1008);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ii(i6, 2, p56, ze72, z);
        }
    }

    public static final void b(n56 n56, float f, long j) {
        int i;
        n56.getClass();
        float f2 = 0.0f;
        if (!lx1.b(f, Float.NaN)) {
            if (lx1.b(f, 0.0f)) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.ceil((double) (f * n56.w));
            }
        }
        n56.f((byte) 8, n56.H, n56.I);
        z57 z57 = n56.y;
        if (z57 != null) {
            z57.a |= 256;
            z57.k = f2;
        }
        n56.f((byte) 35, n56.H, n56.I);
        hl hlVar = n56.H;
        hl hlVar2 = n56.I;
        cu7 cu7 = cu7.a;
        if (hlVar == cu7) {
            if ((n56.G & 1) != 0) {
                yo4 yo4 = n56.C;
                if (yo4 == null || (hlVar = (hl) yo4.b(50)) == null) {
                    hlVar = o56.a;
                }
            } else {
                hlVar = null;
            }
        }
        if (hlVar2 == cu7) {
            if ((n56.G & 1) != 0) {
                yo4 yo42 = n56.D;
                if (yo42 == null || (hlVar2 = (hl) yo42.b(50)) == null) {
                    hlVar2 = o56.a;
                }
            } else {
                hlVar2 = null;
            }
        }
        if (hlVar == null || hlVar2 == null) {
            i = n56.G & -2;
        } else {
            i = n56.G | 1;
        }
        n56.G = i;
        n56.g(50, hlVar, hlVar2);
        z57 z572 = n56.y;
        if (z572 != null) {
            z572.d(j);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            ku4.j("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static fe6 d(byte[] bArr, Parcelable.Creator creator) {
        z65.k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        fe6 fe6 = (fe6) creator.createFromParcel(obtain);
        obtain.recycle();
        return fe6;
    }

    public static a20 e(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a20(an.d(view));
        }
        return null;
    }

    public static final bg7 f(ak6 ak6) {
        vr2 vr2;
        ArrayList arrayList = new ArrayList();
        Object g = ak6.w.g(zj6.a);
        if (g == null) {
            g = null;
        }
        h4 h4Var = (h4) g;
        if (h4Var == null || (vr2 = (vr2) h4Var.b) == null || !((Boolean) vr2.y(arrayList)).booleanValue()) {
            return null;
        }
        return (bg7) arrayList.get(0);
    }

    public static long g(py6 py6, byte b2, long j, int i) {
        long j2;
        long j3;
        StringBuilder q;
        String str;
        long j4;
        long j5;
        long j6;
        pi6 pi6;
        byte b3 = b2;
        if ((i & 4) != 0) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        py6.getClass();
        long j7 = 0;
        int i2 = (0 > j2 ? 1 : (0 == j2 ? 0 : -1));
        if (i2 > 0) {
            if (j2 < 0) {
                j3 = 0;
                q = hl6.q(0, "startIndex (", ") and endIndex (");
                str = ") should be non negative";
            } else {
                j3 = 0;
                q = hl6.q(0, "startIndex (", ") is not within the range [0..endIndex(");
                str = "))";
            }
            h.j(f21.k(q, j2, str));
            return j3;
        } else if (i2 == 0) {
            return -1;
        } else {
            long j8 = 0;
            while (j8 < j2) {
                py6 py62 = py6;
                if (!py62.j(1 + j8)) {
                    return -1;
                }
                tc0 c2 = py62.c();
                long min = Math.min(j2, py62.c().y);
                c2.getClass();
                long min2 = Math.min(min, c2.y);
                rj1.o(c2.y, j8, min2);
                if (j8 == min2 || (pi6 = c2.w) == null) {
                    j5 = j7;
                    j4 = -1;
                    j6 = -1;
                } else {
                    j4 = -1;
                    long j9 = c2.y;
                    String str2 = "Check failed.";
                    j5 = j7;
                    if (j9 - j8 < j8) {
                        pi6 pi62 = c2.x;
                        while (pi62 != null && j9 > j8) {
                            j9 -= (long) (pi62.c - pi62.b);
                            if (j9 <= j8) {
                                break;
                            }
                            pi62 = pi62.g;
                        }
                        if (j9 != -1) {
                            while (min2 > j9) {
                                pi62.getClass();
                                String str3 = str2;
                                int k = c35.k(pi62, b3, Math.max((int) (j8 - j9), 0), Math.min(pi62.a(), (int) (min2 - j9)));
                                if (k != -1) {
                                    j6 = j9 + ((long) k);
                                } else {
                                    j9 += (long) pi62.a();
                                    pi62 = pi62.f;
                                    if (pi62 != null && j9 < min2) {
                                        str2 = str3;
                                    }
                                }
                            }
                            h.s(str2);
                            return j5;
                        }
                    } else {
                        String str4 = str2;
                        long j10 = j5;
                        while (pi6 != null) {
                            long j11 = ((long) (pi6.c - pi6.b)) + j10;
                            if (j11 > j8) {
                                break;
                            }
                            pi6 = pi6.f;
                            j10 = j11;
                        }
                        if (j10 != -1) {
                            while (min2 > j10) {
                                pi6.getClass();
                                int k2 = c35.k(pi6, b3, Math.max((int) (j8 - j10), 0), Math.min(pi6.a(), (int) (min2 - j10)));
                                if (k2 != -1) {
                                    j6 = ((long) k2) + j10;
                                } else {
                                    j10 += (long) pi6.a();
                                    pi6 = pi6.f;
                                    if (pi6 != null) {
                                        if (j10 >= min2) {
                                        }
                                    }
                                }
                            }
                            h.s(str4);
                            return j5;
                        }
                    }
                    j6 = -1;
                }
                if (j6 != j4) {
                    return j6;
                }
                j8 = py62.c().y;
                j7 = j5;
            }
            return -1;
        }
    }

    public static boolean h(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final byte[] i(py6 py6, int i) {
        py6.getClass();
        long j = (long) i;
        if (j >= 0) {
            return j(py6, i);
        }
        h.j(f21.g(j, "byteCount (", ") < 0"));
        return null;
    }

    public static final byte[] j(py6 py6, int i) {
        if (i == -1) {
            long j = 2147483647L;
            while (py6.c().y < 2147483647L && py6.j(j)) {
                j *= 2;
            }
            if (py6.c().y < 2147483647L) {
                i = (int) py6.c().y;
            } else {
                throw new IllegalStateException(("Can't create an array of size " + py6.c().y).toString());
            }
        } else {
            py6.p((long) i);
        }
        byte[] bArr = new byte[i];
        tc0 c2 = py6.c();
        c2.getClass();
        long j2 = (long) i;
        rj1.o(j2, 0, j2);
        int i2 = 0;
        while (i2 < i) {
            int k = c2.k(bArr, i2, i);
            if (k != -1) {
                i2 += k;
            } else {
                throw new EOFException(pb4.k("Source exhausted before reading ", i, " bytes. Only ", k, " bytes were read."));
            }
        }
        return bArr;
    }

    public static final Object k(pl3 pl3, String str, JsonObject jsonObject, zr3 zr3) {
        pl3.getClass();
        str.getClass();
        return new en3(pl3, jsonObject, str, zr3.getDescriptor()).g(zr3);
    }

    public static final void l(j75 j75, int i, Object obj) {
        j75.k[(j75.l - j75.g[j75.h - 1].c) + i] = obj;
    }

    public static final void m(j75 j75, int i, Object obj, int i2, Object obj2) {
        int i3 = j75.l - j75.g[j75.h - 1].c;
        Object[] objArr = j75.k;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void n(j75 j75, Object obj, Object obj2, Object obj3) {
        int i = j75.l - j75.g[j75.h - 1].c;
        Object[] objArr = j75.k;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final jd3 o(ad3 ad3) {
        return new jd3(ad3.a, ad3.b, ad3.c, ad3.d);
    }

    public static final String p(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static int q(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i2 = 0;
        while (i2 < 6) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }

    public static void r(Object obj, Object obj2) {
        if (obj == null) {
            ku4.j("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            ku4.j(f21.h("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
