package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumCategoryDto;", "", "", "key", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumCategoryDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/forum/ForumCategoryDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getLabel", "getLabel$annotations", "Companion", "rm2", "sm2", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class ForumCategoryDto {
    public static final sm2 Companion = new Object();
    private final String key;
    private final String label;

    public /* synthetic */ ForumCategoryDto(int i, String str, String str2, rl6 rl6Var) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = str2;
            return;
        }
        wn6.x(i, 3, rm2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumCategoryDto copy$default(ForumCategoryDto forumCategoryDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumCategoryDto.key;
        }
        if ((i & 2) != 0) {
            str2 = forumCategoryDto.label;
        }
        return forumCategoryDto.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$data(ForumCategoryDto forumCategoryDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, forumCategoryDto.key);
        hy0Var.x(ll6Var, 1, forumCategoryDto.label);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final ForumCategoryDto copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ForumCategoryDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumCategoryDto)) {
            return false;
        }
        ForumCategoryDto forumCategoryDto = (ForumCategoryDto) obj;
        if (sg3.e(this.key, forumCategoryDto.key) && sg3.e(this.label, forumCategoryDto.label)) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        return pb4.m("ForumCategoryDto(key=", this.key, ", label=", this.label, ")");
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getLabel$annotations() {
    }

    public ForumCategoryDto(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.label = str2;
    }
}
