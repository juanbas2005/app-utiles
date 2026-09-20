package defpackage;

import android.graphics.Path;
import android.util.Log;

/* renamed from: xe5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xe5 {
    public char a;
    public final float[] b;

    public xe5(xe5 xe5) {
        this.a = xe5.a;
        float[] fArr = xe5.b;
        this.b = l55.h(fArr, fArr.length);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        float f8 = f;
        float f9 = f3;
        float f10 = f7;
        double radians = Math.toRadians((double) f10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        float f11 = f2;
        double d4 = radians;
        double d5 = (double) f11;
        double d6 = (double) f5;
        double d7 = ((d5 * sin) + (d3 * cos)) / d6;
        double d8 = (double) f6;
        double d9 = ((d5 * cos) + (((double) (-f8)) * sin)) / d8;
        double d10 = d8;
        double d11 = (double) f4;
        double d12 = ((d11 * sin) + (((double) f9) * cos)) / d6;
        double d13 = ((d11 * cos) + (((double) (-f9)) * sin)) / d10;
        double d14 = d7 - d12;
        double d15 = d9 - d13;
        double d16 = (d7 + d12) / 2.0d;
        double d17 = (d9 + d13) / 2.0d;
        double d18 = d14;
        double d19 = (d15 * d15) + (d14 * d14);
        if (d19 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d19);
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            float f12 = f5 * sqrt;
            float f13 = f11;
            float f14 = sqrt * f6;
            a(path, f, f13, f9, f4, f12, f14, f10, z, z2);
            return;
        }
        boolean z4 = z2;
        double sqrt2 = Math.sqrt(d20);
        double d21 = sqrt2 * d18;
        double d22 = sqrt2 * d15;
        if (z == z4) {
            d2 = d16 - d22;
            d = d17 + d21;
        } else {
            d2 = d16 + d22;
            d = d17 - d21;
        }
        double atan2 = Math.atan2(d9 - d, d7 - d2);
        double atan22 = Math.atan2(d13 - d, d12 - d2) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4 != z3) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d23 = d2 * d6;
        double d24 = d * d10;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d4);
        double sin2 = Math.sin(d4);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d6;
        double d28 = d27 * cos2;
        double d29 = d10 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d10 * cos2;
        double d33 = atan22 / ((double) ceil);
        double d34 = (cos3 * d32) + (sin3 * d31);
        double d35 = d3;
        double d36 = d5;
        int i2 = 0;
        double d37 = atan2;
        while (i2 < ceil) {
            double d38 = d37 + d33;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            int i3 = ceil;
            double d39 = (((d6 * cos2) * cos4) + d25) - (d29 * sin4);
            double d40 = (d32 * sin4) + (d6 * sin2 * cos4) + d26;
            double d41 = (d28 * sin4) - (d29 * cos4);
            double d42 = (cos4 * d32) + (sin4 * d31);
            double d43 = d38 - d37;
            double tan = Math.tan(d43 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            double d44 = (d34 * sqrt3) + d36;
            double d45 = d31;
            Path path2 = path;
            path2.rLineTo(0.0f, 0.0f);
            float f15 = (float) (d40 - (sqrt3 * d42));
            Path path3 = path2;
            path3.cubicTo((float) ((d30 * sqrt3) + d35), (float) d44, (float) (d39 - (sqrt3 * d41)), f15, (float) d39, (float) d40);
            i2++;
            d36 = d40;
            cos2 = cos2;
            d31 = d45;
            d37 = d38;
            d34 = d42;
            d35 = d39;
            ceil = i3;
            d30 = d41;
            d33 = d33;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v10, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v12, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v13, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v14, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v15, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v17, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v18, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v19, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v20, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v21, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v22, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v23, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v28, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v29, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v30, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v31, resolved type: float[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void b(xe5[] xe5Arr, Path path) {
        int i;
        int i2;
        float[] fArr;
        int i3;
        char c;
        float f;
        float f2;
        xe5 xe5;
        boolean z;
        boolean z2;
        boolean z3;
        xe5 xe52;
        boolean z4;
        float[] fArr2;
        float f3;
        float f4;
        float[] fArr3;
        int i4;
        float f5;
        float f6;
        float f7;
        float[] fArr4;
        int i5;
        float f8;
        int i6;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float[] fArr5;
        xe5[] xe5Arr2 = xe5Arr;
        Path path2 = path;
        float[] fArr6 = new float[6];
        int length = xe5Arr2.length;
        int i7 = 0;
        int i8 = 0;
        char c2 = 'm';
        while (i8 < length) {
            xe5 xe53 = xe5Arr2[i8];
            char c3 = xe53.a;
            float[] fArr7 = xe53.b;
            float f14 = fArr6[i7];
            float f15 = fArr6[1];
            float f16 = fArr6[2];
            float f17 = fArr6[3];
            float f18 = fArr6[4];
            int i9 = i7;
            float f19 = fArr6[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    break;
            }
            i = 2;
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i10 = i9;
            while (i10 < fArr7.length) {
                if (c3 == 'A') {
                    fArr = fArr7;
                    i2 = i10;
                    xe5 = xe53;
                    float f24 = f22;
                    float f25 = f23;
                    i3 = i8;
                    c = c3;
                    int i11 = i2 + 5;
                    float f26 = fArr[i11];
                    int i12 = i2 + 6;
                    float f27 = fArr[i12];
                    float f28 = fArr[i2];
                    float f29 = fArr[i2 + 1];
                    float f30 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        z = 1;
                    } else {
                        z = i9;
                    }
                    if (fArr[i2 + 4] != 0.0f) {
                        z2 = 1;
                    } else {
                        z2 = i9;
                    }
                    a(path, f24, f25, f26, f27, f28, f29, f30, z, z2);
                    f16 = fArr[i11];
                    f = fArr[i12];
                    f17 = f;
                    f2 = f16;
                } else if (c3 == 'C') {
                    fArr = fArr7;
                    i2 = i10;
                    i3 = i8;
                    xe5 = xe53;
                    c = c3;
                    int i13 = i2 + 2;
                    int i14 = i2 + 3;
                    int i15 = i2 + 4;
                    int i16 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i13], fArr[i14], fArr[i15], fArr[i16]);
                    float f31 = fArr[i15];
                    float f32 = fArr[i16];
                    f16 = fArr[i13];
                    f17 = fArr[i14];
                    f = f32;
                    f2 = f31;
                } else if (c3 == 'H') {
                    fArr = fArr7;
                    i2 = i10;
                    xe5 = xe53;
                    c = c3;
                    f = f23;
                    i3 = i8;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr7;
                    i2 = i10;
                    i3 = i8;
                    xe5 = xe53;
                    c = c3;
                    int i17 = i2 + 1;
                    int i18 = i2 + 2;
                    int i19 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i17], fArr[i18], fArr[i19]);
                    float f33 = fArr[i2];
                    float f34 = fArr[i17];
                    float f35 = fArr[i18];
                    float f36 = fArr[i19];
                    f16 = f33;
                    f17 = f34;
                    f2 = f35;
                    f = f36;
                } else if (c3 == 'V') {
                    fArr = fArr7;
                    i2 = i10;
                    i3 = i8;
                    xe5 = xe53;
                    f2 = f22;
                    c = c3;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 != 'c') {
                        if (c3 != 'h') {
                            if (c3 != 'q') {
                                if (c3 != 'v') {
                                    if (c3 == 'L') {
                                        fArr = fArr7;
                                        i6 = i10;
                                        int i20 = i6 + 1;
                                        path2.lineTo(fArr[i6], fArr[i20]);
                                        f9 = fArr[i6];
                                        f = fArr[i20];
                                    } else if (c3 == 'M') {
                                        fArr = fArr7;
                                        i6 = i10;
                                        f9 = fArr[i6];
                                        f = fArr[i6 + 1];
                                        if (i6 > 0) {
                                            path2.lineTo(f9, f);
                                        } else {
                                            path2.moveTo(f9, f);
                                            f20 = f9;
                                            f21 = f;
                                        }
                                    } else if (c3 == 'S') {
                                        fArr = fArr7;
                                        i6 = i10;
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f22 = (f22 * 2.0f) - f16;
                                            f23 = (f23 * 2.0f) - f17;
                                        }
                                        float f37 = f22;
                                        float f38 = f23;
                                        int i21 = i6 + 1;
                                        int i22 = i6 + 2;
                                        int i23 = i6 + 3;
                                        path2.cubicTo(f37, f38, fArr[i6], fArr[i21], fArr[i22], fArr[i23]);
                                        float f39 = fArr[i6];
                                        f16 = f39;
                                        f17 = fArr[i21];
                                        f9 = fArr[i22];
                                        f = fArr[i23];
                                    } else if (c3 == 'T') {
                                        fArr2 = fArr7;
                                        i2 = i10;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f22 = (f22 * 2.0f) - f16;
                                            f23 = (f23 * 2.0f) - f17;
                                        }
                                        int i24 = i2 + 1;
                                        path2.quadTo(f22, f23, fArr2[i2], fArr2[i24]);
                                        f2 = fArr2[i2];
                                        f4 = fArr2[i24];
                                        xe5 = xe53;
                                        f16 = f22;
                                        f17 = f23;
                                    } else if (c3 == 'l') {
                                        fArr4 = fArr7;
                                        i5 = i10;
                                        int i25 = i5 + 1;
                                        path2.rLineTo(fArr4[i5], fArr4[i25]);
                                        f22 += fArr4[i5];
                                        f8 = fArr4[i25];
                                    } else if (c3 == 'm') {
                                        fArr2 = fArr7;
                                        i2 = i10;
                                        float f40 = fArr2[i2];
                                        f3 = f22 + f40;
                                        float f41 = fArr2[i2 + 1];
                                        f23 += f41;
                                        if (i2 > 0) {
                                            path2.rLineTo(f40, f41);
                                        } else {
                                            path2.rMoveTo(f40, f41);
                                            xe5 = xe53;
                                            f2 = f3;
                                            f20 = f2;
                                            f4 = f23;
                                            f21 = f4;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr5 = fArr7;
                                            i2 = i10;
                                            xe5 = xe53;
                                            f2 = f22;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i26 = i10 + 1;
                                            path2.rQuadTo(f12, f13, fArr7[i10], fArr7[i26]);
                                            float f42 = f12 + f22;
                                            float f43 = f13 + f23;
                                            float f44 = f22 + fArr7[i10];
                                            f23 += fArr7[i26];
                                            f17 = f43;
                                            fArr5 = fArr7;
                                            i2 = i10;
                                            xe5 = xe53;
                                            f2 = f44;
                                            f16 = f42;
                                        }
                                        f4 = f23;
                                        fArr2 = fArr5;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f10 = f23 - f17;
                                            f11 = f22 - f16;
                                        } else {
                                            f11 = 0.0f;
                                            f10 = 0.0f;
                                        }
                                        int i27 = i10;
                                        int i28 = i27 + 1;
                                        int i29 = i27;
                                        int i30 = i29 + 2;
                                        int i31 = i29;
                                        int i32 = i31 + 3;
                                        fArr3 = fArr7;
                                        i4 = i31;
                                        path2.rCubicTo(f11, f10, fArr7[i27], fArr7[i28], fArr7[i30], fArr7[i32]);
                                        f5 = fArr3[i4] + f22;
                                        f6 = fArr3[i28] + f23;
                                        f3 = f22 + fArr3[i30];
                                        f7 = fArr3[i32];
                                    }
                                    i3 = i8;
                                    xe5 = xe53;
                                    c = c3;
                                } else {
                                    fArr4 = fArr7;
                                    i5 = i10;
                                    path2.rLineTo(0.0f, fArr4[i5]);
                                    f8 = fArr4[i5];
                                }
                                f23 += f8;
                                fArr2 = fArr4;
                            } else {
                                fArr3 = fArr7;
                                i4 = i10;
                                int i33 = i4 + 1;
                                int i34 = i4 + 2;
                                int i35 = i4 + 3;
                                path2.rQuadTo(fArr3[i4], fArr3[i33], fArr3[i34], fArr3[i35]);
                                f5 = fArr3[i4] + f22;
                                f6 = fArr3[i33] + f23;
                                f3 = f22 + fArr3[i34];
                                f7 = fArr3[i35];
                            }
                            f23 += f7;
                            f16 = f5;
                            f17 = f6;
                            fArr2 = fArr3;
                        } else {
                            fArr2 = fArr7;
                            i2 = i10;
                            path2.rLineTo(fArr2[i2], 0.0f);
                            f3 = f22 + fArr2[i2];
                        }
                        xe5 = xe53;
                        f2 = f3;
                        f4 = f23;
                        fArr2 = fArr2;
                    } else {
                        fArr2 = fArr7;
                        i2 = i10;
                        int i36 = i2 + 2;
                        int i37 = i2 + 3;
                        int i38 = i2 + 4;
                        int i39 = i2 + 5;
                        path2.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                        float f45 = fArr2[i36] + f22;
                        float f46 = fArr2[i37] + f23;
                        f3 = f22 + fArr2[i38];
                        f23 += fArr2[i39];
                        f16 = f45;
                        f17 = f46;
                        xe5 = xe53;
                        f2 = f3;
                        f4 = f23;
                        fArr2 = fArr2;
                    }
                    i3 = i8;
                    fArr = fArr2;
                    c = c3;
                } else {
                    fArr = fArr7;
                    i2 = i10;
                    int i40 = i2 + 5;
                    float f47 = fArr[i40] + f22;
                    int i41 = i2 + 6;
                    float f48 = fArr[i41] + f23;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        xe52 = xe53;
                        z3 = 1;
                    } else {
                        xe52 = xe53;
                        z3 = i9;
                    }
                    xe5 = xe52;
                    float f52 = f22;
                    c = c3;
                    if (fArr[i2 + 4] != 0.0f) {
                        z4 = 1;
                    } else {
                        z4 = i9;
                    }
                    float f53 = f23;
                    i3 = i8;
                    a(path, f52, f53, f47, f48, f49, f50, f51, z3, z4);
                    f2 = f52 + fArr[i40];
                    f = f53 + fArr[i41];
                    f16 = f2;
                    f17 = f;
                }
                i10 = i2 + i;
                path2 = path;
                xe53 = xe5;
                c3 = c;
                i8 = i3;
                xe5[] xe5Arr3 = xe5Arr;
                f22 = f2;
                f23 = f;
                c2 = c3;
                fArr7 = fArr;
            }
            fArr6[i9] = f22;
            fArr6[1] = f23;
            fArr6[2] = f16;
            fArr6[3] = f17;
            fArr6[4] = f20;
            fArr6[5] = f21;
            c2 = xe53.a;
            i8++;
            xe5Arr2 = xe5Arr;
            path2 = path;
            i7 = i9;
        }
    }

    public xe5(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }
}
