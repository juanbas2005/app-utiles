package io.github.jan.supabase.auth;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006 "}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "", "", "error", "description", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "weakPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;)Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getDescription", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "getWeakPassword", "Companion", "WeakPassword", "io/github/jan/supabase/auth/b", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = b.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GoTrueErrorResponse {
    public static final b Companion = new Object();
    /* access modifiers changed from: private */
    public static final ll6 descriptor;
    private final String description;
    private final String error;
    private final WeakPassword weakPassword;

    /* JADX WARNING: type inference failed for: r0v0, types: [io.github.jan.supabase.auth.b, java.lang.Object] */
    static {
        ll6[] ll6Arr = new ll6[0];
        if (!d57.I0("GoTrueErrorResponse")) {
            nq0 nq0 = new nq0("GoTrueErrorResponse");
            descriptor$lambda$0(nq0);
            descriptor = new nl6("GoTrueErrorResponse", n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
            return;
        }
        h.q("Blank serial names are prohibited");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoTrueErrorResponse(String str, String str2, WeakPassword weakPassword2, int i, hl1 hl1) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : weakPassword2);
    }

    public static /* synthetic */ GoTrueErrorResponse copy$default(GoTrueErrorResponse goTrueErrorResponse, String str, String str2, WeakPassword weakPassword2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goTrueErrorResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = goTrueErrorResponse.description;
        }
        if ((i & 4) != 0) {
            weakPassword2 = goTrueErrorResponse.weakPassword;
        }
        return goTrueErrorResponse.copy(str, str2, weakPassword2);
    }

    private static final vs7 descriptor$lambda$0(nq0 nq0) {
        nq0.getClass();
        nq0.b(nq0, "error", t47.b, 12);
        return vs7.a;
    }

    public final String component1() {
        return this.error;
    }

    public final String component2() {
        return this.description;
    }

    public final WeakPassword component3() {
        return this.weakPassword;
    }

    public final GoTrueErrorResponse copy(String str, String str2, WeakPassword weakPassword2) {
        str2.getClass();
        return new GoTrueErrorResponse(str, str2, weakPassword2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoTrueErrorResponse)) {
            return false;
        }
        GoTrueErrorResponse goTrueErrorResponse = (GoTrueErrorResponse) obj;
        if (sg3.e(this.error, goTrueErrorResponse.error) && sg3.e(this.description, goTrueErrorResponse.description) && sg3.e(this.weakPassword, goTrueErrorResponse.weakPassword)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getError() {
        return this.error;
    }

    public final WeakPassword getWeakPassword() {
        return this.weakPassword;
    }

    public int hashCode() {
        int i;
        String str = this.error;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int h = hl6.h(i * 31, 31, this.description);
        WeakPassword weakPassword2 = this.weakPassword;
        if (weakPassword2 != null) {
            i2 = weakPassword2.hashCode();
        }
        return h + i2;
    }

    public String toString() {
        return "GoTrueErrorResponse(error=" + this.error + ", description=" + this.description + ", weakPassword=" + this.weakPassword + ')';
    }

    public GoTrueErrorResponse(String str, String str2, WeakPassword weakPassword2) {
        str2.getClass();
        this.error = str;
        this.description = str2;
        this.weakPassword = weakPassword2;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "", "", "", "reasons", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReasons", "Companion", "io/github/jan/supabase/auth/c", "io/github/jan/supabase/auth/d", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class WeakPassword {
        /* access modifiers changed from: private */
        public static final nz3[] $childSerializers = {rg3.y(i44.w, new nf1(18))};
        public static final d Companion = new Object();
        private final List<String> reasons;

        public /* synthetic */ WeakPassword(int i, List list, rl6 rl6) {
            if (1 == (i & 1)) {
                this.reasons = list;
            } else {
                wn6.x(i, 1, c.a.getDescriptor());
                throw null;
            }
        }

        /* access modifiers changed from: private */
        public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
            return new cs(t47.a, 0);
        }

        public static /* synthetic */ WeakPassword copy$default(WeakPassword weakPassword, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = weakPassword.reasons;
            }
            return weakPassword.copy(list);
        }

        public final List<String> component1() {
            return this.reasons;
        }

        public final WeakPassword copy(List<String> list) {
            list.getClass();
            return new WeakPassword(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof WeakPassword) && sg3.e(this.reasons, ((WeakPassword) obj).reasons)) {
                return true;
            }
            return false;
        }

        public final List<String> getReasons() {
            return this.reasons;
        }

        public int hashCode() {
            return this.reasons.hashCode();
        }

        public String toString() {
            return "WeakPassword(reasons=" + this.reasons + ')';
        }

        public WeakPassword(List<String> list) {
            list.getClass();
            this.reasons = list;
        }
    }
}
