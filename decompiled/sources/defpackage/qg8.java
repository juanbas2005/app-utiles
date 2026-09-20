package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: qg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg8 implements y45 {
    public final long A;
    public final pw2 w;
    public final int x;
    public final ln y;
    public final long z;

    public qg8(pw2 pw2, int i, ln lnVar, long j, long j2) {
        this.w = pw2;
        this.x = i;
        this.y = lnVar;
        this.z = j;
        this.A = j2;
    }

    public static p11 a(ng8 ng8, y50 y50, int i) {
        p11 p11;
        s29 s29 = y50.w;
        if (s29 == null) {
            p11 = null;
        } else {
            p11 = s29.z;
        }
        if (p11 != null && p11.x) {
            int[] iArr = p11.z;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = p11.B;
                if (iArr2 != null) {
                    while (true) {
                        if (i2 >= iArr2.length) {
                            break;
                        } else if (iArr2[i2] == i) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else {
                while (true) {
                    if (i2 >= iArr.length) {
                        break;
                    } else if (iArr[i2] == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (ng8.o < p11.A) {
                return p11;
            }
        }
        return null;
    }

    public final void K(yb9 yb9) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        pw2 pw2 = this.w;
        if (pw2.f()) {
            g96 g96 = (g96) f96.z().x;
            if (g96 == null || g96.x) {
                ng8 ng8 = (ng8) pw2.F.get(this.y);
                if (ng8 != null) {
                    iw2 iw2 = ng8.e;
                    if (iw2 instanceof y50) {
                        y50 y50 = iw2;
                        long j3 = this.z;
                        int i6 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                        boolean z3 = true;
                        int i7 = 0;
                        if (i6 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i8 = y50.q;
                        if (g96 != null) {
                            z2 &= g96.y;
                            i = g96.z;
                            i3 = g96.A;
                            i2 = g96.w;
                            if (y50.w != null && !y50.q()) {
                                p11 a = a(ng8, y50, this.x);
                                if (a != null) {
                                    if (!a.y || i6 <= 0) {
                                        z3 = false;
                                    }
                                    i3 = a.A;
                                    z2 = z3;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i9 = i;
                        int i10 = -1;
                        if (yb9.k()) {
                            i4 = 0;
                        } else {
                            yb9 yb92 = yb9;
                            if (yb92.d) {
                                i7 = -1;
                                i4 = 100;
                            } else {
                                Exception h = yb92.h();
                                if (h instanceof ApiException) {
                                    Status status = ((ApiException) h).w;
                                    i5 = status.w;
                                    m11 m11 = status.z;
                                    if (m11 != null) {
                                        i4 = i5;
                                        i7 = m11.x;
                                    }
                                } else {
                                    i5 = 101;
                                }
                                i4 = i5;
                                i7 = -1;
                            }
                        }
                        if (z2) {
                            long j4 = this.A;
                            long currentTimeMillis = System.currentTimeMillis();
                            i10 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        int i11 = i10;
                        ph8 ph8 = pw2.I;
                        ph8.sendMessage(ph8.obtainMessage(18, new rg8(new sk4(this.x, i4, i7, j, j2, (String) null, (String) null, i8, i11), i2, (long) i9, i3)));
                    }
                }
            }
        }
    }
}
