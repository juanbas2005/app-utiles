package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.List;
import java.util.Set;

/* renamed from: y13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y13 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ c23 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y13(String str, c23 c23, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.D = str;
        this.C = c23;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((y13) o(f61, o81)).s(vs7);
            case 1:
                return ((y13) o(f61, o81)).s(vs7);
            default:
                return ((y13) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new y13(this.D, this.C, f61);
            case 1:
                return new y13(this.C, this.D, f61, 1);
            default:
                return new y13(this.C, this.D, f61, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    public final Object s(Object obj) {
        List list;
        List list2;
        String str;
        d37 d37;
        Object value;
        Object obj2;
        Throwable th;
        Object obj3;
        int i = this.A;
        vs7 vs7 = vs7.a;
        String str2 = this.D;
        c23 c23 = this.C;
        p81 p81 = p81.w;
        Object obj4 = null;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    if (str2.length() >= 2) {
                        k40 k40 = c23.c;
                        this.B = 1;
                        c50 c50 = (c50) k40;
                        obj3 = ar7.e0(c50.g, new a50(c50, str2, (f61) null, 1), this);
                        if (obj3 == p81) {
                            return p81;
                        }
                    } else {
                        list = a42.w;
                        list2 = list;
                        if (str2.length() == 8) {
                            c23.getClass();
                            try {
                                Cursor query = c23.h.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str2)), new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            obj2 = query.getString(query.getColumnIndexOrThrow("display_name"));
                                        } else {
                                            obj2 = null;
                                        }
                                        query.close();
                                    } catch (Throwable th2) {
                                        ed1.i(query, th);
                                        throw th2;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            } catch (Throwable th3) {
                                obj2 = new m66(th3);
                            }
                            if (!(obj2 instanceof m66)) {
                                obj4 = obj2;
                            }
                            String str3 = (String) obj4;
                            if (str3 != null) {
                                str = str3;
                                d37 = c23.j;
                                do {
                                    value = d37.getValue();
                                } while (!f21.w(o03.a((o03) ((is7) value).a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, list2, str, (String) null, false, (g40) null, (List) null, false, false, (Set) null, 1073741823, 127), 6, d37, value));
                                return vs7;
                            }
                        }
                        str = "";
                        d37 = c23.j;
                        do {
                            value = d37.getValue();
                        } while (!f21.w(o03.a((o03) ((is7) value).a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, list2, str, (String) null, false, (g40) null, (List) null, false, false, (Set) null, 1073741823, 127), 6, d37, value));
                        return vs7;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) obj3;
                list2 = list;
                if (str2.length() == 8) {
                }
                str = "";
                d37 = c23.j;
                do {
                    value = d37.getValue();
                } while (!f21.w(o03.a((o03) ((is7) value).a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, list2, str, (String) null, false, (g40) null, (List) null, false, false, (Set) null, 1073741823, 127), 6, d37, value));
                return vs7;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    k40 k402 = c23.c;
                    this.B = 1;
                    if (((c50) k402).n(str2, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    k40 k403 = c23.c;
                    this.B = 1;
                    if (((c50) k403).o(str2, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y13(c23 c23, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = c23;
        this.D = str;
    }
}
