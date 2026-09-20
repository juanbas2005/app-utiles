package defpackage;

/* renamed from: oa7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class oa7 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        Object obj;
        boolean z;
        Object obj2;
        boolean z2;
        Object obj3;
        try {
            obj = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            obj = new m66(th);
        }
        Object obj4 = null;
        if (obj instanceof m66) {
            obj = null;
        }
        String str = (String) obj;
        boolean z3 = false;
        if (str == null || !Boolean.parseBoolean(str)) {
            z = false;
        } else {
            z = true;
        }
        a = z;
        try {
            obj2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            obj2 = new m66(th2);
        }
        if (obj2 instanceof m66) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null || !Boolean.parseBoolean(str2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        b = z2;
        try {
            obj3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            obj3 = new m66(th3);
        }
        if (!(obj3 instanceof m66)) {
            obj4 = obj3;
        }
        String str3 = (String) obj4;
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z3 = true;
        }
        c = z3;
    }
}
