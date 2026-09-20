.class public final synthetic Ley7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Ley7;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ley7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ley7;->a:Ley7;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.user.UserSession"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "access_token"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "refresh_token"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "provider_refresh_token"

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "provider_token"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "expires_in"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "token_type"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "user"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "type"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "expiresAt"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Ley7;->descriptor:Lll6;

    .line 65
    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 5

    .line 1
    sget-object p0, Lt47;->a:Lt47;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lzu7;->a:Lzu7;

    .line 12
    .line 13
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/16 v3, 0x9

    .line 18
    .line 19
    new-array v3, v3, [Lzr3;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object p0, v3, v4

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    aput-object p0, v3, v4

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    aput-object v0, v3, v4

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    aput-object v1, v3, v0

    .line 32
    .line 33
    sget-object v0, Ltc4;->a:Ltc4;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    aput-object v0, v3, v1

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    aput-object p0, v3, v0

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    aput-object v2, v3, v0

    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    aput-object p0, v3, v0

    .line 46
    .line 47
    sget-object p0, Lwd3;->a:Lwd3;

    .line 48
    .line 49
    const/16 v0, 0x8

    .line 50
    .line 51
    aput-object p0, v3, v0

    .line 52
    .line 53
    return-object v3
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 20

    .line 1
    sget-object v0, Ley7;->descriptor:Lll6;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    move-object v7, v4

    .line 14
    move-object v9, v7

    .line 15
    move-object v10, v9

    .line 16
    move-object v11, v10

    .line 17
    move-object v12, v11

    .line 18
    move-object v15, v12

    .line 19
    move-object/from16 v17, v15

    .line 20
    .line 21
    move-wide v13, v5

    .line 22
    const/4 v8, 0x0

    .line 23
    move v5, v2

    .line 24
    move-object/from16 v6, v17

    .line 25
    .line 26
    :goto_0
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 29
    .line 30
    .line 31
    move-result v16

    .line 32
    packed-switch v16, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v16 .. v16}, Lh;->e(I)V

    .line 36
    .line 37
    .line 38
    return-object v4

    .line 39
    :pswitch_0
    sget-object v4, Lwd3;->a:Lwd3;

    .line 40
    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    invoke-interface {v1, v0, v3, v4, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v7, v3

    .line 48
    check-cast v7, Lqd3;

    .line 49
    .line 50
    or-int/lit16 v8, v8, 0x100

    .line 51
    .line 52
    :goto_1
    const/4 v4, 0x0

    .line 53
    goto :goto_0

    .line 54
    :pswitch_1
    const/4 v3, 0x7

    .line 55
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v17

    .line 59
    or-int/lit16 v8, v8, 0x80

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_2
    const/4 v3, 0x6

    .line 63
    sget-object v4, Lzu7;->a:Lzu7;

    .line 64
    .line 65
    invoke-interface {v1, v0, v3, v4, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v6, v3

    .line 70
    check-cast v6, Lio/github/jan/supabase/auth/user/UserInfo;

    .line 71
    .line 72
    or-int/lit8 v8, v8, 0x40

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_3
    const/4 v3, 0x5

    .line 76
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    or-int/lit8 v8, v8, 0x20

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_4
    const/4 v3, 0x4

    .line 84
    invoke-interface {v1, v0, v3}, Lgy0;->D(Lll6;I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v13

    .line 88
    or-int/lit8 v8, v8, 0x10

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_5
    const/4 v3, 0x3

    .line 92
    sget-object v4, Lt47;->a:Lt47;

    .line 93
    .line 94
    invoke-interface {v1, v0, v3, v4, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    move-object v12, v3

    .line 99
    check-cast v12, Ljava/lang/String;

    .line 100
    .line 101
    or-int/lit8 v8, v8, 0x8

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_6
    sget-object v3, Lt47;->a:Lt47;

    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    invoke-interface {v1, v0, v4, v3, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    move-object v11, v3

    .line 112
    check-cast v11, Ljava/lang/String;

    .line 113
    .line 114
    or-int/lit8 v8, v8, 0x4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_7
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    or-int/lit8 v8, v8, 0x2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_8
    const/4 v3, 0x0

    .line 125
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    or-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_9
    const/4 v3, 0x0

    .line 133
    move v5, v3

    .line 134
    goto :goto_0

    .line 135
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v18, v7

    .line 139
    .line 140
    new-instance v7, Lio/github/jan/supabase/auth/user/UserSession;

    .line 141
    .line 142
    const/16 v19, 0x0

    .line 143
    .line 144
    move-object/from16 v16, v6

    .line 145
    .line 146
    invoke-direct/range {v7 .. v19}, Lio/github/jan/supabase/auth/user/UserSession;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lqd3;Lrl6;)V

    .line 147
    .line 148
    .line 149
    return-object v7

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Ley7;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/github/jan/supabase/auth/user/UserSession;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ley7;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/user/UserSession;->write$Self$auth_kt(Lio/github/jan/supabase/auth/user/UserSession;Lhy0;Lll6;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
