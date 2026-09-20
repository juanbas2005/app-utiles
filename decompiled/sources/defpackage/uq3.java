package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: uq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class uq3 {
    public static final fw0 a = new fw0(-816194768, new tw0(2), false);
    public static final p81 b = p81.w;
    public static final rt0 c = rt0.N;
    public static final float d = 3.0f;
    public static final vq6 e = vq6.x;
    public static final ll6[] f = new ll6[0];
    public static final qx1 g = new Object();
    public static final cc2 h;
    public static final cc2[] i;
    public static x83 j;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static x83 m;
    public static x83 n;
    public static x83 o;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, qx1] */
    static {
        cc2 cc2 = new cc2(1, "GET_CREDENTIAL");
        h = cc2;
        cc2 cc22 = new cc2(1, "CREDENTIAL_REGISTRY");
        cc2 cc23 = new cc2(2, "CLEAR_REGISTRY");
        cc2 cc24 = new cc2(1, "CLEAR_CREATION_OPTIONS");
        cc2 cc25 = cc23;
        cc2 cc26 = new cc2(1, "CLEAR_CREDENTIAL_STATE");
        cc2 cc27 = cc25;
        cc2 cc28 = new cc2(3, "CREATE_CREDENTIAL");
        cc2 cc29 = cc27;
        cc2 cc210 = new cc2(1, "REGISTER_CREATION_OPTIONS");
        cc2 cc211 = new cc2(1, "REGISTER_EXPORT");
        cc2 cc212 = new cc2(1, "IMPORT_CREDENTIALS");
        cc2 cc213 = cc22;
        i = new cc2[]{cc2, cc213, cc29, cc24, cc26, cc28, cc210, cc211, cc212, new cc2(1, "SIGNAL_CREDENTIAL_STATE"), new cc2(1, "CLEAR_EXPORT"), new cc2(3, "IMPORT_CREDENTIALS_FOR_DEVICE_SETUP"), new cc2(3, "EXPORT_CREDENTIALS_TO_DEVICE_SETUP"), new cc2(3, "GET_CREDENTIAL_TRANSFER_CAPABILITIES")};
    }

    public static boolean A(int i2) {
        if ((i2 & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean B(int i2, int i3, long j2) {
        int j3 = k31.j(j2);
        if (i2 > k31.h(j2) || j3 > i2) {
            return false;
        }
        int i4 = k31.i(j2);
        if (i3 > k31.g(j2) || i4 > i3) {
            return false;
        }
        return true;
    }

    public static final boolean C(gq3 gq3, gq3 gq32) {
        gq32.getClass();
        if (gq3.equals(gq32)) {
            return true;
        }
        List D = sg3.D(gq3);
        tq3 tq3 = tq3.D;
        if (dh4.s(D, new or2(2), new b0(19, gq32)).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean D(int i2) {
        if (i2 == 15 || i2 == 255) {
            return true;
        }
        if (i2 != 32768) {
            if (i2 == 32783) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 28 || i3 > 29) {
                    return true;
                }
                return false;
            } else if (i2 == 33023 || i2 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            return true;
        } else {
            return false;
        }
    }

    public static final gq3 E(as3 as3) {
        as3.getClass();
        vq3 J = as3.J();
        if (J instanceof gq3) {
            return (gq3) J;
        }
        if (!(J instanceof cs3)) {
            kj6.o("Only KClass supported as classifier, got ", J);
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + J + " from generic non-reified function. Such functionality cannot be supported because " + J + " is erased, either specify serializer explicitly or make calling function inline with reified " + J + '.');
    }

    public static final long F(long j2, long j3, float f2) {
        k45 k45 = vt0.x;
        long a2 = jt0.a(j2, k45);
        long a3 = jt0.a(j3, k45);
        float d2 = jt0.d(a2);
        float h2 = jt0.h(a2);
        float g2 = jt0.g(a2);
        float e2 = jt0.e(a2);
        float d3 = jt0.d(a3);
        float h3 = jt0.h(a3);
        float g3 = jt0.g(a3);
        float e3 = jt0.e(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return jt0.a(g(we.E(h2, h3, f2), we.E(g2, g3, f2), we.E(e2, e3, f2), we.E(d2, d3, f2), k45), jt0.f(j3));
    }

    public static final wu4 G(vr2 vr2) {
        xu4 xu4 = new xu4();
        vr2.y(xu4);
        boolean z = xu4.b;
        boolean z2 = xu4.c;
        int i2 = xu4.d;
        boolean z3 = xu4.e;
        dv5 dv5 = xu4.a;
        return new wu4(z, z2, i2, false, z3, dv5.b, dv5.c);
    }

    public static final String H(String str) {
        if (!k57.u0(str, "9953", false) || !k57.m0(str, "99", false) || str.length() <= 4) {
            return null;
        }
        String substring = str.substring(2, str.length() - 2);
        if (substring.length() != 10 || !k57.u0(substring, "53", false)) {
            return substring;
        }
        return substring.substring(2);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [pk4, ye4] */
    public static pk4 I(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    j2 = -1;
                    break;
                }
                int i4 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j2 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i4) {
                    break;
                }
                i3++;
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j3 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i5 = 0; ((long) i5) < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        ? ye4 = new ye4();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        ye4.z = duplicate;
                        ye4.w = position;
                        int i7 = position - duplicate.getInt(position);
                        ye4.x = i7;
                        ye4.y = ((ByteBuffer) ye4.z).getShort(i7);
                        return ye4;
                    }
                }
            }
            rf2.i("Cannot read metadata.");
            return null;
        }
        rf2.i("Cannot read metadata.");
        return null;
    }

    public static final void L(gq3 gq3) {
        gq3.getClass();
        String A = gq3.A();
        if (A == null) {
            A = "<local class name not available>";
        }
        throw new IllegalArgumentException(f21.h("Serializer for class '", A, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final int M(long j2) {
        float[] fArr = vt0.a;
        return (int) (jt0.a(j2, vt0.e) >>> 32);
    }

    public static final al3 N(gk3 gk3) {
        gk3.getClass();
        return new al3(gk3.a, gk3.b, gk3.c, new String(), gk3.d, gk3.e, false, false, q97.w);
    }

    public static final ua0 a(float f2, long j2) {
        return new ua0(f2, new ky6(j2));
    }

    public static final long b(float f2, float f3, float f4, float f5, tt0 tt0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f6;
        float f7;
        float f8;
        tt0 tt02 = tt0;
        float f9 = 1.0f;
        float f10 = 0.0f;
        if (tt02.c()) {
            if (f5 < 0.0f) {
                f6 = 0.0f;
            } else {
                f6 = f5;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i10 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            if (f2 < 0.0f) {
                f7 = 0.0f;
            } else {
                f7 = f2;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i11 = i10 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            if (f3 < 0.0f) {
                f8 = 0.0f;
            } else {
                f8 = f3;
            }
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i12 = i11 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            if (f4 >= 0.0f) {
                f10 = f4;
            }
            if (f10 <= 1.0f) {
                f9 = f10;
            }
            long j2 = ((long) (i12 | ((int) ((f9 * 255.0f) + 0.5f)))) << 32;
            int i13 = jt0.h;
            return j2;
        }
        if (((int) (tt02.b >> 32)) != 3) {
            xb3.a("Color only works with ColorSpaces with 3 components");
        }
        int i14 = tt02.c;
        if (i14 == -1) {
            xb3.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i15 = 0;
        float b2 = tt02.b(0);
        float a2 = tt02.a(0);
        if (f2 >= b2) {
            b2 = f2;
        }
        if (b2 <= a2) {
            a2 = b2;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a2);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            if (i18 != 0) {
                i3 = 512;
            } else {
                i3 = 0;
            }
            i2 = 31;
            i4 = i3 | (i16 << 15) | (i2 << 10);
        } else {
            i2 = i17 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i19) + 1) | (i16 << 15);
                } else {
                    i3 = i19;
                }
            } else if (i2 >= -10) {
                int i20 = (i18 | 8388608) >> (1 - i2);
                if ((i20 & 4096) != 0) {
                    i20 += 8192;
                }
                i3 = i20 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
            i4 = i3 | (i16 << 15) | (i2 << 10);
        }
        short s = (short) i4;
        float b3 = tt02.b(1);
        float a3 = tt02.a(1);
        if (f3 >= b3) {
            b3 = f3;
        }
        if (b3 <= a3) {
            a3 = b3;
        }
        int floatToRawIntBits2 = Float.floatToRawIntBits(a3);
        int i21 = floatToRawIntBits2 >>> 31;
        int i22 = (floatToRawIntBits2 >>> 23) & 255;
        int i23 = floatToRawIntBits2 & 8388607;
        if (i22 == 255) {
            if (i23 != 0) {
                i6 = 512;
            } else {
                i6 = 0;
            }
            i5 = 31;
            i7 = i6 | (i21 << 15) | (i5 << 10);
        } else {
            i5 = i22 - 112;
            if (i5 >= 31) {
                i6 = 0;
                i5 = 49;
            } else if (i5 > 0) {
                int i24 = i23 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i7 = (((i5 << 10) | i24) + 1) | (i21 << 15);
                } else {
                    i6 = i24;
                }
            } else if (i5 >= -10) {
                int i25 = (i23 | 8388608) >> (1 - i5);
                if ((i25 & 4096) != 0) {
                    i25 += 8192;
                }
                i6 = i25 >> 13;
                i5 = 0;
            } else {
                i6 = 0;
                i5 = 0;
            }
            i7 = i6 | (i21 << 15) | (i5 << 10);
        }
        short s2 = (short) i7;
        float b4 = tt02.b(2);
        float a4 = tt02.a(2);
        if (f4 >= b4) {
            b4 = f4;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits3 = Float.floatToRawIntBits(a4);
        int i26 = floatToRawIntBits3 >>> 31;
        int i27 = (floatToRawIntBits3 >>> 23) & 255;
        int i28 = 8388607 & floatToRawIntBits3;
        if (i27 == 255) {
            if (i28 != 0) {
                i15 = 512;
            }
            i8 = i15;
            i15 = 31;
            i9 = i8 | (i26 << 15) | (i15 << 10);
        } else {
            int i29 = i27 - 112;
            if (i29 >= 31) {
                i8 = 0;
                i15 = 49;
            } else if (i29 > 0) {
                int i30 = i28 >> 13;
                if ((floatToRawIntBits3 & 4096) != 0) {
                    i9 = (((i29 << 10) | i30) + 1) | (i26 << 15);
                } else {
                    i8 = i30;
                    i15 = i29;
                }
            } else if (i29 >= -10) {
                int i31 = (i28 | 8388608) >> (1 - i29);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i8 = i31 >> 13;
            } else {
                i8 = 0;
            }
            i9 = i8 | (i26 << 15) | (i15 << 10);
        }
        short s3 = (short) i9;
        if (f5 >= 0.0f) {
            f10 = f5;
        }
        if (f10 <= 1.0f) {
            f9 = f10;
        }
        long j3 = (((long) i14) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) ((f9 * 1023.0f) + 0.5f))) & 1023) << 6);
        int i32 = jt0.h;
        return j3;
    }

    public static final long c(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = jt0.h;
        return j2;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = jt0.h;
        return j3;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | -16777216 | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long f(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = os3.O;
        return j2;
    }

    public static final long g(float f2, float f3, float f4, float f5, tt0 tt0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f6 = f5;
        if (tt0.c()) {
            long j2 = ((long) ((((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i9 = jt0.h;
            return j2;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 512;
        int i15 = 0;
        if (i11 == 255) {
            if (i12 != 0) {
                i3 = 512;
            } else {
                i3 = 0;
            }
            i2 = 31;
            i4 = i3 | (i10 << 15) | (i2 << 10);
        } else {
            i2 = i11 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i16 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i16) + 1) | (i10 << 15);
                } else {
                    i3 = i16;
                }
            } else if (i2 >= -10) {
                int i17 = (i12 | 8388608) >> (1 - i2);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i3 = i17 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
            i4 = i3 | (i10 << 15) | (i2 << 10);
        }
        short s = (short) i4;
        int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
        int i18 = floatToRawIntBits2 >>> 31;
        int i19 = (floatToRawIntBits2 >>> 23) & 255;
        int i20 = floatToRawIntBits2 & 8388607;
        if (i19 == 255) {
            if (i20 != 0) {
                i6 = 512;
            } else {
                i6 = 0;
            }
            i5 = 31;
            i7 = i6 | (i18 << 15) | (i5 << 10);
        } else {
            i5 = i19 - 112;
            if (i5 >= 31) {
                i5 = 49;
                i6 = 0;
            } else if (i5 > 0) {
                int i21 = i20 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i7 = (((i5 << 10) | i21) + 1) | (i18 << 15);
                } else {
                    i6 = i21;
                }
            } else if (i5 >= -10) {
                int i22 = (i20 | 8388608) >> (1 - i5);
                if ((i22 & 4096) != 0) {
                    i22 += 8192;
                }
                i6 = i22 >> 13;
                i5 = 0;
            } else {
                i6 = 0;
                i5 = 0;
            }
            i7 = i6 | (i18 << 15) | (i5 << 10);
        }
        short s2 = (short) i7;
        int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
        int i23 = floatToRawIntBits3 >>> 31;
        int i24 = (floatToRawIntBits3 >>> 23) & 255;
        int i25 = 8388607 & floatToRawIntBits3;
        if (i24 == 255) {
            if (i25 == 0) {
                i14 = 0;
            }
            i15 = i14;
            i13 = 31;
            i8 = (i23 << 15) | (i13 << 10) | i15;
        } else {
            int i26 = i24 - 112;
            if (i26 < 31) {
                if (i26 > 0) {
                    i15 = i25 >> 13;
                    if ((floatToRawIntBits3 & 4096) != 0) {
                        i8 = (((i26 << 10) | i15) + 1) | (i23 << 15);
                    } else {
                        i13 = i26;
                    }
                } else if (i26 >= -10) {
                    int i27 = (i25 | 8388608) >> (1 - i26);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i13 = 0;
                    i15 = i27 >> 13;
                } else {
                    i13 = 0;
                }
            }
            i8 = (i23 << 15) | (i13 << 10) | i15;
        }
        long max = ((((long) ((short) i8)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) tt0.c) & 63);
        int i28 = jt0.h;
        return max;
    }

    public static final ml4 i(ml4 ml4, float f2, boolean z) {
        return ml4.d(new vs(f2, z));
    }

    public static final Set k(ll6 ll6) {
        ll6.getClass();
        if (ll6 instanceof nh0) {
            return ((nh0) ll6).b();
        }
        HashSet hashSet = new HashSet(ll6.e());
        int e2 = ll6.e();
        for (int i2 = 0; i2 < e2; i2++) {
            hashSet.add(ll6.f(i2));
        }
        return hashSet;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: up7} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static am6 l(am6 am6, lq0 lq0, x06 x06, int i2) {
        up7 up7;
        if ((i2 & 2) != 0) {
            x06 = null;
        }
        am6.getClass();
        nz3 y = rg3.y(i44.x, new p3(am6, false, lq0, 2));
        pj3 pj3 = (pj3) am6.x;
        if (x06 != null) {
            up7 = new r14(am6, lq0, x06, 0);
        } else {
            up7 = am6.y;
        }
        return new am6(pj3, up7, y);
    }

    public static final ll6[] m(List list) {
        ll6[] ll6Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null || (ll6Arr = (ll6[]) list.toArray(new ll6[0])) == null) {
            return f;
        }
        return ll6Arr;
    }

    public static final long n(long j2, long j3) {
        float f2;
        float f3;
        long a2 = jt0.a(j2, jt0.f(j3));
        float d2 = jt0.d(j3);
        float d3 = jt0.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = jt0.h(a2);
        float h3 = jt0.h(j3);
        float f6 = 0.0f;
        int i2 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = jt0.g(a2);
        float g3 = jt0.g(j3);
        if (i2 == 0) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = jt0.e(a2);
        float e3 = jt0.e(j3);
        if (i2 != 0) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return g(f2, f3, f6, f5, jt0.f(j3));
    }

    public static final am6 o(am6 am6, rm rmVar) {
        am6.getClass();
        rmVar.getClass();
        if (rmVar.isEmpty()) {
            return am6;
        }
        return new am6((pj3) am6.x, (up7) am6.y, rg3.y(i44.x, new p3(am6, false, rmVar, 3)));
    }

    public static final c2 p(gq3 gq3) {
        gq3.getClass();
        List<cs3> I = gl0.I(gq3);
        ArrayList arrayList = new ArrayList(et0.e0(I, 10));
        for (cs3 c0 : I) {
            arrayList.add(new gs3(bb0.c0(c0, (List) null, false, 7), ks3.w));
        }
        return bb0.c0(gq3, arrayList, false, 6);
    }

    public static void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39);
                sb.append("Unable to create parent directories of ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
    }

    public static final void r(pn4 pn4, qk0 qk0, kc0 kc0, float f2, lq6 lq6, rd7 rd7, iz1 iz1) {
        ArrayList arrayList = pn4.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jc5 jc5 = (jc5) arrayList.get(i2);
            jc5.a.g(qk0, kc0, f2, lq6, rd7, iz1);
            qk0.o(0.0f, jc5.a.b());
        }
    }

    public static final ml4 s(ml4 ml4, ok2 ok2) {
        return ml4.d(new pk2(ok2));
    }

    public static Set u() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final ArrayList v(oq3 oq3) {
        ArrayList arrayList = new ArrayList();
        for (Object next : ((kq3) oq3.y.getValue()).a()) {
            if (next instanceof zq3) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final x83 w() {
        x83 x83 = n;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(11.0f, 7.0f);
        be5.g(2.0f);
        be5.n(2.0f);
        be5.g(-2.0f);
        be5.c();
        be5.j(11.0f, 11.0f);
        be5.g(2.0f);
        be5.n(6.0f);
        be5.g(-2.0f);
        be5.c();
        be5.j(12.0f, 2.0f);
        be5.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        be5.l(4.48f, 10.0f, 10.0f, 10.0f);
        be5.l(10.0f, -4.48f, 10.0f, -10.0f);
        be5.k(17.52f, 2.0f, 12.0f, 2.0f);
        be5.c();
        be5.j(12.0f, 20.0f);
        be5.e(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        be5.l(3.59f, -8.0f, 8.0f, -8.0f);
        be5.l(8.0f, 3.59f, 8.0f, 8.0f);
        be5.l(-3.59f, 8.0f, -8.0f, 8.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        n = b2;
        return b2;
    }

    public static final x83 z() {
        x83 x83 = o;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.LockReset", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(13.0f, 3.0f);
        e2.e(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        e2.f(1.0f);
        e2.i(4.0f, 4.0f);
        e2.i(4.0f, -4.0f);
        e2.f(6.0f);
        e2.e(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        e2.l(7.0f, 3.14f, 7.0f, 7.0f);
        e2.l(-3.14f, 7.0f, -7.0f, 7.0f);
        e2.e(-1.9f, 0.0f, -3.62f, -0.76f, -4.88f, -1.99f);
        e2.h(6.7f, 18.42f);
        e2.d(8.32f, 20.01f, 10.55f, 21.0f, 13.0f, 21.0f);
        e2.e(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        e2.k(17.97f, 3.0f, 13.0f, 3.0f);
        e2.c();
        e2.j(15.0f, 11.0f);
        e2.n(-1.0f);
        e2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e2.l(-2.0f, 0.9f, -2.0f, 2.0f);
        e2.n(1.0f);
        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e2.n(3.0f);
        e2.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e2.g(4.0f);
        e2.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e2.n(-3.0f);
        e2.d(16.0f, 11.45f, 15.55f, 11.0f, 15.0f, 11.0f);
        e2.c();
        e2.j(14.0f, 11.0f);
        e2.g(-2.0f);
        e2.n(-1.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.m(11.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        o = b2;
        return b2;
    }

    public abstract zw3 J(zw3 zw3);

    public abstract Object K();

    public abstract boolean j(Object obj);

    public Object t(int i2) {
        hg3 e2 = x().e(i2);
        return e2.c.b().y(Integer.valueOf(i2 - e2.a));
    }

    public abstract ig x();

    public Object y(int i2) {
        Object y;
        hg3 e2 = x().e(i2);
        int i3 = i2 - e2.a;
        vr2 key = e2.c.getKey();
        if (key == null || (y = key.y(Integer.valueOf(i3))) == null) {
            return new mm1(i2);
        }
        return y;
    }

    public void h(Object obj) {
    }
}
