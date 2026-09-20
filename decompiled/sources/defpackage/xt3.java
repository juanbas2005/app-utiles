package defpackage;

/* renamed from: xt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xt3 extends fu3 {
    public abstract Object a();

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof au3) {
            str = "\"" + ((au3) this).a + '\"';
        } else {
            str = a().toString();
        }
        return hl6.o(sb, str, ')');
    }
}
