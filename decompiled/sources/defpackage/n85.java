package defpackage;

import android.content.Context;
import android.view.inputmethod.ExtractedText;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n85 {
    public static x83 b;
    public static Field c;
    public static boolean d;
    public static Class e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Field i;
    public static boolean j;
    public static final /* synthetic */ int k = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ n85(int i2) {
        this.a = i2;
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = "a";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i2) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final ExtractedText b(hf7 hf7) {
        ExtractedText extractedText = new ExtractedText();
        String str = hf7.a.x;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = hf7.b;
        extractedText.selectionStart = lg7.f(j2);
        extractedText.selectionEnd = lg7.e(j2);
        extractedText.flags = d57.y0(hf7.a.x, 10) ^ true ? 1 : 0;
        return extractedText;
    }

    public static final void c(xo4 xo4, int i2) {
        if (xo4.b == 0 || !(xo4.c(0) == i2 || xo4.c(xo4.b - 1) == i2)) {
            int i3 = xo4.b;
            xo4.a(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int c2 = xo4.c(i4);
                if (i2 <= c2) {
                    break;
                }
                xo4.f(i3, c2);
                i3 = i4;
            }
            xo4.f(i3, i2);
        }
    }

    public static String e(zf0 zf0) {
        StringBuilder sb = new StringBuilder(zf0.size());
        for (int i2 = 0; i2 < zf0.size(); i2++) {
            byte d2 = zf0.d(i2);
            if (d2 == 34) {
                sb.append("\\\"");
            } else if (d2 == 39) {
                sb.append("\\'");
            } else if (d2 != 92) {
                switch (d2) {
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
                        if (d2 >= 32 && d2 <= 126) {
                            sb.append((char) d2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((d2 >>> 6) & 3) + 48));
                            sb.append((char) (((d2 >>> 3) & 7) + 48));
                            sb.append((char) ((d2 & 7) + 48));
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

    public static final String g(xs2 xs2) {
        ri0 ri0;
        uq4 uq4;
        uq4 uq42;
        if (fv3.A(xs2)) {
            ri0 = h(xs2);
        } else {
            ri0 = null;
        }
        if (ri0 != null) {
            ri0 i2 = ts1.i(ri0);
            if (i2 instanceof cr5) {
                fv3.A(i2);
                ri0 b2 = ts1.b(ts1.i(i2), e7.M);
                if (!(b2 == null || (uq42 = (uq4) wd0.a.get(ts1.g(b2))) == null)) {
                    return uq42.b();
                }
            } else if (i2 instanceof au6) {
                int i3 = ud0.l;
                LinkedHashMap linkedHashMap = mz6.i;
                String h2 = dh4.h((au6) i2);
                if (h2 == null) {
                    uq4 = null;
                } else {
                    uq4 = (uq4) linkedHashMap.get(h2);
                }
                if (uq4 != null) {
                    return uq4.b();
                }
            }
        }
        return null;
    }

    public static final ri0 h(ri0 ri0) {
        ri0.getClass();
        if (!mz6.j.contains(ri0.getName()) && !wd0.d.contains(ts1.i(ri0).getName())) {
            return null;
        }
        if ((ri0 instanceof cr5) || (ri0 instanceof ar5)) {
            return ts1.b(ri0, l06.Q);
        }
        if (ri0 instanceof au6) {
            return ts1.b(ri0, l06.R);
        }
        return null;
    }

    public static final ri0 i(ri0 ri0) {
        ri0.getClass();
        ri0 h2 = h(ri0);
        if (h2 != null) {
            return h2;
        }
        int i2 = vd0.l;
        uq4 name = ri0.getName();
        name.getClass();
        if (!mz6.e.contains(name)) {
            return null;
        }
        return ts1.b(ri0, l06.S);
    }

    public static final boolean j(ql4 ql4, ri0 ri0) {
        ql4.getClass();
        ri0.getClass();
        vj1 r = ri0.r();
        r.getClass();
        fu6 g0 = ((ql4) r).g0();
        g0.getClass();
        for (ql4 i2 = rs1.i(ql4); i2 != null; i2 = rs1.i(i2)) {
            if (!(i2 instanceof w04)) {
                fu6 g02 = i2.g0();
                if (g02 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    du7 du7 = null;
                    arrayDeque.add(new d77(g02, (d77) null));
                    wo7 L = g0.L();
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        d77 d77 = (d77) arrayDeque.poll();
                        vw3 vw3 = d77.a;
                        wo7 L2 = vw3.L();
                        if (L2 == null) {
                            a(3);
                            throw null;
                        } else if (L == null) {
                            a(4);
                            throw null;
                        } else if (L2.equals(L)) {
                            boolean Q = vw3.Q();
                            for (d77 d772 = d77.b; d772 != null; d772 = d772.b) {
                                vw3 vw32 = d772.a;
                                List G = vw32.G();
                                k28 k28 = k28.y;
                                or2 or2 = yo7.b;
                                if (G == null || !G.isEmpty()) {
                                    Iterator it = G.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((xp7) it.next()).a() != k28) {
                                                vw3 = (vw3) h49.o(new dq7(t49.f0(or2.f(vw32.L(), vw32.G()))).f(vw3, k28)).b;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                vw3 = new dq7(or2.f(vw32.L(), vw32.G())).f(vw3, k28);
                                if (Q || vw32.Q()) {
                                    Q = true;
                                } else {
                                    Q = false;
                                }
                            }
                            wo7 L3 = vw3.L();
                            if (L3 == null) {
                                a(3);
                                throw null;
                            } else if (L3.equals(L)) {
                                du7 = iq7.g(vw3, Q);
                            } else {
                                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + ub5.h(L3) + ", \n\nsupertype: " + ub5.h(L) + " \n" + L3.equals(L));
                            }
                        } else {
                            for (vw3 vw33 : L2.e()) {
                                vw33.getClass();
                                arrayDeque.add(new d77(vw33, d77));
                            }
                        }
                    }
                    if (du7 != null) {
                        return !fv3.A(i2);
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"}));
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [x77, java.lang.Object, z77] */
    public static x77 k(x77 x77) {
        if ((x77 instanceof z77) || (x77 instanceof y77)) {
            return x77;
        }
        if (x77 instanceof Serializable) {
            return new y77(x77);
        }
        ? obj = new Object();
        x77.getClass();
        obj.w = x77;
        return obj;
    }

    public static final void l(Context context) {
        Map map;
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            bc4.k().e(dd8.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = dd8.b;
            int F = tf4.F(strArr.length);
            if (F < 16) {
                F = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(F);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            if (linkedHashMap.isEmpty()) {
                map = Collections.singletonMap(databasePath2, noBackupFilesDir);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        bc4.k().q(dd8.a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    bc4.k().e(dd8.a, str);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object n(l43 l43, h61 h61) {
        ve6 ve6;
        int i2;
        if (h61 instanceof ve6) {
            ve6 ve62 = (ve6) h61;
            int i3 = ve62.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ve62.B = i3 - Integer.MIN_VALUE;
                ve6 = ve62;
                Object obj = ve6.A;
                i2 = ve6.B;
                if (i2 != 0) {
                    o85.q(obj);
                    if (l43 instanceof we6) {
                        return l43;
                    }
                    hf0 b2 = l43.d().b();
                    ve6.z = l43;
                    ve6.B = 1;
                    obj = rc9.J0(b2, ve6);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    l43 = ve6.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                py6 py6 = (py6) obj;
                py6.getClass();
                return new we6(l43.w, l43.c(), l43.d(), i75.j(py6, -1));
            }
        }
        ve6 = new h61(h61);
        Object obj2 = ve6.A;
        i2 = ve6.B;
        if (i2 != 0) {
        }
        py6 py62 = (py6) obj2;
        py62.getClass();
        return new we6(l43.w, l43.c(), l43.d(), i75.j(py62, -1));
    }

    public static final int o(xo4 xo4) {
        int c2;
        int i2 = xo4.b;
        int c3 = xo4.c(0);
        while (xo4.b != 0 && xo4.c(0) == c3) {
            xo4.f(0, xo4.d());
            xo4.e(xo4.b - 1);
            int i3 = xo4.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int c4 = xo4.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int c5 = xo4.c(i7);
                if (i6 < i3 && (c2 = xo4.c(i6)) > c5) {
                    if (c2 <= c4) {
                        break;
                    }
                    xo4.f(i5, c2);
                    xo4.f(i6, c4);
                    i5 = i6;
                } else if (c5 <= c4) {
                    break;
                } else {
                    xo4.f(i5, c5);
                    xo4.f(i7, c4);
                    i5 = i7;
                }
            }
        }
        return c3;
    }

    public static final r58 p(gq3 gq3, a68 a68, w58 w58, ib1 ib1, yt2 yt2) {
        if (w58 == null) {
            w58 = o85.l(a68);
        }
        w58.getClass();
        ib1.getClass();
        z58 g2 = a68.g();
        g2.getClass();
        no7 no7 = new no7(g2, w58, ib1);
        gq3.getClass();
        String l = gq3.l();
        if (l != null) {
            return no7.b(gq3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l));
        }
        h.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final e81 q(h81 h81) {
        int i2 = xr8.a;
        tr8 tr8 = new tr8(new ts2(17), false);
        h81.getClass();
        return rc9.D0(h81, tr8);
    }

    public abstract int d(String str, byte[] bArr, int i2, int i3);

    public abstract ly5 f();

    public int hashCode() {
        switch (this.a) {
            case 6:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract int m(byte[] bArr, int i2, int i3);

    public String toString() {
        switch (this.a) {
            case 6:
                String A = b26.a.b(getClass()).A();
                A.getClass();
                return A;
            default:
                return super.toString();
        }
    }
}
