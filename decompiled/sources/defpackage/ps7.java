package defpackage;

/* renamed from: ps7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ps7 {
    public kg5 a;
    public kg5 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[LOOP:0: B:24:0x0061->B:30:0x0071, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[EDGE_INSN: B:33:0x0076->B:31:0x0076 ?: BREAK  , SYNTHETIC] */
    public final void a(hf7 hf7) {
        hf7 hf72;
        String str;
        kg5 kg5;
        kg5 kg52;
        hf7 hf73;
        this.e = false;
        kg5 kg53 = this.a;
        if (kg53 != null) {
            hf72 = (hf7) kg53.y;
        } else {
            hf72 = null;
        }
        if (!sg3.e(hf7, hf72)) {
            String str2 = hf7.a.x;
            kg5 kg54 = this.a;
            if (kg54 == null || (hf73 = (hf7) kg54.y) == null) {
                str = null;
            } else {
                str = hf73.a.x;
            }
            boolean e2 = sg3.e(str2, str);
            kg5 kg55 = this.a;
            if (!e2) {
                this.a = new kg5(27, kg55, hf7);
                this.b = null;
                int length = hf7.a.x.length() + this.c;
                this.c = length;
                if (length > 100000) {
                    kg5 kg56 = this.a;
                    if (kg56 != null) {
                        kg5 = (kg5) kg56.x;
                    } else {
                        kg5 = null;
                    }
                    if (kg5 != null) {
                        while (true) {
                            if (kg56 != null) {
                                kg5 kg57 = (kg5) kg56.x;
                                if (kg57 != null) {
                                    kg52 = (kg5) kg57.x;
                                    if (kg52 != null) {
                                        break;
                                    }
                                    kg56 = (kg5) kg56.x;
                                }
                            }
                            kg52 = null;
                            if (kg52 != null) {
                            }
                        }
                        if (kg56 != null) {
                            kg56.x = null;
                        }
                    }
                }
            } else if (kg55 != null) {
                kg55.y = hf7;
            }
        }
    }
}
