package defpackage;

import java.util.concurrent.Callable;

/* renamed from: g29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g29 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ w29 e;

    public /* synthetic */ g29(w29 w29, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = w29;
    }

    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        w29 w29 = this.e;
        switch (i) {
            case b85.b:
                w29.d.T();
                uq8 uq8 = w29.d.y;
                v89.R(uq8);
                return uq8.a2(str3, str2, str);
            case 1:
                w29.d.T();
                uq8 uq82 = w29.d.y;
                v89.R(uq82);
                return uq82.a2(str3, str2, str);
            case 2:
                w29.d.T();
                uq8 uq83 = w29.d.y;
                v89.R(uq83);
                return uq83.e2(str3, str2, str);
            default:
                w29.d.T();
                uq8 uq84 = w29.d.y;
                v89.R(uq84);
                return uq84.e2(str3, str2, str);
        }
    }
}
