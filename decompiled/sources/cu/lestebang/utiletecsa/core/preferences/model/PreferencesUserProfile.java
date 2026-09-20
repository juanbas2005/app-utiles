package cu.lestebang.utiletecsa.core.preferences.model;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;", "", "", "id", "userName", "profilePictureUriString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$preferences", "(Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUserName", "getProfilePictureUriString", "Companion", "$serializer", "preferences"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class PreferencesUserProfile {
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String profilePictureUriString;
    private final String userName;

    public /* synthetic */ PreferencesUserProfile(int i, String str, String str2, String str3, rl6 rl6Var) {
        this.id = (i & 1) == 0 ? new String() : str;
        if ((i & 2) == 0) {
            this.userName = new String();
        } else {
            this.userName = str2;
        }
        if ((i & 4) == 0) {
            this.profilePictureUriString = null;
        } else {
            this.profilePictureUriString = str3;
        }
    }

    public static /* synthetic */ PreferencesUserProfile copy$default(PreferencesUserProfile preferencesUserProfile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferencesUserProfile.id;
        }
        if ((i & 2) != 0) {
            str2 = preferencesUserProfile.userName;
        }
        if ((i & 4) != 0) {
            str3 = preferencesUserProfile.profilePictureUriString;
        }
        return preferencesUserProfile.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$preferences(PreferencesUserProfile preferencesUserProfile, hy0 hy0Var, ll6 ll6Var) {
        if (hy0Var.f(ll6Var) || !sg3.e(preferencesUserProfile.id, new String())) {
            hy0Var.x(ll6Var, 0, preferencesUserProfile.id);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(preferencesUserProfile.userName, new String())) {
            hy0Var.x(ll6Var, 1, preferencesUserProfile.userName);
        }
        if (hy0Var.f(ll6Var) || preferencesUserProfile.profilePictureUriString != null) {
            hy0Var.A(ll6Var, 2, t47.a, preferencesUserProfile.profilePictureUriString);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.profilePictureUriString;
    }

    public final PreferencesUserProfile copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return new PreferencesUserProfile(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesUserProfile)) {
            return false;
        }
        PreferencesUserProfile preferencesUserProfile = (PreferencesUserProfile) obj;
        if (sg3.e(this.id, preferencesUserProfile.id) && sg3.e(this.userName, preferencesUserProfile.userName) && sg3.e(this.profilePictureUriString, preferencesUserProfile.profilePictureUriString)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProfilePictureUriString() {
        return this.profilePictureUriString;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int hashCode;
        int h = hl6.h(this.id.hashCode() * 31, 31, this.userName);
        String str = this.profilePictureUriString;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return h + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userName;
        return f21.l(f21.o("PreferencesUserProfile(id=", str, ", userName=", str2, ", profilePictureUriString="), this.profilePictureUriString, ")");
    }

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$Companion;", "", "<init>", "()V", "Lzr3;", "Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;", "serializer", "()Lzr3;", "preferences"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(hl1 hl1Var) {
            this();
        }

        public final zr3 serializer() {
            return PreferencesUserProfile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PreferencesUserProfile() {
        this((String) null, (String) null, (String) null, 7, (hl1) null);
    }

    public PreferencesUserProfile(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.userName = str2;
        this.profilePictureUriString = str3;
    }

    public /* synthetic */ PreferencesUserProfile(String str, String str2, String str3, int i, hl1 hl1Var) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : str3);
    }
}
