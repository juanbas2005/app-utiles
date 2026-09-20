package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: r49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r49 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ v49 a;

    public /* synthetic */ r49(v49 v49) {
        this.a = v49;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        v49 v49 = this.a;
        v49.getClass();
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            pz8 pz8 = ((y19) v49.w).B;
            y19.g(pz8);
            pz8.J.a("IABTCF_TCString change picked up in listener.");
            p39 p39 = v49.Q;
            z65.k(p39);
            p39.b(500);
        }
    }
}
