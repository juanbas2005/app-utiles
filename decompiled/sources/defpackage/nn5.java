package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: nn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nn5 extends e {
    private static final nn5 DEFAULT_INSTANCE;
    private static volatile od5 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private jf4 preferences_ = jf4.x;

    static {
        nn5 nn5 = new nn5();
        DEFAULT_INSTANCE = nn5;
        e.j(nn5.class, nn5);
    }

    public static jf4 l(nn5 nn5) {
        jf4 jf4 = nn5.preferences_;
        if (!jf4.w) {
            nn5.preferences_ = jf4.b();
        }
        return nn5.preferences_;
    }

    public static ln5 n() {
        return (ln5) ((su2) DEFAULT_INSTANCE.c(5));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static nn5 o(FileInputStream fileInputStream) {
        nn5 nn5 = DEFAULT_INSTANCE;
        c cVar = new c(fileInputStream);
        z92 a = z92.a();
        e i = nn5.i();
        try {
            bu5 bu5 = bu5.c;
            bu5.getClass();
            pg6 a2 = bu5.a(i.getClass());
            d dVar = (d) cVar.x;
            if (dVar == null) {
                dVar = new d(cVar);
            }
            a2.e(i, dVar, a);
            a2.b(i);
            if (e.f(i, true)) {
                return (nn5) i;
            }
            throw new IOException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.w) {
                e = new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new IOException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
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
                return new ew5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", mn5.a});
            case 3:
                return new nn5();
            case 4:
                return new su2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                od5 od52 = PARSER;
                if (od52 != null) {
                    return od52;
                }
                synchronized (nn5.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
