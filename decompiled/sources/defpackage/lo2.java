package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumCommentFeedDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumCommentVoteDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumPostFeedDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumPostVoteDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: lo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lo2 implements sn2 {
    public static final List d = sg3.E("id", "user_id", "author_name", "category", "title", "body", "has_image", "image_path", "created_at", "likes", "dislikes", "comment_count");
    public final j77 a;
    public final h81 b;
    public volatile ArrayList c;

    public lo2(j77 j77, h81 h81) {
        j77.getClass();
        this.a = j77;
        this.b = h81;
    }

    public static final Object b(lo2 lo2, String str, a97 a97) {
        return a35.k(lo2.a).l("forum-images").q(new String[]{str}, a97);
    }

    public static final String c(lo2 lo2, UserInfo userInfo) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        String str;
        JsonObject userMetadata = userInfo.getUserMetadata();
        String str2 = null;
        if (!(userMetadata == null || (jsonElement2 = (JsonElement) userMetadata.get((Object) "full_name")) == null)) {
            JsonPrimitive f = em3.f(jsonElement2);
            if (f instanceof JsonNull) {
                str = null;
            } else {
                str = f.getContent();
            }
            if (str != null) {
                return str;
            }
        }
        if (!(userMetadata == null || (jsonElement = (JsonElement) userMetadata.get((Object) "name")) == null)) {
            JsonPrimitive f2 = em3.f(jsonElement);
            if (!(f2 instanceof JsonNull)) {
                str2 = f2.getContent();
            }
        }
        if (str2 != null) {
            return str2;
        }
        String email = userInfo.getEmail();
        if (email == null) {
            email = "";
        }
        return d57.g1(email, "@");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb A[LOOP:0: B:23:0x00b5->B:25:0x00bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Serializable d(lo2 lo2, String str, ArrayList arrayList, h61 h61) {
        do2 do2;
        int i;
        int F;
        lo2.getClass();
        if (h61 instanceof do2) {
            do2 = (do2) h61;
            int i2 = do2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                do2.B = i2 - Integer.MIN_VALUE;
                Object obj = do2.z;
                i = do2.B;
                if (i != 0) {
                    o85.q(obj);
                    if (str == null || arrayList.isEmpty()) {
                        return b42.w;
                    }
                    hm5 i3 = f55.i(lo2.a, "forum_comment_votes");
                    gm5 gm5 = i3.a;
                    String str2 = i3.c;
                    ku4 ku4 = gm5.c.v;
                    im5 im5 = new im5(str2, ku4);
                    zc9 zc9 = new zc9(ku4, im5.f, 4);
                    zc9.a("user_id", xd2.EQ, str);
                    zc9.a("comment_id", xd2.IN, arrayList);
                    im5.d("*");
                    h66 h66 = h66.a;
                    String str3 = i3.b;
                    do2.B = 1;
                    obj = h66.a(gm5, str3, im5, do2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj;
                t77 t77 = jm5.b.d;
                String str4 = jm5.a;
                gs3 gs3 = gs3.c;
                List<ForumCommentVoteDto> list = (List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(ForumCommentVoteDto.class))), str4);
                F = tf4.F(et0.e0(list, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (ForumCommentVoteDto forumCommentVoteDto : list) {
                    linkedHashMap.put(forumCommentVoteDto.getCommentId(), new Integer(forumCommentVoteDto.getVote()));
                }
                return linkedHashMap;
            }
        }
        do2 = new do2(lo2, h61);
        Object obj2 = do2.z;
        i = do2.B;
        if (i != 0) {
        }
        jm5 jm52 = (jm5) obj2;
        t77 t772 = jm52.b.d;
        String str42 = jm52.a;
        gs3 gs32 = gs3.c;
        List<ForumCommentVoteDto> list2 = (List) ((f96) t772).s(b26.c(List.class, x91.C(b26.b(ForumCommentVoteDto.class))), str42);
        F = tf4.F(et0.e0(list2, 10));
        if (F < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F);
        while (r7.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb A[LOOP:0: B:23:0x00b5->B:25:0x00bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Serializable e(lo2 lo2, String str, ArrayList arrayList, h61 h61) {
        eo2 eo2;
        int i;
        int F;
        lo2.getClass();
        if (h61 instanceof eo2) {
            eo2 = (eo2) h61;
            int i2 = eo2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eo2.B = i2 - Integer.MIN_VALUE;
                Object obj = eo2.z;
                i = eo2.B;
                if (i != 0) {
                    o85.q(obj);
                    if (str == null || arrayList.isEmpty()) {
                        return b42.w;
                    }
                    hm5 i3 = f55.i(lo2.a, "forum_post_votes");
                    gm5 gm5 = i3.a;
                    String str2 = i3.c;
                    ku4 ku4 = gm5.c.v;
                    im5 im5 = new im5(str2, ku4);
                    zc9 zc9 = new zc9(ku4, im5.f, 4);
                    zc9.a("user_id", xd2.EQ, str);
                    zc9.a("post_id", xd2.IN, arrayList);
                    im5.d("*");
                    h66 h66 = h66.a;
                    String str3 = i3.b;
                    eo2.B = 1;
                    obj = h66.a(gm5, str3, im5, eo2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj;
                t77 t77 = jm5.b.d;
                String str4 = jm5.a;
                gs3 gs3 = gs3.c;
                List<ForumPostVoteDto> list = (List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(ForumPostVoteDto.class))), str4);
                F = tf4.F(et0.e0(list, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (ForumPostVoteDto forumPostVoteDto : list) {
                    linkedHashMap.put(forumPostVoteDto.getPostId(), new Integer(forumPostVoteDto.getVote()));
                }
                return linkedHashMap;
            }
        }
        eo2 = new eo2(lo2, h61);
        Object obj2 = eo2.z;
        i = eo2.B;
        if (i != 0) {
        }
        jm5 jm52 = (jm5) obj2;
        t77 t772 = jm52.b.d;
        String str42 = jm52.a;
        gs3 gs32 = gs3.c;
        List<ForumPostVoteDto> list2 = (List) ((f96) t772).s(b26.c(List.class, x91.C(b26.b(ForumPostVoteDto.class))), str42);
        F = tf4.F(et0.e0(list2, 10));
        if (F < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F);
        while (r7.hasNext()) {
        }
        return linkedHashMap2;
    }

    public static final tm2 f(lo2 lo2, ForumCommentFeedDto forumCommentFeedDto, String str, int i) {
        boolean z;
        lo2.getClass();
        String id = forumCommentFeedDto.getId();
        String postId = forumCommentFeedDto.getPostId();
        String body = forumCommentFeedDto.getBody();
        String authorName = forumCommentFeedDto.getAuthorName();
        String i1 = d57.i1(10, forumCommentFeedDto.getCreatedAt());
        long likes = forumCommentFeedDto.getLikes();
        long dislikes = forumCommentFeedDto.getDislikes();
        if (str == null || !sg3.e(forumCommentFeedDto.getUserId(), str)) {
            z = false;
        } else {
            z = true;
        }
        return new tm2(id, postId, body, authorName, i1, likes, dislikes, i, z);
    }

    public static final en2 g(lo2 lo2, ForumPostFeedDto forumPostFeedDto, String str, int i, Map map) {
        String str2;
        boolean z;
        String str3 = str;
        lo2.getClass();
        String id = forumPostFeedDto.getId();
        String category = forumPostFeedDto.getCategory();
        String str4 = (String) map.get(forumPostFeedDto.getCategory());
        if (str4 == null) {
            str4 = forumPostFeedDto.getCategory();
        }
        qm2 qm2 = new qm2(category, str4);
        String title = forumPostFeedDto.getTitle();
        String body = forumPostFeedDto.getBody();
        String imagePath = forumPostFeedDto.getImagePath();
        if (imagePath != null) {
            str2 = lo2.q(imagePath);
        } else {
            str2 = null;
        }
        String imagePath2 = forumPostFeedDto.getImagePath();
        boolean hasImage = forumPostFeedDto.getHasImage();
        String authorName = forumPostFeedDto.getAuthorName();
        String i1 = d57.i1(10, forumPostFeedDto.getCreatedAt());
        long likes = forumPostFeedDto.getLikes();
        long dislikes = forumPostFeedDto.getDislikes();
        long commentCount = forumPostFeedDto.getCommentCount();
        String str5 = id;
        if (str3 == null || !sg3.e(forumPostFeedDto.getUserId(), str3)) {
            z = false;
        } else {
            z = true;
        }
        return new en2(str5, qm2, title, body, str2, imagePath2, hasImage, authorName, i1, likes, dislikes, commentCount, i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object h(lo2 lo2, String str, byte[] bArr, h61 h61) {
        ho2 ho2;
        int i;
        if (h61 instanceof ho2) {
            ho2 = (ho2) h61;
            int i2 = ho2.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ho2.C = i2 - Integer.MIN_VALUE;
                Object obj = ho2.A;
                i = ho2.C;
                if (i != 0) {
                    o85.q(obj);
                    String str2 = str + "/" + UUID.randomUUID() + ".jpg";
                    am6 l = a35.k(lo2.a).l("forum-images");
                    vd2 vd2 = new vd2(3);
                    ho2.z = str2;
                    ho2.C = 1;
                    Object U = l.U(str2, bArr, vd2, ho2);
                    p81 p81 = p81.w;
                    if (U == p81) {
                        return p81;
                    }
                    return str2;
                } else if (i == 1) {
                    String str3 = ho2.z;
                    o85.q(obj);
                    return str3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ho2 = new ho2(lo2, h61);
        Object obj2 = ho2.A;
        i = ho2.C;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object i(String str, String str2, h61 h61) {
        tn2 tn2;
        int i;
        if (h61 instanceof tn2) {
            tn2 = (tn2) h61;
            int i2 = tn2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tn2.B = i2 - Integer.MIN_VALUE;
                Object obj = tn2.z;
                i = tn2.B;
                if (i != 0) {
                    o85.q(obj);
                    p0 p0Var = new p0(this, str2, str, (f61) null, 23);
                    tn2.B = 1;
                    obj = ar7.e0(this.b, p0Var, tn2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        tn2 = new tn2(this, h61);
        Object obj2 = tn2.z;
        i = tn2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object j(ez4 ez4, h61 h61) {
        un2 un2;
        int i;
        if (h61 instanceof un2) {
            un2 = (un2) h61;
            int i2 = un2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                un2.B = i2 - Integer.MIN_VALUE;
                Object obj = un2.z;
                i = un2.B;
                if (i != 0) {
                    o85.q(obj);
                    p6 p6Var = new p6(this, ez4, (f61) null);
                    un2.B = 1;
                    obj = ar7.e0(this.b, p6Var, un2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        un2 = new un2(this, h61);
        Object obj2 = un2.z;
        i = un2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object k(String str, h61 h61) {
        vn2 vn2;
        int i;
        if (h61 instanceof vn2) {
            vn2 = (vn2) h61;
            int i2 = vn2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vn2.B = i2 - Integer.MIN_VALUE;
                Object obj = vn2.z;
                i = vn2.B;
                if (i != 0) {
                    o85.q(obj);
                    wn2 wn2 = new wn2(this, str, (f61) null, 0);
                    vn2.B = 1;
                    obj = ar7.e0(this.b, wn2, vn2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        vn2 = new vn2(this, h61);
        Object obj2 = vn2.z;
        i = vn2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object l(String str, String str2, h61 h61) {
        xn2 xn2;
        int i;
        if (h61 instanceof xn2) {
            xn2 = (xn2) h61;
            int i2 = xn2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xn2.B = i2 - Integer.MIN_VALUE;
                Object obj = xn2.z;
                i = xn2.B;
                if (i != 0) {
                    o85.q(obj);
                    f7 f7Var = new f7(this, str2, str, (f61) null);
                    xn2.B = 1;
                    obj = ar7.e0(this.b, f7Var, xn2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        xn2 = new xn2(this, h61);
        Object obj2 = xn2.z;
        i = xn2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object m(h61 h61) {
        yn2 yn2;
        int i;
        if (h61 instanceof yn2) {
            yn2 = (yn2) h61;
            int i2 = yn2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yn2.B = i2 - Integer.MIN_VALUE;
                Object obj = yn2.z;
                i = yn2.B;
                if (i != 0) {
                    o85.q(obj);
                    ju1 ju1 = new ju1(this, (f61) null, 5);
                    yn2.B = 1;
                    obj = ar7.e0(this.b, ju1, yn2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        yn2 = new yn2(this, h61);
        Object obj2 = yn2.z;
        i = yn2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object n(String str, h61 h61) {
        zn2 zn2;
        int i;
        if (h61 instanceof zn2) {
            zn2 = (zn2) h61;
            int i2 = zn2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zn2.B = i2 - Integer.MIN_VALUE;
                Object obj = zn2.z;
                i = zn2.B;
                if (i != 0) {
                    o85.q(obj);
                    w6 w6Var = new w6(this, str, (f61) null);
                    zn2.B = 1;
                    obj = ar7.e0(this.b, w6Var, zn2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        zn2 = new zn2(this, h61);
        Object obj2 = zn2.z;
        i = zn2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object o(String str, h61 h61) {
        ao2 ao2;
        int i;
        if (h61 instanceof ao2) {
            ao2 = (ao2) h61;
            int i2 = ao2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ao2.B = i2 - Integer.MIN_VALUE;
                Object obj = ao2.z;
                i = ao2.B;
                if (i != 0) {
                    o85.q(obj);
                    wn2 wn2 = new wn2(this, str, (f61) null, 1);
                    ao2.B = 1;
                    obj = ar7.e0(this.b, wn2, ao2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        ao2 = new ao2(this, h61);
        Object obj2 = ao2.z;
        i = ao2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object p(int i, int i2, String str, String str2, h61 h61) {
        bo2 bo2;
        int i3;
        if (h61 instanceof bo2) {
            bo2 = (bo2) h61;
            int i4 = bo2.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bo2.B = i4 - Integer.MIN_VALUE;
                Object obj = bo2.z;
                i3 = bo2.B;
                if (i3 != 0) {
                    o85.q(obj);
                    co2 co2 = new co2(this, i2, i, str, str2, (f61) null);
                    bo2.B = 1;
                    obj = ar7.e0(this.b, co2, bo2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        bo2 = new bo2(this, h61);
        Object obj2 = bo2.z;
        i3 = bo2.B;
        if (i3 != 0) {
        }
        return ((o66) obj2).w;
    }

    public final String q(String str) {
        str.getClass();
        am6 l = a35.k(this.a).l("forum-images");
        return j45.e(((h47) l.y).a("object/public/" + ((String) l.x) + '/' + str)).c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object r(String str, ez4 ez4, String str2, h61 h61) {
        fo2 fo2;
        int i;
        if (h61 instanceof fo2) {
            fo2 = (fo2) h61;
            int i2 = fo2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo2.B = i2 - Integer.MIN_VALUE;
                Object obj = fo2.z;
                i = fo2.B;
                if (i != 0) {
                    o85.q(obj);
                    go2 go2 = new go2(this, ez4, str2, str, (f61) null);
                    fo2.B = 1;
                    obj = ar7.e0(this.b, go2, fo2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        fo2 = new fo2(this, h61);
        Object obj2 = fo2.z;
        i = fo2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object s(int i, h61 h61, String str) {
        io2 io2;
        int i2;
        if (h61 instanceof io2) {
            io2 = (io2) h61;
            int i3 = io2.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                io2.B = i3 - Integer.MIN_VALUE;
                Object obj = io2.z;
                i2 = io2.B;
                if (i2 != 0) {
                    o85.q(obj);
                    jo2 jo2 = new jo2(this, i, str, (f61) null, 0);
                    io2.B = 1;
                    obj = ar7.e0(this.b, jo2, io2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        io2 = new io2(this, h61);
        Object obj2 = io2.z;
        i2 = io2.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object t(int i, h61 h61, String str) {
        ko2 ko2;
        int i2;
        if (h61 instanceof ko2) {
            ko2 = (ko2) h61;
            int i3 = ko2.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ko2.B = i3 - Integer.MIN_VALUE;
                Object obj = ko2.z;
                i2 = ko2.B;
                if (i2 != 0) {
                    o85.q(obj);
                    jo2 jo2 = new jo2(this, i, str, (f61) null, 1);
                    ko2.B = 1;
                    obj = ar7.e0(this.b, jo2, ko2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        ko2 = new ko2(this, h61);
        Object obj2 = ko2.z;
        i2 = ko2.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }
}
