package defpackage;

/* renamed from: u62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum u62 {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s");
    
    public final String w;

    /* access modifiers changed from: public */
    u62(String str) {
        this.w = str;
    }
}
