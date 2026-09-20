package defpackage;

import io.ktor.http.Url;

/* renamed from: su7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class su7 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Url x;

    public /* synthetic */ su7(Url url, int i) {
        this.w = i;
        this.x = url;
    }

    public final Object b() {
        int i = this.w;
        Url url = this.x;
        switch (i) {
            case b85.b:
                return Url.encodedQuery_delegate$lambda$0(url);
            case 1:
                return Url.encodedPathAndQuery_delegate$lambda$0(url);
            case 2:
                return Url.encodedUser_delegate$lambda$0(url);
            case 3:
                return Url.encodedPassword_delegate$lambda$0(url);
            default:
                return Url.encodedFragment_delegate$lambda$0(url);
        }
    }
}
