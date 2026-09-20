package defpackage;

import java.util.Arrays;
import java.util.function.BiFunction;

/* renamed from: v79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class v79 implements BiFunction {
    public final /* synthetic */ byte[] a;

    public /* synthetic */ v79(byte[] bArr) {
        this.a = bArr;
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = this.a;
        if (Arrays.equals(bArr, bArr2)) {
            return bArr;
        }
        return bArr2;
    }
}
