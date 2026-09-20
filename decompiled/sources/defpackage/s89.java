package defpackage;

import java.util.function.Function;

/* renamed from: s89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class s89 implements Function {
    public final /* synthetic */ x49 a;
    public final /* synthetic */ b89 b;
    public final /* synthetic */ k93 c;

    public /* synthetic */ s89(x49 x49, b89 b89, k93 k93) {
        this.a = x49;
        this.b = b89;
        this.c = k93;
    }

    public final /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        d89 d89 = new d89(new w89(this.a, this.b));
        this.c.w = true;
        return d89;
    }
}
