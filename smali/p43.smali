.class public final Lp43;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public C:Ljava/lang/Object;

.field public synthetic D:Ljava/lang/Object;

.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj43;Lq43;Lf61;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp43;->A:I

    .line 15
    iput-object p1, p0, Lp43;->F:Ljava/lang/Object;

    iput-object p2, p0, Lp43;->G:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La97;-><init>(ILf61;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lf61;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lp43;->A:I

    .line 3
    .line 4
    iput-object p1, p0, Lp43;->E:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lp43;->F:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lp43;->G:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-direct {p0, p1, p4}, La97;-><init>(ILf61;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp43;->A:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lp81;->w:Lp81;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, Lp43;->F:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, Lp43;->G:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v6, Ljava/lang/Long;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/Long;

    .line 22
    .line 23
    iget-object v1, v0, Lp43;->E:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Long;

    .line 26
    .line 27
    iget-object v9, v0, Lp43;->C:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v9, Lwk6;

    .line 30
    .line 31
    iget-object v10, v0, Lp43;->D:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v13, v10

    .line 34
    check-cast v13, Ly53;

    .line 35
    .line 36
    iget v10, v0, Lp43;->B:I

    .line 37
    .line 38
    if-eqz v10, :cond_1

    .line 39
    .line 40
    if-ne v10, v4, :cond_0

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_0
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v8

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v2, La73;->a:Lcc4;

    .line 59
    .line 60
    iget-object v2, v13, Ly53;->a:Lyr7;

    .line 61
    .line 62
    invoke-virtual {v2}, Lyr7;->d()Las7;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v2, v2, Las7;->w:Ljava/lang/String;

    .line 70
    .line 71
    const-string v8, "ws"

    .line 72
    .line 73
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-nez v8, :cond_3

    .line 78
    .line 79
    const-string v8, "wss"

    .line 80
    .line 81
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move v2, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    :goto_0
    const/4 v2, 0x0

    .line 91
    :goto_1
    iget-object v8, v13, Ly53;->f:Liz0;

    .line 92
    .line 93
    sget-object v10, Lu43;->a:Lau;

    .line 94
    .line 95
    invoke-virtual {v8, v10}, Liz0;->d(Lau;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    check-cast v8, Ljava/util/Map;

    .line 100
    .line 101
    const/4 v15, 0x0

    .line 102
    if-eqz v8, :cond_4

    .line 103
    .line 104
    sget-object v10, Lx63;->a:Lx63;

    .line 105
    .line 106
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move-object v8, v15

    .line 112
    :goto_2
    check-cast v8, Ly63;

    .line 113
    .line 114
    if-nez v8, :cond_7

    .line 115
    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    if-nez v1, :cond_6

    .line 119
    .line 120
    :cond_5
    if-nez v5, :cond_6

    .line 121
    .line 122
    if-eqz v6, :cond_7

    .line 123
    .line 124
    :cond_6
    new-instance v8, Ly63;

    .line 125
    .line 126
    invoke-direct {v8}, Ly63;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v13, v8}, Ly53;->c(Ly63;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    if-eqz v8, :cond_c

    .line 133
    .line 134
    iget-object v10, v8, Ly63;->b:Ljava/lang/Long;

    .line 135
    .line 136
    if-nez v10, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    move-object v5, v10

    .line 140
    :goto_3
    invoke-static {v5}, Ly63;->a(Ljava/lang/Long;)V

    .line 141
    .line 142
    .line 143
    iput-object v5, v8, Ly63;->b:Ljava/lang/Long;

    .line 144
    .line 145
    iget-object v5, v8, Ly63;->c:Ljava/lang/Long;

    .line 146
    .line 147
    if-nez v5, :cond_9

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    move-object v6, v5

    .line 151
    :goto_4
    invoke-static {v6}, Ly63;->a(Ljava/lang/Long;)V

    .line 152
    .line 153
    .line 154
    iput-object v6, v8, Ly63;->c:Ljava/lang/Long;

    .line 155
    .line 156
    if-eqz v2, :cond_c

    .line 157
    .line 158
    iget-object v2, v8, Ly63;->a:Ljava/lang/Long;

    .line 159
    .line 160
    if-nez v2, :cond_a

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    move-object v1, v2

    .line 164
    :goto_5
    invoke-virtual {v8, v1}, Ly63;->b(Ljava/lang/Long;)V

    .line 165
    .line 166
    .line 167
    iget-object v12, v8, Ly63;->a:Ljava/lang/Long;

    .line 168
    .line 169
    if-eqz v12, :cond_c

    .line 170
    .line 171
    const-wide v1, 0x7fffffffffffffffL

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 177
    .line 178
    .line 179
    move-result-wide v5

    .line 180
    cmp-long v1, v5, v1

    .line 181
    .line 182
    if-nez v1, :cond_b

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_b
    iget-object v14, v13, Ly53;->e:Lw77;

    .line 186
    .line 187
    new-instance v1, Lk81;

    .line 188
    .line 189
    const-string v2, "request-timeout"

    .line 190
    .line 191
    invoke-direct {v1, v2}, Lk81;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance v11, Lp0;

    .line 195
    .line 196
    const/16 v16, 0x1c

    .line 197
    .line 198
    invoke-direct/range {v11 .. v16}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v9, v1, v15, v11, v7}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v2, v13, Ly53;->e:Lw77;

    .line 206
    .line 207
    new-instance v5, Lh43;

    .line 208
    .line 209
    const/4 v6, 0x5

    .line 210
    invoke-direct {v5, v6, v1}, Lh43;-><init>(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v5}, Lll3;->v(Lvr2;)Lmw1;

    .line 214
    .line 215
    .line 216
    :cond_c
    :goto_6
    iput-object v15, v0, Lp43;->C:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v15, v0, Lp43;->D:Ljava/lang/Object;

    .line 219
    .line 220
    iput v4, v0, Lp43;->B:I

    .line 221
    .line 222
    iget-object v1, v9, Lwk6;->w:Lyk6;

    .line 223
    .line 224
    invoke-interface {v1, v13, v0}, Lyk6;->a(Ly53;Lh61;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v3, :cond_d

    .line 229
    .line 230
    move-object v0, v3

    .line 231
    :cond_d
    :goto_7
    return-object v0

    .line 232
    :pswitch_0
    check-cast v6, Lq43;

    .line 233
    .line 234
    check-cast v5, Lj43;

    .line 235
    .line 236
    iget-object v1, v5, Lj43;->E:Lf96;

    .line 237
    .line 238
    iget-object v9, v0, Lp43;->D:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v9, Lyg5;

    .line 241
    .line 242
    iget-object v10, v0, Lp43;->E:Ljava/lang/Object;

    .line 243
    .line 244
    iget v11, v0, Lp43;->B:I

    .line 245
    .line 246
    if-eqz v11, :cond_10

    .line 247
    .line 248
    if-eq v11, v4, :cond_f

    .line 249
    .line 250
    if-ne v11, v7, :cond_e

    .line 251
    .line 252
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_10

    .line 256
    .line 257
    :cond_e
    invoke-static {v2}, Lh;->s(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_8
    move-object v3, v8

    .line 261
    goto/16 :goto_11

    .line 262
    .line 263
    :cond_f
    iget-object v2, v0, Lp43;->C:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v2, Lmd2;

    .line 266
    .line 267
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    move-object v11, v2

    .line 271
    move-object/from16 v2, p1

    .line 272
    .line 273
    goto/16 :goto_f

    .line 274
    .line 275
    :cond_10
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    new-instance v2, Ly53;

    .line 279
    .line 280
    invoke-direct {v2}, Ly53;-><init>()V

    .line 281
    .line 282
    .line 283
    iget-object v11, v9, Lyg5;->w:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v11, Ly53;

    .line 286
    .line 287
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object v12, v11, Ly53;->e:Lw77;

    .line 291
    .line 292
    iput-object v12, v2, Ly53;->e:Lw77;

    .line 293
    .line 294
    invoke-virtual {v2, v11}, Ly53;->e(Ly53;)V

    .line 295
    .line 296
    .line 297
    const-class v11, Ljava/lang/Object;

    .line 298
    .line 299
    if-nez v10, :cond_11

    .line 300
    .line 301
    sget-object v10, Lm15;->a:Lm15;

    .line 302
    .line 303
    iput-object v10, v2, Ly53;->d:Ljava/lang/Object;

    .line 304
    .line 305
    sget-object v10, Lb26;->a:Lc26;

    .line 306
    .line 307
    invoke-virtual {v10, v11}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    :try_start_0
    invoke-static {v11}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 312
    .line 313
    .line 314
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    goto :goto_9

    .line 316
    :catchall_0
    move-object v11, v8

    .line 317
    :goto_9
    new-instance v12, Lfp7;

    .line 318
    .line 319
    invoke-direct {v12, v10, v11}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v12}, Ly53;->b(Lfp7;)V

    .line 323
    .line 324
    .line 325
    goto :goto_b

    .line 326
    :cond_11
    instance-of v12, v10, Lj85;

    .line 327
    .line 328
    if-eqz v12, :cond_12

    .line 329
    .line 330
    iput-object v10, v2, Ly53;->d:Ljava/lang/Object;

    .line 331
    .line 332
    invoke-virtual {v2, v8}, Ly53;->b(Lfp7;)V

    .line 333
    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_12
    iput-object v10, v2, Ly53;->d:Ljava/lang/Object;

    .line 337
    .line 338
    sget-object v10, Lb26;->a:Lc26;

    .line 339
    .line 340
    invoke-virtual {v10, v11}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    :try_start_1
    invoke-static {v11}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 345
    .line 346
    .line 347
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 348
    goto :goto_a

    .line 349
    :catchall_1
    move-object v11, v8

    .line 350
    :goto_a
    new-instance v12, Lfp7;

    .line 351
    .line 352
    invoke-direct {v12, v10, v11}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v12}, Ly53;->b(Lfp7;)V

    .line 356
    .line 357
    .line 358
    :goto_b
    sget-object v10, Lqr0;->b:Lxb4;

    .line 359
    .line 360
    invoke-virtual {v1, v10}, Lf96;->D(Lxb4;)V

    .line 361
    .line 362
    .line 363
    new-instance v11, Lmd2;

    .line 364
    .line 365
    iget-object v10, v2, Ly53;->a:Lyr7;

    .line 366
    .line 367
    invoke-virtual {v10}, Lyr7;->b()Lio/ktor/http/Url;

    .line 368
    .line 369
    .line 370
    move-result-object v12

    .line 371
    iget-object v13, v2, Ly53;->b:Li53;

    .line 372
    .line 373
    iget-object v10, v2, Ly53;->c:Ldz2;

    .line 374
    .line 375
    invoke-virtual {v10}, Ldz2;->d1()Lgz2;

    .line 376
    .line 377
    .line 378
    move-result-object v14

    .line 379
    iget-object v10, v2, Ly53;->d:Ljava/lang/Object;

    .line 380
    .line 381
    instance-of v15, v10, Lj85;

    .line 382
    .line 383
    if-eqz v15, :cond_13

    .line 384
    .line 385
    check-cast v10, Lj85;

    .line 386
    .line 387
    move-object v15, v10

    .line 388
    goto :goto_c

    .line 389
    :cond_13
    move-object v15, v8

    .line 390
    :goto_c
    if-eqz v15, :cond_1c

    .line 391
    .line 392
    iget-object v10, v2, Ly53;->e:Lw77;

    .line 393
    .line 394
    iget-object v2, v2, Ly53;->f:Liz0;

    .line 395
    .line 396
    move-object/from16 v17, v2

    .line 397
    .line 398
    move-object/from16 v16, v10

    .line 399
    .line 400
    invoke-direct/range {v11 .. v17}, Lmd2;-><init>(Lio/ktor/http/Url;Li53;Lgz2;Lj85;Lel3;Liz0;)V

    .line 401
    .line 402
    .line 403
    sget-object v10, Lw43;->b:Lau;

    .line 404
    .line 405
    iget-object v12, v5, Lj43;->F:Ln43;

    .line 406
    .line 407
    invoke-virtual {v2, v10, v12}, Liz0;->e(Lau;Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v14}, Lb57;->names()Ljava/util/Set;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    check-cast v2, Ljava/lang/Iterable;

    .line 415
    .line 416
    new-instance v10, Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    :cond_14
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    if-eqz v12, :cond_15

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    move-object v13, v12

    .line 436
    check-cast v13, Ljava/lang/String;

    .line 437
    .line 438
    sget-object v14, Lb53;->a:Ljava/util/List;

    .line 439
    .line 440
    invoke-interface {v14, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_14

    .line 445
    .line 446
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    goto :goto_d

    .line 450
    :cond_15
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    if-eqz v2, :cond_1b

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    iget-object v2, v11, Lmd2;->h:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v2, Ljava/util/Set;

    .line 462
    .line 463
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    if-eqz v10, :cond_17

    .line 472
    .line 473
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    check-cast v10, Lt43;

    .line 478
    .line 479
    invoke-interface {v6}, Lq43;->A()Ljava/util/Set;

    .line 480
    .line 481
    .line 482
    move-result-object v12

    .line 483
    invoke-interface {v12, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v12

    .line 487
    if-eqz v12, :cond_16

    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_16
    const-string v0, "Engine doesn\'t support "

    .line 491
    .line 492
    invoke-static {v0, v10}, Lrf2;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_8

    .line 496
    .line 497
    :cond_17
    iput-object v9, v0, Lp43;->D:Ljava/lang/Object;

    .line 498
    .line 499
    iput-object v8, v0, Lp43;->E:Ljava/lang/Object;

    .line 500
    .line 501
    iput-object v11, v0, Lp43;->C:Ljava/lang/Object;

    .line 502
    .line 503
    iput v4, v0, Lp43;->B:I

    .line 504
    .line 505
    invoke-static {v6, v11, v0}, Lq43;->O(Lq43;Lmd2;Lh61;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    if-ne v2, v3, :cond_18

    .line 510
    .line 511
    goto/16 :goto_11

    .line 512
    .line 513
    :cond_18
    :goto_f
    check-cast v2, Li63;

    .line 514
    .line 515
    new-instance v4, Ll43;

    .line 516
    .line 517
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-direct {v4, v5}, Ll43;-><init>(Lj43;)V

    .line 524
    .line 525
    .line 526
    new-instance v6, Lxl1;

    .line 527
    .line 528
    invoke-direct {v6, v4, v11}, Lxl1;-><init>(Ll43;Lmd2;)V

    .line 529
    .line 530
    .line 531
    iput-object v6, v4, Ll43;->x:Lx53;

    .line 532
    .line 533
    new-instance v6, Lyl1;

    .line 534
    .line 535
    invoke-direct {v6, v4, v2}, Lyl1;-><init>(Ll43;Li63;)V

    .line 536
    .line 537
    .line 538
    iput-object v6, v4, Ll43;->y:Lyl1;

    .line 539
    .line 540
    invoke-virtual {v4}, Ll43;->getAttributes()Liz0;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    sget-object v10, Ll43;->A:Lau;

    .line 545
    .line 546
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v6}, Liz0;->c()Ljava/util/Map;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    invoke-interface {v6, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    iget-object v2, v2, Li63;->e:Ljava/lang/Object;

    .line 560
    .line 561
    instance-of v6, v2, Lhf0;

    .line 562
    .line 563
    if-nez v6, :cond_19

    .line 564
    .line 565
    invoke-virtual {v4}, Ll43;->getAttributes()Liz0;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    invoke-virtual {v6, v10, v2}, Liz0;->e(Lau;Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    :cond_19
    invoke-virtual {v4}, Ll43;->d()Lyl1;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    sget-object v6, Lqr0;->c:Lxb4;

    .line 577
    .line 578
    invoke-virtual {v1, v6}, Lf96;->D(Lxb4;)V

    .line 579
    .line 580
    .line 581
    invoke-interface {v2}, Lo81;->k()Le81;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-static {v1}, Lr16;->Q(Le81;)Lel3;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    new-instance v6, Lh43;

    .line 590
    .line 591
    invoke-direct {v6, v7, v5, v2}, Lh43;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-interface {v1, v6}, Lel3;->v(Lvr2;)Lmw1;

    .line 595
    .line 596
    .line 597
    iput-object v8, v0, Lp43;->D:Ljava/lang/Object;

    .line 598
    .line 599
    iput-object v8, v0, Lp43;->E:Ljava/lang/Object;

    .line 600
    .line 601
    iput-object v8, v0, Lp43;->C:Ljava/lang/Object;

    .line 602
    .line 603
    iput v7, v0, Lp43;->B:I

    .line 604
    .line 605
    invoke-virtual {v9, v0, v4}, Lyg5;->d(Lf61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    if-ne v0, v3, :cond_1a

    .line 610
    .line 611
    goto :goto_11

    .line 612
    :cond_1a
    :goto_10
    sget-object v3, Lvs7;->a:Lvs7;

    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_1b
    new-instance v0, Lio/ktor/http/UnsafeHeaderException;

    .line 616
    .line 617
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    new-instance v2, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    const-string v3, "Header(s) "

    .line 627
    .line 628
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    const-string v1, " are controlled by the engine and cannot be set explicitly"

    .line 635
    .line 636
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    throw v0

    .line 647
    :cond_1c
    const-string v0, "No request transformation found: "

    .line 648
    .line 649
    iget-object v1, v2, Ly53;->d:Ljava/lang/Object;

    .line 650
    .line 651
    invoke-static {v0, v1}, Lku4;->x(Ljava/lang/String;Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_8

    .line 655
    .line 656
    :goto_11
    return-object v3

    .line 657
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lp43;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Lp43;->G:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lp43;->F:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lwk6;

    .line 13
    .line 14
    check-cast p2, Ly53;

    .line 15
    .line 16
    check-cast p3, Lf61;

    .line 17
    .line 18
    new-instance v0, Lp43;

    .line 19
    .line 20
    iget-object p0, p0, Lp43;->E:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Long;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/Long;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/Long;

    .line 27
    .line 28
    invoke-direct {v0, p0, v3, v2, p3}, Lp43;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lf61;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v0, Lp43;->C:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, v0, Lp43;->D:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lp43;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, Lyg5;

    .line 41
    .line 42
    check-cast p3, Lf61;

    .line 43
    .line 44
    new-instance p0, Lp43;

    .line 45
    .line 46
    check-cast v3, Lj43;

    .line 47
    .line 48
    check-cast v2, Lq43;

    .line 49
    .line 50
    invoke-direct {p0, v3, v2, p3}, Lp43;-><init>(Lj43;Lq43;Lf61;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lp43;->D:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p2, p0, Lp43;->E:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lp43;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
