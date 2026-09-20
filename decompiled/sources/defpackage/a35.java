package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a35 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public a35() {
        new ConcurrentHashMap();
    }

    public static final void a(long j, tg7 tg7, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        yt2.g0(-684938728);
        if ((i & 6) == 0) {
            if (yt2.f(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(tg7)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(gs2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            yy0 yy0 = yf7.a;
            t49.d(new ju5[]{b81.g(j, j41.a), yy0.a(((tg7) yt2.k(yy0)).d(tg7))}, gs2, yt2, ((i2 >> 3) & 112) | 8);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new iu5(j, tg7, gs2, i, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final s96 b(float[] fArr, y71 y71, AbstractList abstractList, float f, float f2) {
        float f3;
        long j;
        boolean z;
        ArrayList arrayList;
        int i;
        List list;
        int i2;
        qc1 qc1;
        float f4;
        yb5 yb5;
        y71 y712;
        y71 y713;
        float[] fArr2 = fArr;
        AbstractList abstractList2 = abstractList;
        float f5 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        y71.getClass();
        s96 s96 = null;
        if (fArr2.length >= 6) {
            int i3 = 2;
            int i4 = 1;
            if (fArr2.length % 2 == 1) {
                h.q("The vertices array should have even size");
                return null;
            } else if (abstractList2 == null || abstractList2.size() * 2 == fArr2.length) {
                ArrayList arrayList2 = new ArrayList();
                int length = fArr2.length / 2;
                ArrayList arrayList3 = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                while (i6 < length) {
                    if (abstractList2 == null || (y713 = (y71) abstractList2.get(i6)) == null) {
                        y712 = y71;
                    } else {
                        y712 = y713;
                    }
                    int i7 = (((i6 + length) - 1) % length) * 2;
                    int i8 = i6 + 1;
                    int i9 = (i8 % length) * 2;
                    int i10 = i6 * 2;
                    arrayList3.add(new m96(mh2.a(fArr2[i7], fArr2[i7 + 1]), mh2.a(fArr2[i10], fArr2[i10 + 1]), mh2.a(fArr2[i9], fArr2[i9 + 1]), y712));
                    i6 = i8;
                    f5 = f5;
                }
                float f6 = f5;
                re3 V = z65.V(0, length);
                ArrayList arrayList4 = new ArrayList(et0.e0(V, 10));
                Iterator it = V.iterator();
                while (true) {
                    f3 = 0.0f;
                    if (!((qe3) it).y) {
                        break;
                    }
                    int nextInt = ((je3) it).nextInt();
                    int i11 = (nextInt + 1) % length;
                    float f7 = ((m96) arrayList3.get(nextInt)).h + ((m96) arrayList3.get(i11)).h;
                    float c2 = ((m96) arrayList3.get(i11)).c() + ((m96) arrayList3.get(nextInt)).c();
                    int i12 = nextInt * 2;
                    float f8 = fArr2[i12];
                    float f9 = fArr2[i12 + 1];
                    int i13 = i11 * 2;
                    float f10 = f8 - fArr2[i13];
                    float f11 = f9 - fArr2[i13 + 1];
                    float f12 = j18.b;
                    float sqrt = (float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)));
                    if (f7 > sqrt) {
                        yb5 = new yb5(Float.valueOf(sqrt / f7), Float.valueOf(0.0f));
                    } else if (c2 > sqrt) {
                        yb5 = new yb5(valueOf, Float.valueOf((sqrt - f7) / (c2 - f7)));
                    } else {
                        yb5 = new yb5(valueOf, valueOf);
                    }
                    arrayList4.add(yb5);
                }
                int i14 = 0;
                while (i14 < length) {
                    float[] fArr3 = new float[i3];
                    s96 s962 = s96;
                    int i15 = i5;
                    int i16 = i15;
                    while (i16 < i3) {
                        int i17 = i3;
                        yb5 yb52 = (yb5) arrayList4.get((((i14 + length) - 1) + i16) % length);
                        int i18 = i5;
                        float f13 = f3;
                        float d2 = b81.d(((m96) arrayList3.get(i14)).c(), ((m96) arrayList3.get(i14)).h, ((Number) yb52.x).floatValue(), ((m96) arrayList3.get(i14)).h * ((Number) yb52.w).floatValue());
                        int i19 = i15 + 1;
                        if (fArr3.length < i19) {
                            fArr3 = Arrays.copyOf(fArr3, Math.max(i19, (fArr3.length * 3) / 2));
                        }
                        fArr3[i15] = d2;
                        i16++;
                        f3 = f13;
                        i15 = i19;
                        i5 = i18;
                        i3 = i17;
                    }
                    int i20 = i3;
                    int i21 = i5;
                    float f14 = f3;
                    m96 m96 = (m96) arrayList3.get(i14);
                    if (i15 > 0) {
                        float f15 = fArr3[i21];
                        if (i4 < i15) {
                            float f16 = fArr3[i4];
                            long j2 = m96.e;
                            int i22 = i4;
                            int i23 = length;
                            long j3 = m96.d;
                            float f17 = m96.f;
                            ArrayList arrayList5 = arrayList2;
                            long j4 = m96.b;
                            int i24 = i22;
                            float min = Math.min(f15, f16);
                            float f18 = m96.h;
                            if (f18 < 1.0E-4f || min < 1.0E-4f || f17 < 1.0E-4f) {
                                i = i14;
                                arrayList = arrayList4;
                                m96.i = j4;
                                float r = jb5.r(j4);
                                float s = jb5.s(j4);
                                float r2 = jb5.r(j4);
                                float s2 = jb5.s(j4);
                                list = sg3.D(h03.b(r, s, j18.c(r, r2, 0.33333334f), j18.c(s, s2, 0.33333334f), j18.c(r, r2, 0.6666667f), j18.c(s, s2, 0.6666667f), r2, s2));
                            } else {
                                float min2 = Math.min(min, f18);
                                float a2 = m96.a(f15);
                                float a3 = m96.a(f16);
                                float f19 = (f17 * min2) / f18;
                                float f20 = j18.b;
                                i = i14;
                                m96.i = jb5.D(j4, jb5.H((float) Math.sqrt((double) ((min2 * min2) + (f19 * f19))), jb5.m(jb5.g(2.0f, jb5.D(j3, j2)))));
                                long D = jb5.D(j4, jb5.H(min2, j3));
                                long D2 = jb5.D(j4, jb5.H(min2, j2));
                                float f21 = min2;
                                qc1 b2 = m96.b(f21, a2, m96.b, m96.a, D, D2, m96.i, f19);
                                long j5 = D2;
                                long j6 = D;
                                long j7 = j5;
                                qc1 b3 = m96.b(f21, a3, m96.b, m96.c, j7, j6, m96.i, f19);
                                float a4 = b3.a();
                                float b4 = b3.b();
                                float[] fArr4 = b3.a;
                                qc1 b5 = h03.b(a4, b4, fArr4[4], fArr4[5], fArr4[i20], fArr4[3], fArr4[i21], fArr4[i24]);
                                float r3 = jb5.r(m96.i);
                                float s3 = jb5.s(m96.i);
                                float a5 = b2.a();
                                float b6 = b2.b();
                                float[] fArr5 = b5.a;
                                float f22 = fArr5[i21];
                                float f23 = fArr5[i24];
                                float f24 = a5 - r3;
                                float f25 = b6 - s3;
                                long b7 = j18.b(f24, f25);
                                float f26 = f22 - r3;
                                float f27 = f23 - s3;
                                float f28 = f24;
                                float f29 = f25;
                                long b8 = j18.b(f26, f27);
                                arrayList = arrayList4;
                                float f30 = f26;
                                long a6 = mh2.a(-jb5.s(b7), jb5.r(b7));
                                long a7 = mh2.a(-jb5.s(b8), jb5.r(b8));
                                if ((jb5.s(a6) * f27) + (jb5.r(a6) * f30) >= f14) {
                                    i2 = i24;
                                } else {
                                    i2 = i21;
                                }
                                float h = jb5.h(b7, b8);
                                if (h > 0.999f) {
                                    qc1 = h03.b(a5, b6, j18.c(a5, f22, 0.33333334f), j18.c(b6, f23, 0.33333334f), j18.c(a5, f22, 0.6666667f), j18.c(b6, f23, 0.6666667f), f22, f23);
                                } else {
                                    float f31 = a5;
                                    float f32 = f23;
                                    float f33 = f22;
                                    long j8 = a6;
                                    float f34 = b6;
                                    float f35 = f6 - h;
                                    float sqrt2 = ((((float) Math.sqrt((double) (2.0f * f35))) - ((float) Math.sqrt((double) (f6 - (h * h))))) * ((((float) Math.sqrt((double) ((f29 * f29) + (f28 * f28)))) * 4.0f) / 3.0f)) / f35;
                                    if (i2 != 0) {
                                        f4 = f6;
                                    } else {
                                        f4 = -1.0f;
                                    }
                                    float f36 = sqrt2 * f4;
                                    qc1 = h03.b(f31, f34, (jb5.r(j8) * f36) + f31, (jb5.s(j8) * f36) + f34, f33 - (jb5.r(a7) * f36), f32 - (jb5.s(a7) * f36), f33, f32);
                                }
                                list = sg3.E(b2, qc1, b5);
                            }
                            ArrayList arrayList6 = arrayList5;
                            arrayList6.add(list);
                            i14 = i + 1;
                            f3 = f14;
                            arrayList2 = arrayList6;
                            s96 = s962;
                            i5 = i21;
                            i3 = i20;
                            length = i23;
                            i4 = i24;
                            arrayList4 = arrayList;
                        } else {
                            h.l("Index must be between 0 and size");
                            return s962;
                        }
                    } else {
                        h.l("Index must be between 0 and size");
                        return s962;
                    }
                }
                ArrayList arrayList7 = arrayList2;
                int i25 = i3;
                int i26 = i4;
                int i27 = length;
                int i28 = i5;
                float f37 = f3;
                ArrayList arrayList8 = new ArrayList();
                int i29 = i28;
                while (i29 < length) {
                    int i30 = i29 + 1;
                    int i31 = i30 % length;
                    int i32 = i29 * 2;
                    long a8 = mh2.a(fArr2[i32], fArr2[i32 + 1]);
                    int i33 = (((i29 + length) - 1) % length) * 2;
                    long a9 = mh2.a(fArr2[i33], fArr2[i33 + 1]);
                    int i34 = i31 * 2;
                    int i35 = i30;
                    long a10 = mh2.a(fArr2[i34], fArr2[i34 + 1]);
                    long A = jb5.A(a8, a9);
                    long A2 = jb5.A(a10, a8);
                    if ((jb5.s(A2) * jb5.r(A)) - (jb5.r(A2) * jb5.s(A)) > f37) {
                        z = i26;
                    } else {
                        z = i28;
                    }
                    arrayList8.add(new ac2((List) arrayList7.get(i29), a8, ((m96) arrayList3.get(i29)).i, z));
                    float a11 = ((qc1) dt0.G0((List) arrayList7.get(i29))).a();
                    float b9 = ((qc1) dt0.G0((List) arrayList7.get(i29))).b();
                    float f38 = ((qc1) dt0.w0((List) arrayList7.get(i31))).a[i28];
                    float f39 = ((qc1) dt0.w0((List) arrayList7.get(i31))).a[i26];
                    arrayList8.add(new dc2(sg3.D(h03.b(a11, b9, j18.c(a11, f38, 0.33333334f), j18.c(b9, f39, 0.33333334f), j18.c(a11, f38, 0.6666667f), j18.c(b9, f39, 0.6666667f), f38, f39))));
                    i29 = i35;
                }
                if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
                    float f40 = f37;
                    float f41 = f40;
                    int i36 = i28;
                    while (i36 < fArr2.length) {
                        int i37 = i36 + 1;
                        f41 += fArr2[i36];
                        i36 += 2;
                        f40 += fArr2[i37];
                    }
                    j = mh2.a((f41 / ((float) fArr2.length)) / 2.0f, (f40 / ((float) fArr2.length)) / 2.0f);
                } else {
                    j = mh2.a(f, f2);
                }
                return new s96(arrayList8, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            } else {
                h.q("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                return null;
            }
        } else {
            h.q("Polygons must have at least 3 vertices");
            return null;
        }
    }

    public static final void c(Long l, long j, i53 i53) {
        i53.getClass();
        if (l != null && l.longValue() >= 0 && !i53.equals(i53.g) && l.longValue() != j) {
            long longValue = l.longValue();
            throw new IllegalStateException(("Content-Length mismatch: expected " + longValue + " bytes, but received " + j + " bytes").toString());
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static final boolean i(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static dm2 j(dm2[] dm2Arr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        dm2 dm2 = null;
        int i4 = Integer.MAX_VALUE;
        for (dm2 dm22 : dm2Arr) {
            int abs = Math.abs(dm22.c - i2) * 2;
            if (dm22.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (dm2 == null || i4 > i5) {
                dm2 = dm22;
                i4 = i5;
            }
        }
        return dm2;
    }

    public static final h47 k(j77 j77) {
        j77.getClass();
        Object obj = ((m77) j77).i.a.get("storage");
        if (!(obj instanceof h47)) {
            obj = null;
        }
        h47 h47 = (h47) obj;
        if (h47 != null) {
            return h47;
        }
        c26 c26 = b26.a;
        Class<h47> cls = h47.class;
        kj6.m("Plugin storage not installed or not of type ", c26.b(cls).A(), ". Consider installing ", c26.b(cls).A(), " within your SupabaseClientBuilder");
        return null;
    }

    public static void m(Status status, Object obj, xb7 xb7) {
        ApiException apiException;
        if (status.f()) {
            xb7.b(obj);
            return;
        }
        if (status.y != null) {
            apiException = new ApiException(status);
        } else {
            apiException = new ApiException(status);
        }
        xb7.a(apiException);
    }

    public static String n(long j) {
        return f21.g(j, "PointerId(value=", ")");
    }

    public static final boolean o(sr2 sr2, String str) {
        try {
            boolean booleanValue = ((Boolean) sr2.b()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused3) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        }
    }

    public static String p(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
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
                        if (b2 >= 32 && b2 <= 126) {
                            sb.append((char) b2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public abstract Typeface d(Context context, sl2 sl2, Resources resources, int i);

    public abstract Typeface e(Context context, dm2[] dm2Arr, int i);

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface g(Context context, Resources resources, int i, String str, int i2) {
        File s = b35.s(context);
        if (s == null) {
            return null;
        }
        try {
            if (!b35.h(s, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(s.getPath());
            s.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s.delete();
        }
    }

    public abstract long l();
}
