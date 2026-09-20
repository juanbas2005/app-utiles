package defpackage;

import androidx.datastore.preferences.protobuf.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: pn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn5 extends e {
    private static final pn5 DEFAULT_INSTANCE;
    private static volatile od5 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private qf3 strings_ = du5.z;

    static {
        pn5 pn5 = new pn5();
        DEFAULT_INSTANCE = pn5;
        e.j(pn5.class, pn5);
    }

    public static void l(pn5 pn5, Iterable iterable) {
        int i;
        qf3 qf3 = pn5.strings_;
        if (!((du5) qf3).w) {
            du5 du5 = (du5) qf3;
            int i2 = du5.y;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            pn5.strings_ = du5.g(i);
        }
        qf3 qf32 = pn5.strings_;
        Charset charset = tf3.a;
        if (iterable instanceof g44) {
            List b = ((g44) iterable).b();
            if (qf32 == null) {
                ((du5) qf32).getClass();
                Iterator it = b.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (next instanceof zf0) {
                        throw null;
                    } else if (next instanceof byte[]) {
                        byte[] bArr = (byte[]) next;
                        zf0.g(bArr, 0, bArr.length);
                        throw null;
                    } else {
                        String str = (String) next;
                        throw null;
                    }
                }
            } else {
                ku4.a();
            }
        } else if (iterable instanceof oo5) {
            ((du5) qf32).addAll((Collection) iterable);
        } else {
            if ((qf32 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) qf32).ensureCapacity(((Collection) iterable).size() + ((du5) qf32).y);
            }
            du5 du52 = (du5) qf32;
            int i3 = du52.y;
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (du52.y - i3) + " is null.";
                    for (int i4 = du52.y - 1; i4 >= i3; i4--) {
                        du52.remove(i4);
                    }
                    ku4.j(str2);
                    return;
                }
                du52.add(next2);
            }
        }
    }

    public static pn5 m() {
        return DEFAULT_INSTANCE;
    }

    public static on5 o() {
        return (on5) ((su2) DEFAULT_INSTANCE.c(5));
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [od5, java.lang.Object] */
    public final Object c(int i) {
        od5 od5;
        switch (b81.B(i)) {
            case b85.b:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ew5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new pn5();
            case 4:
                return new su2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                od5 od52 = PARSER;
                if (od52 != null) {
                    return od52;
                }
                synchronized (pn5.class) {
                    try {
                        od5 od53 = PARSER;
                        od5 = od53;
                        if (od53 == null) {
                            ? obj = new Object();
                            PARSER = obj;
                            od5 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return od5;
            default:
                ku4.p();
                return null;
        }
    }

    public final qf3 n() {
        return this.strings_;
    }
}
