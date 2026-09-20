package defpackage;

/* renamed from: gl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum gl4 {
    TERMINATOR(new int[]{0, 0, 0}),
    NUMERIC(new int[]{10, 12, 14}),
    ALPHANUMERIC(new int[]{9, 11, 13}),
    STRUCTURED_APPEND(new int[]{0, 0, 0}),
    BYTE(new int[]{8, 16, 16}),
    ECI(new int[]{0, 0, 0}),
    KANJI(new int[]{8, 10, 12}),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}),
    HANZI(new int[]{8, 10, 12});
    
    public final int[] w;

    /* access modifiers changed from: public */
    gl4(int[] iArr) {
        this.w = iArr;
    }
}
