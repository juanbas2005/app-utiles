.class public final synthetic Lg83;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lg83;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lg83;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg83;->a:Lg83;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.user.Identity"

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "identity_data"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "identity_id"

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "last_sign_in_at"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "updated_at"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "created_at"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "provider"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "user_id"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lg83;->descriptor:Lll6;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 7

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
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    new-array v4, v4, [Lzr3;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    aput-object p0, v4, v5

    .line 25
    .line 26
    sget-object v5, Lxm3;->a:Lxm3;

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    aput-object v5, v4, v6

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aput-object v0, v4, v5

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v1, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    aput-object v2, v4, v0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    aput-object v3, v4, v0

    .line 42
    .line 43
    const/4 v0, 0x6

    .line 44
    aput-object p0, v4, v0

    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    aput-object p0, v4, v0

    .line 48
    .line 49
    return-object v4
    .line 50
    .line 51
    .line 52
    .line 53
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
    .locals 17

    .line 1
    sget-object v0, Lg83;->descriptor:Lll6;

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
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v2

    .line 13
    move v7, v3

    .line 14
    move-object v8, v4

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    move-object v11, v10

    .line 18
    move-object v12, v11

    .line 19
    move-object v13, v12

    .line 20
    move-object v14, v13

    .line 21
    move-object v15, v14

    .line 22
    :goto_0
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    packed-switch v6, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, Lh;->e(I)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    const/4 v6, 0x7

    .line 36
    invoke-interface {v1, v0, v6}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v15

    .line 40
    or-int/lit16 v7, v7, 0x80

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_1
    const/4 v6, 0x6

    .line 44
    invoke-interface {v1, v0, v6}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    or-int/lit8 v7, v7, 0x40

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_2
    const/4 v6, 0x5

    .line 52
    sget-object v4, Lt47;->a:Lt47;

    .line 53
    .line 54
    invoke-interface {v1, v0, v6, v4, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v13, v4

    .line 59
    check-cast v13, Ljava/lang/String;

    .line 60
    .line 61
    or-int/lit8 v7, v7, 0x20

    .line 62
    .line 63
    :goto_1
    const/4 v4, 0x0

    .line 64
    goto :goto_0

    .line 65
    :pswitch_3
    sget-object v4, Lt47;->a:Lt47;

    .line 66
    .line 67
    const/4 v6, 0x4

    .line 68
    invoke-interface {v1, v0, v6, v4, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object v12, v4

    .line 73
    check-cast v12, Ljava/lang/String;

    .line 74
    .line 75
    or-int/lit8 v7, v7, 0x10

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_4
    const/4 v4, 0x3

    .line 79
    sget-object v6, Lt47;->a:Lt47;

    .line 80
    .line 81
    invoke-interface {v1, v0, v4, v6, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move-object v11, v4

    .line 86
    check-cast v11, Ljava/lang/String;

    .line 87
    .line 88
    or-int/lit8 v7, v7, 0x8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_5
    sget-object v4, Lt47;->a:Lt47;

    .line 92
    .line 93
    const/4 v6, 0x2

    .line 94
    invoke-interface {v1, v0, v6, v4, v10}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    move-object v10, v4

    .line 99
    check-cast v10, Ljava/lang/String;

    .line 100
    .line 101
    or-int/lit8 v7, v7, 0x4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_6
    sget-object v4, Lxm3;->a:Lxm3;

    .line 105
    .line 106
    invoke-interface {v1, v0, v2, v4, v9}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v9, v4

    .line 111
    check-cast v9, Lkotlinx/serialization/json/JsonObject;

    .line 112
    .line 113
    or-int/lit8 v7, v7, 0x2

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_7
    invoke-interface {v1, v0, v3}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    or-int/lit8 v7, v7, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :pswitch_8
    move v5, v3

    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Lio/github/jan/supabase/auth/user/Identity;

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    invoke-direct/range {v6 .. v16}, Lio/github/jan/supabase/auth/user/Identity;-><init>(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V

    .line 133
    .line 134
    .line 135
    return-object v6

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch -0x1
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
    sget-object p0, Lg83;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/auth/user/Identity;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lg83;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/user/Identity;->write$Self$auth_kt(Lio/github/jan/supabase/auth/user/Identity;Lhy0;Lll6;)V

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
