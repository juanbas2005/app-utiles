package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001a¨\u0006/"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostVoteDto;", "", "", "postId", "userId", "", "vote", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostVoteDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostVoteDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPostId", "getPostId$annotations", "()V", "getUserId", "getUserId$annotations", "I", "getVote", "getVote$annotations", "Companion", "qn2", "rn2", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ForumPostVoteDto {
    public static final rn2 Companion = new Object();
    private final String postId;
    private final String userId;
    private final int vote;

    public /* synthetic */ ForumPostVoteDto(int i, String str, String str2, int i2, rl6 rl6) {
        if (7 == (i & 7)) {
            this.postId = str;
            this.userId = str2;
            this.vote = i2;
            return;
        }
        wn6.x(i, 7, qn2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumPostVoteDto copy$default(ForumPostVoteDto forumPostVoteDto, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = forumPostVoteDto.postId;
        }
        if ((i2 & 2) != 0) {
            str2 = forumPostVoteDto.userId;
        }
        if ((i2 & 4) != 0) {
            i = forumPostVoteDto.vote;
        }
        return forumPostVoteDto.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostVoteDto forumPostVoteDto, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, forumPostVoteDto.postId);
        hy0.x(ll6, 1, forumPostVoteDto.userId);
        hy0.w(2, forumPostVoteDto.vote, ll6);
    }

    public final String component1() {
        return this.postId;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.vote;
    }

    public final ForumPostVoteDto copy(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        return new ForumPostVoteDto(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostVoteDto)) {
            return false;
        }
        ForumPostVoteDto forumPostVoteDto = (ForumPostVoteDto) obj;
        if (sg3.e(this.postId, forumPostVoteDto.postId) && sg3.e(this.userId, forumPostVoteDto.userId) && this.vote == forumPostVoteDto.vote) {
            return true;
        }
        return false;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVote() {
        return this.vote;
    }

    public int hashCode() {
        return Integer.hashCode(this.vote) + hl6.h(this.postId.hashCode() * 31, 31, this.userId);
    }

    public String toString() {
        String str = this.postId;
        String str2 = this.userId;
        return hl6.n(f21.o("ForumPostVoteDto(postId=", str, ", userId=", str2, ", vote="), this.vote, ")");
    }

    public static /* synthetic */ void getPostId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void getVote$annotations() {
    }

    public ForumPostVoteDto(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.postId = str;
        this.userId = str2;
        this.vote = i;
    }
}
