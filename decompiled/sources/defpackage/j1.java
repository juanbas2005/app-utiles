package defpackage;

/* renamed from: j1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j1 extends Throwable {
    public final /* synthetic */ int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(String str, int i) {
        super(str);
        this.w = i;
    }

    public synchronized Throwable fillInStackTrace() {
        switch (this.w) {
            case b85.b:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
