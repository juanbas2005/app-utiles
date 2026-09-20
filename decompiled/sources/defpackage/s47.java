package defpackage;

import android.content.Context;
import android.content.res.Resources;
import cu.lestebang.utiletecsa.R;

/* renamed from: s47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s47 {
    public final Resources a;
    public final String b;

    public s47(Context context) {
        z65.k(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public /* synthetic */ s47(Resources resources, String str) {
        this.a = resources;
        this.b = str;
    }
}
