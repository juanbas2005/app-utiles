package defpackage;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* renamed from: km2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km2 extends PlatformOptimizedCancellationException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public km2(int i) {
        super("rememberCoroutineScope left the composition");
        switch (i) {
            case 1:
                super("The coroutine scope left the composition");
                return;
            default:
                return;
        }
    }
}
