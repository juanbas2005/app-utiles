package defpackage;

/* renamed from: nw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nw5 extends rx0 {
    public final /* synthetic */ int x;
    public final /* synthetic */ br4 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw5(br4 br4, int i) {
        super(1);
        this.x = i;
        this.y = br4;
    }

    public final void i(String[] strArr) {
        int i = this.x;
        br4 br4 = this.y;
        switch (i) {
            case b85.b:
                if (strArr != null) {
                    ((ow5) br4.x).z = strArr;
                    return;
                } else {
                    h.q("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                    return;
                }
            default:
                if (strArr != null) {
                    ((ow5) br4.x).A = strArr;
                    return;
                } else {
                    h.q("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                    return;
                }
        }
    }
}
