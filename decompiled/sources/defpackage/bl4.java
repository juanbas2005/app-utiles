package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bl4 extends ll4 implements ry0, my3 {
    public LinkedHashMap K;

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        boolean z;
        int i;
        float f = ((lx1) h49.w(this, hf3.c)).w;
        if (f < 0.0f) {
            f = 0.0f;
        }
        eh5 y = gh4.y(j);
        int i2 = 0;
        if (!this.J || Float.isNaN(f) || lx1.a(f, 0.0f) <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!Float.isNaN(f)) {
            i = oh4.r0(f);
        } else {
            i = 0;
        }
        int i3 = y.w;
        if (z) {
            i3 = Math.max(i3, i);
        }
        int i4 = y.x;
        if (z) {
            i4 = Math.max(i4, i);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.K;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.K = linkedHashMap;
            }
            m48 m48 = hf3.b;
            int round = Math.round(((float) (i - y.w)) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(m48, Integer.valueOf(round));
            h23 h23 = hf3.a;
            int round2 = Math.round(((float) (i - y.x)) / 2.0f);
            if (round2 >= 0) {
                i2 = round2;
            }
            linkedHashMap.put(h23, Integer.valueOf(i2));
        }
        Map map = this.K;
        if (map == null) {
            map = b42.w;
        }
        return oh4.d0(i3, i4, map, new gd3(i3, i4, y));
    }
}
