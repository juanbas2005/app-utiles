package defpackage;

/* renamed from: nf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nf4 {
    public static final lf4 a;
    public static final lf4 b = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, lf4] */
    static {
        bu5 bu5 = bu5.c;
        lf4 lf4 = null;
        try {
            lf4 = (lf4) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        a = lf4;
    }
}
