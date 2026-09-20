.class public final synthetic Lcb1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lcb1;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcb1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcb1;->a:Lcb1;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.admin.oauth.CreateOAuthClientBuilder"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "client_name"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "redirect_uris"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "client_uri"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "grant_types"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "response_types"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "scope"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "token_endpoint_auth_method"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lcb1;->descriptor:Lll6;

    .line 53
    .line 54
    return-void
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


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 4

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x7

    .line 6
    new-array v0, v0, [Lzr3;

    .line 7
    .line 8
    sget-object v1, Lt47;->a:Lt47;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    aput-object v3, v0, v2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    aput-object v3, v0, v2

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    aget-object v3, p0, v2

    .line 31
    .line 32
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lzr3;

    .line 37
    .line 38
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    aput-object v3, v0, v2

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    aget-object v3, p0, v2

    .line 46
    .line 47
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lzr3;

    .line 52
    .line 53
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    aput-object v3, v0, v2

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    const/4 v1, 0x6

    .line 67
    aget-object p0, p0, v1

    .line 68
    .line 69
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lzr3;

    .line 74
    .line 75
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    aput-object p0, v0, v1

    .line 80
    .line 81
    return-object v0
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

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, Lcb1;->descriptor:Lll6;

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
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;->access$get$childSerializers$cp()[Lnz3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move v6, v3

    .line 17
    move v8, v4

    .line 18
    move-object v9, v5

    .line 19
    move-object v10, v9

    .line 20
    move-object v11, v10

    .line 21
    move-object v12, v11

    .line 22
    move-object v13, v12

    .line 23
    move-object v14, v13

    .line 24
    move-object v15, v14

    .line 25
    :goto_0
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    packed-switch v7, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    invoke-static {v7}, Lh;->e(I)V

    .line 35
    .line 36
    .line 37
    return-object v5

    .line 38
    :pswitch_0
    const/4 v7, 0x6

    .line 39
    aget-object v16, v2, v7

    .line 40
    .line 41
    invoke-interface/range {v16 .. v16}, Lnz3;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v16

    .line 45
    move-object/from16 v5, v16

    .line 46
    .line 47
    check-cast v5, Lzr3;

    .line 48
    .line 49
    invoke-interface {v1, v0, v7, v5, v15}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    move-object v15, v5

    .line 54
    check-cast v15, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 55
    .line 56
    or-int/lit8 v8, v8, 0x40

    .line 57
    .line 58
    :goto_1
    const/4 v5, 0x0

    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    const/4 v5, 0x5

    .line 61
    sget-object v7, Lt47;->a:Lt47;

    .line 62
    .line 63
    invoke-interface {v1, v0, v5, v7, v14}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    move-object v14, v5

    .line 68
    check-cast v14, Ljava/lang/String;

    .line 69
    .line 70
    or-int/lit8 v8, v8, 0x20

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_2
    const/4 v5, 0x4

    .line 74
    aget-object v7, v2, v5

    .line 75
    .line 76
    invoke-interface {v7}, Lnz3;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lzr3;

    .line 81
    .line 82
    invoke-interface {v1, v0, v5, v7, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    move-object v13, v5

    .line 87
    check-cast v13, Ljava/util/List;

    .line 88
    .line 89
    or-int/lit8 v8, v8, 0x10

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :pswitch_3
    const/4 v5, 0x3

    .line 93
    aget-object v7, v2, v5

    .line 94
    .line 95
    invoke-interface {v7}, Lnz3;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, Lzr3;

    .line 100
    .line 101
    invoke-interface {v1, v0, v5, v7, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v12, v5

    .line 106
    check-cast v12, Ljava/util/List;

    .line 107
    .line 108
    or-int/lit8 v8, v8, 0x8

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_4
    sget-object v5, Lt47;->a:Lt47;

    .line 112
    .line 113
    const/4 v7, 0x2

    .line 114
    invoke-interface {v1, v0, v7, v5, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object v11, v5

    .line 119
    check-cast v11, Ljava/lang/String;

    .line 120
    .line 121
    or-int/lit8 v8, v8, 0x4

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_5
    aget-object v5, v2, v3

    .line 125
    .line 126
    invoke-interface {v5}, Lnz3;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lzr3;

    .line 131
    .line 132
    invoke-interface {v1, v0, v3, v5, v10}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    move-object v10, v5

    .line 137
    check-cast v10, Ljava/util/List;

    .line 138
    .line 139
    or-int/lit8 v8, v8, 0x2

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_6
    invoke-interface {v1, v0, v4}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    or-int/lit8 v8, v8, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :pswitch_7
    move v6, v4

    .line 150
    goto :goto_0

    .line 151
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 152
    .line 153
    .line 154
    new-instance v7, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;

    .line 155
    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    invoke-direct/range {v7 .. v16}, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lrl6;)V

    .line 159
    .line 160
    .line 161
    return-object v7

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lcb1;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lcb1;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;->write$Self$auth_kt(Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;Lhy0;Lll6;)V

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
