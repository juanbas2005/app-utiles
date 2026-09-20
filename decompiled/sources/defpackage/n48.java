package defpackage;

/* renamed from: n48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n48 extends wx3 implements gs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ k23[] y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n48(k23[] k23Arr, int i) {
        super(2);
        this.x = i;
        this.y = k23Arr;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        k23[] k23Arr = this.y;
        switch (i) {
            case b85.b:
                return Float.valueOf(t35.h((dh5) obj, true, k23Arr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(t35.h((dh5) obj, false, k23Arr, ((Number) obj2).floatValue()));
        }
    }
}
