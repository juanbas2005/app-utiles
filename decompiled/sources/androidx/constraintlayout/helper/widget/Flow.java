package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class Flow extends w68 {
    public final ei2 F;

    /* JADX WARNING: type inference failed for: r8v1, types: [pz2, ei2] */
    /* JADX WARNING: type inference failed for: r1v0, types: [m60, java.lang.Object] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new int[32];
        this.C = new HashMap();
        this.y = context;
        super.g(attributeSet);
        ? pz2 = new pz2();
        pz2.r0 = 0;
        pz2.s0 = 0;
        pz2.t0 = 0;
        pz2.u0 = 0;
        pz2.v0 = 0;
        pz2.w0 = 0;
        pz2.x0 = false;
        pz2.y0 = 0;
        pz2.z0 = 0;
        pz2.A0 = new Object();
        pz2.B0 = null;
        pz2.C0 = -1;
        pz2.D0 = -1;
        pz2.E0 = -1;
        pz2.F0 = -1;
        pz2.G0 = -1;
        pz2.H0 = -1;
        pz2.I0 = 0.5f;
        pz2.J0 = 0.5f;
        pz2.K0 = 0.5f;
        pz2.L0 = 0.5f;
        pz2.M0 = 0.5f;
        pz2.N0 = 0.5f;
        pz2.O0 = 0;
        pz2.P0 = 0;
        pz2.Q0 = 2;
        pz2.R0 = 2;
        pz2.S0 = 0;
        pz2.T0 = -1;
        pz2.U0 = 0;
        pz2.V0 = new ArrayList();
        pz2.W0 = null;
        pz2.X0 = null;
        pz2.Y0 = null;
        pz2.a1 = 0;
        this.F = pz2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jv5.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.F.U0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    ei2 ei2 = this.F;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ei2.r0 = dimensionPixelSize;
                    ei2.s0 = dimensionPixelSize;
                    ei2.t0 = dimensionPixelSize;
                    ei2.u0 = dimensionPixelSize;
                } else if (index == 18) {
                    ei2 ei22 = this.F;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ei22.t0 = dimensionPixelSize2;
                    ei22.v0 = dimensionPixelSize2;
                    ei22.w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.F.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.F.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.F.r0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.F.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.F.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.F.S0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.F.C0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.F.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.F.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.F.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.F.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.F.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.F.I0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.F.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.F.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.F.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.F.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.F.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.F.Q0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.F.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.F.O0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.F.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.F.T0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.z = this.F;
        i();
    }

    public final void h(g31 g31, boolean z) {
        ei2 ei2 = this.F;
        int i = ei2.t0;
        if (i <= 0 && ei2.u0 <= 0) {
            return;
        }
        if (z) {
            ei2.v0 = ei2.u0;
            ei2.w0 = i;
            return;
        }
        ei2.v0 = i;
        ei2.w0 = ei2.u0;
    }

    /* JADX WARNING: type inference failed for: r28v0 */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r28v2 */
    /* JADX WARNING: type inference failed for: r28v3 */
    /* JADX WARNING: type inference failed for: r28v4 */
    /* JADX WARNING: type inference failed for: r28v5 */
    /* JADX WARNING: type inference failed for: r28v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0560  */
    public final void j(ei2 ei2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        ? r28;
        char c;
        boolean z;
        ci2 ci2;
        int i10;
        boolean z2;
        int[] iArr2;
        int i11;
        boolean z3;
        int i12;
        boolean z4;
        int i13;
        boolean z5;
        int i14;
        int i15;
        g31 g31;
        int i16;
        int i17;
        int i18;
        boolean z6;
        boolean z7;
        boolean z8;
        g31[] g31Arr;
        g31 g312;
        n21 n21;
        ei2 ei22 = ei2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = 0;
        if (ei22 != null) {
            ArrayList arrayList = ei22.V0;
            if (ei22.q0 > 0) {
                m60 m60 = ei22.A0;
                g31 g313 = ei22.S;
                if (g313 != null) {
                    n21 = ((h31) g313).t0;
                } else {
                    n21 = null;
                }
                if (n21 == null) {
                    ei22.y0 = 0;
                    ei22.z0 = 0;
                    ei22.x0 = false;
                    setMeasuredDimension(ei22.y0, ei22.z0);
                    return;
                }
                int i20 = 0;
                while (i20 < ei22.q0) {
                    g31 g314 = ei22.p0[i20];
                    if (g314 != null && !(g314 instanceof zx2)) {
                        int j = g314.j(i19);
                        int j2 = g314.j(1);
                        if (j != 3 || g314.q == 1 || j2 != 3 || g314.r == 1) {
                            if (j == 3) {
                                j = 2;
                            }
                            if (j2 == 3) {
                                j2 = 2;
                            }
                            m60.a = j;
                            m60.b = j2;
                            m60.c = g314.n();
                            m60.d = g314.k();
                            n21.b(g314, m60);
                            g314.J(m60.e);
                            g314.G(m60.f);
                            g314.D(m60.g);
                        }
                    }
                    i20++;
                    i19 = 0;
                }
            }
            int i21 = ei22.v0;
            int i22 = ei22.w0;
            int i23 = ei22.r0;
            int i24 = ei22.s0;
            int[] iArr3 = new int[2];
            int i25 = (size - i21) - i22;
            int i26 = ei22.U0;
            if (i26 == 1) {
                i25 = (size2 - i23) - i24;
            }
            int i27 = ei22.C0;
            if (i26 == 0) {
                if (i27 == -1) {
                    ei22.C0 = 0;
                }
                if (ei22.D0 == -1) {
                    ei22.D0 = 0;
                }
            } else {
                if (i27 == -1) {
                    ei22.C0 = 0;
                }
                if (ei22.D0 == -1) {
                    ei22.D0 = 0;
                }
            }
            g31[] g31Arr2 = ei22.p0;
            int i28 = i22;
            int i29 = 0;
            int i30 = 0;
            while (true) {
                i3 = ei22.q0;
                i4 = i23;
                if (i29 >= i3) {
                    break;
                }
                if (ei22.p0[i29].f0 == 8) {
                    i30++;
                }
                i29++;
                i23 = i4;
            }
            if (i30 > 0) {
                g31Arr2 = new g31[(i3 - i30)];
                int i31 = 0;
                int i32 = 0;
                while (i31 < ei22.q0) {
                    g31 g315 = ei22.p0[i31];
                    int i33 = i31;
                    if (g315.f0 != 8) {
                        g31Arr2[i32] = g315;
                        i32++;
                    }
                    i31 = i33 + 1;
                }
                i5 = i32;
            } else {
                i5 = i3;
            }
            g31[] g31Arr3 = g31Arr2;
            ei22.Z0 = g31Arr3;
            ei22.a1 = i5;
            int i34 = ei22.S0;
            if (i34 != 0) {
                if (i34 == 1) {
                    g31[] g31Arr4 = g31Arr3;
                    i10 = i24;
                    z2 = true;
                    iArr2 = iArr3;
                    int i35 = ei22.U0;
                    h21 h21 = ei22.K;
                    h21 h212 = ei22.J;
                    if (i5 != 0) {
                        arrayList.clear();
                        i6 = i21;
                        r28 = 1;
                        i9 = i28;
                        i8 = i4;
                        i7 = i10;
                        iArr = iArr2;
                        h21 h213 = h212;
                        g31[] g31Arr5 = g31Arr4;
                        h21 h214 = h21;
                        int i36 = i25;
                        ci2 ci22 = new ci2(ei22, i35, ei22.H, ei22.I, ei22.J, ei22.K, i36);
                        arrayList.add(ci22);
                        if (i35 == 0) {
                            ci2 ci23 = ci22;
                            int i37 = 0;
                            i11 = 0;
                            int i38 = 0;
                            while (i37 < i5) {
                                g31 g316 = g31Arr5[i37];
                                int P = ei22.P(g316, i36);
                                int i39 = i37;
                                if (g316.o0[0] == 3) {
                                    i11++;
                                }
                                int i40 = i11;
                                if ((i38 == i36 || ei22.O0 + i38 + P > i36) && ci23.b != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5 && i39 > 0 && (i16 = ei22.T0) > 0 && i39 % i16 == 0) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i14 = i40;
                                    g31 = g316;
                                    i15 = i39;
                                    ci2 ci24 = new ci2(ei22, i35, ei22.H, ei22.I, ei22.J, ei22.K, i36);
                                    ci24.n = i15;
                                    arrayList.add(ci24);
                                    ci23 = ci24;
                                } else {
                                    g31 = g316;
                                    i14 = i40;
                                    i15 = i39;
                                    if (i15 > 0) {
                                        i38 = ei22.O0 + P + i38;
                                        ci23.a(g31);
                                        i37 = i15 + 1;
                                        i11 = i14;
                                    }
                                }
                                i38 = P;
                                ci23.a(g31);
                                i37 = i15 + 1;
                                i11 = i14;
                            }
                        } else {
                            ci2 ci25 = ci22;
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            while (i41 < i5) {
                                g31 g317 = g31Arr5[i41];
                                int O = ei22.O(g317, i36);
                                if (g317.o0[1] == 3) {
                                    i42++;
                                }
                                int i44 = i42;
                                if ((i43 == i36 || ei22.P0 + i43 + O > i36) && ci25.b != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4 && i41 > 0 && (i13 = ei22.T0) > 0 && i41 % i13 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    ci2 ci26 = new ci2(ei22, i35, ei22.H, ei22.I, ei22.J, ei22.K, i36);
                                    ci26.n = i41;
                                    arrayList.add(ci26);
                                    ci25 = ci26;
                                } else if (i41 > 0) {
                                    i43 = ei22.P0 + O + i43;
                                    ci25.a(g317);
                                    i41++;
                                    i42 = i44;
                                }
                                i43 = O;
                                ci25.a(g317);
                                i41++;
                                i42 = i44;
                            }
                            i11 = i42;
                        }
                        int size3 = arrayList.size();
                        h21 h215 = ei22.H;
                        h21 h216 = ei22.I;
                        int i45 = ei22.v0;
                        int i46 = ei22.r0;
                        int i47 = ei22.w0;
                        int i48 = ei22.s0;
                        h21 h217 = h215;
                        int[] iArr4 = ei22.o0;
                        int i49 = i35;
                        if (iArr4[0] == 2 || iArr4[1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i11 > 0 && z3) {
                            for (int i50 = 0; i50 < size3; i50++) {
                                ci2 ci27 = (ci2) arrayList.get(i50);
                                if (i49 == 0) {
                                    ci27.e(i36 - ci27.d());
                                } else {
                                    ci27.e(i36 - ci27.c());
                                }
                            }
                        }
                        h21 h218 = h216;
                        int i51 = i45;
                        int i52 = i46;
                        int i53 = i47;
                        int i54 = i48;
                        h21 h219 = h214;
                        h21 h2110 = h217;
                        h21 h2111 = h213;
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = 0;
                        while (i55 < size3) {
                            ci2 ci28 = (ci2) arrayList.get(i55);
                            if (i49 == 0) {
                                if (i55 < size3 - 1) {
                                    h219 = ((ci2) arrayList.get(i55 + 1)).b.I;
                                    i54 = 0;
                                } else {
                                    i54 = ei22.s0;
                                    h219 = h214;
                                }
                                h21 h2112 = ci28.b.K;
                                i12 = i49;
                                ci28.f(i12, h2110, h218, h2111, h219, i51, i52, i53, i54, i36);
                                i56 = Math.max(i56, ci28.d());
                                int c2 = ci28.c() + i57;
                                if (i55 > 0) {
                                    c2 += ei22.P0;
                                }
                                i57 = c2;
                                h218 = h2112;
                                i52 = 0;
                            } else {
                                i12 = i49;
                                if (i55 < size3 - 1) {
                                    h2111 = ((ci2) arrayList.get(i55 + 1)).b.H;
                                    i53 = 0;
                                } else {
                                    i53 = ei22.w0;
                                    h2111 = h213;
                                }
                                h21 h2113 = ci28.b.J;
                                ci2 ci29 = ci28;
                                ci29.f(i12, h2110, h218, h2111, h219, i51, i52, i53, i54, i36);
                                int d = ci29.d() + i56;
                                int max = Math.max(i57, ci29.c());
                                if (i55 > 0) {
                                    d += ei22.O0;
                                }
                                i57 = max;
                                i56 = d;
                                h2110 = h2113;
                                i51 = 0;
                            }
                            i55++;
                            i49 = i12;
                        }
                        iArr[0] = i56;
                        iArr[1] = i57;
                    }
                } else if (i34 != 2) {
                    i7 = i24;
                    iArr = iArr3;
                    i6 = i21;
                    i9 = i28;
                    i8 = i4;
                    c = 0;
                    r28 = 1;
                    int i58 = iArr[c] + i6 + i9;
                    int i59 = iArr[r28] + i8 + i7;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size = Math.min(i58, size);
                        } else if (mode == 0) {
                            size = i58;
                        } else {
                            size = 0;
                        }
                    }
                    if (mode2 != 1073741824) {
                        if (mode2 == Integer.MIN_VALUE) {
                            size2 = Math.min(i59, size2);
                        } else if (mode2 == 0) {
                            size2 = i59;
                        } else {
                            size2 = 0;
                        }
                    }
                    ei22.y0 = size;
                    ei22.z0 = size2;
                    ei22.J(size);
                    ei22.G(size2);
                    if (ei22.q0 > 0) {
                        z = r28;
                    } else {
                        z = false;
                    }
                    ei22.x0 = z;
                    setMeasuredDimension(ei22.y0, ei22.z0);
                    return;
                } else {
                    int i60 = ei22.U0;
                    int i61 = ei22.T0;
                    if (i60 == 0) {
                        if (i61 <= 0) {
                            int i62 = 0;
                            int i63 = 0;
                            i17 = 0;
                            while (true) {
                                i10 = i24;
                                if (i62 >= i5) {
                                    break;
                                }
                                if (i62 > 0) {
                                    i63 += ei22.O0;
                                }
                                g31 g318 = g31Arr3[i62];
                                if (g318 != null) {
                                    int P2 = ei22.P(g318, i25) + i63;
                                    if (P2 > i25) {
                                        break;
                                    }
                                    i17++;
                                    i63 = P2;
                                }
                                i62++;
                                i24 = i10;
                            }
                        } else {
                            i10 = i24;
                            i17 = i61;
                        }
                        i61 = 0;
                    } else {
                        i10 = i24;
                        if (i61 <= 0) {
                            int i64 = 0;
                            int i65 = 0;
                            for (int i66 = 0; i66 < i5; i66++) {
                                if (i66 > 0) {
                                    i64 += ei22.P0;
                                }
                                g31 g319 = g31Arr3[i66];
                                if (g319 != null) {
                                    int O2 = ei22.O(g319, i25) + i64;
                                    if (O2 > i25) {
                                        break;
                                    }
                                    i65++;
                                    i64 = O2;
                                }
                            }
                            i61 = i65;
                        }
                        i17 = 0;
                    }
                    if (ei22.Y0 == null) {
                        ei22.Y0 = new int[2];
                    }
                    if ((i18 == 0 && i60 == 1) || (i17 == 0 && i60 == 0)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    while (!z6) {
                        if (i60 == 0) {
                            z7 = z6;
                            i18 = (int) Math.ceil((double) (((float) i5) / ((float) i17)));
                        } else {
                            z7 = z6;
                            i17 = (int) Math.ceil((double) (((float) i5) / ((float) i18)));
                            i18 = i18;
                        }
                        g31[] g31Arr6 = ei22.X0;
                        int[] iArr5 = iArr3;
                        if (g31Arr6 == null || g31Arr6.length < i17) {
                            ei22.X0 = new g31[i17];
                        } else {
                            Arrays.fill(g31Arr6, (Object) null);
                        }
                        g31[] g31Arr7 = ei22.W0;
                        if (g31Arr7 == null || g31Arr7.length < i18) {
                            ei22.W0 = new g31[i18];
                        } else {
                            Arrays.fill(g31Arr7, (Object) null);
                        }
                        int i67 = 0;
                        while (i67 < i17) {
                            int i68 = 0;
                            while (i68 < i18) {
                                int i69 = (i68 * i17) + i67;
                                int i70 = i67;
                                if (i60 == 1) {
                                    i69 = (i70 * i18) + i68;
                                }
                                int i71 = i60;
                                int i72 = i69;
                                if (i72 < g31Arr3.length && (g312 = g31Arr3[i72]) != null) {
                                    int P3 = ei22.P(g312, i25);
                                    g31Arr = g31Arr3;
                                    g31 g3110 = ei22.X0[i70];
                                    if (g3110 == null || g3110.n() < P3) {
                                        ei22.X0[i70] = g312;
                                    }
                                    int O3 = ei22.O(g312, i25);
                                    g31 g3111 = ei22.W0[i68];
                                    if (g3111 == null || g3111.k() < O3) {
                                        ei22.W0[i68] = g312;
                                    }
                                } else {
                                    g31Arr = g31Arr3;
                                }
                                i68++;
                                i67 = i70;
                                i60 = i71;
                                g31Arr3 = g31Arr;
                            }
                            g31[] g31Arr8 = g31Arr3;
                            int i73 = i60;
                            i67++;
                        }
                        g31[] g31Arr9 = g31Arr3;
                        int i74 = i60;
                        int i75 = 0;
                        for (int i76 = 0; i76 < i17; i76++) {
                            g31 g3112 = ei22.X0[i76];
                            if (g3112 != null) {
                                if (i76 > 0) {
                                    i75 += ei22.O0;
                                }
                                i75 = ei22.P(g3112, i25) + i75;
                            }
                        }
                        int i77 = 0;
                        int i78 = 0;
                        while (i77 < i18) {
                            g31 g3113 = ei22.W0[i77];
                            int i79 = i77;
                            if (g3113 != null) {
                                if (i77 > 0) {
                                    i78 += ei22.P0;
                                }
                                i78 = ei22.O(g3113, i25) + i78;
                            }
                            i77 = i79 + 1;
                        }
                        iArr5[0] = i75;
                        iArr5[1] = i78;
                        if (i74 == 0) {
                            if (i75 > i25 && i17 > 1) {
                                i17--;
                            }
                            z8 = true;
                            iArr3 = iArr5;
                            i60 = i74;
                            g31Arr3 = g31Arr9;
                        } else {
                            if (i78 > i25 && i18 > 1) {
                                i18--;
                            }
                            z8 = true;
                            iArr3 = iArr5;
                            i60 = i74;
                            g31Arr3 = g31Arr9;
                        }
                        z8 = z7;
                        iArr3 = iArr5;
                        i60 = i74;
                        g31Arr3 = g31Arr9;
                    }
                    iArr2 = iArr3;
                    z2 = true;
                    int[] iArr6 = ei22.Y0;
                    iArr6[0] = i17;
                    iArr6[1] = i18;
                }
                r28 = z2;
                i6 = i21;
                i9 = i28;
                i8 = i4;
                i7 = i10;
                iArr = iArr2;
            } else {
                g31[] g31Arr10 = g31Arr3;
                i7 = i24;
                int i80 = i25;
                iArr = iArr3;
                i6 = i21;
                i9 = i28;
                i8 = i4;
                r28 = 1;
                int i81 = ei22.U0;
                if (i5 != 0) {
                    if (arrayList.size() == 0) {
                        ci2 = new ci2(ei22, i81, ei22.H, ei22.I, ei22.J, ei22.K, i80);
                        arrayList.add(ci2);
                    } else {
                        ci2 ci210 = (ci2) arrayList.get(0);
                        ci210.c = 0;
                        ci210.b = null;
                        ci210.l = 0;
                        ci210.m = 0;
                        ci210.n = 0;
                        ci210.o = 0;
                        ci210.p = 0;
                        ci2 ci211 = ci210;
                        ci211.f(i81, ei22.H, ei22.I, ei22.J, ei22.K, ei22.v0, ei22.r0, ei22.w0, ei22.s0, i80);
                        ci2 = ci211;
                    }
                    for (int i82 = 0; i82 < i5; i82++) {
                        ci2.a(g31Arr10[i82]);
                    }
                    c = 0;
                    iArr[0] = ci2.d();
                    iArr[1] = ci2.c();
                    int i582 = iArr[c] + i6 + i9;
                    int i592 = iArr[r28] + i8 + i7;
                    if (mode != 1073741824) {
                    }
                    if (mode2 != 1073741824) {
                    }
                    ei22.y0 = size;
                    ei22.z0 = size2;
                    ei22.J(size);
                    ei22.G(size2);
                    if (ei22.q0 > 0) {
                    }
                    ei22.x0 = z;
                    setMeasuredDimension(ei22.y0, ei22.z0);
                    return;
                }
            }
            c = 0;
            r28 = r28;
            int i5822 = iArr[c] + i6 + i9;
            int i5922 = iArr[r28] + i8 + i7;
            if (mode != 1073741824) {
            }
            if (mode2 != 1073741824) {
            }
            ei22.y0 = size;
            ei22.z0 = size2;
            ei22.J(size);
            ei22.G(size2);
            if (ei22.q0 > 0) {
            }
            ei22.x0 = z;
            setMeasuredDimension(ei22.y0, ei22.z0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final void onMeasure(int i, int i2) {
        j(this.F, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.F.K0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.F.E0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.F.L0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.F.F0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.F.Q0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.F.I0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.F.O0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.F.C0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.F.T0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.F.U0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        ei2 ei2 = this.F;
        ei2.r0 = i;
        ei2.s0 = i;
        ei2.t0 = i;
        ei2.u0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.F.s0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.F.v0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.F.w0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.F.r0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.F.R0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.F.J0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.F.P0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.F.D0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.F.S0 = i;
        requestLayout();
    }
}
