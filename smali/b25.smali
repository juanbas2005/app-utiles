.class public final synthetic Lb25;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lb25;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lb25;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb25;->a:Lb25;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.admin.oauth.OAuthClient"

    .line 11
    .line 12
    const/16 v3, 0xe

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "client_id"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "client_secret"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "client_name"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "client_type"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "client_uri"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "logo_uri"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "redirect_uris"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "grant_types"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "response_types"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "scope"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "token_endpoint_auth_method"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "registration_type"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "created_at"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "updated_at"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    sput-object v1, Lb25;->descriptor:Lll6;

    .line 90
    .line 91
    return-void
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
    .locals 4

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0xe

    .line 6
    .line 7
    new-array v0, v0, [Lzr3;

    .line 8
    .line 9
    sget-object v1, Lt47;->a:Lt47;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    aput-object v3, v0, v2

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    aget-object v3, p0, v2

    .line 26
    .line 27
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lzr3;

    .line 32
    .line 33
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    aput-object v3, v0, v2

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aput-object v3, v0, v2

    .line 45
    .line 46
    const/4 v2, 0x5

    .line 47
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    aput-object v3, v0, v2

    .line 52
    .line 53
    const/4 v2, 0x6

    .line 54
    aget-object v3, p0, v2

    .line 55
    .line 56
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    aput-object v3, v0, v2

    .line 61
    .line 62
    const/4 v2, 0x7

    .line 63
    aget-object v3, p0, v2

    .line 64
    .line 65
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    aput-object v3, v0, v2

    .line 70
    .line 71
    const/16 v2, 0x8

    .line 72
    .line 73
    aget-object v3, p0, v2

    .line 74
    .line 75
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    aput-object v3, v0, v2

    .line 80
    .line 81
    const/16 v2, 0x9

    .line 82
    .line 83
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    aput-object v3, v0, v2

    .line 88
    .line 89
    const/16 v2, 0xa

    .line 90
    .line 91
    aget-object v3, p0, v2

    .line 92
    .line 93
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lzr3;

    .line 98
    .line 99
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    aput-object v3, v0, v2

    .line 104
    .line 105
    const/16 v2, 0xb

    .line 106
    .line 107
    aget-object p0, p0, v2

    .line 108
    .line 109
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Lzr3;

    .line 114
    .line 115
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    aput-object p0, v0, v2

    .line 120
    .line 121
    const/16 p0, 0xc

    .line 122
    .line 123
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    aput-object v2, v0, p0

    .line 128
    .line 129
    const/16 p0, 0xd

    .line 130
    .line 131
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    aput-object v1, v0, p0

    .line 136
    .line 137
    return-object v0
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
    .locals 24

    .line 1
    sget-object v0, Lb25;->descriptor:Lll6;

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
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->access$get$childSerializers$cp()[Lnz3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object/from16 v17, v2

    .line 14
    .line 15
    const/16 p0, 0x0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    const/16 v18, 0x1

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    :goto_0
    if-eqz v18, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 38
    .line 39
    .line 40
    move-result v20

    .line 41
    packed-switch v20, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v20 .. v20}, Lh;->e(I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    move-object/from16 v20, v11

    .line 49
    .line 50
    const/16 v11, 0xd

    .line 51
    .line 52
    move-object/from16 v21, v10

    .line 53
    .line 54
    sget-object v10, Lt47;->a:Lt47;

    .line 55
    .line 56
    invoke-interface {v1, v0, v11, v10, v9}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Ljava/lang/String;

    .line 61
    .line 62
    or-int/lit16 v8, v8, 0x2000

    .line 63
    .line 64
    :goto_1
    move-object/from16 v11, v20

    .line 65
    .line 66
    :goto_2
    move-object/from16 v10, v21

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_1
    move-object/from16 v21, v10

    .line 70
    .line 71
    move-object/from16 v20, v11

    .line 72
    .line 73
    const/16 v10, 0xc

    .line 74
    .line 75
    sget-object v11, Lt47;->a:Lt47;

    .line 76
    .line 77
    invoke-interface {v1, v0, v10, v11, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/lang/String;

    .line 82
    .line 83
    or-int/lit16 v8, v8, 0x1000

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :pswitch_2
    move-object/from16 v21, v10

    .line 87
    .line 88
    move-object/from16 v20, v11

    .line 89
    .line 90
    const/16 v10, 0xb

    .line 91
    .line 92
    aget-object v11, v17, v10

    .line 93
    .line 94
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    check-cast v11, Lzr3;

    .line 99
    .line 100
    invoke-interface {v1, v0, v10, v11, v2}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;

    .line 105
    .line 106
    or-int/lit16 v8, v8, 0x800

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_3
    move-object/from16 v21, v10

    .line 110
    .line 111
    move-object/from16 v20, v11

    .line 112
    .line 113
    const/16 v10, 0xa

    .line 114
    .line 115
    aget-object v11, v17, v10

    .line 116
    .line 117
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, Lzr3;

    .line 122
    .line 123
    invoke-interface {v1, v0, v10, v11, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;

    .line 128
    .line 129
    or-int/lit16 v8, v8, 0x400

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_4
    move-object/from16 v21, v10

    .line 133
    .line 134
    move-object/from16 v20, v11

    .line 135
    .line 136
    const/16 v10, 0x9

    .line 137
    .line 138
    sget-object v11, Lt47;->a:Lt47;

    .line 139
    .line 140
    invoke-interface {v1, v0, v10, v11, v4}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/lang/String;

    .line 145
    .line 146
    or-int/lit16 v8, v8, 0x200

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :pswitch_5
    move-object/from16 v21, v10

    .line 150
    .line 151
    move-object/from16 v20, v11

    .line 152
    .line 153
    const/16 v10, 0x8

    .line 154
    .line 155
    aget-object v11, v17, v10

    .line 156
    .line 157
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    check-cast v11, Lzr3;

    .line 162
    .line 163
    invoke-interface {v1, v0, v10, v11, v5}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    check-cast v5, Ljava/util/List;

    .line 168
    .line 169
    or-int/lit16 v8, v8, 0x100

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_6
    move-object/from16 v21, v10

    .line 173
    .line 174
    move-object/from16 v20, v11

    .line 175
    .line 176
    const/4 v10, 0x7

    .line 177
    aget-object v11, v17, v10

    .line 178
    .line 179
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    check-cast v11, Lzr3;

    .line 184
    .line 185
    invoke-interface {v1, v0, v10, v11, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Ljava/util/List;

    .line 190
    .line 191
    or-int/lit16 v8, v8, 0x80

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :pswitch_7
    move-object/from16 v21, v10

    .line 196
    .line 197
    move-object/from16 v20, v11

    .line 198
    .line 199
    const/4 v10, 0x6

    .line 200
    aget-object v11, v17, v10

    .line 201
    .line 202
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    check-cast v11, Lzr3;

    .line 207
    .line 208
    invoke-interface {v1, v0, v10, v11, v15}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    move-object v15, v10

    .line 213
    check-cast v15, Ljava/util/List;

    .line 214
    .line 215
    or-int/lit8 v8, v8, 0x40

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :pswitch_8
    move-object/from16 v21, v10

    .line 220
    .line 221
    move-object/from16 v20, v11

    .line 222
    .line 223
    const/4 v10, 0x5

    .line 224
    sget-object v11, Lt47;->a:Lt47;

    .line 225
    .line 226
    invoke-interface {v1, v0, v10, v11, v14}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    move-object v14, v10

    .line 231
    check-cast v14, Ljava/lang/String;

    .line 232
    .line 233
    or-int/lit8 v8, v8, 0x20

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :pswitch_9
    move-object/from16 v21, v10

    .line 238
    .line 239
    move-object/from16 v20, v11

    .line 240
    .line 241
    sget-object v10, Lt47;->a:Lt47;

    .line 242
    .line 243
    const/4 v11, 0x4

    .line 244
    invoke-interface {v1, v0, v11, v10, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    move-object v13, v10

    .line 249
    check-cast v13, Ljava/lang/String;

    .line 250
    .line 251
    or-int/lit8 v8, v8, 0x10

    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :pswitch_a
    move-object/from16 v21, v10

    .line 256
    .line 257
    move-object/from16 v20, v11

    .line 258
    .line 259
    const/4 v10, 0x3

    .line 260
    aget-object v11, v17, v10

    .line 261
    .line 262
    invoke-interface {v11}, Lnz3;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    check-cast v11, Lzr3;

    .line 267
    .line 268
    invoke-interface {v1, v0, v10, v11, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    move-object v12, v10

    .line 273
    check-cast v12, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;

    .line 274
    .line 275
    or-int/lit8 v8, v8, 0x8

    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :pswitch_b
    move-object/from16 v21, v10

    .line 280
    .line 281
    const/4 v10, 0x2

    .line 282
    invoke-interface {v1, v0, v10}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    or-int/lit8 v8, v8, 0x4

    .line 287
    .line 288
    goto/16 :goto_2

    .line 289
    .line 290
    :pswitch_c
    move-object/from16 v21, v10

    .line 291
    .line 292
    move-object/from16 v20, v11

    .line 293
    .line 294
    sget-object v10, Lt47;->a:Lt47;

    .line 295
    .line 296
    move-object/from16 v16, v2

    .line 297
    .line 298
    move-object/from16 v11, v21

    .line 299
    .line 300
    const/4 v2, 0x1

    .line 301
    invoke-interface {v1, v0, v2, v10, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    check-cast v10, Ljava/lang/String;

    .line 306
    .line 307
    or-int/lit8 v8, v8, 0x2

    .line 308
    .line 309
    :goto_3
    move-object/from16 v2, v16

    .line 310
    .line 311
    move-object/from16 v11, v20

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :pswitch_d
    move-object/from16 v16, v2

    .line 316
    .line 317
    move-object/from16 v20, v11

    .line 318
    .line 319
    const/4 v2, 0x1

    .line 320
    move-object v11, v10

    .line 321
    const/4 v10, 0x0

    .line 322
    invoke-interface {v1, v0, v10}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v19

    .line 326
    or-int/lit8 v8, v8, 0x1

    .line 327
    .line 328
    :goto_4
    move-object v10, v11

    .line 329
    goto :goto_3

    .line 330
    :pswitch_e
    move-object/from16 v16, v2

    .line 331
    .line 332
    move-object/from16 v20, v11

    .line 333
    .line 334
    const/4 v2, 0x1

    .line 335
    move-object v11, v10

    .line 336
    const/4 v10, 0x0

    .line 337
    move/from16 v18, v10

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_0
    move-object/from16 v16, v2

    .line 341
    .line 342
    move-object/from16 v20, v11

    .line 343
    .line 344
    move-object v11, v10

    .line 345
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 346
    .line 347
    .line 348
    move-object/from16 v21, v11

    .line 349
    .line 350
    move-object/from16 v11, v20

    .line 351
    .line 352
    move-object/from16 v20, v16

    .line 353
    .line 354
    move-object/from16 v16, v7

    .line 355
    .line 356
    new-instance v7, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 357
    .line 358
    const/16 v23, 0x0

    .line 359
    .line 360
    move-object/from16 v18, v4

    .line 361
    .line 362
    move-object/from16 v17, v5

    .line 363
    .line 364
    move-object/from16 v22, v9

    .line 365
    .line 366
    move-object/from16 v9, v19

    .line 367
    .line 368
    move-object/from16 v10, v21

    .line 369
    .line 370
    move-object/from16 v19, v3

    .line 371
    .line 372
    move-object/from16 v21, v6

    .line 373
    .line 374
    invoke-direct/range {v7 .. v23}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientRegistrationType;Ljava/lang/String;Ljava/lang/String;Lrl6;)V

    .line 375
    .line 376
    .line 377
    return-object v7

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lb25;->descriptor:Lll6;

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
    check-cast p2, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lb25;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;->write$Self$auth_kt(Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;Lhy0;Lll6;)V

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
