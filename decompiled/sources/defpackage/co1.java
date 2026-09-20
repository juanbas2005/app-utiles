package defpackage;

import java.io.InputStream;

/* renamed from: co1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co1 extends i85 {
    public final /* synthetic */ int a = 1;
    public final Long b;
    public final q51 c;
    public final /* synthetic */ Object d;

    public co1(yg5 yg5, q51 q51, Object obj) {
        Long l;
        this.d = obj;
        String E0 = ((y53) yg5.w).c.E0("Content-Length");
        if (E0 != null) {
            l = Long.valueOf(Long.parseLong(E0));
        } else {
            l = null;
        }
        this.b = l;
        if (q51 == null) {
            q51 q512 = l51.a;
            q51 = l51.e;
        }
        this.c = q51;
    }

    public final Long a() {
        switch (this.a) {
            case b85.b:
                return this.b;
            default:
                return this.b;
        }
    }

    public final q51 b() {
        switch (this.a) {
            case b85.b:
                return this.c;
            default:
                return this.c;
        }
    }

    public final hf0 d() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                return (hf0) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                dn1 dn1 = aw1.a;
                cm1 cm1 = cm1.y;
                me0 me0 = ne0.a;
                inputStream.getClass();
                cm1.getClass();
                me0.getClass();
                int i2 = eo3.a;
                return new hw5(new xc3(inputStream), cm1);
        }
    }

    public co1(y53 y53, q51 q51, Object obj) {
        this.d = obj;
        String E0 = y53.c.E0("Content-Length");
        this.b = E0 != null ? Long.valueOf(Long.parseLong(E0)) : null;
        if (q51 == null) {
            q51 q512 = l51.a;
            q51 = l51.e;
        }
        this.c = q51;
    }
}
