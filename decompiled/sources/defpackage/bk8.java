package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: bk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bk8 extends us0 {
    public static final Map z;
    public final sd9 y;

    static {
        EnumMap enumMap = new EnumMap(sd9.class);
        for (sd9 sd9 : sd9.values()) {
            bk8[] bk8Arr = new bk8[10];
            for (int i = 0; i < 10; i++) {
                bk8Arr[i] = new bk8(i, sd9, td9.e);
            }
            enumMap.put(sd9, bk8Arr);
        }
        z = Collections.unmodifiableMap(enumMap);
    }

    public bk8(int i, sd9 sd9, td9 td9) {
        super(td9, i);
        jb5.K("format char", sd9);
        this.y = sd9;
        if (!td9.a()) {
            char c = sd9.w;
            c = td9.c() ? c & 65503 : c;
            StringBuilder sb = new StringBuilder("%");
            td9.d(sb);
            sb.append((char) c);
        }
    }

    public final void E(j32 j32, Object obj) {
        j32.e(obj, this.y, (td9) this.x);
    }
}
