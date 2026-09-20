.class public final synthetic Lay5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lay5;->w:I

    iput-object p2, p0, Lay5;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lay5;Lno6;)V
    .locals 0

    .line 1
    const/16 p2, 0x16

    .line 2
    .line 3
    iput p2, p0, Lay5;->w:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lay5;->x:Ljava/lang/Object;

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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lay5;->w:I

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object p0, p0, Lay5;->x:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Le61;

    .line 20
    .line 21
    check-cast p1, Lnq0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v0, "first"

    .line 27
    .line 28
    iget-object v1, p0, Le61;->b:Lzr3;

    .line 29
    .line 30
    invoke-interface {v1}, Lzr3;->getDescriptor()Lll6;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/16 v2, 0xc

    .line 35
    .line 36
    invoke-static {p1, v0, v1, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 37
    .line 38
    .line 39
    const-string v0, "second"

    .line 40
    .line 41
    iget-object v1, p0, Le61;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lzr3;

    .line 44
    .line 45
    invoke-interface {v1}, Lzr3;->getDescriptor()Lll6;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {p1, v0, v1, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 50
    .line 51
    .line 52
    const-string v0, "third"

    .line 53
    .line 54
    iget-object p0, p0, Le61;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lzr3;

    .line 57
    .line 58
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1, v0, p0, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lvs7;->a:Lvs7;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    check-cast p0, Lgg7;

    .line 69
    .line 70
    check-cast p1, Lul;

    .line 71
    .line 72
    iget-object v0, p1, Lul;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lrl;

    .line 75
    .line 76
    instance-of v1, v0, La74;

    .line 77
    .line 78
    const/16 v2, 0xe

    .line 79
    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    move-object v1, v0

    .line 83
    check-cast v1, La74;

    .line 84
    .line 85
    iget-object v3, v1, La74;->b:Lgg7;

    .line 86
    .line 87
    if-nez v3, :cond_0

    .line 88
    .line 89
    iget-object v0, v1, La74;->a:Ljava/lang/String;

    .line 90
    .line 91
    new-instance v1, La74;

    .line 92
    .line 93
    invoke-direct {v1, v0, p0}, La74;-><init>(Ljava/lang/String;Lgg7;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v1, v6, v2}, Lul;->a(Lul;Lrl;II)Lul;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    instance-of v1, v0, Lz64;

    .line 102
    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    check-cast v0, Lz64;

    .line 106
    .line 107
    iget-object v1, v0, Lz64;->b:Lgg7;

    .line 108
    .line 109
    if-nez v1, :cond_1

    .line 110
    .line 111
    iget-object v0, v0, Lz64;->a:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v1, Lz64;

    .line 114
    .line 115
    invoke-direct {v1, v0, p0}, Lz64;-><init>(Ljava/lang/String;Lgg7;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v1, v6, v2}, Lul;->a(Lul;Lrl;II)Lul;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :cond_1
    :goto_0
    return-object p1

    .line 123
    :pswitch_1
    check-cast p0, Lse7;

    .line 124
    .line 125
    check-cast p1, Ljava/lang/Float;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iget-object v0, p0, Lse7;->a:Lad5;

    .line 132
    .line 133
    invoke-virtual {v0}, Lad5;->d()F

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    add-float/2addr v1, p1

    .line 138
    iget-object p0, p0, Lse7;->b:Lad5;

    .line 139
    .line 140
    invoke-virtual {p0}, Lad5;->d()F

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    cmpl-float v2, v1, v2

    .line 145
    .line 146
    if-lez v2, :cond_2

    .line 147
    .line 148
    invoke-virtual {p0}, Lad5;->d()F

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-virtual {v0}, Lad5;->d()F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    sub-float p1, p0, p1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    cmpg-float p0, v1, v4

    .line 160
    .line 161
    if-gez p0, :cond_3

    .line 162
    .line 163
    invoke-virtual {v0}, Lad5;->d()F

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    neg-float p1, p0

    .line 168
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lad5;->d()F

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    add-float/2addr p0, p1

    .line 173
    invoke-virtual {v0, p0}, Lad5;->e(F)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_2
    check-cast p0, Lay5;

    .line 182
    .line 183
    check-cast p1, Lln7;

    .line 184
    .line 185
    instance-of v0, p1, Lp9;

    .line 186
    .line 187
    if-eqz v0, :cond_4

    .line 188
    .line 189
    check-cast p1, Lp9;

    .line 190
    .line 191
    iget-object p1, p1, Lp9;->K:Lgg0;

    .line 192
    .line 193
    invoke-virtual {p0, p1}, Lay5;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    const-string p0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    .line 200
    .line 201
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :goto_2
    return-object v7

    .line 205
    :pswitch_3
    check-cast p0, Lwc7;

    .line 206
    .line 207
    check-cast p1, Lvr2;

    .line 208
    .line 209
    invoke-interface {p1, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object p0, Lvs7;->a:Lvs7;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_4
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 216
    .line 217
    check-cast p1, Lhz1;

    .line 218
    .line 219
    invoke-interface {p1}, Lhz1;->j0()Lwr0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lwr0;->D()Lqk0;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-interface {p1}, Lhz1;->e()J

    .line 228
    .line 229
    .line 230
    move-result-wide v4

    .line 231
    shr-long v3, v4, v3

    .line 232
    .line 233
    long-to-int v3, v3

    .line 234
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    float-to-int v3, v3

    .line 239
    invoke-interface {p1}, Lhz1;->e()J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    and-long/2addr v1, v4

    .line 244
    long-to-int p1, v1

    .line 245
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    float-to-int p1, p1

    .line 250
    invoke-virtual {p0, v6, v6, v3, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 251
    .line 252
    .line 253
    invoke-static {v0}, Lpd;->a(Lqk0;)Landroid/graphics/Canvas;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lvs7;->a:Lvs7;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_5
    check-cast p0, Lcf4;

    .line 264
    .line 265
    check-cast p1, Lub4;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object p0, p0, Lcf4;->z:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p0, Lms3;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_6
    check-cast p0, Ly57;

    .line 276
    .line 277
    check-cast p1, Ll76;

    .line 278
    .line 279
    const/4 v0, 0x4

    .line 280
    invoke-static {p0, v0}, Ly57;->a1(Ly57;I)Lz57;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    const/16 v0, 0x15

    .line 285
    .line 286
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    const/high16 v5, 0x3f800000    # 1.0f

    .line 291
    .line 292
    if-eqz v0, :cond_5

    .line 293
    .line 294
    iget v0, p0, Lz57;->H:F

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_5
    move v0, v5

    .line 298
    :goto_3
    invoke-virtual {p1, v0}, Ll76;->c(F)V

    .line 299
    .line 300
    .line 301
    const/16 v0, 0x16

    .line 302
    .line 303
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_6

    .line 308
    .line 309
    iget v0, p0, Lz57;->I:F

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_6
    move v0, v5

    .line 313
    :goto_4
    invoke-virtual {p1, v0}, Ll76;->l(F)V

    .line 314
    .line 315
    .line 316
    const/16 v0, 0x17

    .line 317
    .line 318
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_7

    .line 323
    .line 324
    iget v5, p0, Lz57;->J:F

    .line 325
    .line 326
    :cond_7
    invoke-virtual {p1, v5}, Ll76;->m(F)V

    .line 327
    .line 328
    .line 329
    const/16 v0, 0x18

    .line 330
    .line 331
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_8

    .line 336
    .line 337
    iget v0, p0, Lz57;->K:F

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_8
    move v0, v4

    .line 341
    :goto_5
    invoke-virtual {p1, v0}, Ll76;->y(F)V

    .line 342
    .line 343
    .line 344
    const/16 v0, 0x19

    .line 345
    .line 346
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_9

    .line 351
    .line 352
    iget v0, p0, Lz57;->L:F

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_9
    move v0, v4

    .line 356
    :goto_6
    invoke-virtual {p1, v0}, Ll76;->A(F)V

    .line 357
    .line 358
    .line 359
    const/16 v0, 0x1a

    .line 360
    .line 361
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_a

    .line 366
    .line 367
    iget v0, p0, Lz57;->M:F

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_a
    move v0, v4

    .line 371
    :goto_7
    invoke-virtual {p1, v0}, Ll76;->h(F)V

    .line 372
    .line 373
    .line 374
    const/16 v0, 0x1b

    .line 375
    .line 376
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_b

    .line 381
    .line 382
    iget v0, p0, Lz57;->N:F

    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_b
    move v0, v4

    .line 386
    :goto_8
    invoke-virtual {p1, v0}, Ll76;->j(F)V

    .line 387
    .line 388
    .line 389
    const/16 v0, 0x1c

    .line 390
    .line 391
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_c

    .line 396
    .line 397
    iget v4, p0, Lz57;->O:F

    .line 398
    .line 399
    :cond_c
    invoke-virtual {p1, v4}, Ll76;->k(F)V

    .line 400
    .line 401
    .line 402
    const/16 v0, 0x36

    .line 403
    .line 404
    invoke-virtual {p0, v0}, Lz57;->w(I)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_d

    .line 409
    .line 410
    iget-object v7, p0, Lz57;->T:Llt0;

    .line 411
    .line 412
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    :cond_d
    invoke-virtual {p1, v7}, Ll76;->g(Llt0;)V

    .line 416
    .line 417
    .line 418
    sget-wide v4, Lql7;->b:J

    .line 419
    .line 420
    const/16 v0, 0x1d

    .line 421
    .line 422
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    const/16 v8, 0x1e

    .line 427
    .line 428
    if-nez v7, :cond_e

    .line 429
    .line 430
    invoke-virtual {p0, v8}, Lz57;->v(B)Z

    .line 431
    .line 432
    .line 433
    move-result v7

    .line 434
    if-eqz v7, :cond_11

    .line 435
    .line 436
    :cond_e
    shr-long v9, v4, v3

    .line 437
    .line 438
    long-to-int v3, v9

    .line 439
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_f

    .line 448
    .line 449
    iget v3, p0, Lz57;->P:F

    .line 450
    .line 451
    :cond_f
    and-long v0, v4, v1

    .line 452
    .line 453
    long-to-int v0, v0

    .line 454
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    invoke-virtual {p0, v8}, Lz57;->v(B)Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    if-eqz v1, :cond_10

    .line 463
    .line 464
    iget v0, p0, Lz57;->Q:F

    .line 465
    .line 466
    :cond_10
    invoke-static {v3, v0}, Lo55;->a(FF)J

    .line 467
    .line 468
    .line 469
    move-result-wide v4

    .line 470
    :cond_11
    invoke-virtual {p1, v4, v5}, Ll76;->w(J)V

    .line 471
    .line 472
    .line 473
    const/16 v0, 0x1f

    .line 474
    .line 475
    invoke-virtual {p0, v0}, Lz57;->v(B)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_12

    .line 480
    .line 481
    iget-boolean v6, p0, Lz57;->D:Z

    .line 482
    .line 483
    :cond_12
    invoke-virtual {p1, v6}, Ll76;->f(Z)V

    .line 484
    .line 485
    .line 486
    sget-object v0, Lgr8;->h:Lm23;

    .line 487
    .line 488
    const/16 v1, 0x35

    .line 489
    .line 490
    invoke-virtual {p0, v1}, Lz57;->w(I)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_13

    .line 495
    .line 496
    iget-object v0, p0, Lz57;->E:Lpq6;

    .line 497
    .line 498
    :cond_13
    invoke-virtual {p1, v0}, Ll76;->r(Lpq6;)V

    .line 499
    .line 500
    .line 501
    sget-object p0, Lvs7;->a:Lvs7;

    .line 502
    .line 503
    return-object p0

    .line 504
    :pswitch_7
    check-cast p0, Lh47;

    .line 505
    .line 506
    check-cast p1, Ly53;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    new-instance v0, Ly63;

    .line 512
    .line 513
    invoke-direct {v0}, Ly63;-><init>()V

    .line 514
    .line 515
    .line 516
    iget-object p0, p0, Lh47;->c:Lc47;

    .line 517
    .line 518
    iget-wide v1, p0, Lc47;->u:J

    .line 519
    .line 520
    invoke-static {v1, v2}, Lu02;->e(J)J

    .line 521
    .line 522
    .line 523
    move-result-wide v1

    .line 524
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-virtual {v0, p0}, Ly63;->b(Ljava/lang/Long;)V

    .line 529
    .line 530
    .line 531
    sget-object p0, Lvs7;->a:Lvs7;

    .line 532
    .line 533
    invoke-virtual {p1, v0}, Ly53;->c(Ly63;)V

    .line 534
    .line 535
    .line 536
    return-object p0

    .line 537
    :pswitch_8
    check-cast p0, Lcy6;

    .line 538
    .line 539
    iget-object v1, p0, Lcy6;->h:Ljava/lang/Object;

    .line 540
    .line 541
    monitor-enter v1

    .line 542
    :try_start_0
    iget-object p0, p0, Lcy6;->j:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast p0, Lby6;

    .line 545
    .line 546
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    iget-object v0, p0, Lby6;->b:Ljava/lang/Object;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    iget v2, p0, Lby6;->d:I

    .line 555
    .line 556
    iget-object v3, p0, Lby6;->c:Lhp4;

    .line 557
    .line 558
    if-nez v3, :cond_14

    .line 559
    .line 560
    new-instance v3, Lhp4;

    .line 561
    .line 562
    invoke-direct {v3}, Lhp4;-><init>()V

    .line 563
    .line 564
    .line 565
    iput-object v3, p0, Lby6;->c:Lhp4;

    .line 566
    .line 567
    iget-object v4, p0, Lby6;->f:Ltp4;

    .line 568
    .line 569
    invoke-virtual {v4, v0, v3}, Ltp4;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    :cond_14
    invoke-virtual {p0, p1, v2, v0, v3}, Lby6;->b(Ljava/lang/Object;ILjava/lang/Object;Lhp4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 573
    .line 574
    .line 575
    monitor-exit v1

    .line 576
    sget-object p0, Lvs7;->a:Lvs7;

    .line 577
    .line 578
    return-object p0

    .line 579
    :catchall_0
    move-exception v0

    .line 580
    move-object p0, v0

    .line 581
    monitor-exit v1

    .line 582
    throw p0

    .line 583
    :pswitch_9
    check-cast p0, Lnw6;

    .line 584
    .line 585
    check-cast p1, Lhb2;

    .line 586
    .line 587
    iget-object p1, p1, Lhb2;->a:Ljava/lang/Object;

    .line 588
    .line 589
    invoke-static {p1, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result p0

    .line 593
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    return-object p0

    .line 598
    :pswitch_a
    check-cast p0, Lgv6;

    .line 599
    .line 600
    check-cast p1, Lhn4;

    .line 601
    .line 602
    iget-object p1, p1, Lhn4;->e:Lst2;

    .line 603
    .line 604
    invoke-static {p1}, Lhj8;->m(Lst2;)Lst2;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-virtual {p0, p1}, Lgv6;->f(Lst2;)I

    .line 609
    .line 610
    .line 611
    move-result p0

    .line 612
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    return-object p0

    .line 617
    :pswitch_b
    check-cast p0, Lqu6;

    .line 618
    .line 619
    iget-object v0, p0, Lqu6;->B:Lxk6;

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    iget-object v1, p0, Lqu6;->B:Lxk6;

    .line 625
    .line 626
    invoke-static {v1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-nez v0, :cond_15

    .line 631
    .line 632
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 633
    .line 634
    invoke-static {v0}, Lvm5;->b(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    :cond_15
    iget-object v0, p0, Lqu6;->A:Lup4;

    .line 638
    .line 639
    iget-object v1, p0, Lqu6;->y:Ljava/lang/Object;

    .line 640
    .line 641
    if-nez v0, :cond_17

    .line 642
    .line 643
    if-nez v1, :cond_16

    .line 644
    .line 645
    iput-object p1, p0, Lqu6;->y:Ljava/lang/Object;

    .line 646
    .line 647
    goto :goto_a

    .line 648
    :cond_16
    sget-object v0, Lcg6;->a:Lup4;

    .line 649
    .line 650
    new-instance v0, Lup4;

    .line 651
    .line 652
    invoke-direct {v0}, Lup4;-><init>()V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v1}, Lup4;->a(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, p1}, Lup4;->a(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    iput-object v0, p0, Lqu6;->A:Lup4;

    .line 662
    .line 663
    iput-object v7, p0, Lqu6;->y:Ljava/lang/Object;

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :cond_17
    if-nez v1, :cond_18

    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_18
    const-string p0, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 670
    .line 671
    invoke-static {p0}, Lvm5;->b(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :goto_9
    invoke-virtual {v0, p1}, Lup4;->a(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    :goto_a
    sget-object p0, Lvs7;->a:Lvs7;

    .line 678
    .line 679
    return-object p0

    .line 680
    :pswitch_c
    move-object v7, p0

    .line 681
    check-cast v7, Lzc9;

    .line 682
    .line 683
    check-cast p1, Lqk5;

    .line 684
    .line 685
    iget-wide v9, p1, Lqk5;->c:J

    .line 686
    .line 687
    iget-object p0, v7, Lzc9;->z:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast p0, Lze7;

    .line 690
    .line 691
    invoke-virtual {p0}, Lze7;->k()Z

    .line 692
    .line 693
    .line 694
    move-result v0

    .line 695
    if-eqz v0, :cond_1b

    .line 696
    .line 697
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    iget-object v0, v0, Lhf7;->a:Lvl;

    .line 702
    .line 703
    iget-object v0, v0, Lvl;->x:Ljava/lang/String;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_19

    .line 710
    .line 711
    goto :goto_b

    .line 712
    :cond_19
    iget-object v0, p0, Lze7;->d:Lu44;

    .line 713
    .line 714
    if-eqz v0, :cond_1b

    .line 715
    .line 716
    invoke-virtual {v0}, Lu44;->d()Lcg7;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    if-nez v0, :cond_1a

    .line 721
    .line 722
    goto :goto_b

    .line 723
    :cond_1a
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 724
    .line 725
    .line 726
    move-result-object v8

    .line 727
    const/4 v11, 0x0

    .line 728
    sget-object v12, Ld63;->K:Lku4;

    .line 729
    .line 730
    invoke-virtual/range {v7 .. v12}, Lzc9;->e(Lhf7;JZLlj6;)J

    .line 731
    .line 732
    .line 733
    goto :goto_c

    .line 734
    :cond_1b
    :goto_b
    move v5, v6

    .line 735
    :goto_c
    if-eqz v5, :cond_1c

    .line 736
    .line 737
    invoke-virtual {p1}, Lqk5;->a()V

    .line 738
    .line 739
    .line 740
    :cond_1c
    sget-object p0, Lvs7;->a:Lvs7;

    .line 741
    .line 742
    return-object p0

    .line 743
    :pswitch_d
    check-cast p0, Lzh6;

    .line 744
    .line 745
    check-cast p1, Ll35;

    .line 746
    .line 747
    iget-object v0, p0, Lzh6;->k:Leh6;

    .line 748
    .line 749
    iget-wide v1, p1, Ll35;->a:J

    .line 750
    .line 751
    iget p1, p0, Lzh6;->j:I

    .line 752
    .line 753
    invoke-virtual {p0, v0, v1, v2, p1}, Lzh6;->d(Leh6;JI)J

    .line 754
    .line 755
    .line 756
    move-result-wide p0

    .line 757
    new-instance v0, Ll35;

    .line 758
    .line 759
    invoke-direct {v0, p0, p1}, Ll35;-><init>(J)V

    .line 760
    .line 761
    .line 762
    return-object v0

    .line 763
    :pswitch_e
    check-cast p0, Lgh6;

    .line 764
    .line 765
    check-cast p1, Ljava/lang/Float;

    .line 766
    .line 767
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 768
    .line 769
    .line 770
    move-result p1

    .line 771
    iget-object v0, p0, Lgh6;->a:Lbd5;

    .line 772
    .line 773
    invoke-virtual {v0}, Lbd5;->d()I

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    int-to-float v1, v1

    .line 778
    add-float/2addr v1, p1

    .line 779
    iget v2, p0, Lgh6;->g:F

    .line 780
    .line 781
    add-float/2addr v1, v2

    .line 782
    iget-object v2, p0, Lgh6;->f:Lbd5;

    .line 783
    .line 784
    invoke-virtual {v2}, Lbd5;->d()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    int-to-float v2, v2

    .line 789
    invoke-static {v1, v4, v2}, Lz65;->o(FFF)F

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    cmpg-float v1, v1, v2

    .line 794
    .line 795
    if-nez v1, :cond_1d

    .line 796
    .line 797
    goto :goto_d

    .line 798
    :cond_1d
    move v5, v6

    .line 799
    :goto_d
    invoke-virtual {v0}, Lbd5;->d()I

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    int-to-float v1, v1

    .line 804
    sub-float/2addr v2, v1

    .line 805
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    invoke-virtual {v0}, Lbd5;->d()I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    add-int/2addr v3, v1

    .line 814
    invoke-virtual {v0, v3}, Lbd5;->e(I)V

    .line 815
    .line 816
    .line 817
    int-to-float v0, v1

    .line 818
    sub-float v0, v2, v0

    .line 819
    .line 820
    iput v0, p0, Lgh6;->g:F

    .line 821
    .line 822
    if-nez v5, :cond_1e

    .line 823
    .line 824
    move p1, v2

    .line 825
    :cond_1e
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 826
    .line 827
    .line 828
    move-result-object p0

    .line 829
    return-object p0

    .line 830
    :pswitch_f
    check-cast p0, Lay6;

    .line 831
    .line 832
    invoke-virtual {p0, p1}, Lay6;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    sget-object p0, Lvs7;->a:Lvs7;

    .line 836
    .line 837
    return-object p0

    .line 838
    :pswitch_10
    check-cast p0, Loe6;

    .line 839
    .line 840
    invoke-interface {p0, p1}, Loe6;->f(Ljava/lang/Object;)V

    .line 841
    .line 842
    .line 843
    sget-object p0, Lvs7;->a:Lvs7;

    .line 844
    .line 845
    return-object p0

    .line 846
    :pswitch_11
    check-cast p0, Lpe6;

    .line 847
    .line 848
    iget-object p0, p0, Lpe6;->y:Lre6;

    .line 849
    .line 850
    if-eqz p0, :cond_1f

    .line 851
    .line 852
    invoke-interface {p0, p1}, Lre6;->c(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    :cond_1f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 857
    .line 858
    .line 859
    move-result-object p0

    .line 860
    return-object p0

    .line 861
    :pswitch_12
    check-cast p0, Ldq1;

    .line 862
    .line 863
    check-cast p1, Lir2;

    .line 864
    .line 865
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iput-object p1, p0, Ldq1;->i:Ljava/lang/Object;

    .line 869
    .line 870
    sget-object p0, Lvs7;->a:Lvs7;

    .line 871
    .line 872
    return-object p0

    .line 873
    :pswitch_13
    check-cast p0, Lse4;

    .line 874
    .line 875
    check-cast p1, [Ljava/lang/String;

    .line 876
    .line 877
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    invoke-virtual {p0, p1}, Lse4;->d0(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    sget-object p0, Lvs7;->a:Lvs7;

    .line 884
    .line 885
    return-object p0

    .line 886
    :pswitch_14
    check-cast p0, Lg36;

    .line 887
    .line 888
    check-cast p1, Ljava/util/Map;

    .line 889
    .line 890
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    iget-object p1, p0, Lg36;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 894
    .line 895
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 896
    .line 897
    .line 898
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 899
    .line 900
    .line 901
    move-result-object p1

    .line 902
    iget-object v0, p0, Lg36;->d:Lh81;

    .line 903
    .line 904
    new-instance v1, Lf36;

    .line 905
    .line 906
    invoke-direct {v1, p0, v7}, Lf36;-><init>(Lg36;Lf61;)V

    .line 907
    .line 908
    .line 909
    const/4 p0, 0x2

    .line 910
    invoke-static {p1, v0, v7, v1, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 911
    .line 912
    .line 913
    sget-object p0, Lvs7;->a:Lvs7;

    .line 914
    .line 915
    return-object p0

    .line 916
    :pswitch_15
    check-cast p0, La06;

    .line 917
    .line 918
    check-cast p1, Ljava/util/Map;

    .line 919
    .line 920
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 924
    .line 925
    .line 926
    move-result-object p1

    .line 927
    new-instance v0, Lzz5;

    .line 928
    .line 929
    invoke-direct {v0, p0, v7, v5}, Lzz5;-><init>(La06;Lf61;I)V

    .line 930
    .line 931
    .line 932
    const/4 p0, 0x3

    .line 933
    invoke-static {p1, v7, v7, v0, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 934
    .line 935
    .line 936
    sget-object p0, Lvs7;->a:Lvs7;

    .line 937
    .line 938
    return-object p0

    .line 939
    :pswitch_16
    check-cast p0, Ljy5;

    .line 940
    .line 941
    check-cast p1, Lh22;

    .line 942
    .line 943
    invoke-virtual {p0, p1}, Ljy5;->a(Lh22;)V

    .line 944
    .line 945
    .line 946
    sget-object p0, Lvs7;->a:Lvs7;

    .line 947
    .line 948
    return-object p0

    .line 949
    :pswitch_17
    check-cast p0, Lgy5;

    .line 950
    .line 951
    check-cast p1, Ljava/lang/Throwable;

    .line 952
    .line 953
    const-string v0, "Recomposer effect job completed"

    .line 954
    .line 955
    invoke-static {v0, p1}, Lrc9;->b(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    iget-object v1, p0, Lgy5;->c:Ljava/lang/Object;

    .line 960
    .line 961
    monitor-enter v1

    .line 962
    :try_start_1
    iget-object v2, p0, Lgy5;->d:Lel3;

    .line 963
    .line 964
    if-eqz v2, :cond_20

    .line 965
    .line 966
    iget-object v3, p0, Lgy5;->u:Ld37;

    .line 967
    .line 968
    sget-object v4, Ldy5;->x:Ldy5;

    .line 969
    .line 970
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v3, v7, v4}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    invoke-interface {v2, v0}, Lel3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 977
    .line 978
    .line 979
    iput-object v7, p0, Lgy5;->r:Lkk0;

    .line 980
    .line 981
    new-instance v0, Lw34;

    .line 982
    .line 983
    const/16 v3, 0x14

    .line 984
    .line 985
    invoke-direct {v0, v3, p0, p1}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    invoke-interface {v2, v0}, Lel3;->v(Lvr2;)Lmw1;

    .line 989
    .line 990
    .line 991
    goto :goto_e

    .line 992
    :catchall_1
    move-exception v0

    .line 993
    move-object p0, v0

    .line 994
    goto :goto_f

    .line 995
    :cond_20
    iput-object v0, p0, Lgy5;->e:Ljava/lang/Throwable;

    .line 996
    .line 997
    iget-object p0, p0, Lgy5;->u:Ld37;

    .line 998
    .line 999
    sget-object p1, Ldy5;->w:Ldy5;

    .line 1000
    .line 1001
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {p0, v7, p1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1005
    .line 1006
    .line 1007
    :goto_e
    monitor-exit v1

    .line 1008
    sget-object p0, Lvs7;->a:Lvs7;

    .line 1009
    .line 1010
    return-object p0

    .line 1011
    :goto_f
    monitor-exit v1

    .line 1012
    throw p0

    .line 1013
    :pswitch_18
    check-cast p0, Lpy0;

    .line 1014
    .line 1015
    invoke-virtual {p0, p1}, Lpy0;->h(Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    sget-object p0, Lvs7;->a:Lvs7;

    .line 1019
    .line 1020
    return-object p0

    .line 1021
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
