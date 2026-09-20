package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* renamed from: zf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf8 implements Comparator {
    public static final /* synthetic */ zf8 x = new zf8(1);
    public static final /* synthetic */ zf8 y = new zf8(6);
    public final /* synthetic */ int w;

    public /* synthetic */ zf8(int i) {
        this.w = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.w) {
            case b85.b:
                return pd8.k(((wf8) obj).a, ((wf8) obj2).a);
            case 1:
                return ((Scope) obj).x.compareTo(((Scope) obj2).x);
            case 2:
                return ((Scope) obj).x.compareTo(((Scope) obj2).x);
            case 3:
                int b = hl6.b(obj);
                int b2 = hl6.b(obj2);
                if (b != b2) {
                    return b81.a(b, b2);
                }
                int B = b81.B(b);
                if (B == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (B == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (B == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (B == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 4:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
