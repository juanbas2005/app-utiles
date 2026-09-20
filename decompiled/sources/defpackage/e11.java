package defpackage;

import java.net.Proxy;

/* renamed from: e11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class e11 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    static {
        int[] iArr = new int[Proxy.Type.values().length];
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
