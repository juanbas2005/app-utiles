.class public final Lrb2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lx72;


# instance fields
.field public final A:Ljava/lang/Object;

.field public w:J

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lpx5;Lbc7;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lrb2;->x:Ljava/lang/Object;

    .line 41
    iput-object p2, p0, Lrb2;->y:Ljava/lang/Object;

    const-wide/high16 p1, -0x8000000000000000L

    .line 42
    iput-wide p1, p0, Lrb2;->w:J

    .line 43
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 44
    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object p1, p0, Lrb2;->A:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lq09;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrb2;->A:Ljava/lang/Object;

    .line 5
    .line 6
    const-string p1, "health_monitor"

    .line 7
    .line 8
    invoke-static {p1}, Lz65;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p1, p2, v0

    .line 14
    .line 15
    if-lez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-static {p1}, Lz65;->f(Z)V

    .line 21
    .line 22
    .line 23
    const-string p1, "health_monitor:start"

    .line 24
    .line 25
    iput-object p1, p0, Lrb2;->x:Ljava/lang/Object;

    .line 26
    .line 27
    const-string p1, "health_monitor:count"

    .line 28
    .line 29
    iput-object p1, p0, Lrb2;->y:Ljava/lang/Object;

    .line 30
    .line 31
    const-string p1, "health_monitor:value"

    .line 32
    .line 33
    iput-object p1, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 34
    .line 35
    iput-wide p2, p0, Lrb2;->w:J

    .line 36
    .line 37
    return-void
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

.method public synthetic constructor <init>(Lv89;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb2;->A:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ly96;

    .line 23
    .line 24
    invoke-interface {v2}, Ly96;->cancel()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v2}, Ly96;->a()Ly96;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v3, p0, Lrb2;->x:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lpx5;

    .line 37
    .line 38
    iget-object v3, v3, Lpx5;->p:Las;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Las;->addLast(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
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

.method public b()Lx96;
    .locals 7

    .line 1
    iget-object v0, p0, Lrb2;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpx5;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lpx5;->a(Lex5;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Lpx5;->b()Ly96;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v2

    .line 18
    new-instance v3, Ljb2;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Ljb2;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v2, v3

    .line 24
    :goto_0
    invoke-interface {v2}, Ly96;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance p0, Lx96;

    .line 31
    .line 32
    const/4 v0, 0x6

    .line 33
    invoke-direct {p0, v2, v1, v0}, Lx96;-><init>(Ly96;Ljava/lang/Throwable;I)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    instance-of v3, v2, Ljb2;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v2, Ljb2;

    .line 42
    .line 43
    iget-object p0, v2, Ljb2;->a:Lx96;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    iget-object v3, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v4, Lfg8;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v4, " connect "

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Lpx5;->i:Lv9;

    .line 69
    .line 70
    iget-object v0, v0, Lv9;->h:Lg73;

    .line 71
    .line 72
    invoke-virtual {v0}, Lg73;->g()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v3, p0, Lrb2;->y:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lbc7;

    .line 86
    .line 87
    invoke-virtual {v3}, Lbc7;->d()Lac7;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    new-instance v4, Lqb2;

    .line 92
    .line 93
    invoke-direct {v4, v0, v2, p0}, Lqb2;-><init>(Ljava/lang/String;Ly96;Lrb2;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v5, 0x0

    .line 97
    .line 98
    invoke-virtual {v3, v4, v5, v6}, Lac7;->d(Lvb7;J)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-object v1
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

.method public c(JLh19;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lrb2;->y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lrb2;->y:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 28
    .line 29
    check-cast v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lh19;

    .line 47
    .line 48
    invoke-virtual {v0}, Lh19;->A()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    const-wide/16 v4, 0x3e8

    .line 53
    .line 54
    div-long/2addr v2, v4

    .line 55
    const-wide/16 v6, 0x3c

    .line 56
    .line 57
    div-long/2addr v2, v6

    .line 58
    div-long/2addr v2, v6

    .line 59
    invoke-virtual {p3}, Lh19;->A()J

    .line 60
    .line 61
    .line 62
    move-result-wide v8

    .line 63
    div-long/2addr v8, v4

    .line 64
    div-long/2addr v8, v6

    .line 65
    div-long/2addr v8, v6

    .line 66
    cmp-long v0, v2, v8

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_2
    iget-wide v2, p0, Lrb2;->w:J

    .line 73
    .line 74
    invoke-virtual {p3}, Lnl8;->m()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    int-to-long v4, v0

    .line 79
    add-long/2addr v2, v4

    .line 80
    iget-object v0, p0, Lrb2;->A:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lv89;

    .line 83
    .line 84
    invoke-virtual {v0}, Lv89;->c0()Ltp8;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    sget-object v5, Lby8;->Y0:Lay8;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-virtual {v4, v6, v5}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    iget-object v4, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 98
    .line 99
    check-cast v4, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-nez v4, :cond_4

    .line 106
    .line 107
    invoke-virtual {v0}, Lv89;->c0()Ltp8;

    .line 108
    .line 109
    .line 110
    sget-object v4, Lby8;->j:Lay8;

    .line 111
    .line 112
    invoke-virtual {v4, v6}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    int-to-long v4, v4

    .line 127
    cmp-long v4, v2, v4

    .line 128
    .line 129
    if-gez v4, :cond_6

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    invoke-virtual {v0}, Lv89;->c0()Ltp8;

    .line 133
    .line 134
    .line 135
    sget-object v4, Lby8;->j:Lay8;

    .line 136
    .line 137
    invoke-virtual {v4, v6}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    int-to-long v4, v4

    .line 152
    cmp-long v4, v2, v4

    .line 153
    .line 154
    if-ltz v4, :cond_4

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    :goto_0
    iput-wide v2, p0, Lrb2;->w:J

    .line 158
    .line 159
    iget-object v2, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 160
    .line 161
    check-cast v2, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    iget-object p3, p0, Lrb2;->y:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p3, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lrb2;->x:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Lb29;

    .line 180
    .line 181
    if-nez p1, :cond_5

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_5
    invoke-virtual {p1}, Lb29;->t()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    :goto_1
    iget-object p0, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 189
    .line 190
    check-cast p0, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-virtual {v0}, Lv89;->c0()Ltp8;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    sget-object p2, Lby8;->k:Lay8;

    .line 201
    .line 202
    invoke-virtual {p1, v6, p2}, Ltp8;->l1(Ljava/lang/String;Lay8;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    const/4 p2, 0x1

    .line 207
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-lt p0, p1, :cond_7

    .line 212
    .line 213
    :cond_6
    :goto_2
    return v1

    .line 214
    :cond_7
    return p2
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrb2;->A:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq09;

    .line 4
    .line 5
    invoke-virtual {v0}, Lin8;->b1()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ly19;

    .line 11
    .line 12
    iget-object v1, v1, Ly19;->G:Lxb4;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v3, p0, Lrb2;->y:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lrb2;->x:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {v0, p0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public f()Lex5;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, Lrb2;->x:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lpx5;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lpx5;->a(Lex5;)Z

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Lrb2;->a()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_2
    :goto_1
    :try_start_1
    iget-object v2, p0, Lrb2;->x:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lpx5;

    .line 37
    .line 38
    iget-object v2, v2, Lpx5;->k:Ldx5;

    .line 39
    .line 40
    iget-boolean v2, v2, Ldx5;->N:Z

    .line 41
    .line 42
    if-nez v2, :cond_f

    .line 43
    .line 44
    iget-object v2, p0, Lrb2;->y:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lbc7;

    .line 47
    .line 48
    iget-object v2, v2, Lbc7;->a:Lbr4;

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-wide v4, p0, Lrb2;->w:J

    .line 55
    .line 56
    sub-long/2addr v4, v2

    .line 57
    iget-object v6, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 58
    .line 59
    check-cast v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_4

    .line 66
    .line 67
    const-wide/16 v6, 0x0

    .line 68
    .line 69
    cmp-long v6, v4, v6

    .line 70
    .line 71
    if-gtz v6, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-wide v5, v4

    .line 75
    move-object v4, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lrb2;->b()Lx96;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const-wide/32 v5, 0xee6b280

    .line 82
    .line 83
    .line 84
    add-long/2addr v2, v5

    .line 85
    iput-wide v2, p0, Lrb2;->w:J

    .line 86
    .line 87
    :goto_3
    if-nez v4, :cond_7

    .line 88
    .line 89
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 90
    .line 91
    iget-object v3, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 92
    .line 93
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_5

    .line 100
    .line 101
    :goto_4
    move-object v4, v0

    .line 102
    goto :goto_5

    .line 103
    :cond_5
    iget-object v4, p0, Lrb2;->A:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v4, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 106
    .line 107
    invoke-virtual {v4, v5, v6, v2}, Ljava/util/concurrent/LinkedBlockingDeque;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lx96;

    .line 112
    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    iget-object v4, v2, Lx96;->a:Ly96;

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-object v4, v2

    .line 122
    :goto_5
    if-nez v4, :cond_7

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_7
    iget-object v2, v4, Lx96;->b:Ly96;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    const/4 v5, 0x1

    .line 129
    if-nez v2, :cond_8

    .line 130
    .line 131
    iget-object v2, v4, Lx96;->c:Ljava/lang/Throwable;

    .line 132
    .line 133
    if-nez v2, :cond_8

    .line 134
    .line 135
    move v2, v5

    .line 136
    goto :goto_6

    .line 137
    :cond_8
    move v2, v3

    .line 138
    :goto_6
    if-eqz v2, :cond_b

    .line 139
    .line 140
    invoke-virtual {p0}, Lrb2;->a()V

    .line 141
    .line 142
    .line 143
    iget-object v2, v4, Lx96;->a:Ly96;

    .line 144
    .line 145
    invoke-interface {v2}, Ly96;->c()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_9

    .line 150
    .line 151
    iget-object v2, v4, Lx96;->a:Ly96;

    .line 152
    .line 153
    invoke-interface {v2}, Ly96;->g()Lx96;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :cond_9
    iget-object v2, v4, Lx96;->b:Ly96;

    .line 158
    .line 159
    if-nez v2, :cond_a

    .line 160
    .line 161
    iget-object v2, v4, Lx96;->c:Ljava/lang/Throwable;

    .line 162
    .line 163
    if-nez v2, :cond_a

    .line 164
    .line 165
    move v3, v5

    .line 166
    :cond_a
    if-eqz v3, :cond_b

    .line 167
    .line 168
    iget-object v0, v4, Lx96;->a:Ly96;

    .line 169
    .line 170
    invoke-interface {v0}, Ly96;->b()Lex5;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    invoke-virtual {p0}, Lrb2;->a()V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_b
    :try_start_2
    iget-object v2, v4, Lx96;->c:Ljava/lang/Throwable;

    .line 179
    .line 180
    if-eqz v2, :cond_e

    .line 181
    .line 182
    instance-of v3, v2, Ljava/io/IOException;

    .line 183
    .line 184
    if-eqz v3, :cond_d

    .line 185
    .line 186
    if-nez v1, :cond_c

    .line 187
    .line 188
    check-cast v2, Ljava/io/IOException;

    .line 189
    .line 190
    move-object v1, v2

    .line 191
    goto :goto_7

    .line 192
    :cond_c
    invoke-static {v1, v2}, Lsu0;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_d
    throw v2

    .line 197
    :cond_e
    :goto_7
    iget-object v2, v4, Lx96;->b:Ly96;

    .line 198
    .line 199
    if-eqz v2, :cond_0

    .line 200
    .line 201
    iget-object v3, p0, Lrb2;->x:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v3, Lpx5;

    .line 204
    .line 205
    iget-object v3, v3, Lpx5;->p:Las;

    .line 206
    .line 207
    invoke-virtual {v3, v2}, Las;->addFirst(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 213
    .line 214
    const-string v1, "Canceled"

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 220
    :goto_8
    invoke-virtual {p0}, Lrb2;->a()V

    .line 221
    .line 222
    .line 223
    throw v0
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public h()Lpx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lrb2;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpx5;

    .line 4
    .line 5
    return-object p0
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
