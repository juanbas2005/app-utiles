.class public final synthetic Lwi5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lvr2;


# direct methods
.method public synthetic constructor <init>(ILvr2;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lwi5;->w:I

    .line 2
    .line 3
    iput-boolean p3, p0, Lwi5;->x:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwi5;->y:Lvr2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public synthetic constructor <init>(ZLvr2;II)V
    .locals 0

    .line 11
    iput p4, p0, Lwi5;->w:I

    iput-boolean p1, p0, Lwi5;->x:Z

    iput-object p2, p0, Lwi5;->y:Lvr2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwi5;->w:I

    .line 4
    .line 5
    const/16 v4, 0x30

    .line 6
    .line 7
    sget-object v5, Lwr;->a:Lrr;

    .line 8
    .line 9
    sget-object v6, Ljl4;->w:Ljl4;

    .line 10
    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    const/16 v11, 0x31

    .line 15
    .line 16
    iget-object v12, v0, Lwi5;->y:Lvr2;

    .line 17
    .line 18
    iget-boolean v13, v0, Lwi5;->x:Z

    .line 19
    .line 20
    sget-object v14, Lvs7;->a:Lvs7;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, Lyt2;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v11}, Lb85;->v(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v13, v12, v0, v1}, Lrs4;->d(ZLvr2;Lyt2;I)V

    .line 41
    .line 42
    .line 43
    return-object v14

    .line 44
    :pswitch_0
    move-object/from16 v0, p1

    .line 45
    .line 46
    check-cast v0, Lyt2;

    .line 47
    .line 48
    move-object/from16 v1, p2

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v11}, Lb85;->v(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {v13, v12, v0, v1}, Lrs4;->j(ZLvr2;Lyt2;I)V

    .line 60
    .line 61
    .line 62
    return-object v14

    .line 63
    :pswitch_1
    move-object/from16 v1, p1

    .line 64
    .line 65
    check-cast v1, Lyt2;

    .line 66
    .line 67
    move-object/from16 v11, p2

    .line 68
    .line 69
    check-cast v11, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    and-int/lit8 v12, v11, 0x3

    .line 76
    .line 77
    if-eq v12, v7, :cond_0

    .line 78
    .line 79
    move v7, v9

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move v7, v8

    .line 82
    :goto_0
    and-int/2addr v11, v9

    .line 83
    invoke-virtual {v1, v11, v7}, Lyt2;->V(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    sget-object v7, Lwr;->c:Lsr;

    .line 90
    .line 91
    sget-object v11, Lxb4;->K:Lg80;

    .line 92
    .line 93
    invoke-static {v7, v11, v1, v8}, Lzt0;->a(Lvr;Lg80;Lyt2;I)Lau0;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iget-wide v11, v1, Lyt2;->T:J

    .line 98
    .line 99
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual {v1}, Lyt2;->m()Lvf5;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-static {v1, v6}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    sget-object v13, Lux0;->d:Ltx0;

    .line 112
    .line 113
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v13, Ltx0;->b:Lvy0;

    .line 117
    .line 118
    invoke-virtual {v1}, Lyt2;->i0()V

    .line 119
    .line 120
    .line 121
    iget-boolean v15, v1, Lyt2;->S:Z

    .line 122
    .line 123
    if-eqz v15, :cond_1

    .line 124
    .line 125
    invoke-virtual {v1, v13}, Lyt2;->l(Lsr2;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    invoke-virtual {v1}, Lyt2;->r0()V

    .line 130
    .line 131
    .line 132
    :goto_1
    sget-object v15, Ltx0;->f:Lck;

    .line 133
    .line 134
    invoke-static {v15, v1, v7}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget-object v7, Ltx0;->e:Lck;

    .line 138
    .line 139
    invoke-static {v7, v1, v11}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    sget-object v11, Ltx0;->g:Lck;

    .line 147
    .line 148
    invoke-static {v11, v1, v8}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object v8, Ltx0;->h:Lce;

    .line 152
    .line 153
    invoke-static {v1, v8}, Lg75;->O(Lyt2;Lvr2;)V

    .line 154
    .line 155
    .line 156
    const/16 v38, 0xd

    .line 157
    .line 158
    sget-object v10, Ltx0;->d:Lck;

    .line 159
    .line 160
    invoke-static {v10, v1, v12}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    const v12, 0x7f110434

    .line 164
    .line 165
    .line 166
    invoke-static {v12, v1}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-static/range {v38 .. v38}, Lya5;->k(I)J

    .line 171
    .line 172
    .line 173
    move-result-wide v19

    .line 174
    invoke-static {}, Lz08;->e()J

    .line 175
    .line 176
    .line 177
    move-result-wide v17

    .line 178
    const/16 v36, 0x0

    .line 179
    .line 180
    const v37, 0x3ffea

    .line 181
    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const-wide/16 v23, 0x0

    .line 190
    .line 191
    const/16 v25, 0x0

    .line 192
    .line 193
    const/16 v26, 0x0

    .line 194
    .line 195
    const-wide/16 v27, 0x0

    .line 196
    .line 197
    const/16 v29, 0x0

    .line 198
    .line 199
    const/16 v30, 0x0

    .line 200
    .line 201
    const/16 v31, 0x0

    .line 202
    .line 203
    const/16 v32, 0x0

    .line 204
    .line 205
    const/16 v33, 0x0

    .line 206
    .line 207
    const/16 v35, 0x6000

    .line 208
    .line 209
    move-object/from16 v34, v1

    .line 210
    .line 211
    move-object v1, v15

    .line 212
    move-object v15, v12

    .line 213
    invoke-static/range {v15 .. v37}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v12, v34

    .line 217
    .line 218
    const/high16 v15, 0x41400000    # 12.0f

    .line 219
    .line 220
    const v2, 0x7f110433

    .line 221
    .line 222
    .line 223
    invoke-static {v6, v15, v12, v2, v12}, Lpb4;->j(Ljl4;FLyt2;ILyt2;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    invoke-static/range {v38 .. v38}, Lya5;->k(I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v19

    .line 231
    invoke-static {}, Lz08;->e()J

    .line 232
    .line 233
    .line 234
    move-result-wide v17

    .line 235
    invoke-static/range {v15 .. v37}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 236
    .line 237
    .line 238
    const/high16 v2, 0x41800000    # 16.0f

    .line 239
    .line 240
    invoke-static {v6, v2}, Lyu6;->d(Lml4;F)Lml4;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v12, v2}, Lk75;->a(Lyt2;Lml4;)V

    .line 245
    .line 246
    .line 247
    sget-object v2, Lxb4;->I:Lh80;

    .line 248
    .line 249
    invoke-static {v5, v2, v12, v4}, Lca6;->a(Ltr;Lh80;Lyt2;I)Lea6;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    iget-wide v4, v12, Lyt2;->T:J

    .line 254
    .line 255
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-virtual {v12}, Lyt2;->m()Lvf5;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-static {v12, v6}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    invoke-virtual {v12}, Lyt2;->i0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v3, v12, Lyt2;->S:Z

    .line 271
    .line 272
    if-eqz v3, :cond_2

    .line 273
    .line 274
    invoke-virtual {v12, v13}, Lyt2;->l(Lsr2;)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_2
    invoke-virtual {v12}, Lyt2;->r0()V

    .line 279
    .line 280
    .line 281
    :goto_2
    invoke-static {v1, v12, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v7, v12, v5}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v4, v12, v11, v12, v8}, Lf21;->s(ILyt2;Lck;Lyt2;Lce;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v10, v12, v15}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    const v1, 0x7f110439

    .line 294
    .line 295
    .line 296
    invoke-static {v1, v12}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    invoke-static/range {v38 .. v38}, Lya5;->k(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v19

    .line 304
    sget-object v21, Lam2;->A:Lam2;

    .line 305
    .line 306
    invoke-static {}, Lz08;->k()J

    .line 307
    .line 308
    .line 309
    move-result-wide v17

    .line 310
    new-instance v1, Llz3;

    .line 311
    .line 312
    const/high16 v2, 0x3f800000    # 1.0f

    .line 313
    .line 314
    invoke-direct {v1, v2, v9}, Llz3;-><init>(FZ)V

    .line 315
    .line 316
    .line 317
    const/16 v36, 0x0

    .line 318
    .line 319
    const v37, 0x3ffa8

    .line 320
    .line 321
    .line 322
    const/16 v22, 0x0

    .line 323
    .line 324
    const-wide/16 v23, 0x0

    .line 325
    .line 326
    const/16 v25, 0x0

    .line 327
    .line 328
    const/16 v26, 0x0

    .line 329
    .line 330
    const-wide/16 v27, 0x0

    .line 331
    .line 332
    const/16 v29, 0x0

    .line 333
    .line 334
    const/16 v30, 0x0

    .line 335
    .line 336
    const/16 v31, 0x0

    .line 337
    .line 338
    const/16 v32, 0x0

    .line 339
    .line 340
    const/16 v33, 0x0

    .line 341
    .line 342
    const v35, 0x186000

    .line 343
    .line 344
    .line 345
    move-object/from16 v16, v1

    .line 346
    .line 347
    move-object/from16 v34, v12

    .line 348
    .line 349
    invoke-static/range {v15 .. v37}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 350
    .line 351
    .line 352
    const/high16 v1, 0x41000000    # 8.0f

    .line 353
    .line 354
    invoke-static {v6, v1}, Lyu6;->p(Lml4;F)Lml4;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-static {v12, v1}, Lk75;->a(Lyt2;Lml4;)V

    .line 359
    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    const/16 v22, 0x7c

    .line 364
    .line 365
    iget-boolean v15, v0, Lwi5;->x:Z

    .line 366
    .line 367
    iget-object v0, v0, Lwi5;->y:Lvr2;

    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    const/16 v18, 0x0

    .line 372
    .line 373
    const/16 v19, 0x0

    .line 374
    .line 375
    move-object/from16 v16, v0

    .line 376
    .line 377
    move-object/from16 v20, v12

    .line 378
    .line 379
    invoke-static/range {v15 .. v22}, Lp97;->a(ZLvr2;Lml4;ZLn97;Lyt2;II)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v9}, Lyt2;->r(Z)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v9}, Lyt2;->r(Z)V

    .line 386
    .line 387
    .line 388
    goto :goto_3

    .line 389
    :cond_3
    move-object v12, v1

    .line 390
    invoke-virtual {v12}, Lyt2;->Y()V

    .line 391
    .line 392
    .line 393
    :goto_3
    return-object v14

    .line 394
    :pswitch_2
    const/16 v38, 0xd

    .line 395
    .line 396
    move-object/from16 v1, p1

    .line 397
    .line 398
    check-cast v1, Lyt2;

    .line 399
    .line 400
    move-object/from16 v2, p2

    .line 401
    .line 402
    check-cast v2, Ljava/lang/Integer;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    and-int/lit8 v3, v2, 0x3

    .line 409
    .line 410
    if-eq v3, v7, :cond_4

    .line 411
    .line 412
    move v8, v9

    .line 413
    :cond_4
    and-int/2addr v2, v9

    .line 414
    invoke-virtual {v1, v2, v8}, Lyt2;->V(IZ)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-eqz v2, :cond_6

    .line 419
    .line 420
    sget-object v2, Lyu6;->a:Lsd2;

    .line 421
    .line 422
    sget v3, Lv08;->a:I

    .line 423
    .line 424
    const-wide v7, 0xffd2eef5L

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    invoke-static {v7, v8}, Luq3;->d(J)J

    .line 430
    .line 431
    .line 432
    move-result-wide v7

    .line 433
    const-wide v10, 0xff0f3a49L

    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    invoke-static {v10, v11}, Luq3;->d(J)J

    .line 439
    .line 440
    .line 441
    move-result-wide v10

    .line 442
    invoke-static {v7, v8, v10, v11}, Lv08;->e(JJ)J

    .line 443
    .line 444
    .line 445
    move-result-wide v7

    .line 446
    sget-object v3, Lgr8;->h:Lm23;

    .line 447
    .line 448
    invoke-static {v2, v7, v8, v3}, Lb96;->h(Lml4;JLpq6;)Lml4;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const/high16 v3, 0x41600000    # 14.0f

    .line 453
    .line 454
    const/high16 v7, 0x41200000    # 10.0f

    .line 455
    .line 456
    invoke-static {v2, v3, v7}, Lx91;->L(Lml4;FF)Lml4;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    sget-object v3, Lxb4;->I:Lh80;

    .line 461
    .line 462
    invoke-static {v5, v3, v1, v4}, Lca6;->a(Ltr;Lh80;Lyt2;I)Lea6;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    iget-wide v4, v1, Lyt2;->T:J

    .line 467
    .line 468
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    invoke-virtual {v1}, Lyt2;->m()Lvf5;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-static {v1, v2}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    sget-object v7, Lux0;->d:Ltx0;

    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    sget-object v7, Ltx0;->b:Lvy0;

    .line 486
    .line 487
    invoke-virtual {v1}, Lyt2;->i0()V

    .line 488
    .line 489
    .line 490
    iget-boolean v8, v1, Lyt2;->S:Z

    .line 491
    .line 492
    if-eqz v8, :cond_5

    .line 493
    .line 494
    invoke-virtual {v1, v7}, Lyt2;->l(Lsr2;)V

    .line 495
    .line 496
    .line 497
    goto :goto_4

    .line 498
    :cond_5
    invoke-virtual {v1}, Lyt2;->r0()V

    .line 499
    .line 500
    .line 501
    :goto_4
    sget-object v7, Ltx0;->f:Lck;

    .line 502
    .line 503
    invoke-static {v7, v1, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    sget-object v3, Ltx0;->e:Lck;

    .line 507
    .line 508
    invoke-static {v3, v1, v5}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    sget-object v4, Ltx0;->g:Lck;

    .line 516
    .line 517
    invoke-static {v4, v1, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    sget-object v3, Ltx0;->h:Lce;

    .line 521
    .line 522
    invoke-static {v1, v3}, Lg75;->O(Lyt2;Lvr2;)V

    .line 523
    .line 524
    .line 525
    sget-object v3, Ltx0;->d:Lck;

    .line 526
    .line 527
    invoke-static {v3, v1, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    invoke-static {}, Lsg3;->w()Lx83;

    .line 531
    .line 532
    .line 533
    move-result-object v17

    .line 534
    const-wide v2, 0xff1090b8L

    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    invoke-static {v2, v3}, Luq3;->d(J)J

    .line 540
    .line 541
    .line 542
    move-result-wide v2

    .line 543
    const-wide v4, 0xff3fc1e9L

    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    invoke-static {v4, v5}, Luq3;->d(J)J

    .line 549
    .line 550
    .line 551
    move-result-wide v4

    .line 552
    invoke-static {v2, v3, v4, v5}, Lv08;->e(JJ)J

    .line 553
    .line 554
    .line 555
    move-result-wide v20

    .line 556
    const/high16 v2, 0x41a00000    # 20.0f

    .line 557
    .line 558
    invoke-static {v6, v2}, Lyu6;->l(Lml4;F)Lml4;

    .line 559
    .line 560
    .line 561
    move-result-object v19

    .line 562
    const/16 v23, 0x1b0

    .line 563
    .line 564
    const/16 v24, 0x0

    .line 565
    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    move-object/from16 v22, v1

    .line 569
    .line 570
    invoke-static/range {v17 .. v24}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 571
    .line 572
    .line 573
    move-object/from16 v5, v22

    .line 574
    .line 575
    const/high16 v1, 0x41000000    # 8.0f

    .line 576
    .line 577
    invoke-static {v6, v1}, Lyu6;->p(Lml4;F)Lml4;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-static {v5, v1}, Lk75;->a(Lyt2;Lml4;)V

    .line 582
    .line 583
    .line 584
    const v1, 0x7f1101ae

    .line 585
    .line 586
    .line 587
    invoke-static {v1, v5}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v17

    .line 591
    invoke-static {}, Lv08;->d()J

    .line 592
    .line 593
    .line 594
    move-result-wide v19

    .line 595
    invoke-static/range {v38 .. v38}, Lya5;->k(I)J

    .line 596
    .line 597
    .line 598
    move-result-wide v21

    .line 599
    sget-object v23, Lam2;->A:Lam2;

    .line 600
    .line 601
    const/16 v38, 0x0

    .line 602
    .line 603
    const v39, 0x3ffaa

    .line 604
    .line 605
    .line 606
    const/16 v24, 0x0

    .line 607
    .line 608
    const-wide/16 v25, 0x0

    .line 609
    .line 610
    const/16 v27, 0x0

    .line 611
    .line 612
    const/16 v28, 0x0

    .line 613
    .line 614
    const-wide/16 v29, 0x0

    .line 615
    .line 616
    const/16 v31, 0x0

    .line 617
    .line 618
    const/16 v32, 0x0

    .line 619
    .line 620
    const/16 v33, 0x0

    .line 621
    .line 622
    const/16 v34, 0x0

    .line 623
    .line 624
    const/16 v35, 0x0

    .line 625
    .line 626
    const v37, 0x186000

    .line 627
    .line 628
    .line 629
    move-object/from16 v36, v5

    .line 630
    .line 631
    invoke-static/range {v17 .. v39}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 632
    .line 633
    .line 634
    new-instance v1, Llz3;

    .line 635
    .line 636
    const/high16 v2, 0x3f800000    # 1.0f

    .line 637
    .line 638
    invoke-direct {v1, v2, v9}, Llz3;-><init>(FZ)V

    .line 639
    .line 640
    .line 641
    invoke-static {v5, v1}, Lk75;->a(Lyt2;Lml4;)V

    .line 642
    .line 643
    .line 644
    sget-wide v16, Ljt0;->c:J

    .line 645
    .line 646
    invoke-static {}, Lv08;->a()J

    .line 647
    .line 648
    .line 649
    move-result-wide v18

    .line 650
    invoke-static {}, Lv08;->c()J

    .line 651
    .line 652
    .line 653
    move-result-wide v26

    .line 654
    sget-wide v20, Ljt0;->f:J

    .line 655
    .line 656
    sget-object v1, Lr16;->H:Lrt0;

    .line 657
    .line 658
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 659
    .line 660
    .line 661
    move-result-wide v22

    .line 662
    sget-object v1, Lr16;->O:Lrt0;

    .line 663
    .line 664
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 665
    .line 666
    .line 667
    move-result-wide v28

    .line 668
    sget-object v1, Lr16;->R:Lrt0;

    .line 669
    .line 670
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 671
    .line 672
    .line 673
    move-result-wide v30

    .line 674
    sget-object v1, Lr16;->r:Lrt0;

    .line 675
    .line 676
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 677
    .line 678
    .line 679
    move-result-wide v1

    .line 680
    sget v3, Lr16;->s:F

    .line 681
    .line 682
    invoke-static {v3, v1, v2}, Ljt0;->b(FJ)J

    .line 683
    .line 684
    .line 685
    move-result-wide v1

    .line 686
    sget-object v3, Lch4;->b:Lt37;

    .line 687
    .line 688
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    check-cast v4, Lzg4;

    .line 693
    .line 694
    iget-object v4, v4, Lzg4;->a:Lqt0;

    .line 695
    .line 696
    iget-wide v6, v4, Lqt0;->p:J

    .line 697
    .line 698
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 699
    .line 700
    .line 701
    move-result-wide v32

    .line 702
    sget-object v1, Lr16;->v:Lrt0;

    .line 703
    .line 704
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 705
    .line 706
    .line 707
    move-result-wide v1

    .line 708
    sget v4, Lr16;->w:F

    .line 709
    .line 710
    invoke-static {v4, v1, v2}, Ljt0;->b(FJ)J

    .line 711
    .line 712
    .line 713
    move-result-wide v1

    .line 714
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    check-cast v6, Lzg4;

    .line 719
    .line 720
    iget-object v6, v6, Lzg4;->a:Lqt0;

    .line 721
    .line 722
    iget-wide v6, v6, Lqt0;->p:J

    .line 723
    .line 724
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 725
    .line 726
    .line 727
    move-result-wide v34

    .line 728
    sget-object v1, Lr16;->t:Lrt0;

    .line 729
    .line 730
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 731
    .line 732
    .line 733
    move-result-wide v1

    .line 734
    sget v6, Lr16;->u:F

    .line 735
    .line 736
    invoke-static {v6, v1, v2}, Ljt0;->b(FJ)J

    .line 737
    .line 738
    .line 739
    move-result-wide v1

    .line 740
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v6

    .line 744
    check-cast v6, Lzg4;

    .line 745
    .line 746
    iget-object v6, v6, Lzg4;->a:Lqt0;

    .line 747
    .line 748
    iget-wide v6, v6, Lqt0;->p:J

    .line 749
    .line 750
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 751
    .line 752
    .line 753
    move-result-wide v38

    .line 754
    sget-object v1, Lr16;->x:Lrt0;

    .line 755
    .line 756
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 757
    .line 758
    .line 759
    move-result-wide v1

    .line 760
    sget v6, Lr16;->y:F

    .line 761
    .line 762
    invoke-static {v6, v1, v2}, Ljt0;->b(FJ)J

    .line 763
    .line 764
    .line 765
    move-result-wide v1

    .line 766
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v6

    .line 770
    check-cast v6, Lzg4;

    .line 771
    .line 772
    iget-object v6, v6, Lzg4;->a:Lqt0;

    .line 773
    .line 774
    iget-wide v6, v6, Lqt0;->p:J

    .line 775
    .line 776
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 777
    .line 778
    .line 779
    move-result-wide v40

    .line 780
    sget-object v1, Lr16;->B:Lrt0;

    .line 781
    .line 782
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 783
    .line 784
    .line 785
    move-result-wide v1

    .line 786
    invoke-static {v4, v1, v2}, Ljt0;->b(FJ)J

    .line 787
    .line 788
    .line 789
    move-result-wide v1

    .line 790
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    check-cast v6, Lzg4;

    .line 795
    .line 796
    iget-object v6, v6, Lzg4;->a:Lqt0;

    .line 797
    .line 798
    iget-wide v6, v6, Lqt0;->p:J

    .line 799
    .line 800
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 801
    .line 802
    .line 803
    move-result-wide v42

    .line 804
    sget-object v1, Lr16;->C:Lrt0;

    .line 805
    .line 806
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 807
    .line 808
    .line 809
    move-result-wide v1

    .line 810
    invoke-static {v4, v1, v2}, Ljt0;->b(FJ)J

    .line 811
    .line 812
    .line 813
    move-result-wide v1

    .line 814
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    check-cast v4, Lzg4;

    .line 819
    .line 820
    iget-object v4, v4, Lzg4;->a:Lqt0;

    .line 821
    .line 822
    iget-wide v6, v4, Lqt0;->p:J

    .line 823
    .line 824
    invoke-static {v1, v2, v6, v7}, Luq3;->n(JJ)J

    .line 825
    .line 826
    .line 827
    move-result-wide v44

    .line 828
    sget-object v1, Lr16;->z:Lrt0;

    .line 829
    .line 830
    invoke-static {v1, v5}, Lst0;->e(Lrt0;Lyt2;)J

    .line 831
    .line 832
    .line 833
    move-result-wide v1

    .line 834
    sget v4, Lr16;->A:F

    .line 835
    .line 836
    invoke-static {v4, v1, v2}, Ljt0;->b(FJ)J

    .line 837
    .line 838
    .line 839
    move-result-wide v1

    .line 840
    invoke-virtual {v5, v3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    check-cast v3, Lzg4;

    .line 845
    .line 846
    iget-object v3, v3, Lzg4;->a:Lqt0;

    .line 847
    .line 848
    iget-wide v3, v3, Lqt0;->p:J

    .line 849
    .line 850
    invoke-static {v1, v2, v3, v4}, Luq3;->n(JJ)J

    .line 851
    .line 852
    .line 853
    move-result-wide v46

    .line 854
    new-instance v15, Ln97;

    .line 855
    .line 856
    move-wide/from16 v24, v16

    .line 857
    .line 858
    move-wide/from16 v36, v20

    .line 859
    .line 860
    invoke-direct/range {v15 .. v47}, Ln97;-><init>(JJJJJJJJJJJJJJJJ)V

    .line 861
    .line 862
    .line 863
    const/4 v6, 0x0

    .line 864
    const/16 v7, 0x5c

    .line 865
    .line 866
    iget-boolean v1, v0, Lwi5;->x:Z

    .line 867
    .line 868
    iget-object v0, v0, Lwi5;->y:Lvr2;

    .line 869
    .line 870
    const/4 v2, 0x0

    .line 871
    const/4 v3, 0x0

    .line 872
    move v4, v1

    .line 873
    move-object v1, v0

    .line 874
    move v0, v4

    .line 875
    move-object v4, v15

    .line 876
    invoke-static/range {v0 .. v7}, Lp97;->a(ZLvr2;Lml4;ZLn97;Lyt2;II)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v5, v9}, Lyt2;->r(Z)V

    .line 880
    .line 881
    .line 882
    goto :goto_5

    .line 883
    :cond_6
    move-object v5, v1

    .line 884
    invoke-virtual {v5}, Lyt2;->Y()V

    .line 885
    .line 886
    .line 887
    :goto_5
    return-object v14

    .line 888
    nop

    .line 889
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method
