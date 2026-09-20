package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
import org.xml.sax.SAXException;

/* renamed from: ku4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ku4 implements ko1, ex1, xa6, lj6 {
    public final /* synthetic */ int w;

    public /* synthetic */ ku4(int i) {
        this.w = i;
    }

    public static /* synthetic */ void A(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void d(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void p() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void q(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + obj + obj2);
    }

    public static /* synthetic */ void s(String str) {
        throw new SAXException(str);
    }

    public static /* synthetic */ void t(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void v() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void w(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void x(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void y(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void z(String str, Object obj) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                wr0 a = u10.a();
                a.a0(rawQuery.getString(1));
                a.z = vo5.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    bArr = null;
                } else {
                    bArr = Base64.decode(string, 0);
                }
                a.y = bArr;
                arrayList.add(a.o());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    public jj6 f(zc9 zc9) {
        boolean z;
        switch (this.w) {
            case 28:
                tt2 tt2 = (tt2) zc9.z;
                ij6 b = tt2.b(tt2.b);
                ij6 b2 = tt2.b(tt2.c);
                if (zc9.b() == fc1.w) {
                    z = true;
                } else {
                    z = false;
                }
                return new jj6(b, b2, z);
            default:
                return f55.a(zc9, hz2.K);
        }
    }

    public double b(double d) {
        return d;
    }

    public void e(nu5 nu5) {
    }
}
