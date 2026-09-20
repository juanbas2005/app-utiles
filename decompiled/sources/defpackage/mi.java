package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: mi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class mi implements ey6 {
    public static final me6 e = new me6(19);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public mi(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", new Class[]{String.class});
        this.c = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    public final boolean b() {
        boolean z = ih.e;
        return ih.e;
    }

    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, (Object[]) null);
                if (bArr != null) {
                    return new String(bArr, mo0.a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !sg3.e(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e3);
                }
            }
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                Method method = this.d;
                ej5 ej5 = ej5.a;
                method.invoke(sSLSocket, new Object[]{s63.j(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
