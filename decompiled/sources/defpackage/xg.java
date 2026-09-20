package defpackage;

import android.graphics.Paint;

/* renamed from: xg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class xg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004a */
    static {
        try {
            new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr = new int[Paint.Cap.values().length];
        try {
            iArr[Paint.Cap.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Paint.Cap.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        try {
            iArr2[Paint.Join.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
