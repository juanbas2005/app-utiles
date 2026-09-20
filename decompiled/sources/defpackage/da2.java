package defpackage;

/* renamed from: da2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class da2 {
    public static final ba2 a = new Object();
    public static final ba2 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [ba2, java.lang.Object] */
    static {
        bu5 bu5 = bu5.c;
        ba2 ba2 = null;
        try {
            ba2 = (ba2) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        b = ba2;
    }
}
