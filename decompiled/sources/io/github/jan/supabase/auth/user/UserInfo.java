package io.github.jan.supabase.auth.user;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\b\b\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001BÍ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b$\u0010%Bµ\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b$\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010.J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00100J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010.J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b8\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u00100J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010.J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u00100J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010,J\u0012\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u00100J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u0010.J\u0012\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b@\u00100J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010.J\u0012\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bB\u00100J\u0012\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bC\u00100J\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u00100J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bE\u0010.J\u0012\u0010F\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bI\u00100J\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u00100JÚ\u0002\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bM\u0010.J\u0010\u0010N\u001a\u00020&HÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010Q\u001a\u00020\u001f2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RJ'\u0010[\u001a\u00020X2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020VH\u0001¢\u0006\u0004\bY\u0010ZR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\\\u0012\u0004\b^\u0010_\u001a\u0004\b]\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010`\u0012\u0004\bb\u0010_\u001a\u0004\ba\u0010.R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010c\u0012\u0004\be\u0010_\u001a\u0004\bd\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010c\u0012\u0004\bg\u0010_\u001a\u0004\bf\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010c\u0012\u0004\bi\u0010_\u001a\u0004\bh\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010`\u0012\u0004\bk\u0010_\u001a\u0004\bj\u0010.R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010c\u0012\u0004\bm\u0010_\u001a\u0004\bl\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010n\u001a\u0004\bo\u00106R \u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010`\u0012\u0004\bq\u0010_\u001a\u0004\bp\u0010.R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010n\u0012\u0004\bs\u0010_\u001a\u0004\br\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010c\u0012\u0004\bu\u0010_\u001a\u0004\bt\u00100R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010`\u0012\u0004\bw\u0010_\u001a\u0004\bv\u0010.R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010`\u0012\u0004\by\u0010_\u001a\u0004\bx\u0010.R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010c\u0012\u0004\b{\u0010_\u001a\u0004\bz\u00100R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\\\u0012\u0004\b}\u0010_\u001a\u0004\b|\u0010,R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010c\u0012\u0004\b\u0010_\u001a\u0004\b~\u00100R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010`\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\u0019\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100R$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0014\n\u0004\b\u001a\u0010`\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u0010.R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100R$\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100R$\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010`\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u0010.R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\u0014\n\u0005\b \u0010\u0001\u0012\u0005\b\u0001\u0010_\u001a\u0004\b \u0010GR$\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\u0014\n\u0005\b!\u0010\u0001\u0012\u0005\b\u0001\u0010_\u001a\u0004\b!\u0010GR$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\"\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100R$\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b#\u0010c\u0012\u0005\b\u0001\u0010_\u001a\u0005\b\u0001\u00100¨\u0006\u0001"}, d2 = {"Lio/github/jan/supabase/auth/user/UserInfo;", "", "Lkotlinx/serialization/json/JsonObject;", "appMetadata", "", "aud", "Lqd3;", "confirmationSentAt", "confirmedAt", "createdAt", "email", "emailConfirmedAt", "", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "factors", "id", "Lio/github/jan/supabase/auth/user/Identity;", "identities", "lastSignInAt", "phone", "role", "updatedAt", "userMetadata", "phoneChangeSentAt", "newPhone", "emailChangeSentAt", "newEmail", "invitedAt", "recoverySentAt", "phoneConfirmedAt", "actionLink", "", "isAnonymous", "isSSOUser", "bannedUntil", "deletedAt", "<init>", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Lqd3;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lqd3;Ljava/lang/String;Ljava/lang/String;Lqd3;Lkotlinx/serialization/json/JsonObject;Lqd3;Ljava/lang/String;Lqd3;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lqd3;Lqd3;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Lqd3;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lqd3;Ljava/lang/String;Ljava/lang/String;Lqd3;Lkotlinx/serialization/json/JsonObject;Lqd3;Ljava/lang/String;Lqd3;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lqd3;Lqd3;Lrl6;)V", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "()Ljava/lang/String;", "component3", "()Lqd3;", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "()Ljava/lang/Boolean;", "component25", "component26", "component27", "copy", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Lqd3;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lqd3;Ljava/lang/String;Ljava/lang/String;Lqd3;Lkotlinx/serialization/json/JsonObject;Lqd3;Ljava/lang/String;Lqd3;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lqd3;Lqd3;)Lio/github/jan/supabase/auth/user/UserInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/user/UserInfo;Lhy0;Lll6;)V", "write$Self", "Lkotlinx/serialization/json/JsonObject;", "getAppMetadata", "getAppMetadata$annotations", "()V", "Ljava/lang/String;", "getAud", "getAud$annotations", "Lqd3;", "getConfirmationSentAt", "getConfirmationSentAt$annotations", "getConfirmedAt", "getConfirmedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getEmail", "getEmail$annotations", "getEmailConfirmedAt", "getEmailConfirmedAt$annotations", "Ljava/util/List;", "getFactors", "getId", "getId$annotations", "getIdentities", "getIdentities$annotations", "getLastSignInAt", "getLastSignInAt$annotations", "getPhone", "getPhone$annotations", "getRole", "getRole$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getUserMetadata", "getUserMetadata$annotations", "getPhoneChangeSentAt", "getPhoneChangeSentAt$annotations", "getNewPhone", "getNewPhone$annotations", "getEmailChangeSentAt", "getEmailChangeSentAt$annotations", "getNewEmail", "getNewEmail$annotations", "getInvitedAt", "getInvitedAt$annotations", "getRecoverySentAt", "getRecoverySentAt$annotations", "getPhoneConfirmedAt", "getPhoneConfirmedAt$annotations", "getActionLink", "getActionLink$annotations", "Ljava/lang/Boolean;", "isAnonymous$annotations", "isSSOUser$annotations", "getBannedUntil", "getBannedUntil$annotations", "getDeletedAt", "getDeletedAt$annotations", "Companion", "zu7", "av7", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UserInfo {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final av7 Companion = new Object();
    private final String actionLink;
    private final JsonObject appMetadata;
    private final String aud;
    private final qd3 bannedUntil;
    private final qd3 confirmationSentAt;
    private final qd3 confirmedAt;
    private final qd3 createdAt;
    private final qd3 deletedAt;
    private final String email;
    private final qd3 emailChangeSentAt;
    private final qd3 emailConfirmedAt;
    private final List<UserMfaFactor> factors;
    private final String id;
    private final List<Identity> identities;
    private final qd3 invitedAt;
    private final Boolean isAnonymous;
    private final Boolean isSSOUser;
    private final qd3 lastSignInAt;
    private final String newEmail;
    private final String newPhone;
    private final String phone;
    private final qd3 phoneChangeSentAt;
    private final qd3 phoneConfirmedAt;
    private final qd3 recoverySentAt;
    private final String role;
    private final qd3 updatedAt;
    private final JsonObject userMetadata;

    /* JADX WARNING: type inference failed for: r0v0, types: [av7, java.lang.Object] */
    static {
        wi7 wi7 = new wi7(13);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, null, null, null, null, null, rg3.y(i44, wi7), null, rg3.y(i44, new wi7(14)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ UserInfo(int i, JsonObject jsonObject, String str, qd3 qd3, qd3 qd32, qd3 qd33, String str2, qd3 qd34, List list, String str3, List list2, qd3 qd35, String str4, String str5, qd3 qd36, JsonObject jsonObject2, qd3 qd37, String str6, qd3 qd38, String str7, qd3 qd39, qd3 qd310, qd3 qd311, String str8, Boolean bool, Boolean bool2, qd3 qd312, qd3 qd313, rl6 rl6) {
        if (258 == (i & 258)) {
            if ((i & 1) == 0) {
                this.appMetadata = null;
            } else {
                this.appMetadata = jsonObject;
            }
            this.aud = str;
            if ((i & 4) == 0) {
                this.confirmationSentAt = null;
            } else {
                this.confirmationSentAt = qd3;
            }
            if ((i & 8) == 0) {
                this.confirmedAt = null;
            } else {
                this.confirmedAt = qd32;
            }
            if ((i & 16) == 0) {
                this.createdAt = null;
            } else {
                this.createdAt = qd33;
            }
            if ((i & 32) == 0) {
                this.email = null;
            } else {
                this.email = str2;
            }
            if ((i & 64) == 0) {
                this.emailConfirmedAt = null;
            } else {
                this.emailConfirmedAt = qd34;
            }
            if ((i & 128) == 0) {
                this.factors = a42.w;
            } else {
                this.factors = list;
            }
            this.id = str3;
            if ((i & 512) == 0) {
                this.identities = null;
            } else {
                this.identities = list2;
            }
            if ((i & 1024) == 0) {
                this.lastSignInAt = null;
            } else {
                this.lastSignInAt = qd35;
            }
            if ((i & 2048) == 0) {
                this.phone = null;
            } else {
                this.phone = str4;
            }
            if ((i & 4096) == 0) {
                this.role = null;
            } else {
                this.role = str5;
            }
            if ((i & 8192) == 0) {
                this.updatedAt = null;
            } else {
                this.updatedAt = qd36;
            }
            if ((i & 16384) == 0) {
                this.userMetadata = null;
            } else {
                this.userMetadata = jsonObject2;
            }
            if ((32768 & i) == 0) {
                this.phoneChangeSentAt = null;
            } else {
                this.phoneChangeSentAt = qd37;
            }
            if ((65536 & i) == 0) {
                this.newPhone = null;
            } else {
                this.newPhone = str6;
            }
            if ((131072 & i) == 0) {
                this.emailChangeSentAt = null;
            } else {
                this.emailChangeSentAt = qd38;
            }
            if ((262144 & i) == 0) {
                this.newEmail = null;
            } else {
                this.newEmail = str7;
            }
            if ((524288 & i) == 0) {
                this.invitedAt = null;
            } else {
                this.invitedAt = qd39;
            }
            if ((1048576 & i) == 0) {
                this.recoverySentAt = null;
            } else {
                this.recoverySentAt = qd310;
            }
            if ((2097152 & i) == 0) {
                this.phoneConfirmedAt = null;
            } else {
                this.phoneConfirmedAt = qd311;
            }
            if ((4194304 & i) == 0) {
                this.actionLink = null;
            } else {
                this.actionLink = str8;
            }
            if ((8388608 & i) == 0) {
                this.isAnonymous = null;
            } else {
                this.isAnonymous = bool;
            }
            if ((16777216 & i) == 0) {
                this.isSSOUser = null;
            } else {
                this.isSSOUser = bool2;
            }
            if ((33554432 & i) == 0) {
                this.bannedUntil = null;
            } else {
                this.bannedUntil = qd312;
            }
            if ((i & 67108864) == 0) {
                this.deletedAt = null;
            } else {
                this.deletedAt = qd313;
            }
        } else {
            wn6.x(i, 258, zu7.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(bv7.a, 0);
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$0() {
        return new cs(g83.a, 0);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, JsonObject jsonObject, String str, qd3 qd3, qd3 qd32, qd3 qd33, String str2, qd3 qd34, List list, String str3, List list2, qd3 qd35, String str4, String str5, qd3 qd36, JsonObject jsonObject2, qd3 qd37, String str6, qd3 qd38, String str7, qd3 qd39, qd3 qd310, qd3 qd311, String str8, Boolean bool, Boolean bool2, qd3 qd312, qd3 qd313, int i, Object obj) {
        qd3 qd314;
        qd3 qd315;
        UserInfo userInfo2 = userInfo;
        int i2 = i;
        JsonObject jsonObject3 = (i2 & 1) != 0 ? userInfo2.appMetadata : jsonObject;
        String str9 = (i2 & 2) != 0 ? userInfo2.aud : str;
        qd3 qd316 = (i2 & 4) != 0 ? userInfo2.confirmationSentAt : qd3;
        qd3 qd317 = (i2 & 8) != 0 ? userInfo2.confirmedAt : qd32;
        qd3 qd318 = (i2 & 16) != 0 ? userInfo2.createdAt : qd33;
        String str10 = (i2 & 32) != 0 ? userInfo2.email : str2;
        qd3 qd319 = (i2 & 64) != 0 ? userInfo2.emailConfirmedAt : qd34;
        List list3 = (i2 & 128) != 0 ? userInfo2.factors : list;
        String str11 = (i2 & 256) != 0 ? userInfo2.id : str3;
        List list4 = (i2 & 512) != 0 ? userInfo2.identities : list2;
        qd3 qd320 = (i2 & 1024) != 0 ? userInfo2.lastSignInAt : qd35;
        String str12 = (i2 & 2048) != 0 ? userInfo2.phone : str4;
        String str13 = (i2 & 4096) != 0 ? userInfo2.role : str5;
        qd3 qd321 = (i2 & 8192) != 0 ? userInfo2.updatedAt : qd36;
        JsonObject jsonObject4 = jsonObject3;
        JsonObject jsonObject5 = (i2 & 16384) != 0 ? userInfo2.userMetadata : jsonObject2;
        qd3 qd322 = (i2 & 32768) != 0 ? userInfo2.phoneChangeSentAt : qd37;
        String str14 = (i & 65536) != 0 ? userInfo2.newPhone : str6;
        qd3 qd323 = (i & 131072) != 0 ? userInfo2.emailChangeSentAt : qd38;
        String str15 = (i & 262144) != 0 ? userInfo2.newEmail : str7;
        qd3 qd324 = (i & 524288) != 0 ? userInfo2.invitedAt : qd39;
        qd3 qd325 = (i & 1048576) != 0 ? userInfo2.recoverySentAt : qd310;
        qd3 qd326 = (i & 2097152) != 0 ? userInfo2.phoneConfirmedAt : qd311;
        String str16 = (i & 4194304) != 0 ? userInfo2.actionLink : str8;
        Boolean bool3 = (i & 8388608) != 0 ? userInfo2.isAnonymous : bool;
        Boolean bool4 = (i & 16777216) != 0 ? userInfo2.isSSOUser : bool2;
        qd3 qd327 = (i & 33554432) != 0 ? userInfo2.bannedUntil : qd312;
        if ((i & 67108864) != 0) {
            qd315 = qd327;
            qd314 = userInfo2.deletedAt;
        } else {
            qd314 = qd313;
            qd315 = qd327;
        }
        return userInfo2.copy(jsonObject4, str9, qd316, qd317, qd318, str10, qd319, list3, str11, list4, qd320, str12, str13, qd321, jsonObject5, qd322, str14, qd323, str15, qd324, qd325, qd326, str16, bool3, bool4, qd315, qd314);
    }

    public static final /* synthetic */ void write$Self$auth_kt(UserInfo userInfo, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        if (hy0.f(ll6) || userInfo.appMetadata != null) {
            hy0.A(ll6, 0, xm3.a, userInfo.appMetadata);
        }
        hy0.x(ll6, 1, userInfo.aud);
        if (hy0.f(ll6) || userInfo.confirmationSentAt != null) {
            hy0.A(ll6, 2, wd3.a, userInfo.confirmationSentAt);
        }
        if (hy0.f(ll6) || userInfo.confirmedAt != null) {
            hy0.A(ll6, 3, wd3.a, userInfo.confirmedAt);
        }
        if (hy0.f(ll6) || userInfo.createdAt != null) {
            hy0.A(ll6, 4, wd3.a, userInfo.createdAt);
        }
        if (hy0.f(ll6) || userInfo.email != null) {
            hy0.A(ll6, 5, t47.a, userInfo.email);
        }
        if (hy0.f(ll6) || userInfo.emailConfirmedAt != null) {
            hy0.A(ll6, 6, wd3.a, userInfo.emailConfirmedAt);
        }
        if (hy0.f(ll6) || !sg3.e(userInfo.factors, a42.w)) {
            hy0.o(ll6, 7, (zr3) nz3Arr[7].getValue(), userInfo.factors);
        }
        hy0.x(ll6, 8, userInfo.id);
        if (hy0.f(ll6) || userInfo.identities != null) {
            hy0.A(ll6, 9, (zr3) nz3Arr[9].getValue(), userInfo.identities);
        }
        if (hy0.f(ll6) || userInfo.lastSignInAt != null) {
            hy0.A(ll6, 10, wd3.a, userInfo.lastSignInAt);
        }
        if (hy0.f(ll6) || userInfo.phone != null) {
            hy0.A(ll6, 11, t47.a, userInfo.phone);
        }
        if (hy0.f(ll6) || userInfo.role != null) {
            hy0.A(ll6, 12, t47.a, userInfo.role);
        }
        if (hy0.f(ll6) || userInfo.updatedAt != null) {
            hy0.A(ll6, 13, wd3.a, userInfo.updatedAt);
        }
        if (hy0.f(ll6) || userInfo.userMetadata != null) {
            hy0.A(ll6, 14, xm3.a, userInfo.userMetadata);
        }
        if (hy0.f(ll6) || userInfo.phoneChangeSentAt != null) {
            hy0.A(ll6, 15, wd3.a, userInfo.phoneChangeSentAt);
        }
        if (hy0.f(ll6) || userInfo.newPhone != null) {
            hy0.A(ll6, 16, t47.a, userInfo.newPhone);
        }
        if (hy0.f(ll6) || userInfo.emailChangeSentAt != null) {
            hy0.A(ll6, 17, wd3.a, userInfo.emailChangeSentAt);
        }
        if (hy0.f(ll6) || userInfo.newEmail != null) {
            hy0.A(ll6, 18, t47.a, userInfo.newEmail);
        }
        if (hy0.f(ll6) || userInfo.invitedAt != null) {
            hy0.A(ll6, 19, wd3.a, userInfo.invitedAt);
        }
        if (hy0.f(ll6) || userInfo.recoverySentAt != null) {
            hy0.A(ll6, 20, wd3.a, userInfo.recoverySentAt);
        }
        if (hy0.f(ll6) || userInfo.phoneConfirmedAt != null) {
            hy0.A(ll6, 21, wd3.a, userInfo.phoneConfirmedAt);
        }
        if (hy0.f(ll6) || userInfo.actionLink != null) {
            hy0.A(ll6, 22, t47.a, userInfo.actionLink);
        }
        if (hy0.f(ll6) || userInfo.isAnonymous != null) {
            hy0.A(ll6, 23, ja0.a, userInfo.isAnonymous);
        }
        if (hy0.f(ll6) || userInfo.isSSOUser != null) {
            hy0.A(ll6, 24, ja0.a, userInfo.isSSOUser);
        }
        if (hy0.f(ll6) || userInfo.bannedUntil != null) {
            hy0.A(ll6, 25, wd3.a, userInfo.bannedUntil);
        }
        if (hy0.f(ll6) || userInfo.deletedAt != null) {
            hy0.A(ll6, 26, wd3.a, userInfo.deletedAt);
        }
    }

    public final JsonObject component1() {
        return this.appMetadata;
    }

    public final List<Identity> component10() {
        return this.identities;
    }

    public final qd3 component11() {
        return this.lastSignInAt;
    }

    public final String component12() {
        return this.phone;
    }

    public final String component13() {
        return this.role;
    }

    public final qd3 component14() {
        return this.updatedAt;
    }

    public final JsonObject component15() {
        return this.userMetadata;
    }

    public final qd3 component16() {
        return this.phoneChangeSentAt;
    }

    public final String component17() {
        return this.newPhone;
    }

    public final qd3 component18() {
        return this.emailChangeSentAt;
    }

    public final String component19() {
        return this.newEmail;
    }

    public final String component2() {
        return this.aud;
    }

    public final qd3 component20() {
        return this.invitedAt;
    }

    public final qd3 component21() {
        return this.recoverySentAt;
    }

    public final qd3 component22() {
        return this.phoneConfirmedAt;
    }

    public final String component23() {
        return this.actionLink;
    }

    public final Boolean component24() {
        return this.isAnonymous;
    }

    public final Boolean component25() {
        return this.isSSOUser;
    }

    public final qd3 component26() {
        return this.bannedUntil;
    }

    public final qd3 component27() {
        return this.deletedAt;
    }

    public final qd3 component3() {
        return this.confirmationSentAt;
    }

    public final qd3 component4() {
        return this.confirmedAt;
    }

    public final qd3 component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.email;
    }

    public final qd3 component7() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> component8() {
        return this.factors;
    }

    public final String component9() {
        return this.id;
    }

    public final UserInfo copy(JsonObject jsonObject, String str, qd3 qd3, qd3 qd32, qd3 qd33, String str2, qd3 qd34, List<UserMfaFactor> list, String str3, List<Identity> list2, qd3 qd35, String str4, String str5, qd3 qd36, JsonObject jsonObject2, qd3 qd37, String str6, qd3 qd38, String str7, qd3 qd39, qd3 qd310, qd3 qd311, String str8, Boolean bool, Boolean bool2, qd3 qd312, qd3 qd313) {
        str.getClass();
        list.getClass();
        str3.getClass();
        return new UserInfo(jsonObject, str, qd3, qd32, qd33, str2, qd34, list, str3, list2, qd35, str4, str5, qd36, jsonObject2, qd37, str6, qd38, str7, qd39, qd310, qd311, str8, bool, bool2, qd312, qd313);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        if (sg3.e(this.appMetadata, userInfo.appMetadata) && sg3.e(this.aud, userInfo.aud) && sg3.e(this.confirmationSentAt, userInfo.confirmationSentAt) && sg3.e(this.confirmedAt, userInfo.confirmedAt) && sg3.e(this.createdAt, userInfo.createdAt) && sg3.e(this.email, userInfo.email) && sg3.e(this.emailConfirmedAt, userInfo.emailConfirmedAt) && sg3.e(this.factors, userInfo.factors) && sg3.e(this.id, userInfo.id) && sg3.e(this.identities, userInfo.identities) && sg3.e(this.lastSignInAt, userInfo.lastSignInAt) && sg3.e(this.phone, userInfo.phone) && sg3.e(this.role, userInfo.role) && sg3.e(this.updatedAt, userInfo.updatedAt) && sg3.e(this.userMetadata, userInfo.userMetadata) && sg3.e(this.phoneChangeSentAt, userInfo.phoneChangeSentAt) && sg3.e(this.newPhone, userInfo.newPhone) && sg3.e(this.emailChangeSentAt, userInfo.emailChangeSentAt) && sg3.e(this.newEmail, userInfo.newEmail) && sg3.e(this.invitedAt, userInfo.invitedAt) && sg3.e(this.recoverySentAt, userInfo.recoverySentAt) && sg3.e(this.phoneConfirmedAt, userInfo.phoneConfirmedAt) && sg3.e(this.actionLink, userInfo.actionLink) && sg3.e(this.isAnonymous, userInfo.isAnonymous) && sg3.e(this.isSSOUser, userInfo.isSSOUser) && sg3.e(this.bannedUntil, userInfo.bannedUntil) && sg3.e(this.deletedAt, userInfo.deletedAt)) {
            return true;
        }
        return false;
    }

    public final String getActionLink() {
        return this.actionLink;
    }

    public final JsonObject getAppMetadata() {
        return this.appMetadata;
    }

    public final String getAud() {
        return this.aud;
    }

    public final qd3 getBannedUntil() {
        return this.bannedUntil;
    }

    public final qd3 getConfirmationSentAt() {
        return this.confirmationSentAt;
    }

    public final qd3 getConfirmedAt() {
        return this.confirmedAt;
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final qd3 getDeletedAt() {
        return this.deletedAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final qd3 getEmailChangeSentAt() {
        return this.emailChangeSentAt;
    }

    public final qd3 getEmailConfirmedAt() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> getFactors() {
        return this.factors;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Identity> getIdentities() {
        return this.identities;
    }

    public final qd3 getInvitedAt() {
        return this.invitedAt;
    }

    public final qd3 getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getNewEmail() {
        return this.newEmail;
    }

    public final String getNewPhone() {
        return this.newPhone;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final qd3 getPhoneChangeSentAt() {
        return this.phoneChangeSentAt;
    }

    public final qd3 getPhoneConfirmedAt() {
        return this.phoneConfirmedAt;
    }

    public final qd3 getRecoverySentAt() {
        return this.recoverySentAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public final JsonObject getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        JsonObject jsonObject = this.appMetadata;
        int i24 = 0;
        if (jsonObject == null) {
            i = 0;
        } else {
            i = jsonObject.hashCode();
        }
        int h = hl6.h(i * 31, 31, this.aud);
        qd3 qd3 = this.confirmationSentAt;
        if (qd3 == null) {
            i2 = 0;
        } else {
            i2 = qd3.hashCode();
        }
        int i25 = (h + i2) * 31;
        qd3 qd32 = this.confirmedAt;
        if (qd32 == null) {
            i3 = 0;
        } else {
            i3 = qd32.hashCode();
        }
        int i26 = (i25 + i3) * 31;
        qd3 qd33 = this.createdAt;
        if (qd33 == null) {
            i4 = 0;
        } else {
            i4 = qd33.hashCode();
        }
        int i27 = (i26 + i4) * 31;
        String str = this.email;
        if (str == null) {
            i5 = 0;
        } else {
            i5 = str.hashCode();
        }
        int i28 = (i27 + i5) * 31;
        qd3 qd34 = this.emailConfirmedAt;
        if (qd34 == null) {
            i6 = 0;
        } else {
            i6 = qd34.hashCode();
        }
        int h2 = hl6.h(hl6.j(this.factors, (i28 + i6) * 31, 31), 31, this.id);
        List<Identity> list = this.identities;
        if (list == null) {
            i7 = 0;
        } else {
            i7 = list.hashCode();
        }
        int i29 = (h2 + i7) * 31;
        qd3 qd35 = this.lastSignInAt;
        if (qd35 == null) {
            i8 = 0;
        } else {
            i8 = qd35.hashCode();
        }
        int i30 = (i29 + i8) * 31;
        String str2 = this.phone;
        if (str2 == null) {
            i9 = 0;
        } else {
            i9 = str2.hashCode();
        }
        int i31 = (i30 + i9) * 31;
        String str3 = this.role;
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = str3.hashCode();
        }
        int i32 = (i31 + i10) * 31;
        qd3 qd36 = this.updatedAt;
        if (qd36 == null) {
            i11 = 0;
        } else {
            i11 = qd36.hashCode();
        }
        int i33 = (i32 + i11) * 31;
        JsonObject jsonObject2 = this.userMetadata;
        if (jsonObject2 == null) {
            i12 = 0;
        } else {
            i12 = jsonObject2.hashCode();
        }
        int i34 = (i33 + i12) * 31;
        qd3 qd37 = this.phoneChangeSentAt;
        if (qd37 == null) {
            i13 = 0;
        } else {
            i13 = qd37.hashCode();
        }
        int i35 = (i34 + i13) * 31;
        String str4 = this.newPhone;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i36 = (i35 + i14) * 31;
        qd3 qd38 = this.emailChangeSentAt;
        if (qd38 == null) {
            i15 = 0;
        } else {
            i15 = qd38.hashCode();
        }
        int i37 = (i36 + i15) * 31;
        String str5 = this.newEmail;
        if (str5 == null) {
            i16 = 0;
        } else {
            i16 = str5.hashCode();
        }
        int i38 = (i37 + i16) * 31;
        qd3 qd39 = this.invitedAt;
        if (qd39 == null) {
            i17 = 0;
        } else {
            i17 = qd39.hashCode();
        }
        int i39 = (i38 + i17) * 31;
        qd3 qd310 = this.recoverySentAt;
        if (qd310 == null) {
            i18 = 0;
        } else {
            i18 = qd310.hashCode();
        }
        int i40 = (i39 + i18) * 31;
        qd3 qd311 = this.phoneConfirmedAt;
        if (qd311 == null) {
            i19 = 0;
        } else {
            i19 = qd311.hashCode();
        }
        int i41 = (i40 + i19) * 31;
        String str6 = this.actionLink;
        if (str6 == null) {
            i20 = 0;
        } else {
            i20 = str6.hashCode();
        }
        int i42 = (i41 + i20) * 31;
        Boolean bool = this.isAnonymous;
        if (bool == null) {
            i21 = 0;
        } else {
            i21 = bool.hashCode();
        }
        int i43 = (i42 + i21) * 31;
        Boolean bool2 = this.isSSOUser;
        if (bool2 == null) {
            i22 = 0;
        } else {
            i22 = bool2.hashCode();
        }
        int i44 = (i43 + i22) * 31;
        qd3 qd312 = this.bannedUntil;
        if (qd312 == null) {
            i23 = 0;
        } else {
            i23 = qd312.hashCode();
        }
        int i45 = (i44 + i23) * 31;
        qd3 qd313 = this.deletedAt;
        if (qd313 != null) {
            i24 = qd313.hashCode();
        }
        return i45 + i24;
    }

    public final Boolean isAnonymous() {
        return this.isAnonymous;
    }

    public final Boolean isSSOUser() {
        return this.isSSOUser;
    }

    public String toString() {
        return "UserInfo(appMetadata=" + this.appMetadata + ", aud=" + this.aud + ", confirmationSentAt=" + this.confirmationSentAt + ", confirmedAt=" + this.confirmedAt + ", createdAt=" + this.createdAt + ", email=" + this.email + ", emailConfirmedAt=" + this.emailConfirmedAt + ", factors=" + this.factors + ", id=" + this.id + ", identities=" + this.identities + ", lastSignInAt=" + this.lastSignInAt + ", phone=" + this.phone + ", role=" + this.role + ", updatedAt=" + this.updatedAt + ", userMetadata=" + this.userMetadata + ", phoneChangeSentAt=" + this.phoneChangeSentAt + ", newPhone=" + this.newPhone + ", emailChangeSentAt=" + this.emailChangeSentAt + ", newEmail=" + this.newEmail + ", invitedAt=" + this.invitedAt + ", recoverySentAt=" + this.recoverySentAt + ", phoneConfirmedAt=" + this.phoneConfirmedAt + ", actionLink=" + this.actionLink + ", isAnonymous=" + this.isAnonymous + ", isSSOUser=" + this.isSSOUser + ", bannedUntil=" + this.bannedUntil + ", deletedAt=" + this.deletedAt + ')';
    }

    public UserInfo(JsonObject jsonObject, String str, qd3 qd3, qd3 qd32, qd3 qd33, String str2, qd3 qd34, List<UserMfaFactor> list, String str3, List<Identity> list2, qd3 qd35, String str4, String str5, qd3 qd36, JsonObject jsonObject2, qd3 qd37, String str6, qd3 qd38, String str7, qd3 qd39, qd3 qd310, qd3 qd311, String str8, Boolean bool, Boolean bool2, qd3 qd312, qd3 qd313) {
        str.getClass();
        list.getClass();
        str3.getClass();
        this.appMetadata = jsonObject;
        this.aud = str;
        this.confirmationSentAt = qd3;
        this.confirmedAt = qd32;
        this.createdAt = qd33;
        this.email = str2;
        this.emailConfirmedAt = qd34;
        this.factors = list;
        this.id = str3;
        this.identities = list2;
        this.lastSignInAt = qd35;
        this.phone = str4;
        this.role = str5;
        this.updatedAt = qd36;
        this.userMetadata = jsonObject2;
        this.phoneChangeSentAt = qd37;
        this.newPhone = str6;
        this.emailChangeSentAt = qd38;
        this.newEmail = str7;
        this.invitedAt = qd39;
        this.recoverySentAt = qd310;
        this.phoneConfirmedAt = qd311;
        this.actionLink = str8;
        this.isAnonymous = bool;
        this.isSSOUser = bool2;
        this.bannedUntil = qd312;
        this.deletedAt = qd313;
    }

    public static /* synthetic */ void getActionLink$annotations() {
    }

    public static /* synthetic */ void getAppMetadata$annotations() {
    }

    public static /* synthetic */ void getAud$annotations() {
    }

    public static /* synthetic */ void getBannedUntil$annotations() {
    }

    public static /* synthetic */ void getConfirmationSentAt$annotations() {
    }

    public static /* synthetic */ void getConfirmedAt$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDeletedAt$annotations() {
    }

    public static /* synthetic */ void getEmail$annotations() {
    }

    public static /* synthetic */ void getEmailChangeSentAt$annotations() {
    }

    public static /* synthetic */ void getEmailConfirmedAt$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getIdentities$annotations() {
    }

    public static /* synthetic */ void getInvitedAt$annotations() {
    }

    public static /* synthetic */ void getLastSignInAt$annotations() {
    }

    public static /* synthetic */ void getNewEmail$annotations() {
    }

    public static /* synthetic */ void getNewPhone$annotations() {
    }

    public static /* synthetic */ void getPhone$annotations() {
    }

    public static /* synthetic */ void getPhoneChangeSentAt$annotations() {
    }

    public static /* synthetic */ void getPhoneConfirmedAt$annotations() {
    }

    public static /* synthetic */ void getRecoverySentAt$annotations() {
    }

    public static /* synthetic */ void getRole$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static /* synthetic */ void getUserMetadata$annotations() {
    }

    public static /* synthetic */ void isAnonymous$annotations() {
    }

    public static /* synthetic */ void isSSOUser$annotations() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ UserInfo(JsonObject jsonObject, String str, qd3 qd3, qd3 qd32, qd3 qd33, String str2, qd3 qd34, List list, String str3, List list2, qd3 qd35, String str4, String str5, qd3 qd36, JsonObject jsonObject2, qd3 qd37, String str6, qd3 qd38, String str7, qd3 qd39, qd3 qd310, qd3 qd311, String str8, Boolean bool, Boolean bool2, qd3 qd312, qd3 qd313, int i, hl1 hl1) {
        this((r0 & 1) != 0 ? null : jsonObject, str, (r0 & 4) != 0 ? null : qd3, (r0 & 8) != 0 ? null : qd32, (r0 & 16) != 0 ? null : qd33, (r0 & 32) != 0 ? null : str2, (r0 & 64) != 0 ? null : qd34, (r0 & 128) != 0 ? a42.w : list, str3, (r0 & 512) != 0 ? null : list2, (r0 & 1024) != 0 ? null : qd35, (r0 & 2048) != 0 ? null : str4, (r0 & 4096) != 0 ? null : str5, (r0 & 8192) != 0 ? null : qd36, (r0 & 16384) != 0 ? null : jsonObject2, (32768 & r0) != 0 ? null : qd37, (65536 & r0) != 0 ? null : str6, (131072 & r0) != 0 ? null : qd38, (262144 & r0) != 0 ? null : str7, (524288 & r0) != 0 ? null : qd39, (1048576 & r0) != 0 ? null : qd310, (2097152 & r0) != 0 ? null : qd311, (4194304 & r0) != 0 ? null : str8, (8388608 & r0) != 0 ? null : bool, (16777216 & r0) != 0 ? null : bool2, (33554432 & r0) != 0 ? null : qd312, (r0 & 67108864) != 0 ? null : qd313);
        int i2 = i;
    }
}
