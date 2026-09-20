package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: o00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o00 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public o00(String str, f93 f93, mb9 mb9, Executor executor, ka9 ka9, xn5 xn5, hx8 hx8) {
        this.a = 2;
        this.i = new Object();
        this.j = new jz0(23);
        this.k = null;
        this.b = str;
        this.c = pt2.e(f93);
        this.d = mb9;
        this.e = new jl6(executor);
        this.f = ka9;
        this.g = xn5;
        this.h = hx8;
    }

    public static final void a(o00 o00, ll4 ll4, xz4 xz4) {
        hc3 hc3;
        ll4 ll42 = ll4.A;
        while (ll42 != null) {
            if (ll42 == ((tz4) o00.c)) {
                uy3 v = ((uy3) o00.b).v();
                if (v != null) {
                    hc3 = (hc3) v.a0.d;
                } else {
                    hc3 = null;
                }
                xz4.Q = hc3;
                o00.e = xz4;
                return;
            } else if ((ll42.y & 2) == 0) {
                ll42.U0(xz4);
                ll42 = ll42.A;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [e40, ll4] */
    public static ll4 d(kl4 kl4, ll4 ll4) {
        ll4 ll42;
        if (kl4 instanceof pl4) {
            ll42 = ((pl4) kl4).g();
            ll42.y = yz4.f(ll42);
        } else {
            ? ll43 = new ll4();
            ll43.y = yz4.d(kl4);
            ll43.K = kl4;
            new HashSet();
            ll42 = ll43;
        }
        if (ll42.J) {
            yb3.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        ll42.E = true;
        ll4 ll44 = ll4.B;
        if (ll44 != null) {
            ll44.A = ll42;
            ll42.B = ll44;
        }
        ll4.B = ll42;
        ll42.A = ll4;
        return ll42;
    }

    public static ll4 e(ll4 ll4) {
        boolean z = ll4.J;
        if (z) {
            hp4 hp4 = yz4.a;
            if (!z) {
                yb3.b("autoInvalidateRemovedNode called on unattached node");
            }
            yz4.a(ll4, -1, 2);
            ll4.S0();
            ll4.M0();
        }
        ll4 ll42 = ll4.B;
        ll4 ll43 = ll4.A;
        if (ll42 != null) {
            ll42.A = ll43;
            ll4.B = null;
        }
        if (ll43 != null) {
            ll43.B = ll42;
            ll4.A = null;
        }
        ll43.getClass();
        return ll43;
    }

    public static void j(kl4 kl4, kl4 kl42, ll4 ll4) {
        if ((kl4 instanceof pl4) && (kl42 instanceof pl4)) {
            ll4.getClass();
            ((pl4) kl42).h(ll4);
            if (ll4.J) {
                yz4.c(ll4);
            } else {
                ll4.F = true;
            }
        } else if (ll4 instanceof e40) {
            e40 e40 = (e40) ll4;
            boolean z = e40.J;
            if (z) {
                if (!z) {
                    yb3.b("unInitializeModifier called on unattached node");
                }
                if ((e40.y & 8) != 0) {
                    ((je) rc9.P0(e40)).y();
                }
            }
            e40.K = kl42;
            e40.y = yz4.d(kl42);
            if (e40.J) {
                e40.V0(false);
            }
            if (ll4.J) {
                yz4.c(ll4);
            } else {
                ll4.F = true;
            }
        } else {
            yb3.b("Unknown Modifier.Node type");
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.i;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            h.s("Property \"autoMetadata\" has not been set");
        }
    }

    public p00 c() {
        String str;
        if (((String) this.b) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((i42) this.f) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.g) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.h) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.i) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new p00((String) this.b, (Integer) this.d, (i42) this.f, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (HashMap) this.i, (Integer) this.e, (String) this.c, (byte[]) this.j, (byte[]) this.k);
        }
        h.s("Missing required properties:".concat(str));
        return null;
    }

    public boolean f(int i2) {
        if ((((ll4) this.g).z & i2) != 0) {
            return true;
        }
        return false;
    }

    public void g() {
        for (ll4 ll4 = (ll4) this.g; ll4 != null; ll4 = ll4.B) {
            ll4.R0();
            if (ll4.E) {
                hp4 hp4 = yz4.a;
                if (!ll4.J) {
                    yb3.b("autoInvalidateInsertedNode called on unattached node");
                }
                yz4.a(ll4, -1, 1);
            }
            if (ll4.F) {
                yz4.c(ll4);
            }
            ll4.E = false;
            ll4.F = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026a, code lost:
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d0, code lost:
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014a, code lost:
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0150, code lost:
        if ((r19 & 1) != 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0156, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        if (r13 > r3) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        if (r13 == r12) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015b, code lost:
        if (r13 == r3) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        r24 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        r24 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0170, code lost:
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        r24 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017b, code lost:
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        if (r3 == 0) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018a, code lost:
        r25 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018d, code lost:
        r25 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018f, code lost:
        if (r14 != r11) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0191, code lost:
        r27 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
        r27 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0196, code lost:
        r25 = r22 + (r25 & r27);
        r30 = r22;
        r22 = r11;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        if (r14 <= r7) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        if (r11 <= r15) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a4, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b0, code lost:
        if (r0.a(r14 - 1, r27 - 1) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b2, code lost:
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b9, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bd, code lost:
        r20[r17 + r28] = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c1, code lost:
        if (r24 == 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c3, code lost:
        r11 = r19 - r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c5, code lost:
        if (r11 < r12) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c7, code lost:
        if (r11 > r3) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
        if (r16[r17 + r11] < r14) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0140  */
    public void h(int i2, eq4 eq4, eq4 eq42, ll4 ll4, boolean z) {
        eq4 eq43;
        eq4 eq44;
        int i3;
        int i4;
        int[] iArr;
        int[] iArr2;
        int i5;
        char c2;
        char c3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sz4 sz4 = (sz4) this.k;
        if (sz4 == null) {
            i3 = i2;
            eq44 = eq4;
            eq43 = eq42;
            sz4 = new sz4(this, ll4, i3, eq44, eq43, z);
            this.k = sz4;
        } else {
            i3 = i2;
            eq44 = eq4;
            eq43 = eq42;
            sz4.a = ll4;
            sz4.b = i3;
            sz4.c = eq44;
            sz4.d = eq43;
            sz4.e = z;
        }
        o00 o00 = sz4.f;
        int i17 = eq44.y - i3;
        int i18 = eq43.y - i3;
        char c4 = 2;
        int i19 = ((i17 + i18) + 1) / 2;
        xe3 xe3 = new xe3(i19 * 3);
        xe3 xe32 = new xe3(i19 * 4);
        int i20 = 0;
        xe32.e(0, i17, 0, i18);
        int i21 = (i19 * 2) + 1;
        int[] iArr3 = new int[i21];
        int[] iArr4 = new int[i21];
        int[] iArr5 = new int[5];
        while (true) {
            int i22 = xe32.b;
            if (i22 == 0) {
                break;
            }
            char c5 = c4;
            int[] iArr6 = xe32.a;
            int i23 = i20;
            int i24 = i22 - 1;
            xe32.b = i24;
            int i25 = iArr6[i24];
            int i26 = i22 - 2;
            xe32.b = i26;
            int i27 = iArr6[i26];
            int i28 = i22 - 3;
            xe32.b = i28;
            int i29 = iArr6[i28];
            int i30 = i22 - 4;
            xe32.b = i30;
            int i31 = iArr6[i30];
            int i32 = i29 - i31;
            int i33 = i21;
            int i34 = i25 - i27;
            int[] iArr7 = iArr3;
            if (i32 >= 1 && i34 >= 1) {
                int i35 = 1;
                int i36 = ((i32 + i34) + 1) / 2;
                int i37 = i33 / 2;
                int i38 = i37 + 1;
                iArr7[i38] = i31;
                iArr4[i38] = i29;
                int i39 = i34;
                int i40 = i23;
                while (i40 < i36) {
                    int i41 = i32 - i39;
                    int i42 = i36;
                    iArr = iArr4;
                    if ((Math.abs(i41) & 1) == i35) {
                        i5 = 1;
                    } else {
                        i5 = i23;
                    }
                    int i43 = -i40;
                    int i44 = i5;
                    int i45 = i43;
                    while (true) {
                        if (i45 > i40) {
                            break;
                        }
                        if (i45 != i43) {
                            if (i45 != i40) {
                                i10 = i45;
                                iArr2 = iArr5;
                            } else {
                                i10 = i45;
                                iArr2 = iArr5;
                            }
                            i12 = iArr7[(i10 - 1) + i37];
                            i11 = i12 + 1;
                            iArr2 = iArr2;
                            int i46 = ((i11 - i31) + i27) - i10;
                            if (i40 == 0) {
                                i13 = 1;
                            } else {
                                i13 = i23;
                            }
                            if (i11 != i12) {
                                i14 = 1;
                            } else {
                                i14 = i23;
                            }
                            int i47 = i46 - (i13 & i14);
                            int i48 = i46;
                            int i49 = i12;
                            i15 = i48;
                            while (i11 < i29 && i15 < i25 && sz4.a(i11, i15)) {
                                i11++;
                                i15++;
                            }
                            iArr7[i37 + i10] = i11;
                            if (i44 == 0) {
                                int i50 = i15;
                                int i51 = i41 - i10;
                                i16 = i32;
                                if (i51 >= i43 + 1 && i51 <= i40 - 1 && iArr[i37 + i51] <= i11) {
                                    iArr2[i23] = i49;
                                    iArr2[1] = i47;
                                    iArr2[c5] = i11;
                                    iArr2[3] = i50;
                                    iArr2[4] = i23;
                                    c2 = 1;
                                    break;
                                }
                            } else {
                                i16 = i32;
                            }
                            i45 = i10 + 2;
                            iArr5 = iArr2;
                            i32 = i16;
                        } else {
                            i10 = i45;
                            iArr2 = iArr5;
                        }
                        i12 = iArr7[i10 + 1 + i37];
                        i11 = i12;
                        int i462 = ((i11 - i31) + i27) - i10;
                        if (i40 == 0) {
                        }
                        if (i11 != i12) {
                        }
                        int i472 = i462 - (i13 & i14);
                        int i482 = i462;
                        int i492 = i12;
                        i15 = i482;
                        while (i11 < i29) {
                            i11++;
                            i15++;
                        }
                        iArr7[i37 + i10] = i11;
                        if (i44 == 0) {
                        }
                        i45 = i10 + 2;
                        iArr5 = iArr2;
                        i32 = i16;
                    }
                    if (Math.min(iArr2[c5] - iArr2[i23], iArr2[3] - iArr2[c2]) > 0) {
                        int i52 = iArr2[i23];
                        int i53 = iArr2[c2];
                        int i54 = iArr2[3] - i53;
                        int i55 = iArr2[c5] - i52;
                        if (i54 != i55) {
                            i55 = Math.min(i55, i54);
                            int i56 = iArr2[4];
                            if (i56 != 0) {
                                i6 = 1;
                            } else {
                                i6 = i23;
                            }
                            int i57 = iArr2[3];
                            c3 = 1;
                            int i58 = iArr2[1];
                            int i59 = i52;
                            int i60 = i57 - i58;
                            int i61 = iArr2[c5];
                            int i62 = iArr2[i23];
                            int i63 = i56;
                            if (i60 > i61 - i62) {
                                i7 = 1;
                            } else {
                                i7 = i23;
                            }
                            int i64 = i59 + ((i7 | i6) ^ 1);
                            if (i63 != 0) {
                                i8 = 1;
                            } else {
                                i8 = i23;
                            }
                            int i65 = i64;
                            if (i57 - i58 > i61 - i62) {
                                i9 = 1;
                            } else {
                                i9 = i23;
                            }
                            i53 += ((i9 ^ 1) | i8) ^ 1;
                            i52 = i65;
                        } else {
                            int i66 = i52;
                            c3 = 1;
                        }
                        xe3.d(i52, i53, i55);
                    } else {
                        c3 = c2;
                    }
                    xe32.e(i31, iArr2[i23], i27, iArr2[c3]);
                    xe32.e(iArr2[c5], i29, iArr2[3], i25);
                    c4 = c5;
                    i20 = i23;
                    i21 = i33;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c4 = c5;
            i20 = i23;
            i21 = i33;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        char c6 = c4;
        int i67 = i20;
        int i68 = xe3.b;
        if (i68 % 3 != 0) {
            yb3.b("Array size not a multiple of 3");
        }
        if (i68 > 3) {
            i4 = i67;
            xe3.f(i4, i68 - 3);
        } else {
            i4 = i67;
        }
        xe3.d(i17, i18, i4);
        int i69 = i4;
        int i70 = i69;
        int i71 = i70;
        while (i69 < xe3.b) {
            int[] iArr8 = xe3.a;
            int i72 = iArr8[i69];
            int i73 = iArr8[i69 + 2];
            int i74 = i72 - i73;
            int i75 = iArr8[i69 + 1] - i73;
            i69 += 3;
            while (i70 < i74) {
                ll4 ll42 = sz4.a.B;
                ll42.getClass();
                if ((ll42.y & 2) != 0) {
                    xz4 xz4 = ll42.D;
                    xz4.getClass();
                    xz4 xz42 = xz4.Q;
                    xz4 xz43 = xz4.P;
                    xz43.getClass();
                    if (xz42 != null) {
                        xz42.P = xz43;
                    }
                    xz43.Q = xz42;
                    a(o00, sz4.a, xz43);
                }
                sz4.a = e(ll42);
                i70++;
            }
            while (i71 < i75) {
                ll4 d2 = d((kl4) sz4.d.w[sz4.b + i71], sz4.a);
                sz4.a = d2;
                if (sz4.e) {
                    ll4 ll43 = d2.B;
                    ll43.getClass();
                    xz4 xz44 = ll43.D;
                    xz44.getClass();
                    my3 r = rc9.r(sz4.a);
                    if (r != null) {
                        oy3 oy3 = new oy3((uy3) o00.b, r);
                        sz4.a.U0(oy3);
                        a(o00, sz4.a, oy3);
                        oy3.Q = xz44.Q;
                        oy3.P = xz44;
                        xz44.Q = oy3;
                    } else {
                        sz4.a.U0(xz44);
                    }
                    sz4.a.L0();
                    sz4.a.R0();
                    ll4 ll44 = sz4.a;
                    hp4 hp4 = yz4.a;
                    if (!ll44.J) {
                        yb3.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    yz4.a(ll44, -1, 1);
                } else {
                    d2.E = true;
                }
                i71++;
            }
            while (true) {
                int i76 = i73 - 1;
                if (i73 > 0) {
                    ll4 ll45 = sz4.a.B;
                    ll45.getClass();
                    sz4.a = ll45;
                    eq4 eq45 = sz4.c;
                    int i77 = sz4.b;
                    kl4 kl4 = (kl4) eq45.w[i77 + i70];
                    kl4 kl42 = (kl4) sz4.d.w[i77 + i71];
                    if (!sg3.e(kl4, kl42)) {
                        j(kl4, kl42, sz4.a);
                    }
                    i70++;
                    i71++;
                    i73 = i76;
                }
            }
        }
        ll4 ll46 = ((ib7) this.f).A;
        int i78 = i4;
        while (ll46 != null && ll46 != ((tz4) this.c)) {
            i78 |= ll46.y;
            ll46.z = i78;
            ll46 = ll46.A;
        }
    }

    public void i() {
        hc3 hc3;
        oy3 oy3;
        uy3 uy3 = (uy3) this.b;
        xz4 xz4 = (hc3) this.d;
        for (ll4 ll4 = ((ib7) this.f).A; ll4 != null; ll4 = ll4.A) {
            my3 r = rc9.r(ll4);
            if (r != null) {
                xz4 xz42 = ll4.D;
                if (xz42 != null) {
                    oy3 oy32 = (oy3) xz42;
                    my3 my3 = oy32.r0;
                    oy32.E1(r);
                    oy3 = oy32;
                    if (my3 != ll4) {
                        o95 o95 = oy32.l0;
                        oy3 = oy32;
                        if (o95 != null) {
                            ((fx2) o95).c();
                            oy3 = oy32;
                        }
                    }
                } else {
                    oy3 oy33 = new oy3(uy3, r);
                    ll4.U0(oy33);
                    oy3 = oy33;
                }
                xz4.Q = oy3;
                oy3.P = xz4;
                xz4 = oy3;
            } else {
                ll4.U0(xz4);
            }
        }
        uy3 v = uy3.v();
        if (v != null) {
            hc3 = (hc3) v.a0.d;
        } else {
            hc3 = null;
        }
        xz4.Q = hc3;
        this.e = xz4;
    }

    public ListenableFuture k(l99 l99, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.i) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.k;
                if (listenableFuture2 != null && listenableFuture2.isDone()) {
                    pt2.b((ListenableFuture) this.k);
                }
            } catch (ExecutionException unused) {
                this.k = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
            if (((ListenableFuture) this.k) == null) {
                this.k = pt2.e(((jz0) this.j).Y(mc9.a(new rg4(28, (Object) this)), (jl6) this.e));
            }
            listenableFuture = (ListenableFuture) this.k;
        }
        return ((jz0) this.j).Y(mc9.a(new no7(this, listenableFuture, l99, executor, 7)), fv1.w);
    }

    public pk8 l(Uri uri) {
        cc9 b2;
        InputStream x;
        mb9 mb9 = (mb9) this.d;
        String str = (String) this.b;
        ka9 ka9 = (ka9) this.f;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
            sb.append("Read ");
            sb.append(str);
            String sb2 = sb.toString();
            ((hx8) this.h).getClass();
            b2 = hx8.b(sb2);
            x = o55.x(ka9.b(uri));
            nl8 a2 = ((ml8) ((rm8) mb9.a.s(7))).a(x, mb9.b);
            if (x != null) {
                x.close();
            }
            b2.close();
            return a2;
            throw th;
            throw th;
        } catch (FileNotFoundException e2) {
            try {
                ia9 b3 = ka9.b(uri);
                if (!b3.a.b(b3.d)) {
                    return mb9.a;
                }
                throw e2;
            } catch (IOException e3) {
                throw u55.z(ka9, uri, e3, str);
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public void m(Uri uri, Object obj) {
        cc9 b2;
        OutputStream outputStream;
        String str = (String) this.b;
        ka9 ka9 = (ka9) this.f;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String sb2 = sb.toString();
            ((hx8) this.h).getClass();
            b2 = hx8.b(sb2);
            k68 k68 = new k68(27, false);
            ia9 b3 = ka9.b(build);
            ArrayList a2 = b3.a(b3.a.d(b3.d));
            new k68[]{k68}[0].o(a2);
            outputStream = (OutputStream) a2.get(0);
            ((pk8) obj).b(outputStream);
            if (((ta9) k68.y) != null) {
                ((OutputStream) k68.x).flush();
                ((ta9) k68.y).w.getFD().sync();
                outputStream.close();
                b2.close();
                ia9 b4 = ka9.b(build);
                ia9 b5 = ka9.b(uri);
                za9 za9 = b4.a;
                if (za9 == b5.a) {
                    za9.f(b4.d, b5.d);
                    return;
                }
                throw new IOException("Cannot rename file across backends");
            }
            throw new IOException("Cannot sync underlying stream");
            throw th;
            throw th;
        } catch (IOException e2) {
            throw u55.z(ka9, uri, e2, str);
        } catch (IOException e3) {
            ia9 b6 = ka9.b(build);
            if (b6.a.b(b6.d)) {
                try {
                    ia9 b7 = ka9.b(build);
                    b7.a.e(b7.d);
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            throw e3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                ll4 ll4 = (ll4) this.g;
                ib7 ib7 = (ib7) this.f;
                if (ll4 == ib7) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (!(ll4 == null || ll4 == ib7)) {
                            sb.append(String.valueOf(ll4));
                            if (ll4.B == ib7) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                ll4 = ll4.B;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o00() {
        this.a = 0;
    }

    public o00(uy3 uy3) {
        this.a = 1;
        this.b = uy3;
        ll4 ll4 = new ll4();
        ll4.z = -1;
        this.c = ll4;
        hc3 hc3 = new hc3(uy3);
        this.d = hc3;
        this.e = hc3;
        ib7 ib7 = hc3.r0;
        this.f = ib7;
        this.g = ib7;
        this.j = new eq4(new ml4[16]);
    }
}
