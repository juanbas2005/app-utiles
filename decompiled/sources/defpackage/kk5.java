package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: kk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kk5 {
    public final List a;
    public final hv2 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        if (r11 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007c, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r11 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r11 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
        r0 = 3;
     */
    public kk5(List list, hv2 hv2) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        MotionEvent a2;
        this.a = list;
        this.b = hv2;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 < 29 || (a2 = a()) == null) {
            i = 0;
        } else {
            i = a2.getClassification();
        }
        this.c = i;
        MotionEvent a3 = a();
        if (a3 != null) {
            i2 = a3.getButtonState();
        } else {
            i2 = 0;
        }
        this.d = i2;
        MotionEvent a4 = a();
        if (a4 != null) {
            i3 = a4.getMetaState();
        } else {
            i3 = 0;
        }
        this.e = i3;
        MotionEvent a5 = a();
        if (a5 != null) {
            if (i4 < 29 || a5.getClassification() != 3) {
                z = false;
            } else {
                z = true;
            }
            if (i4 < 29 || a5.getClassification() != 5) {
                z2 = false;
            } else {
                z2 = true;
            }
            int actionMasked = a5.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (!z) {
                                }
                                break;
                            case 6:
                                if (!z) {
                                }
                                break;
                            case 7:
                                break;
                            case 8:
                                i5 = 6;
                                break;
                            case 9:
                                i5 = 4;
                                break;
                            case 10:
                                i5 = 5;
                                break;
                        }
                    }
                    if (z) {
                        i5 = 11;
                        this.f = i5;
                    }
                } else if (!z) {
                    if (z2) {
                        i5 = 9;
                        this.f = i5;
                    }
                }
                i5 = 12;
                this.f = i5;
            } else if (!z) {
                if (z2) {
                    i5 = 7;
                    this.f = i5;
                }
                i5 = 1;
                this.f = i5;
            }
            i5 = 10;
            this.f = i5;
        }
        int size = list.size();
        while (true) {
            if (i5 >= size) {
                break;
            }
            qk5 qk5 = (qk5) list.get(i5);
            if (ub5.d(qk5)) {
                break;
            } else if (ub5.b(qk5)) {
                break;
            } else {
                i5++;
            }
        }
        i5 = 1;
        this.f = i5;
        i5 = 2;
        this.f = i5;
    }

    public final MotionEvent a() {
        hv2 hv2 = this.b;
        if (hv2 != null) {
            return (MotionEvent) ((kg5) hv2.x).y;
        }
        return null;
    }
}
