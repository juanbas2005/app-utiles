package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: bl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bl2 {
    public static final bl2 c = new bl2("FLAT", 0);
    public static final bl2 d = new bl2("HALF_OPENED", 0);
    public static final Object e = new Object();
    public static volatile n36 f;
    public final /* synthetic */ int a;
    public String b;

    public bl2(Context context, e99 e99) {
        String str;
        this.a = 1;
        if (e99.u()) {
            str = u49.b(context, e99.t());
        } else {
            str = e99.t();
        }
        this.b = str;
    }

    public void a(StringBuilder sb, Iterator it) {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    charSequence = (CharSequence) next;
                } else {
                    charSequence = next.toString();
                }
                sb.append(charSequence);
                while (it.hasNext()) {
                    sb.append(this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        charSequence2 = (CharSequence) next2;
                    } else {
                        charSequence2 = next2.toString();
                    }
                    sb.append(charSequence2);
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        switch (this.a) {
            case b85.b:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bl2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ bl2() {
        this.a = 2;
    }
}
