package defpackage;

import kotlinx.datetime.internal.format.parser.ParseException;

/* renamed from: d1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d1 {
    public abstract lh0 a();

    public abstract d71 b();

    public final Object c(CharSequence charSequence) {
        String str;
        charSequence.getClass();
        try {
            qd5 qd5 = a().c;
            qd5.getClass();
            try {
                return d(i35.m(qd5, charSequence, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + charSequence + "' is invalid";
                } else {
                    str = message + " (when parsing '" + charSequence + "')";
                }
                throw new IllegalArgumentException(str, e);
            }
        } catch (ParseException e2) {
            throw new IllegalArgumentException("Failed to parse value from '" + charSequence + '\'', e2);
        }
    }

    public abstract Object d(d71 d71);
}
