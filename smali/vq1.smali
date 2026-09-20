.class public abstract Lvq1;
.super Lq16;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Ly16;

.field public final B:Ly16;

.field public final x:Ly16;

.field public final y:Ly16;

.field public final z:Ly16;


# direct methods
.method public constructor <init>(Lfq3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lq16;-><init>(Lfq3;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lsq1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lsq1;-><init>(Lvq1;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lvq1;->x:Ly16;

    .line 19
    .line 20
    new-instance v0, Lsq1;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v0, p0, v3}, Lsq1;-><init>(Lvq1;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lvq1;->y:Ly16;

    .line 31
    .line 32
    new-instance v0, Lsq1;

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-direct {v0, p0, v4}, Lsq1;-><init>(Lvq1;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lvq1;->z:Ly16;

    .line 43
    .line 44
    new-instance v0, Ltq1;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1, v1}, Ltq1;-><init>(Lvq1;Lfq3;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lvq1;->A:Ly16;

    .line 54
    .line 55
    new-instance v0, Ltq1;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1, v3}, Ltq1;-><init>(Lvq1;Lfq3;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lvq1;->B:Ly16;

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
.end method


# virtual methods
.method public final M()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvq1;->R()Lri0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lzh4;->f()Lus1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lni3;->a:Lus1;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final P(Z)Ljava/util/ArrayList;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lvq1;->R()Lri0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v13, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v14, 0x0

    .line 13
    const/4 v15, 0x1

    .line 14
    if-eqz p1, :cond_9

    .line 15
    .line 16
    invoke-static {v0}, Lg18;->h(Lvq1;)Lqz3;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v3, Lir1;

    .line 23
    .line 24
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    new-instance v5, Luq1;

    .line 29
    .line 30
    invoke-direct {v5, v1, v14}, Luq1;-><init>(Lqz3;I)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lqr3;->w:Lqr3;

    .line 34
    .line 35
    invoke-direct {v3, v0, v4, v1, v5}, Lir1;-><init>(Lvq1;ILqr3;Lsr2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    instance-of v1, v2, Ltt1;

    .line 42
    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    move-object v1, v2

    .line 48
    check-cast v1, Ltt1;

    .line 49
    .line 50
    iget-object v3, v1, Ltt1;->a0:Lvq4;

    .line 51
    .line 52
    iget-object v1, v1, Ltt1;->Z:Ljs5;

    .line 53
    .line 54
    iget-object v1, v1, Ljs5;->K:Ljava/util/List;

    .line 55
    .line 56
    new-instance v4, Lyb5;

    .line 57
    .line 58
    invoke-direct {v4, v3, v1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    instance-of v1, v2, Lst1;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move-object v1, v2

    .line 67
    check-cast v1, Lst1;

    .line 68
    .line 69
    iget-object v3, v1, Lst1;->X:Lvq4;

    .line 70
    .line 71
    iget-object v1, v1, Lst1;->W:Lqs5;

    .line 72
    .line 73
    iget-object v1, v1, Lqs5;->K:Ljava/util/List;

    .line 74
    .line 75
    new-instance v4, Lyb5;

    .line 76
    .line 77
    invoke-direct {v4, v3, v1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    instance-of v1, v2, Lar5;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    move-object v1, v2

    .line 86
    check-cast v1, Lar5;

    .line 87
    .line 88
    invoke-virtual {v1}, Lar5;->f1()Lcr5;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    instance-of v3, v1, Lst1;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    check-cast v1, Lst1;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    move-object/from16 v1, v16

    .line 100
    .line 101
    :goto_0
    if-eqz v1, :cond_4

    .line 102
    .line 103
    iget-object v3, v1, Lst1;->X:Lvq4;

    .line 104
    .line 105
    iget-object v1, v1, Lst1;->W:Lqs5;

    .line 106
    .line 107
    iget-object v1, v1, Lqs5;->K:Ljava/util/List;

    .line 108
    .line 109
    new-instance v4, Lyb5;

    .line 110
    .line 111
    invoke-direct {v4, v3, v1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move-object/from16 v4, v16

    .line 116
    .line 117
    :goto_1
    if-nez v4, :cond_5

    .line 118
    .line 119
    sget-object v1, La42;->w:La42;

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_5
    iget-object v1, v4, Lyb5;->w:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Lvq4;

    .line 126
    .line 127
    iget-object v3, v4, Lyb5;->x:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v2}, Lpi0;->h0()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance v5, Ljava/util/ArrayList;

    .line 139
    .line 140
    const/16 v6, 0xa

    .line 141
    .line 142
    invoke-static {v4, v6}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v17

    .line 153
    move v4, v14

    .line 154
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_7

    .line 159
    .line 160
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    add-int/lit8 v18, v4, 0x1

    .line 165
    .line 166
    if-ltz v4, :cond_6

    .line 167
    .line 168
    check-cast v6, Lqz3;

    .line 169
    .line 170
    new-instance v7, Lh28;

    .line 171
    .line 172
    move-object v8, v5

    .line 173
    invoke-virtual {v6}, Lin8;->getAnnotations()Lrm;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, Ljt5;

    .line 182
    .line 183
    iget v9, v9, Ljt5;->A:I

    .line 184
    .line 185
    invoke-interface {v1, v9}, Lvq4;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-static {v9}, Luq4;->d(Ljava/lang/String;)Luq4;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v6}, Lqz3;->b()Lvw3;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    const/4 v11, 0x0

    .line 198
    sget-object v12, Lsy6;->j:Lor2;

    .line 199
    .line 200
    move-object v10, v3

    .line 201
    const/4 v3, 0x0

    .line 202
    move-object/from16 v19, v8

    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    move-object/from16 v20, v1

    .line 206
    .line 207
    move-object v1, v7

    .line 208
    move-object v7, v6

    .line 209
    move-object v6, v9

    .line 210
    const/4 v9, 0x0

    .line 211
    move-object/from16 v21, v10

    .line 212
    .line 213
    const/4 v10, 0x0

    .line 214
    move-object/from16 v14, v19

    .line 215
    .line 216
    invoke-direct/range {v1 .. v12}, Lh28;-><init>(Lpi0;Lh28;ILrm;Luq4;Lvw3;ZZZLvw3;Lsy6;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-object v5, v14

    .line 223
    move/from16 v4, v18

    .line 224
    .line 225
    move-object/from16 v1, v20

    .line 226
    .line 227
    move-object/from16 v3, v21

    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    goto :goto_2

    .line 231
    :cond_6
    invoke-static {}, Lsg3;->Z()V

    .line 232
    .line 233
    .line 234
    throw v16

    .line 235
    :cond_7
    move-object v14, v5

    .line 236
    move-object v1, v14

    .line 237
    :goto_3
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    const/4 v4, 0x0

    .line 242
    :goto_4
    if-ge v4, v3, :cond_8

    .line 243
    .line 244
    new-instance v5, Lir1;

    .line 245
    .line 246
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    new-instance v7, Lm61;

    .line 251
    .line 252
    invoke-direct {v7, v4, v15, v1}, Lm61;-><init>(IILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    sget-object v8, Lqr3;->x:Lqr3;

    .line 256
    .line 257
    invoke-direct {v5, v0, v6, v8, v7}, Lir1;-><init>(Lvq1;ILqr3;Lsr2;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    add-int/lit8 v4, v4, 0x1

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_8
    invoke-interface {v2}, Lpi0;->b0()Lqz3;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_9

    .line 271
    .line 272
    new-instance v3, Lir1;

    .line 273
    .line 274
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    new-instance v5, Luq1;

    .line 279
    .line 280
    invoke-direct {v5, v1, v15}, Luq1;-><init>(Lqz3;I)V

    .line 281
    .line 282
    .line 283
    sget-object v1, Lqr3;->y:Lqr3;

    .line 284
    .line 285
    invoke-direct {v3, v0, v4, v1, v5}, Lir1;-><init>(Lvq1;ILqr3;Lsr2;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_9
    invoke-interface {v2}, Lpi0;->S()Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    const/4 v14, 0x0

    .line 300
    :goto_5
    if-ge v14, v1, :cond_a

    .line 301
    .line 302
    new-instance v3, Lir1;

    .line 303
    .line 304
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    new-instance v5, Lm61;

    .line 309
    .line 310
    const/4 v6, 0x2

    .line 311
    invoke-direct {v5, v14, v6, v2}, Lm61;-><init>(IILjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    sget-object v6, Lqr3;->z:Lqr3;

    .line 315
    .line 316
    invoke-direct {v3, v0, v4, v6, v5}, Lir1;-><init>(Lvq1;ILqr3;Lsr2;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    add-int/lit8 v14, v14, 0x1

    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_a
    invoke-static {v0}, Lr16;->Y(Lp16;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_b

    .line 330
    .line 331
    instance-of v0, v2, Lei3;

    .line 332
    .line 333
    if-eqz v0, :cond_b

    .line 334
    .line 335
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-le v0, v15, :cond_b

    .line 340
    .line 341
    new-instance v0, La91;

    .line 342
    .line 343
    const/16 v1, 0xd

    .line 344
    .line 345
    invoke-direct {v0, v1}, La91;-><init>(I)V

    .line 346
    .line 347
    .line 348
    invoke-static {v13, v0}, Lht0;->g0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 349
    .line 350
    .line 351
    :cond_b
    invoke-virtual {v13}, Ljava/util/ArrayList;->trimToSize()V

    .line 352
    .line 353
    .line 354
    return-object v13
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
.end method

.method public abstract Q()Lds1;
.end method

.method public abstract R()Lri0;
.end method

.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lvq1;->y:Ly16;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
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

.method public final f()Lls3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lvq1;->R()Lri0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lzh4;->f()Lus1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lg18;->a:Lup2;

    .line 13
    .line 14
    sget-object v0, Lvs1;->e:Lus1;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lls3;->w:Lls3;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object v0, Lvs1;->c:Lus1;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object p0, Lls3;->x:Lls3;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object v0, Lvs1;->d:Lus1;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    sget-object p0, Lls3;->y:Lls3;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    sget-object v0, Lvs1;->a:Lus1;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    sget-object v0, Lvs1;->b:Lus1;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_4
    :goto_0
    sget-object p0, Lls3;->z:Lls3;

    .line 67
    .line 68
    return-object p0
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

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lvq1;->x:Ly16;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
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

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lvq1;->z:Ly16;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
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

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lvq1;->B:Ly16;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
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

.method public final k()Las3;
    .locals 0

    .line 1
    iget-object p0, p0, Lvq1;->A:Ly16;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly16;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Las3;

    .line 11
    .line 12
    return-object p0
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

.method public final o()Lel4;
    .locals 1

    .line 1
    iget-object v0, p0, Lq16;->w:Lfq3;

    .line 2
    .line 3
    iget-object v0, v0, Lfq3;->b:Lel4;

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lvq1;->R()Lri0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lzh4;->o()Lfl4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    sget-object p0, Lel4;->z:Lel4;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {}, Lh;->c()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, Lel4;->y:Lel4;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lel4;->A:Lel4;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lel4;->x:Lel4;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    return-object v0
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
