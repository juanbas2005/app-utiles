.class public final Ltx3;
.super Ln77;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lcf4;

.field public final b:Ljava/lang/String;

.field public final c:Lm25;

.field public final d:J

.field public final e:Ljava/util/List;

.field public final f:Lj43;


# direct methods
.method public constructor <init>(Lm77;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lm77;->f:Lcf4;

    .line 5
    .line 6
    const-string v1, " [Network]"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcf4;->b(Ljava/lang/String;)Lcf4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Ltx3;->a:Lcf4;

    .line 13
    .line 14
    const-string v1, "sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9"

    .line 15
    .line 16
    iput-object v1, p0, Ltx3;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p1, Lm77;->a:Ll77;

    .line 19
    .line 20
    iget-object v1, p1, Ll77;->g:Lm25;

    .line 21
    .line 22
    iput-object v1, p0, Ltx3;->c:Lm25;

    .line 23
    .line 24
    iget-object p1, p1, Ll77;->c:Lp77;

    .line 25
    .line 26
    iget-wide v1, p1, Lp77;->d:J

    .line 27
    .line 28
    iput-wide v1, p0, Ltx3;->d:J

    .line 29
    .line 30
    iget-object v3, p1, Lp77;->b:Lq43;

    .line 31
    .line 32
    iget-object p1, p1, Lp77;->c:Ljava/util/List;

    .line 33
    .line 34
    iput-object p1, p0, Ltx3;->e:Ljava/util/List;

    .line 35
    .line 36
    iget-object p1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lms3;

    .line 39
    .line 40
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    sget-object v4, Lub4;->w:Lub4;

    .line 45
    .line 46
    invoke-virtual {p1, v4}, Lms3;->a(Lub4;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v6, "Creating KtorSupabaseHttpClient with request timeout "

    .line 55
    .line 56
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lu02;->k(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", HttpClientEngine: "

    .line 67
    .line 68
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {p1, v4, v0, v2, v1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    if-eqz v3, :cond_1

    .line 83
    .line 84
    new-instance p1, Lj43;

    .line 85
    .line 86
    new-instance v0, Ln43;

    .line 87
    .line 88
    invoke-direct {v0}, Ln43;-><init>()V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Ltx3;->e:Ljava/util/List;

    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Ltx3;->b(Ln43;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {p1, v3, v0, v1}, Lj43;-><init>(Lq43;Ln43;Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    sget-object p1, Lx43;->a:Lb45;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance p1, Ln43;

    .line 107
    .line 108
    invoke-direct {p1}, Ln43;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Ltx3;->e:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p0, p1, v0}, Ltx3;->b(Ln43;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, Ln43;->f:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lvd2;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v1, Lh45;

    .line 124
    .line 125
    new-instance v2, Le45;

    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v3, Lot4;

    .line 131
    .line 132
    const/16 v4, 0x12

    .line 133
    .line 134
    invoke-direct {v3, v4}, Lot4;-><init>(I)V

    .line 135
    .line 136
    .line 137
    iput-object v3, v2, Le45;->a:Lot4;

    .line 138
    .line 139
    const/16 v3, 0xa

    .line 140
    .line 141
    iput v3, v2, Le45;->b:I

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Lvd2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-direct {v1, v2}, Lh45;-><init>(Le45;)V

    .line 147
    .line 148
    .line 149
    new-instance v0, Lj43;

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    invoke-direct {v0, v1, p1, v2}, Lj43;-><init>(Lq43;Ln43;Z)V

    .line 153
    .line 154
    .line 155
    move-object p1, v0

    .line 156
    :goto_0
    iput-object p1, p0, Ltx3;->f:Lj43;

    .line 157
    .line 158
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lsx3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lsx3;

    .line 7
    .line 8
    iget v1, v0, Lsx3;->D:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsx3;->D:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsx3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lsx3;-><init>(Ltx3;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lsx3;->B:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsx3;->D:I

    .line 28
    .line 29
    sget-object v2, Lub4;->w:Lub4;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const-string v4, " request to endpoint "

    .line 33
    .line 34
    iget-object v5, p0, Ltx3;->a:Lcf4;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lsx3;->A:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p2, v0, Lsx3;->z:Ly53;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/ktor/client/plugins/HttpRequestTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :catch_1
    move-exception p0

    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :catch_2
    move-exception p3

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance p3, Ly53;

    .line 68
    .line 69
    invoke-direct {p3}, Ly53;-><init>()V

    .line 70
    .line 71
    .line 72
    sget-object v1, La63;->a:Lau;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v1, p3, Ly53;->a:Lyr7;

    .line 78
    .line 79
    invoke-static {v1, p1}, Lzr7;->b(Lyr7;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2, p3}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lt35;->t(Lyr7;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v7, v5, Lcf4;->z:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v7, Lms3;

    .line 92
    .line 93
    iget-object v8, v5, Lcf4;->y:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v8, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v7, v2}, Lms3;->a(Lub4;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_3

    .line 102
    .line 103
    new-instance v9, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v10, "Starting "

    .line 106
    .line 107
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v10, p3, Ly53;->b:Li53;

    .line 111
    .line 112
    iget-object v10, v10, Li53;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v9, v10, v4, v1}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v7, v2, v8, v6, v9}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    :try_start_1
    iget-object v7, p0, Ltx3;->f:Lj43;

    .line 122
    .line 123
    new-instance v8, Ly53;

    .line 124
    .line 125
    invoke-direct {v8}, Ly53;-><init>()V

    .line 126
    .line 127
    .line 128
    iget-object v9, v8, Ly53;->a:Lyr7;

    .line 129
    .line 130
    invoke-static {v9, p1}, Lzr7;->b(Lyr7;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p2, v8}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    new-instance p1, Lhv2;

    .line 137
    .line 138
    invoke-direct {p1, v8, v7}, Lhv2;-><init>(Ly53;Lj43;)V

    .line 139
    .line 140
    .line 141
    iput-object p3, v0, Lsx3;->z:Ly53;

    .line 142
    .line 143
    iput-object v1, v0, Lsx3;->A:Ljava/lang/String;

    .line 144
    .line 145
    iput v3, v0, Lsx3;->D:I

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lhv2;->H0(Lh61;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1
    :try_end_1
    .catch Lio/ktor/client/plugins/HttpRequestTimeoutException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 151
    sget-object p2, Lp81;->w:Lp81;

    .line 152
    .line 153
    if-ne p1, p2, :cond_4

    .line 154
    .line 155
    return-object p2

    .line 156
    :cond_4
    move-object p2, p3

    .line 157
    move-object p3, p1

    .line 158
    move-object p1, v1

    .line 159
    :goto_1
    :try_start_2
    check-cast p3, Lyl1;
    :try_end_2
    .catch Lio/ktor/client/plugins/HttpRequestTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 160
    .line 161
    sget-object p0, Lu02;->x:Lxb4;

    .line 162
    .line 163
    invoke-virtual {p3}, Lyl1;->d()Lio/ktor/util/date/GMTDate;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Lio/ktor/util/date/GMTDate;->getTimestamp()J

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    invoke-virtual {p3}, Lyl1;->c()Lio/ktor/util/date/GMTDate;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0}, Lio/ktor/util/date/GMTDate;->getTimestamp()J

    .line 176
    .line 177
    .line 178
    move-result-wide v7

    .line 179
    sub-long/2addr v0, v7

    .line 180
    sget-object p0, Ly02;->y:Ly02;

    .line 181
    .line 182
    invoke-static {v0, v1, p0}, Lgl0;->f0(JLy02;)J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    iget-object p0, v5, Lcf4;->z:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, Lms3;

    .line 189
    .line 190
    iget-object v3, v5, Lcf4;->y:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p0, v2}, Lms3;->a(Lub4;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_5

    .line 199
    .line 200
    new-instance v5, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    iget-object p2, p2, Ly53;->b:Li53;

    .line 206
    .line 207
    iget-object p2, p2, Li53;->a:Ljava/lang/String;

    .line 208
    .line 209
    const-string v7, " successfully finished in "

    .line 210
    .line 211
    invoke-static {v5, p2, v4, p1, v7}, Lf21;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v1}, Lu02;->k(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p0, v2, v3, v6, p1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :cond_5
    return-object p3

    .line 229
    :catch_3
    move-exception p0

    .line 230
    move-object p2, p3

    .line 231
    move-object p1, v1

    .line 232
    goto :goto_2

    .line 233
    :catch_4
    move-exception p0

    .line 234
    move-object p2, p3

    .line 235
    move-object p1, v1

    .line 236
    goto :goto_3

    .line 237
    :catch_5
    move-exception p1

    .line 238
    move-object p2, p3

    .line 239
    move-object p3, p1

    .line 240
    move-object p1, v1

    .line 241
    goto/16 :goto_4

    .line 242
    .line 243
    :goto_2
    iget-object p3, v5, Lcf4;->z:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p3, Lms3;

    .line 246
    .line 247
    iget-object v0, v5, Lcf4;->y:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {p3, v2}, Lms3;->a(Lub4;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_6

    .line 256
    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    iget-object v3, p2, Ly53;->b:Li53;

    .line 263
    .line 264
    iget-object v3, v3, Li53;->a:Ljava/lang/String;

    .line 265
    .line 266
    const-string v5, " failed with exception "

    .line 267
    .line 268
    invoke-static {v1, v3, v4, p1, v5}, Lf21;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p3, v2, v0, p0, p1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_6
    new-instance p1, Lio/github/jan/supabase/exceptions/HttpRequestException;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    if-nez p0, :cond_7

    .line 292
    .line 293
    const-string p0, ""

    .line 294
    .line 295
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    new-instance p3, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v0, "HTTP request to "

    .line 301
    .line 302
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, p2, Ly53;->a:Lyr7;

    .line 306
    .line 307
    invoke-virtual {v0}, Lyr7;->c()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v0, " ("

    .line 315
    .line 316
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    iget-object p2, p2, Ly53;->b:Li53;

    .line 320
    .line 321
    iget-object p2, p2, Li53;->a:Ljava/lang/String;

    .line 322
    .line 323
    const-string v0, ") failed with message: "

    .line 324
    .line 325
    invoke-static {p3, p2, v0, p0}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p1

    .line 333
    :goto_3
    iget-object p3, v5, Lcf4;->z:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p3, Lms3;

    .line 336
    .line 337
    iget-object v0, v5, Lcf4;->y:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {p3, v2}, Lms3;->a(Lub4;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_8

    .line 346
    .line 347
    new-instance v1, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    iget-object p2, p2, Ly53;->b:Li53;

    .line 353
    .line 354
    iget-object p2, p2, Li53;->a:Ljava/lang/String;

    .line 355
    .line 356
    const-string v3, " was cancelled"

    .line 357
    .line 358
    invoke-static {v1, p2, v4, p1, v3}, Lpb4;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {p3, v2, v0, p0, p1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_8
    throw p0

    .line 366
    :goto_4
    iget-object v0, v5, Lcf4;->z:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Lms3;

    .line 369
    .line 370
    iget-object v1, v5, Lcf4;->y:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v1, Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {v0, v2}, Lms3;->a(Lub4;)Z

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    if-eqz v3, :cond_9

    .line 379
    .line 380
    new-instance v3, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    iget-object p2, p2, Ly53;->b:Li53;

    .line 386
    .line 387
    iget-object p2, p2, Li53;->a:Ljava/lang/String;

    .line 388
    .line 389
    const-string v5, " timed out after "

    .line 390
    .line 391
    invoke-static {v3, p2, v4, p1, v5}, Lf21;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget-wide p0, p0, Ltx3;->d:J

    .line 395
    .line 396
    invoke-static {p0, p1}, Lu02;->k(J)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-virtual {v0, v2, v1, p3, p0}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    :cond_9
    throw p3
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
.end method

.method public final b(Ln43;Ljava/util/List;)V
    .locals 3

    .line 1
    sget-object v0, Lzm1;->b:Ltd0;

    .line 2
    .line 3
    new-instance v1, Lrx3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lrx3;-><init>(Ltx3;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Ln43;->b(Ly43;Lvr2;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lf51;->d:Lwr0;

    .line 13
    .line 14
    new-instance v1, Ltm3;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2}, Ltm3;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ln43;->b(Ly43;Lvr2;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, La73;->b:Lwr0;

    .line 24
    .line 25
    new-instance v1, Lrx3;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, p0, v2}, Lrx3;-><init>(Ltx3;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Ln43;->b(Ly43;Lvr2;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Lvr2;

    .line 49
    .line 50
    invoke-interface {p2, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
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
    .line 64
    .line 65
    .line 66
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
.end method
