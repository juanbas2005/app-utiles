package defpackage;

/* renamed from: zr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zr extends x74 {
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr(ll6 ll6, int i) {
        super(ll6);
        this.b = i;
    }

    public final String a() {
        switch (this.b) {
            case b85.b:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
