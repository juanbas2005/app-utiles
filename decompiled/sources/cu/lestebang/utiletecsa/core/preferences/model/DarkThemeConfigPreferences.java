package cu.lestebang.utiletecsa.core.preferences.model;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\b\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007Ê\u0001\u0002\b\n¨\u0006\t"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "", "<init>", "(Ljava/lang/String;I)V", "FOLLOW_SYSTEM", "LIGHT", "DARK", "AMOLED", "Companion", "preferences", "Lkotlinx/serialization/Serializable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum DarkThemeConfigPreferences {
    FOLLOW_SYSTEM,
    LIGHT,
    DARK,
    AMOLED;
    
    /* access modifiers changed from: private */
    public static final nz3 $cachedSerializer$delegate = null;
    public static final Companion Companion = null;

    static {
        DarkThemeConfigPreferences[] $values;
        $ENTRIES = hj8.t($values);
        Companion = new Companion((hl1) null);
        $cachedSerializer$delegate = rg3.y(i44.w, new o(29));
    }

    /* access modifiers changed from: private */
    public static final zr3 _init_$_anonymous_() {
        DarkThemeConfigPreferences[] values = values();
        values.getClass();
        return new a62("cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences", (Enum[]) values);
    }

    public static u52 getEntries() {
        return $ENTRIES;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences$Companion;", "", "<init>", "()V", "Lzr3;", "Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "serializer", "()Lzr3;", "preferences"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class Companion {
        public /* synthetic */ Companion(hl1 hl1) {
            this();
        }

        private final /* synthetic */ zr3 get$cachedSerializer() {
            return (zr3) DarkThemeConfigPreferences.$cachedSerializer$delegate.getValue();
        }

        public final zr3 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
