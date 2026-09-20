package cu.lestebang.utiletecsa.core.preferences.model;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007Ê\u0001\u0002\b\n¨\u0006\t"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "", "<init>", "(Ljava/lang/String;I)V", "FOLLOW_SYSTEM", "LIGHT", "DARK", "AMOLED", "Companion", "preferences", "Lkotlinx/serialization/Serializable;"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class DarkThemeConfigPreferences {
    private static final /* synthetic */ u52 $ENTRIES;
    private static final /* synthetic */ DarkThemeConfigPreferences[] $VALUES;
    private static final nz3 $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final DarkThemeConfigPreferences FOLLOW_SYSTEM = new DarkThemeConfigPreferences("FOLLOW_SYSTEM", 0);
    public static final DarkThemeConfigPreferences LIGHT = new DarkThemeConfigPreferences("LIGHT", 1);
    public static final DarkThemeConfigPreferences DARK = new DarkThemeConfigPreferences("DARK", 2);
    public static final DarkThemeConfigPreferences AMOLED = new DarkThemeConfigPreferences("AMOLED", 3);

    private static final /* synthetic */ DarkThemeConfigPreferences[] $values() {
        return new DarkThemeConfigPreferences[]{FOLLOW_SYSTEM, LIGHT, DARK, AMOLED};
    }

    static {
        DarkThemeConfigPreferences[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hj8.t($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = rg3.y(i44.w, new o(29));
    }

    private DarkThemeConfigPreferences(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zr3 _init_$_anonymous_() {
        DarkThemeConfigPreferences[] values = values();
        values.getClass();
        return new a62("cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences", (Enum[]) values);
    }

    public static u52 getEntries() {
        return $ENTRIES;
    }

    public static DarkThemeConfigPreferences valueOf(String str) {
        return (DarkThemeConfigPreferences) Enum.valueOf(DarkThemeConfigPreferences.class, str);
    }

    public static DarkThemeConfigPreferences[] values() {
        return (DarkThemeConfigPreferences[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences$Companion;", "", "<init>", "()V", "Lzr3;", "Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "serializer", "()Lzr3;", "preferences"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(hl1 hl1Var) {
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
