package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 32\u00020\u0001:\u000245B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00066"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostContentDto;", "", "", "userId", "authorName", "category", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostContentDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostContentDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getAuthorName", "getAuthorName$annotations", "getCategory", "getCategory$annotations", "getTitle", "getTitle$annotations", "getBody", "getBody$annotations", "Companion", "fn2", "gn2", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ForumPostContentDto {
    public static final gn2 Companion = new Object();
    private final String authorName;
    private final String body;
    private final String category;
    private final String title;
    private final String userId;

    public /* synthetic */ ForumPostContentDto(int i, String str, String str2, String str3, String str4, String str5, rl6 rl6) {
        if (31 == (i & 31)) {
            this.userId = str;
            this.authorName = str2;
            this.category = str3;
            this.title = str4;
            this.body = str5;
            return;
        }
        wn6.x(i, 31, fn2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumPostContentDto copy$default(ForumPostContentDto forumPostContentDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumPostContentDto.userId;
        }
        if ((i & 2) != 0) {
            str2 = forumPostContentDto.authorName;
        }
        if ((i & 4) != 0) {
            str3 = forumPostContentDto.category;
        }
        if ((i & 8) != 0) {
            str4 = forumPostContentDto.title;
        }
        if ((i & 16) != 0) {
            str5 = forumPostContentDto.body;
        }
        String str6 = str4;
        String str7 = str5;
        return forumPostContentDto.copy(str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostContentDto forumPostContentDto, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, forumPostContentDto.userId);
        hy0.x(ll6, 1, forumPostContentDto.authorName);
        hy0.x(ll6, 2, forumPostContentDto.category);
        hy0.x(ll6, 3, forumPostContentDto.title);
        hy0.x(ll6, 4, forumPostContentDto.body);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.authorName;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.body;
    }

    public final ForumPostContentDto copy(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new ForumPostContentDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostContentDto)) {
            return false;
        }
        ForumPostContentDto forumPostContentDto = (ForumPostContentDto) obj;
        if (sg3.e(this.userId, forumPostContentDto.userId) && sg3.e(this.authorName, forumPostContentDto.authorName) && sg3.e(this.category, forumPostContentDto.category) && sg3.e(this.title, forumPostContentDto.title) && sg3.e(this.body, forumPostContentDto.body)) {
            return true;
        }
        return false;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.body.hashCode() + hl6.h(hl6.h(hl6.h(this.userId.hashCode() * 31, 31, this.authorName), 31, this.category), 31, this.title);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.authorName;
        String str3 = this.category;
        String str4 = this.title;
        String str5 = this.body;
        StringBuilder o = f21.o("ForumPostContentDto(userId=", str, ", authorName=", str2, ", category=");
        f21.v(o, str3, ", title=", str4, ", body=");
        return f21.l(o, str5, ")");
    }

    public static /* synthetic */ void getAuthorName$annotations() {
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public ForumPostContentDto(String str, String str2, String str3, String str4, String str5) {
        hl6.t(str, str2, str3, str4, str5);
        this.userId = str;
        this.authorName = str2;
        this.category = str3;
        this.title = str4;
        this.body = str5;
    }
}
