package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: oy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oy7 extends h61 {
    public UserDataPreferences A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ UssdAutoUpdaterService D;
    public int E;
    public String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy7(UssdAutoUpdaterService ussdAutoUpdaterService, h61 h61) {
        super(h61);
        this.D = ussdAutoUpdaterService;
    }

    public final Object s(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return UssdAutoUpdaterService.b(this.D, (String) null, (UserDataPreferences) null, this);
    }
}
