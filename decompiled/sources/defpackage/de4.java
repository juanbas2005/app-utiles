package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;

/* renamed from: de4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class de4 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
    static {
        int[] iArr = new int[DarkThemeConfigPreferences.values().length];
        iArr[DarkThemeConfigPreferences.FOLLOW_SYSTEM.ordinal()] = 1;
        iArr[DarkThemeConfigPreferences.LIGHT.ordinal()] = 2;
        iArr[DarkThemeConfigPreferences.DARK.ordinal()] = 3;
        iArr[DarkThemeConfigPreferences.AMOLED.ordinal()] = 4;
        a = iArr;
    }
}
