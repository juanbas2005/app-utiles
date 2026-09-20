package defpackage;

/* renamed from: t92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t92 extends in8 {
    public final pi0 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t92(pi0 pi0, vw3 vw3) {
        super(vw3);
        if (vw3 != null) {
            this.x = pi0;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"}));
    }

    public final String toString() {
        return b() + ": Ext {" + this.x + "}";
    }
}
