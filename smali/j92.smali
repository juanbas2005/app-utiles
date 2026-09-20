.class public final synthetic Lj92;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 14
    iput p2, p0, Lj92;->w:I

    iput-object p3, p0, Lj92;->y:Ljava/lang/Object;

    iput-boolean p5, p0, Lj92;->x:Z

    iput-object p4, p0, Lj92;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwi4;ZLfw0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lj92;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj92;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lj92;->x:Z

    .line 10
    .line 11
    iput-object p3, p0, Lj92;->z:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
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

.method public synthetic constructor <init>(ZLds2;Lds2;I)V
    .locals 0

    .line 15
    iput p4, p0, Lj92;->w:I

    iput-boolean p1, p0, Lj92;->x:Z

    iput-object p2, p0, Lj92;->y:Ljava/lang/Object;

    iput-object p3, p0, Lj92;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lj92;->w:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lvs7;->a:Lvs7;

    .line 9
    .line 10
    iget-object v6, v0, Lj92;->z:Ljava/lang/Object;

    .line 11
    .line 12
    iget-boolean v7, v0, Lj92;->x:Z

    .line 13
    .line 14
    iget-object v0, v0, Lj92;->y:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, Lxi6;

    .line 20
    .line 21
    check-cast v6, Lgs2;

    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, Lyt2;

    .line 26
    .line 27
    move-object/from16 v2, p2

    .line 28
    .line 29
    check-cast v2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v2, 0xc01

    .line 35
    .line 36
    invoke-static {v2}, Lb85;->v(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0, v7, v6, v1, v2}, Lxi6;->b(ZLgs2;Lyt2;I)V

    .line 41
    .line 42
    .line 43
    return-object v5

    .line 44
    :pswitch_0
    check-cast v0, Lsr2;

    .line 45
    .line 46
    move-object v8, v6

    .line 47
    check-cast v8, Lsr2;

    .line 48
    .line 49
    move-object/from16 v15, p1

    .line 50
    .line 51
    check-cast v15, Lyt2;

    .line 52
    .line 53
    move-object/from16 v1, p2

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    and-int/lit8 v6, v1, 0x3

    .line 62
    .line 63
    if-eq v6, v2, :cond_0

    .line 64
    .line 65
    move v2, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v2, v3

    .line 68
    :goto_0
    and-int/2addr v1, v4

    .line 69
    invoke-virtual {v15, v1, v2}, Lyt2;->V(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    sget-object v1, Lwr;->a:Lrr;

    .line 76
    .line 77
    sget-object v2, Lxb4;->H:Lh80;

    .line 78
    .line 79
    invoke-static {v1, v2, v15, v3}, Lca6;->a(Ltr;Lh80;Lyt2;I)Lea6;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-wide v9, v15, Lyt2;->T:J

    .line 84
    .line 85
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v15}, Lyt2;->m()Lvf5;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    sget-object v9, Ljl4;->w:Ljl4;

    .line 94
    .line 95
    invoke-static {v15, v9}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    sget-object v10, Lux0;->d:Ltx0;

    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v10, Ltx0;->b:Lvy0;

    .line 105
    .line 106
    invoke-virtual {v15}, Lyt2;->i0()V

    .line 107
    .line 108
    .line 109
    iget-boolean v11, v15, Lyt2;->S:Z

    .line 110
    .line 111
    if-eqz v11, :cond_1

    .line 112
    .line 113
    invoke-virtual {v15, v10}, Lyt2;->l(Lsr2;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {v15}, Lyt2;->r0()V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object v10, Ltx0;->f:Lck;

    .line 121
    .line 122
    invoke-static {v10, v15, v1}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v1, Ltx0;->e:Lck;

    .line 126
    .line 127
    invoke-static {v1, v15, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v2, Ltx0;->g:Lck;

    .line 135
    .line 136
    invoke-static {v2, v15, v1}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Ltx0;->h:Lce;

    .line 140
    .line 141
    invoke-static {v15, v1}, Lg75;->O(Lyt2;Lvr2;)V

    .line 142
    .line 143
    .line 144
    sget-object v1, Ltx0;->d:Lck;

    .line 145
    .line 146
    invoke-static {v1, v15, v9}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    if-eqz v7, :cond_4

    .line 150
    .line 151
    const v1, -0x6b84a342

    .line 152
    .line 153
    .line 154
    invoke-virtual {v15, v1}, Lyt2;->e0(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v15, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {v15, v8}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    or-int/2addr v1, v2

    .line 166
    invoke-virtual {v15}, Lyt2;->Q()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-nez v1, :cond_2

    .line 171
    .line 172
    sget-object v1, Lay0;->a:Ld63;

    .line 173
    .line 174
    if-ne v2, v1, :cond_3

    .line 175
    .line 176
    :cond_2
    new-instance v2, Lqm3;

    .line 177
    .line 178
    const/4 v1, 0x6

    .line 179
    invoke-direct {v2, v1, v0, v8}, Lqm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v15, v2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_3
    move-object v9, v2

    .line 186
    check-cast v9, Lsr2;

    .line 187
    .line 188
    move-object/from16 v16, v15

    .line 189
    .line 190
    sget-object v15, Ldh4;->k:Lfw0;

    .line 191
    .line 192
    const/high16 v17, 0x30000000

    .line 193
    .line 194
    const/16 v18, 0x1fe

    .line 195
    .line 196
    const/4 v10, 0x0

    .line 197
    const/4 v11, 0x0

    .line 198
    const/4 v12, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    invoke-static/range {v9 .. v18}, Lgw8;->e(Lsr2;Lml4;ZLpq6;Lxd0;Lla5;Lhs2;Lyt2;II)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v15, v16

    .line 205
    .line 206
    invoke-virtual {v15, v3}, Lyt2;->r(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_4
    const v0, -0x6b7f1fca

    .line 211
    .line 212
    .line 213
    invoke-virtual {v15, v0}, Lyt2;->e0(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v15, v3}, Lyt2;->r(Z)V

    .line 217
    .line 218
    .line 219
    :goto_2
    sget-object v14, Ldh4;->l:Lfw0;

    .line 220
    .line 221
    const/high16 v16, 0x30000000

    .line 222
    .line 223
    const/16 v17, 0x1fe

    .line 224
    .line 225
    const/4 v9, 0x0

    .line 226
    const/4 v10, 0x0

    .line 227
    const/4 v11, 0x0

    .line 228
    const/4 v12, 0x0

    .line 229
    const/4 v13, 0x0

    .line 230
    invoke-static/range {v8 .. v17}, Lgw8;->e(Lsr2;Lml4;ZLpq6;Lxd0;Lla5;Lhs2;Lyt2;II)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v15, v4}, Lyt2;->r(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_5
    invoke-virtual {v15}, Lyt2;->Y()V

    .line 238
    .line 239
    .line 240
    :goto_3
    return-object v5

    .line 241
    :pswitch_1
    check-cast v0, Lwi4;

    .line 242
    .line 243
    check-cast v6, Lfw0;

    .line 244
    .line 245
    move-object/from16 v1, p1

    .line 246
    .line 247
    check-cast v1, Lyt2;

    .line 248
    .line 249
    move-object/from16 v8, p2

    .line 250
    .line 251
    check-cast v8, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    and-int/lit8 v9, v8, 0x3

    .line 258
    .line 259
    if-eq v9, v2, :cond_6

    .line 260
    .line 261
    move v2, v4

    .line 262
    goto :goto_4

    .line 263
    :cond_6
    move v2, v3

    .line 264
    :goto_4
    and-int/2addr v4, v8

    .line 265
    invoke-virtual {v1, v4, v2}, Lyt2;->V(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_8

    .line 270
    .line 271
    const v2, -0x338420d7    # -6.602666E7f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2}, Lyt2;->e0(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v3}, Lyt2;->r(Z)V

    .line 278
    .line 279
    .line 280
    sget-object v2, Lj41;->a:Lyy0;

    .line 281
    .line 282
    if-eqz v7, :cond_7

    .line 283
    .line 284
    iget-wide v7, v0, Lwi4;->a:J

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_7
    iget-wide v7, v0, Lwi4;->d:J

    .line 288
    .line 289
    :goto_5
    invoke-static {v7, v8, v2}, Lb81;->g(JLyy0;)Lju5;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    new-instance v2, Lx30;

    .line 294
    .line 295
    const/4 v4, 0x7

    .line 296
    invoke-direct {v2, v6, v4}, Lx30;-><init>(Lfw0;I)V

    .line 297
    .line 298
    .line 299
    const v4, -0x3542ef07    # -6195324.5f

    .line 300
    .line 301
    .line 302
    invoke-static {v4, v2, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const/16 v4, 0x38

    .line 307
    .line 308
    invoke-static {v0, v2, v1, v4}, Lt49;->c(Lju5;Lgs2;Lyt2;I)V

    .line 309
    .line 310
    .line 311
    const v0, -0x33718e37    # -7.468193E7f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v0}, Lyt2;->e0(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v3}, Lyt2;->r(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_8
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 322
    .line 323
    .line 324
    :goto_6
    return-object v5

    .line 325
    :pswitch_2
    check-cast v0, Lfw0;

    .line 326
    .line 327
    check-cast v6, Lfw0;

    .line 328
    .line 329
    move-object/from16 v1, p1

    .line 330
    .line 331
    check-cast v1, Lyt2;

    .line 332
    .line 333
    move-object/from16 v8, p2

    .line 334
    .line 335
    check-cast v8, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    and-int/lit8 v10, v8, 0x3

    .line 346
    .line 347
    if-eq v10, v2, :cond_9

    .line 348
    .line 349
    move v2, v4

    .line 350
    goto :goto_7

    .line 351
    :cond_9
    move v2, v3

    .line 352
    :goto_7
    and-int/2addr v4, v8

    .line 353
    invoke-virtual {v1, v4, v2}, Lyt2;->V(IZ)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_b

    .line 358
    .line 359
    if-eqz v7, :cond_a

    .line 360
    .line 361
    const v2, -0x69e5daff

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v2}, Lyt2;->e0(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v1, v9}, Lfw0;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    :goto_8
    invoke-virtual {v1, v3}, Lyt2;->r(Z)V

    .line 371
    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_a
    const v0, -0x69e5d887

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v0}, Lyt2;->e0(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, v1, v9}, Lfw0;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_b
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 385
    .line 386
    .line 387
    :goto_9
    return-object v5

    .line 388
    :pswitch_3
    check-cast v0, Lx83;

    .line 389
    .line 390
    check-cast v6, Lsr2;

    .line 391
    .line 392
    move-object/from16 v1, p1

    .line 393
    .line 394
    check-cast v1, Lyt2;

    .line 395
    .line 396
    move-object/from16 v2, p2

    .line 397
    .line 398
    check-cast v2, Ljava/lang/Integer;

    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {v4}, Lb85;->v(I)I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    invoke-static {v0, v7, v6, v1, v2}, Lt13;->m(Lx83;ZLsr2;Lyt2;I)V

    .line 408
    .line 409
    .line 410
    return-object v5

    .line 411
    :pswitch_4
    check-cast v0, Lk92;

    .line 412
    .line 413
    check-cast v6, Lml4;

    .line 414
    .line 415
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, Lyt2;

    .line 418
    .line 419
    move-object/from16 v2, p2

    .line 420
    .line 421
    check-cast v2, Ljava/lang/Integer;

    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    const/16 v2, 0x181

    .line 427
    .line 428
    invoke-static {v2}, Lb85;->v(I)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    invoke-virtual {v0, v7, v6, v1, v2}, Lk92;->a(ZLml4;Lyt2;I)V

    .line 433
    .line 434
    .line 435
    return-object v5

    .line 436
    nop

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
