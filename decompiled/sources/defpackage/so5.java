package defpackage;

import java.util.Iterator;

/* renamed from: so5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class so5 {
    public static final ze4 a;

    static {
        ze4 ze4 = new ze4();
        c26 c26 = b26.a;
        ze4.put(c26.b(String.class), t47.a);
        ze4.put(c26.b(Character.TYPE), ho0.a);
        ze4.put(c26.b(char[].class), ao0.c);
        ze4.put(c26.b(Double.TYPE), ix1.a);
        ze4.put(c26.b(double[].class), ax1.c);
        ze4.put(c26.b(Float.TYPE), oh2.a);
        ze4.put(c26.b(float[].class), kh2.c);
        ze4.put(c26.b(Long.TYPE), tc4.a);
        ze4.put(c26.b(long[].class), hc4.c);
        ze4.put(c26.b(qr7.class), ur7.a);
        ze4.put(c26.b(Integer.TYPE), ue3.a);
        ze4.put(c26.b(int[].class), ge3.c);
        ze4.put(c26.b(lr7.class), pr7.a);
        ze4.put(c26.b(Short.TYPE), ns6.a);
        ze4.put(c26.b(short[].class), ks6.c);
        ze4.put(c26.b(bs7.class), fs7.a);
        ze4.put(c26.b(Byte.TYPE), sf0.a);
        ze4.put(c26.b(byte[].class), oe0.c);
        ze4.put(c26.b(fr7.class), jr7.a);
        ze4.put(c26.b(Boolean.TYPE), ja0.a);
        ze4.put(c26.b(boolean[].class), ia0.c);
        ze4.put(c26.b(vs7.class), ws7.b);
        ze4.put(c26.b(Void.class), y05.a);
        try {
            gq3 b = c26.b(u02.class);
            xb4 xb4 = u02.x;
            ze4.put(b, x02.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            ze4.put(b26.a.b(rr7.class), tr7.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            ze4.put(b26.a.b(mr7.class), or7.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            ze4.put(b26.a.b(cs7.class), es7.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            ze4.put(b26.a.b(gr7.class), ir7.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            ze4.put(b26.a.b(p18.class), r18.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            gq3 b2 = b26.a.b(qd3.class);
            qd3 qd3 = qd3.y;
            ze4.put(b2, wd3.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = ze4.b();
    }

    public static final void a(String str) {
        Iterator it = ((em0) a.values()).iterator();
        while (it.hasNext()) {
            zr3 zr3 = (zr3) it.next();
            if (str.equals(zr3.getDescriptor().a())) {
                StringBuilder q = b81.q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                q.append(b26.a.b(zr3.getClass()).A());
                q.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                h.q(e57.f0(q.toString()));
                return;
            }
        }
    }
}
