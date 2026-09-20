package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: fg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fg8 {
    public static final TimeZone a;
    public static final String b = d57.S0(d57.R0(d45.class.getName(), "okhttp3."), "Client");

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
    }

    public static final boolean a(g73 g73, g73 g732) {
        g73.getClass();
        g732.getClass();
        if (!sg3.e(g73.d, g732.d) || g73.e != g732.e || !sg3.e(g73.a, g732.a)) {
            return false;
        }
        return true;
    }

    public static final int b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                h.j("timeout".concat(" too large"));
                return 0;
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                h.j("timeout".concat(" too small"));
                return 0;
            }
        } else {
            ku4.g("timeout".concat(" < 0"));
            return 0;
        }
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!sg3.e(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(a66 a66) {
        String f = a66.B.f("Content-Length");
        if (f == null) {
            return -1;
        }
        byte[] bArr = dg8.a;
        try {
            return Long.parseLong(f);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final Charset f(ed0 ed0, Charset charset) {
        ed0.getClass();
        charset.getClass();
        int z = ed0.z(dg8.b);
        if (z == -1) {
            return charset;
        }
        if (z == 0) {
            return mo0.a;
        }
        if (z == 1) {
            return mo0.b;
        }
        if (z == 2) {
            Charset charset2 = mo0.a;
            Charset charset3 = mo0.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            mo0.f = forName;
            return forName;
        } else if (z == 3) {
            return mo0.c;
        } else {
            if (z == 4) {
                Charset charset4 = mo0.a;
                Charset charset5 = mo0.g;
                if (charset5 != null) {
                    return charset5;
                }
                Charset forName2 = Charset.forName("UTF-32BE");
                forName2.getClass();
                mo0.g = forName2;
                return forName2;
            }
            throw new AssertionError();
        }
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [sc0, java.lang.Object] */
    public static final boolean g(oy6 oy6, int i) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (oy6.g().e()) {
            j = oy6.g().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        oy6.g().d(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            ? obj = new Object();
            while (oy6.Y(8192, obj) != -1) {
                obj.a();
            }
            if (j == Long.MAX_VALUE) {
                oy6.g().a();
                return true;
            }
            oy6.g().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                oy6.g().a();
                return false;
            }
            oy6.g().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                oy6.g().a();
            } else {
                oy6.g().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final bz2 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vy2 vy2 = (vy2) it.next();
            dg0 dg0 = vy2.a;
            dg0 dg02 = vy2.b;
            String r = dg0.r();
            String r2 = dg02.r();
            arrayList.add(r);
            arrayList.add(d57.k1(r2).toString());
        }
        return new bz2((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(g73 g73, boolean z) {
        int i;
        g73.getClass();
        int i2 = g73.e;
        String str = g73.d;
        if (d57.x0(str, ":", false)) {
            str = pb4.h(']', "[", str);
        }
        if (!z) {
            String str2 = g73.a;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals("https")) {
                i = 443;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return a42.w;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return a42.w;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            singletonList.getClass();
            return singletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List asList = Arrays.asList(objArr2);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }
}
