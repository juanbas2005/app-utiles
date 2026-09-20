package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: aj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj2 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ h06 x;

    public /* synthetic */ aj2(int i, h06 h06) {
        this.w = i;
        this.x = h06;
    }

    public final Object k(Object obj, f61 f61) {
        int i = this.w;
        h06 h06 = this.x;
        switch (i) {
            case b85.b /*0*/:
                h06.w = obj;
                throw new AbortFlowException(this);
            default:
                h06.w = obj;
                throw new AbortFlowException(this);
        }
    }
}
