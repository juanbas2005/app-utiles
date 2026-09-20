.class public abstract Lz42;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lbc4;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lz42;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method public static a(Lcd8;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcd8;->a:Lnd8;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcd8;->e:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcd8;->b(Lcd8;)Ljava/util/HashSet;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, Lcd8;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    :goto_0
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v1, v0, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 50
    .line 51
    iget-object v2, v0, Lnd8;->b:Lf01;

    .line 52
    .line 53
    invoke-virtual {v1}, La96;->b()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-static {v1, v2, p0}, Lmp7;->R(Landroidx/work/impl/WorkDatabase;Lf01;Lcd8;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lz42;->b(Lcd8;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-virtual {v1}, La96;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, La96;->f()V

    .line 67
    .line 68
    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    iget-object p0, v0, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 72
    .line 73
    iget-object v0, v0, Lnd8;->e:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v2, p0, v0}, Lmg6;->b(Lf01;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    invoke-virtual {v1}, La96;->f()V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_3
    const-string v0, "WorkContinuation has cycles ("

    .line 85
    .line 86
    const-string v1, ")"

    .line 87
    .line 88
    invoke-static {p0, v1, v0}, Lrf2;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
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
.end method

.method public static b(Lcd8;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lcd8;->b(Lcd8;)Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lcd8;->a:Lnd8;

    .line 8
    .line 9
    iget-object v3, v0, Lcd8;->d:Ljava/util/List;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    new-array v5, v4, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, v0, Lcd8;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, v0, Lcd8;->c:Lw82;

    .line 23
    .line 24
    iget-object v7, v2, Lnd8;->b:Lf01;

    .line 25
    .line 26
    iget-object v7, v7, Lf01;->d:Lz53;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    iget-object v9, v2, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    array-length v11, v1

    .line 40
    if-lez v11, :cond_0

    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v11, v4

    .line 45
    :goto_0
    sget-object v12, Lkd8;->y:Lkd8;

    .line 46
    .line 47
    sget-object v13, Lkd8;->B:Lkd8;

    .line 48
    .line 49
    sget-object v14, Lkd8;->z:Lkd8;

    .line 50
    .line 51
    if-eqz v11, :cond_7

    .line 52
    .line 53
    array-length v15, v1

    .line 54
    move/from16 v16, v4

    .line 55
    .line 56
    move/from16 v17, v16

    .line 57
    .line 58
    const/16 v18, 0x1

    .line 59
    .line 60
    :goto_1
    if-ge v4, v15, :cond_6

    .line 61
    .line 62
    aget-object v10, v1, v4

    .line 63
    .line 64
    move-object/from16 v19, v3

    .line 65
    .line 66
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3, v10}, Lfe8;->e(Ljava/lang/String;)Lbe8;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "Prerequisite "

    .line 83
    .line 84
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v3, " doesn\'t exist; not enqueuing"

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget-object v3, Lz42;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1, v3, v2}, Lbc4;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    :goto_2
    const/4 v4, 0x0

    .line 105
    const/4 v10, 0x1

    .line 106
    goto/16 :goto_13

    .line 107
    .line 108
    :cond_2
    iget-object v3, v3, Lbe8;->b:Lkd8;

    .line 109
    .line 110
    if-ne v3, v12, :cond_3

    .line 111
    .line 112
    const/4 v10, 0x1

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    const/4 v10, 0x0

    .line 115
    :goto_3
    and-int v18, v18, v10

    .line 116
    .line 117
    if-ne v3, v14, :cond_4

    .line 118
    .line 119
    const/16 v17, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    if-ne v3, v13, :cond_5

    .line 123
    .line 124
    const/16 v16, 0x1

    .line 125
    .line 126
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    move-object/from16 v3, v19

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    :goto_5
    move-object/from16 v19, v3

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x1

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :goto_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    sget-object v4, Lkd8;->w:Lkd8;

    .line 146
    .line 147
    if-nez v3, :cond_16

    .line 148
    .line 149
    if-nez v11, :cond_16

    .line 150
    .line 151
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v10, v5}, Lfe8;->f(Ljava/lang/String;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    if-nez v15, :cond_16

    .line 164
    .line 165
    sget-object v15, Lw82;->y:Lw82;

    .line 166
    .line 167
    move/from16 v20, v3

    .line 168
    .line 169
    sget-object v3, Lw82;->z:Lw82;

    .line 170
    .line 171
    if-eq v6, v15, :cond_c

    .line 172
    .line 173
    if-ne v6, v3, :cond_8

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_8
    sget-object v3, Lw82;->x:Lw82;

    .line 177
    .line 178
    if-ne v6, v3, :cond_a

    .line 179
    .line 180
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_a

    .line 189
    .line 190
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    check-cast v6, Lzd8;

    .line 195
    .line 196
    iget-object v6, v6, Lzd8;->b:Lkd8;

    .line 197
    .line 198
    if-eq v6, v4, :cond_1

    .line 199
    .line 200
    sget-object v12, Lkd8;->x:Lkd8;

    .line 201
    .line 202
    if-ne v6, v12, :cond_9

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    new-instance v3, Lti;

    .line 209
    .line 210
    const/4 v6, 0x1

    .line 211
    invoke-direct {v3, v9, v5, v2, v6}, Lti;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    new-instance v6, Lhx4;

    .line 215
    .line 216
    const/16 v12, 0xd

    .line 217
    .line 218
    invoke-direct {v6, v12, v3}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9, v6}, La96;->o(Lsr2;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_b

    .line 237
    .line 238
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    check-cast v10, Lzd8;

    .line 243
    .line 244
    iget-object v10, v10, Lzd8;->a:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v3, v10}, Lfe8;->c(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    move-object/from16 v24, v2

    .line 251
    .line 252
    move-object/from16 v22, v9

    .line 253
    .line 254
    const/4 v0, 0x1

    .line 255
    goto/16 :goto_e

    .line 256
    .line 257
    :cond_c
    :goto_8
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->r()Lcq1;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    new-instance v15, Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v21

    .line 274
    if-eqz v21, :cond_11

    .line 275
    .line 276
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v21

    .line 280
    move-object/from16 v22, v9

    .line 281
    .line 282
    move-object/from16 v9, v21

    .line 283
    .line 284
    check-cast v9, Lzd8;

    .line 285
    .line 286
    move-object/from16 v21, v10

    .line 287
    .line 288
    iget-object v10, v9, Lzd8;->a:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget-object v0, v11, Lcq1;->a:La96;

    .line 297
    .line 298
    move-object/from16 v23, v11

    .line 299
    .line 300
    new-instance v11, Lcb;

    .line 301
    .line 302
    move-object/from16 v24, v2

    .line 303
    .line 304
    const/16 v2, 0x8

    .line 305
    .line 306
    invoke-direct {v11, v10, v2}, Lcb;-><init>(Ljava/lang/String;I)V

    .line 307
    .line 308
    .line 309
    const/4 v2, 0x0

    .line 310
    const/4 v10, 0x1

    .line 311
    invoke-static {v0, v10, v2, v11}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_10

    .line 322
    .line 323
    iget-object v0, v9, Lzd8;->b:Lkd8;

    .line 324
    .line 325
    if-ne v0, v12, :cond_d

    .line 326
    .line 327
    const/4 v2, 0x1

    .line 328
    goto :goto_a

    .line 329
    :cond_d
    const/4 v2, 0x0

    .line 330
    :goto_a
    and-int v2, v18, v2

    .line 331
    .line 332
    if-ne v0, v14, :cond_e

    .line 333
    .line 334
    const/16 v17, 0x1

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_e
    if-ne v0, v13, :cond_f

    .line 338
    .line 339
    const/16 v16, 0x1

    .line 340
    .line 341
    :cond_f
    :goto_b
    iget-object v0, v9, Lzd8;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move/from16 v18, v2

    .line 347
    .line 348
    :cond_10
    move-object/from16 v0, p0

    .line 349
    .line 350
    move-object/from16 v10, v21

    .line 351
    .line 352
    move-object/from16 v9, v22

    .line 353
    .line 354
    move-object/from16 v11, v23

    .line 355
    .line 356
    move-object/from16 v2, v24

    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_11
    move-object/from16 v24, v2

    .line 360
    .line 361
    move-object/from16 v22, v9

    .line 362
    .line 363
    if-ne v6, v3, :cond_14

    .line 364
    .line 365
    if-nez v16, :cond_12

    .line 366
    .line 367
    if-eqz v17, :cond_14

    .line 368
    .line 369
    :cond_12
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0, v5}, Lfe8;->f(Ljava/lang/String;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_13

    .line 386
    .line 387
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v3, Lzd8;

    .line 392
    .line 393
    iget-object v3, v3, Lzd8;->a:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v0, v3}, Lfe8;->c(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_13
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 400
    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    :cond_14
    invoke-interface {v15, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    move-object v1, v0

    .line 410
    check-cast v1, [Ljava/lang/String;

    .line 411
    .line 412
    array-length v0, v1

    .line 413
    if-lez v0, :cond_15

    .line 414
    .line 415
    const/4 v11, 0x1

    .line 416
    goto :goto_d

    .line 417
    :cond_15
    const/4 v11, 0x0

    .line 418
    :goto_d
    const/4 v0, 0x0

    .line 419
    goto :goto_e

    .line 420
    :cond_16
    move-object/from16 v24, v2

    .line 421
    .line 422
    move/from16 v20, v3

    .line 423
    .line 424
    move-object/from16 v22, v9

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :goto_e
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    move v6, v0

    .line 432
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_1d

    .line 437
    .line 438
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, Lxd8;

    .line 443
    .line 444
    iget-object v3, v0, Lxd8;->b:Lbe8;

    .line 445
    .line 446
    iget-object v9, v0, Lxd8;->a:Ljava/util/UUID;

    .line 447
    .line 448
    if-eqz v11, :cond_19

    .line 449
    .line 450
    if-nez v18, :cond_19

    .line 451
    .line 452
    if-eqz v17, :cond_17

    .line 453
    .line 454
    iput-object v14, v3, Lbe8;->b:Lkd8;

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_17
    if-eqz v16, :cond_18

    .line 458
    .line 459
    iput-object v13, v3, Lbe8;->b:Lkd8;

    .line 460
    .line 461
    goto :goto_10

    .line 462
    :cond_18
    sget-object v10, Lkd8;->A:Lkd8;

    .line 463
    .line 464
    iput-object v10, v3, Lbe8;->b:Lkd8;

    .line 465
    .line 466
    goto :goto_10

    .line 467
    :cond_19
    iput-wide v7, v3, Lbe8;->n:J

    .line 468
    .line 469
    :goto_10
    iget-object v10, v3, Lbe8;->b:Lkd8;

    .line 470
    .line 471
    if-ne v10, v4, :cond_1a

    .line 472
    .line 473
    const/4 v6, 0x1

    .line 474
    :cond_1a
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    move-object/from16 v12, v24

    .line 479
    .line 480
    iget-object v15, v12, Lnd8;->e:Ljava/util/List;

    .line 481
    .line 482
    invoke-static {v15, v3}, Lmp7;->o0(Ljava/util/List;Lbe8;)Lbe8;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    iget-object v15, v10, Lfe8;->a:La96;

    .line 490
    .line 491
    move-object/from16 v19, v2

    .line 492
    .line 493
    new-instance v2, Lde8;

    .line 494
    .line 495
    move-object/from16 v21, v4

    .line 496
    .line 497
    const/4 v4, 0x0

    .line 498
    invoke-direct {v2, v10, v3, v4}, Lde8;-><init>(Lfe8;Lbe8;I)V

    .line 499
    .line 500
    .line 501
    const/4 v10, 0x1

    .line 502
    invoke-static {v15, v4, v10, v2}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    if-eqz v11, :cond_1b

    .line 506
    .line 507
    array-length v2, v1

    .line 508
    const/4 v3, 0x0

    .line 509
    :goto_11
    if-ge v3, v2, :cond_1b

    .line 510
    .line 511
    aget-object v4, v1, v3

    .line 512
    .line 513
    new-instance v10, Lyp1;

    .line 514
    .line 515
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v15

    .line 519
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-direct {v10, v15, v4}, Lyp1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->r()Lcq1;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    iget-object v15, v4, Lcq1;->a:La96;

    .line 533
    .line 534
    move-object/from16 v23, v1

    .line 535
    .line 536
    new-instance v1, Lm0;

    .line 537
    .line 538
    move/from16 v24, v2

    .line 539
    .line 540
    const/16 v2, 0x10

    .line 541
    .line 542
    invoke-direct {v1, v2, v4, v10}, Lm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    const/4 v10, 0x1

    .line 547
    invoke-static {v15, v2, v10, v1}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    add-int/lit8 v3, v3, 0x1

    .line 551
    .line 552
    move-object/from16 v1, v23

    .line 553
    .line 554
    move/from16 v2, v24

    .line 555
    .line 556
    goto :goto_11

    .line 557
    :cond_1b
    move-object/from16 v23, v1

    .line 558
    .line 559
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->x()Lhe8;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    iget-object v0, v0, Lxd8;->c:Ljava/util/Set;

    .line 571
    .line 572
    invoke-virtual {v1, v2, v0}, Lhe8;->a(Ljava/lang/String;Ljava/util/Set;)V

    .line 573
    .line 574
    .line 575
    if-nez v20, :cond_1c

    .line 576
    .line 577
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->u()Ltd8;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    new-instance v1, Lrd8;

    .line 582
    .line 583
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-direct {v1, v5, v2}, Lrd8;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object v2, v0, Ltd8;->a:La96;

    .line 597
    .line 598
    new-instance v3, Lk77;

    .line 599
    .line 600
    const/16 v4, 0x14

    .line 601
    .line 602
    invoke-direct {v3, v4, v0, v1}, Lk77;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    const/4 v4, 0x0

    .line 606
    const/4 v10, 0x1

    .line 607
    invoke-static {v2, v4, v10, v3}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    goto :goto_12

    .line 611
    :cond_1c
    const/4 v4, 0x0

    .line 612
    const/4 v10, 0x1

    .line 613
    :goto_12
    move-object/from16 v24, v12

    .line 614
    .line 615
    move-object/from16 v2, v19

    .line 616
    .line 617
    move-object/from16 v4, v21

    .line 618
    .line 619
    move-object/from16 v1, v23

    .line 620
    .line 621
    goto/16 :goto_f

    .line 622
    .line 623
    :cond_1d
    const/4 v10, 0x1

    .line 624
    move-object/from16 v0, p0

    .line 625
    .line 626
    move v4, v6

    .line 627
    :goto_13
    iput-boolean v10, v0, Lcd8;->g:Z

    .line 628
    .line 629
    return v4
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method
