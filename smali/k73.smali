.class public final synthetic Lk73;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lk73;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lk73;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk73;->a:Lk73;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.providers.builtin.IDToken.Config"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "gotrue_meta_security"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "id_token"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "provider"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "access_token"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "nonce"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "link_identity"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "data"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lk73;->descriptor:Lll6;

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
    .locals 7

    .line 1
    sget-object p0, Lxk0;->a:Lxk0;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lt47;->a:Lt47;

    .line 8
    .line 9
    sget-object v1, Lio/github/jan/supabase/auth/providers/IDTokenProvider;->Companion:Ln73;

    .line 10
    .line 11
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Lxm3;->a:Lxm3;

    .line 24
    .line 25
    invoke-static {v4}, Lhj8;->x(Lzr3;)Lzr3;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x7

    .line 30
    new-array v5, v5, [Lzr3;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    aput-object p0, v5, v6

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    aput-object v0, v5, p0

    .line 37
    .line 38
    const/4 p0, 0x2

    .line 39
    aput-object v1, v5, p0

    .line 40
    .line 41
    const/4 p0, 0x3

    .line 42
    aput-object v2, v5, p0

    .line 43
    .line 44
    const/4 p0, 0x4

    .line 45
    aput-object v3, v5, p0

    .line 46
    .line 47
    sget-object p0, Lja0;->a:Lja0;

    .line 48
    .line 49
    const/4 v0, 0x5

    .line 50
    aput-object p0, v5, v0

    .line 51
    .line 52
    const/4 p0, 0x6

    .line 53
    aput-object v4, v5, p0

    .line 54
    .line 55
    return-object v5
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
    .locals 14

    .line 1
    sget-object p0, Lk73;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v5, v1

    .line 12
    move v11, v5

    .line 13
    move-object v6, v2

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    move-object v9, v8

    .line 17
    move-object v10, v9

    .line 18
    move-object v12, v10

    .line 19
    :goto_0
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    packed-switch v4, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, Lh;->e(I)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_0
    const/4 v4, 0x6

    .line 33
    sget-object v13, Lxm3;->a:Lxm3;

    .line 34
    .line 35
    invoke-interface {p1, p0, v4, v13, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    move-object v12, v4

    .line 40
    check-cast v12, Lkotlinx/serialization/json/JsonObject;

    .line 41
    .line 42
    or-int/lit8 v5, v5, 0x40

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    const/4 v4, 0x5

    .line 46
    invoke-interface {p1, p0, v4}, Lgy0;->z(Lll6;I)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    or-int/lit8 v5, v5, 0x20

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    sget-object v4, Lt47;->a:Lt47;

    .line 54
    .line 55
    const/4 v13, 0x4

    .line 56
    invoke-interface {p1, p0, v13, v4, v10}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object v10, v4

    .line 61
    check-cast v10, Ljava/lang/String;

    .line 62
    .line 63
    or-int/lit8 v5, v5, 0x10

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    const/4 v4, 0x3

    .line 67
    sget-object v13, Lt47;->a:Lt47;

    .line 68
    .line 69
    invoke-interface {p1, p0, v4, v13, v9}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move-object v9, v4

    .line 74
    check-cast v9, Ljava/lang/String;

    .line 75
    .line 76
    or-int/lit8 v5, v5, 0x8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    sget-object v4, Lio/github/jan/supabase/auth/providers/IDTokenProvider;->Companion:Ln73;

    .line 80
    .line 81
    const/4 v13, 0x2

    .line 82
    invoke-interface {p1, p0, v13, v4, v8}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    move-object v8, v4

    .line 87
    check-cast v8, Lio/github/jan/supabase/auth/providers/IDTokenProvider;

    .line 88
    .line 89
    or-int/lit8 v5, v5, 0x4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_5
    invoke-interface {p1, p0, v0}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    or-int/lit8 v5, v5, 0x2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_6
    sget-object v4, Lxk0;->a:Lxk0;

    .line 100
    .line 101
    invoke-interface {p1, p0, v1, v4, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    move-object v6, v4

    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    or-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_7
    move v3, v1

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    invoke-direct/range {v4 .. v13}, Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;-><init>(ILjava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/JsonObject;Lrl6;)V

    .line 120
    .line 121
    .line 122
    return-object v4

    .line 123
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
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lk73;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lk73;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;->write$Self$auth_kt(Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;Lhy0;Lll6;)V

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
