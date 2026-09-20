package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageDto;", "", "", "image", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getImage$annotations", "()V", "Companion", "jn2", "kn2", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ForumPostImageDto {
    public static final kn2 Companion = new Object();
    private final String image;

    public /* synthetic */ ForumPostImageDto(int i, String str, rl6 rl6) {
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = str;
        }
    }

    public static /* synthetic */ ForumPostImageDto copy$default(ForumPostImageDto forumPostImageDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumPostImageDto.image;
        }
        return forumPostImageDto.copy(str);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostImageDto forumPostImageDto, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || forumPostImageDto.image != null) {
            hy0.A(ll6, 0, t47.a, forumPostImageDto.image);
        }
    }

    public final String component1() {
        return this.image;
    }

    public final ForumPostImageDto copy(String str) {
        return new ForumPostImageDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ForumPostImageDto) && sg3.e(this.image, ((ForumPostImageDto) obj).image)) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        String str = this.image;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return f21.h("ForumPostImageDto(image=", this.image, ")");
    }

    public ForumPostImageDto() {
        this((String) null, 1, (hl1) null);
    }

    public ForumPostImageDto(String str) {
        this.image = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForumPostImageDto(String str, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ void getImage$annotations() {
    }
}
