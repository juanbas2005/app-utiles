package defpackage;

/* renamed from: zu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zu0 implements f61 {
    public static final zu0 x = new zu0(0);
    public static final zu0 y = new zu0(1);
    public final /* synthetic */ int w;

    public /* synthetic */ zu0(int i) {
        this.w = i;
    }

    public final void f(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public final e81 r() {
        int i = this.w;
        x32 x32 = x32.w;
        switch (i) {
            case b85.b:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return x32;
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }
}
