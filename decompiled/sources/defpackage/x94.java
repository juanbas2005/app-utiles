package defpackage;

import java.util.Iterator;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.h;

/* renamed from: x94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x94 implements Iterator, ar3 {
    public final /* synthetic */ int w;
    public final rc4 x;

    public /* synthetic */ x94(rc4 rc4, int i) {
        this.w = i;
        this.x = rc4;
    }

    public final boolean hasNext() {
        int i = this.w;
        rc4 rc4 = this.x;
        switch (i) {
            case b85.b:
                return rc4.y;
            default:
                return rc4.y;
        }
    }

    public final Object next() {
        int i = this.w;
        rc4 rc4 = this.x;
        switch (i) {
            case b85.b:
                r94 r94 = LocalDate.Companion;
                long nextLong = rc4.nextLong();
                r94.getClass();
                return r94.a(nextLong);
            default:
                return h.a(YearMonth.Companion, rc4.nextLong());
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
