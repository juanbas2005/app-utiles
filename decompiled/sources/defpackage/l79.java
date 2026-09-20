package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: l79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l79 extends ArrayAdapter {
    public final /* synthetic */ q89 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public l79(q89 q89, eq2 eq2) {
        super(eq2, r0.getIdentifier("libraries_social_licenses_license", "layout", r1), r5.a.getIdentifier("license", "id", r1), new ArrayList());
        this.a = q89;
        s47 s47 = q89.v0;
        Resources resources = s47.a;
        String str = s47.b;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        q89 q89 = this.a;
        if (view == null) {
            LayoutInflater layoutInflater = q89.h0;
            if (layoutInflater == null) {
                layoutInflater = q89.E((Bundle) null);
                q89.h0 = layoutInflater;
            }
            s47 s47 = q89.v0;
            Resources resources = s47.a;
            view = layoutInflater.inflate(resources.getXml(resources.getIdentifier("libraries_social_licenses_license", "layout", s47.b)), viewGroup, false);
        }
        jb9 jb9 = (jb9) getItem(i);
        if (jb9 != null) {
            s47 s472 = q89.v0;
            ((TextView) view.findViewById(s472.a.getIdentifier("license", "id", s472.b))).setText(jb9.w);
        }
        return view;
    }
}
