package defpackage;

import java.lang.reflect.Member;

/* renamed from: u06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u06 extends ct2 implements vr2 {
    public static final u06 D = new ct2(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    public final Object y(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
