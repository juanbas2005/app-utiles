package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lsb3;", "Lej5;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class PlatformInitializer implements sb3 {
    public final List a() {
        return a42.w;
    }

    public final Object b(Context context) {
        u51 u51;
        context.getClass();
        ej5 ej5 = ej5.a;
        ej5 ej52 = ej5.a;
        if (ej52 != null) {
            u51 = (u51) ej52;
        } else {
            u51 = null;
        }
        if (u51 != null) {
            u51.a(context);
        }
        return ej5.a;
    }
}
