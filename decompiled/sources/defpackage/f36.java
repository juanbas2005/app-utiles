package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f36 extends a97 implements gs2 {
    public List A;
    public List B;
    public List C;
    public boolean D;
    public boolean E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ g36 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f36(g36 g36, f61 f61) {
        super(2, f61);
        this.H = g36;
    }

    public final Object H(Object obj, Object obj2) {
        return ((f36) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        f36 f36 = new f36(this.H, f61);
        f36.G = obj;
        return f36;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        defpackage.ed1.i(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0140, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:59:0x0135, B:62:0x013b] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=boolean, for r47v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0183 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0184  */
    public final Object s(boolean z) {
        boolean z2;
        boolean z3;
        List list;
        List list2;
        List list3;
        Object obj;
        Object value;
        q26 q26;
        e36 e;
        ArrayList g;
        Object obj2;
        eo7 eo7;
        Object obj3;
        eo7 eo72;
        String str;
        ew6 ew6;
        long j;
        g36 g36 = this.H;
        Context context = g36.b;
        o81 o81 = (o81) this.G;
        int i = this.F;
        int i2 = 0;
        int i3 = 1;
        if (i == 0) {
            o85.q(z);
            boolean A2 = sg3.A(context, "android.permission.READ_CALL_LOG");
            boolean A3 = sg3.A(context, "android.permission.READ_SMS");
            int i4 = 3;
            mo1 j2 = ar7.j(o81, (e81) null, new f70(g36, (f61) null, 12), 3);
            a42 a42 = a42.w;
            eo7 eo73 = new eo7(a42, a42, a42);
            if (!sg3.A(context, "android.permission.READ_SMS")) {
                z = A3;
            } else {
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse("content://sms"), new String[]{"address", "body", "date", "type"}, (String) null, (String[]) null, "date DESC");
                    if (query != null) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            int i5 = 0;
                            while (query.moveToNext()) {
                                String string = query.getString(i2);
                                if (string == null) {
                                    string = "";
                                }
                                A3 = A3;
                                String string2 = query.getString(i3);
                                if (string2 == null) {
                                    str = "";
                                } else {
                                    str = string2;
                                }
                                z = A3;
                                eo7 = eo73;
                                long j3 = query.getLong(2);
                                int i6 = query.getInt(i4);
                                pl7 k = g36.k(j3, str);
                                if (k != null) {
                                    arrayList2.add(k);
                                } else {
                                    qh5 j4 = g36.j(j3, str);
                                    if (j4 != null) {
                                        arrayList3.add(j4);
                                    }
                                    if (i5 < 300) {
                                        ew6 ew62 = ew6.x;
                                        if (i6 == i3) {
                                            ew6 = ew62;
                                        } else {
                                            ew6 = ew6.w;
                                        }
                                        f41 l = g36.l(string);
                                        String str2 = l.a;
                                        if (str2 == null) {
                                            if (d57.I0(string)) {
                                                str2 = "Desconocido";
                                            } else {
                                                str2 = string;
                                            }
                                        }
                                        String b = h36.b(j3);
                                        String h = g36.h(str2);
                                        if (ew6 == ew62) {
                                            j = 4281298912L;
                                        } else {
                                            j = 4282219166L;
                                        }
                                        String str3 = str2;
                                        String str4 = string;
                                        arrayList.add(new yv6(str3, str4, b, ew6, h, j, l.b, g36.i(string, str2)));
                                        i5++;
                                    }
                                }
                                A3 = z;
                                eo73 = eo7;
                                i2 = 0;
                                i3 = 1;
                                i4 = 3;
                            }
                            z = A3;
                            eo7 = eo73;
                            obj3 = new eo7(arrayList, arrayList2, arrayList3);
                            query.close();
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            throw th2;
                        }
                    } else {
                        z = A3;
                        eo7 = eo73;
                        obj3 = eo7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = A3;
                    eo7 = eo73;
                    obj3 = new m66(th);
                    if (!(obj3 instanceof m66)) {
                    }
                    eo73 = (eo7) eo72;
                    List list4 = (List) eo73.w;
                    list2 = eo73.x;
                    List list5 = (List) eo73.y;
                    this.G = null;
                    this.A = list4;
                    this.B = list2;
                    this.C = list5;
                    this.D = A2;
                    boolean z4 = z;
                    this.E = z4;
                    this.F = 1;
                    obj = j2.h(this);
                    obj2 = p81.w;
                    if (obj != obj2) {
                    }
                }
                if (!(obj3 instanceof m66)) {
                    eo72 = eo7;
                } else {
                    eo72 = obj3;
                }
                eo73 = (eo7) eo72;
            }
            List list42 = (List) eo73.w;
            list2 = eo73.x;
            List list52 = (List) eo73.y;
            this.G = null;
            this.A = list42;
            this.B = list2;
            this.C = list52;
            this.D = A2;
            boolean z42 = z;
            this.E = z42;
            this.F = 1;
            obj = j2.h(this);
            obj2 = p81.w;
            if (obj != obj2) {
                return obj2;
            }
            list = list42;
            z3 = A2;
            list3 = list52;
            z2 = z42;
        } else if (i == 1) {
            boolean z5 = this.E;
            boolean z6 = this.D;
            list3 = this.C;
            list2 = this.B;
            List list6 = this.A;
            o85.q(z);
            z2 = z5;
            list = list6;
            z3 = z6;
            obj = z;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        List list7 = (List) obj;
        g36.h = list3;
        g36.i = list2;
        d37 d37 = g36.e;
        do {
            value = d37.getValue();
            q26 = (q26) ((is7) value).a;
            e = g36.e(q26.m, q26.n);
            g = g36.g(q26.f, q26.g);
        } while (!d37.i(value, new is7(6, q26.a(q26, list7, list, g, g36.f(g, true), g36.f(g, false), (Long) null, (Long) null, e.a, e.b, e.c, e.d, e.e, (Long) null, (Long) null, z3, z2, 12384))));
        return vs7.a;
    }
}
