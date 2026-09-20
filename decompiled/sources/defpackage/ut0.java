package defpackage;

import java.util.function.DoubleUnaryOperator;

/* renamed from: ut0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ut0 implements DoubleUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr2 b;

    public /* synthetic */ ut0(int i, vr2 vr2) {
        this.a = i;
        this.b = vr2;
    }

    public final double applyAsDouble(double d) {
        int i = this.a;
        vr2 vr2 = this.b;
        switch (i) {
            case b85.b:
                return ((Number) vr2.y(Double.valueOf(d))).doubleValue();
            default:
                return ((Number) vr2.y(Double.valueOf(d))).doubleValue();
        }
    }
}
