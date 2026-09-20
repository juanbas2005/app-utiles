package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eu5 implements r25 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final kc2 g;
    public static final kc2 h;
    public static final xl3 i = new xl3(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final q25 d;
    public final fu5 e = new fu5(this);

    static {
        Class<zt5> cls = zt5.class;
        g = new kc2("key", b81.s(b81.r(cls, new wt(1))));
        h = new kc2("value", b81.s(b81.r(cls, new wt(2))));
    }

    public eu5(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, q25 q25) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = q25;
    }

    public static int k(kc2 kc2) {
        zt5 zt5 = (zt5) ((Annotation) kc2.b.get(zt5.class));
        if (zt5 != null) {
            return zt5.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final r25 a(kc2 kc2, Object obj) {
        i(kc2, obj, true);
        return this;
    }

    public final void b(kc2 kc2, double d2, boolean z) {
        if (!z || d2 != 0.0d) {
            l((k(kc2) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
        }
    }

    public final void c(kc2 kc2, int i2, boolean z) {
        if (!z || i2 != 0) {
            zt5 zt5 = (zt5) ((Annotation) kc2.b.get(zt5.class));
            if (zt5 != null) {
                int ordinal = zt5.intEncoding().ordinal();
                if (ordinal == 0) {
                    l(zt5.tag() << 3);
                    l(i2);
                } else if (ordinal == 1) {
                    l(zt5.tag() << 3);
                    l((i2 << 1) ^ (i2 >> 31));
                } else if (ordinal == 2) {
                    l((zt5.tag() << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
                }
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
    }

    public final r25 d(kc2 kc2, boolean z) {
        c(kc2, z ? 1 : 0, true);
        return this;
    }

    public final r25 e(kc2 kc2, int i2) {
        c(kc2, i2, true);
        return this;
    }

    public final r25 f(kc2 kc2, double d2) {
        b(kc2, d2, true);
        return this;
    }

    public final r25 g(kc2 kc2, long j) {
        h(kc2, j, true);
        return this;
    }

    public final void h(kc2 kc2, long j, boolean z) {
        if (!z || j != 0) {
            zt5 zt5 = (zt5) ((Annotation) kc2.b.get(zt5.class));
            if (zt5 != null) {
                int ordinal = zt5.intEncoding().ordinal();
                if (ordinal == 0) {
                    l(zt5.tag() << 3);
                    m(j);
                } else if (ordinal == 1) {
                    l(zt5.tag() << 3);
                    m((j >> 63) ^ (j << 1));
                } else if (ordinal == 2) {
                    l((zt5.tag() << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                }
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
    }

    public final void i(kc2 kc2, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    l((k(kc2) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    l(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object i2 : (Collection) obj) {
                    i(kc2, i2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry j : ((Map) obj).entrySet()) {
                    j(i, kc2, j, false);
                }
            } else if (obj instanceof Double) {
                b(kc2, ((Double) obj).doubleValue(), z);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    l((k(kc2) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                h(kc2, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                c(kc2, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    l((k(kc2) << 3) | 2);
                    l(bArr.length);
                    this.a.write(bArr);
                }
            } else {
                q25 q25 = (q25) this.b.get(obj.getClass());
                if (q25 != null) {
                    j(q25, kc2, obj, z);
                    return;
                }
                a28 a28 = (a28) this.c.get(obj.getClass());
                if (a28 != null) {
                    fu5 fu5 = this.e;
                    fu5.a = false;
                    fu5.c = kc2;
                    fu5.b = z;
                    a28.a(obj, fu5);
                } else if (obj instanceof vt5) {
                    c(kc2, ((vt5) obj).a(), true);
                } else if (obj instanceof Enum) {
                    c(kc2, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, kc2, obj, z);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, x44] */
    public final void j(q25 q25, kc2 kc2, Object obj, boolean z) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.w = 0;
        try {
            outputStream = this.a;
            this.a = outputStream2;
            q25.a(obj, this);
            this.a = outputStream;
            long j = outputStream2.w;
            outputStream2.close();
            if (!z || j != 0) {
                l((k(kc2) << 3) | 2);
                m(j);
                q25.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void l(int i2) {
        while (true) {
            int i3 = (((long) (i2 & -128)) > 0 ? 1 : (((long) (i2 & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 != 0) {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & 127);
                return;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            int i2 = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }
}
