package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.Spanned;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

/* renamed from: b85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b85 {
    public static x83 a = null;
    public static final /* synthetic */ int b = 0;
    public static boolean c = true;

    /* JADX WARNING: type inference failed for: r5v0, types: [sg5, java.lang.Object] */
    public static sg5 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            int unused = MediaStore.getPickImagesMaxLimit();
        }
        g22 g22 = g22.x;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            int unused2 = MediaStore.getPickImagesMaxLimit();
        }
        ? obj = new Object();
        obj.a = t8.a;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            int unused3 = MediaStore.getPickImagesMaxLimit();
        }
        obj.a = u8.a;
        obj.b = g22;
        return obj;
    }

    public static final po5 b(String str) {
        no5 no5 = no5.t;
        if (!d57.I0(str)) {
            so5.a(str);
            return new po5(str, no5);
        }
        h.q("Blank serial names are prohibited");
        return null;
    }

    public static final we8 c(String str, ll6 ll6) {
        ll6.getClass();
        if (d57.I0(str)) {
            h.q("Blank serial names are prohibited");
            return null;
        } else if (!str.equals(ll6.a())) {
            if (ll6.u() instanceof no5) {
                so5.a(str);
            }
            return new we8(str, ll6);
        } else {
            StringBuilder q = b81.q("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
            q.append(ll6.a());
            q.append(')');
            throw new IllegalArgumentException(q.toString().toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [w77, fl3] */
    public static w77 d() {
        return new fl3((el3) null);
    }

    public static final nl6 e(String str, ll6[] ll6Arr, vr2 vr2) {
        if (!d57.I0(str)) {
            nq0 nq0 = new nq0(str);
            vr2.y(nq0);
            return new nl6(str, n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
        }
        h.q("Blank serial names are prohibited");
        return null;
    }

    public static final nl6 f(String str, n85 n85, ll6[] ll6Arr, vr2 vr2) {
        if (d57.I0(str)) {
            h.q("Blank serial names are prohibited");
            return null;
        } else if (!n85.equals(n57.l)) {
            nq0 nq0 = new nq0(str);
            vr2.y(nq0);
            return new nl6(str, n85, nq0.c.size(), qs.p1(ll6Arr), nq0);
        } else {
            h.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
    }

    public static nl6 g(String str, n85 n85, ll6[] ll6Arr) {
        if (d57.I0(str)) {
            h.q("Blank serial names are prohibited");
            return null;
        } else if (!n85.equals(n57.l)) {
            nq0 nq0 = new nq0(str);
            return new nl6(str, n85, nq0.c.size(), qs.p1(ll6Arr), nq0);
        } else {
            h.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
    }

    public static long i(long j, jz3 jz3) {
        int i;
        int i2;
        int i3;
        int i4;
        jz3 jz32 = jz3.w;
        if (jz3 == jz32) {
            i = k31.j(j);
        } else {
            i = k31.i(j);
        }
        if (jz3 == jz32) {
            i2 = k31.h(j);
        } else {
            i2 = k31.g(j);
        }
        if (jz3 == jz32) {
            i3 = k31.i(j);
        } else {
            i3 = k31.j(j);
        }
        if (jz3 == jz32) {
            i4 = k31.g(j);
        } else {
            i4 = k31.h(j);
        }
        return m31.a(i, i2, i3, i4);
    }

    public static long j(long j, int i) {
        int i2;
        int h = k31.h(j);
        if ((i & 4) != 0) {
            i2 = k31.i(j);
        } else {
            i2 = 0;
        }
        return m31.a(0, h, i2, k31.g(j));
    }

    public static String k(yf0 yf0) {
        StringBuilder sb = new StringBuilder(yf0.size());
        for (int i = 0; i < yf0.size(); i++) {
            byte d = yf0.d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        sb.append("\\r");
                        break;
                    default:
                        if (d >= 32 && d <= 126) {
                            sb.append((char) d);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final boolean l(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static boolean m(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static boolean n(int i) {
        int type = Character.getType(i);
        if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
            return true;
        }
        return false;
    }

    public static final pe6 q(yt2 yt2) {
        yt2.e0(1967007413);
        Object[] objArr = new Object[0];
        Object Q = yt2.Q();
        if (Q == ay0.a) {
            Q = new pp5(9);
            yt2.o0(Q);
        }
        pe6 pe6 = (pe6) u55.t(objArr, pe6.A, (sr2) Q, yt2, 384);
        pe6.y = (re6) yt2.k(te6.a);
        yt2.r(false);
        return pe6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    public static final ro7 r(ro7 ro7, rm rmVar) {
        ro7 ro72;
        ro7.getClass();
        if (vm.a(ro7) == rmVar) {
            return ro7;
        }
        um umVar = (um) vm.b.l(vm.a[0], ro7);
        if (umVar != null) {
            if (!ro7.isEmpty()) {
                is isVar = ro7.w;
                ArrayList arrayList = new ArrayList();
                for (Object next : isVar) {
                    if (!sg3.e((um) next, umVar)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() != ro7.w.f()) {
                    ro7.x.getClass();
                    ro72 = kg5.l(arrayList);
                    if (ro72 != null) {
                        ro7 = ro72;
                    }
                }
            }
            ro72 = ro7;
            if (ro72 != null) {
            }
        }
        if (rmVar.iterator().hasNext() || !rmVar.isEmpty()) {
            um umVar2 = new um(rmVar);
            kg5 kg5 = ro7.x;
            gq3 b2 = b26.a.b(um.class);
            kg5.getClass();
            String l = b2.l();
            l.getClass();
            if (ro7.w.get(kg5.v(l)) == null) {
                if (ro7.isEmpty()) {
                    return new ro7(sg3.D(umVar2));
                }
                return kg5.l(dt0.N0(dt0.b1(ro7), umVar2));
            }
        }
        return ro7;
    }

    public static void s(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            k58.b(viewGroup, z);
        } else if (c) {
            try {
                k58.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static final long t(long j) {
        return m31.a(k31.j(j), k31.h(j), k31.i(j), k31.g(j));
    }

    public static final ro7 u(rm rmVar) {
        rmVar.getClass();
        if (rmVar.isEmpty()) {
            ro7.x.getClass();
            return ro7.y;
        }
        kg5 kg5 = ro7.x;
        List D = sg3.D(new um(rmVar));
        kg5.getClass();
        return kg5.l(D);
    }

    public static final int v(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & -920350135) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static boolean x(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = hu8.x;
            }
        } else if (!(collection instanceof wt8)) {
            return false;
        } else {
            obj = ((wt8) collection).C;
        }
        return comparator.equals(obj);
    }

    public abstract Object A(id9 id9);

    public void h(int i) {
        new Handler(Looper.getMainLooper()).post(new in(i, 1, this));
    }

    public abstract void o(int i);

    public abstract void p(Typeface typeface);

    public abstract int w();

    public abstract id9 y(int i);

    public abstract Object z(int i);
}
