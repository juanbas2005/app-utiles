package defpackage;

/* renamed from: re0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re0 implements se0 {
    public final kk0 b;
    public final Throwable c;

    public re0(kk0 kk0) {
        this.b = kk0;
        String property = System.getProperty("io.ktor.development");
        if (property != null && Boolean.parseBoolean(property)) {
            int hashCode = kk0.hashCode();
            rd3.i(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            Throwable th = new Throwable("ReadTask 0x".concat(num));
            su0.O(th);
            this.c = th;
        }
    }

    public final Throwable c() {
        return this.c;
    }

    public final f61 d() {
        return this.b;
    }
}
