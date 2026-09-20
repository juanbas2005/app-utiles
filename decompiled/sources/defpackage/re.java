package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* renamed from: re  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re implements ViewTranslationCallback {
    public static final re a = new Object();

    public final boolean onClearTranslation(View view) {
        sr2 sr2;
        view.getClass();
        bf contentCaptureManager$ui = ((je) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = ze.w;
        me3 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tp4 tp4 = ((hk6) objArr[(i << 3) + i3]).a.d.w;
                        Object g = tp4.g(jk6.E);
                        h4 h4Var = null;
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = tp4.g(zj6.n);
                            if (g2 != null) {
                                h4Var = g2;
                            }
                            h4 h4Var2 = h4Var;
                            if (!(h4Var2 == null || (sr2 = (sr2) h4Var2.b) == null)) {
                                Boolean bool = (Boolean) sr2.b();
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        vr2 vr2;
        view.getClass();
        bf contentCaptureManager$ui = ((je) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = ze.w;
        me3 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tp4 tp4 = ((hk6) objArr[(i << 3) + i3]).a.d.w;
                        Object g = tp4.g(jk6.E);
                        h4 h4Var = null;
                        if (g == null) {
                            g = null;
                        }
                        if (sg3.e(g, Boolean.TRUE)) {
                            Object g2 = tp4.g(zj6.m);
                            if (g2 != null) {
                                h4Var = g2;
                            }
                            h4 h4Var2 = h4Var;
                            if (!(h4Var2 == null || (vr2 = (vr2) h4Var2.b) == null)) {
                                Boolean bool = (Boolean) vr2.y(Boolean.FALSE);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        vr2 vr2;
        view.getClass();
        bf contentCaptureManager$ui = ((je) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = ze.x;
        me3 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tp4 tp4 = ((hk6) objArr[(i << 3) + i3]).a.d.w;
                        Object g = tp4.g(jk6.E);
                        h4 h4Var = null;
                        if (g == null) {
                            g = null;
                        }
                        if (sg3.e(g, Boolean.FALSE)) {
                            Object g2 = tp4.g(zj6.m);
                            if (g2 != null) {
                                h4Var = g2;
                            }
                            h4 h4Var2 = h4Var;
                            if (!(h4Var2 == null || (vr2 = (vr2) h4Var2.b) == null)) {
                                Boolean bool = (Boolean) vr2.y(Boolean.TRUE);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
