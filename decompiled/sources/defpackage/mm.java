package defpackage;

import java.util.Locale;

/* renamed from: mm  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum mm {
    FIELD((String) null),
    FILE((String) null),
    PROPERTY((String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    public final String w;

    /* access modifiers changed from: public */
    mm(String str) {
        if (str == null) {
            str = name().toLowerCase(Locale.ROOT);
            str.getClass();
        }
        this.w = str;
    }
}
