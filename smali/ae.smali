.class public final Lae;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lae;->x:I

    .line 2
    .line 3
    iput-object p2, p0, Lae;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lae;->z:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lae;->x:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    iget-object v5, p0, Lae;->z:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lae;->y:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lvr2;

    .line 16
    .line 17
    sget-object v0, Lxz4;->m0:Ll76;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    check-cast v5, Lxz4;

    .line 23
    .line 24
    iget-object p0, v5, Lxz4;->d0:Lpq6;

    .line 25
    .line 26
    iget-object v1, v0, Ll76;->K:Lpq6;

    .line 27
    .line 28
    invoke-static {p0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    iget-boolean v1, v5, Lxz4;->e0:Z

    .line 33
    .line 34
    iget-boolean v6, v0, Ll76;->L:Z

    .line 35
    .line 36
    if-eq v1, v6, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    if-eqz p0, :cond_1

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    :cond_1
    iget-object v1, v0, Ll76;->K:Lpq6;

    .line 44
    .line 45
    iput-object v1, v5, Lxz4;->d0:Lpq6;

    .line 46
    .line 47
    iput-boolean v6, v5, Lxz4;->e0:Z

    .line 48
    .line 49
    iget-boolean v1, v5, Lxz4;->f0:Z

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    :cond_2
    iget-object p0, v5, Lxz4;->O:Luy3;

    .line 60
    .line 61
    invoke-virtual {p0}, Luy3;->H()V

    .line 62
    .line 63
    .line 64
    :cond_3
    iput-boolean v3, v5, Lxz4;->f0:Z

    .line 65
    .line 66
    iget-object p0, v0, Ll76;->K:Lpq6;

    .line 67
    .line 68
    iget-wide v1, v0, Ll76;->N:J

    .line 69
    .line 70
    iget-object v3, v0, Ll76;->Q:Ley3;

    .line 71
    .line 72
    iget-object v5, v0, Ll76;->P:Ltp1;

    .line 73
    .line 74
    invoke-interface {p0, v1, v2, v3, v5}, Lpq6;->a(JLey3;Ltp1;)Ln85;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput-object p0, v0, Ll76;->T:Ln85;

    .line 79
    .line 80
    return-object v4

    .line 81
    :pswitch_0
    check-cast p0, Luy3;

    .line 82
    .line 83
    iget-object p0, p0, Luy3;->a0:Lo00;

    .line 84
    .line 85
    check-cast v5, Lh06;

    .line 86
    .line 87
    iget-object v0, p0, Lo00;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lll4;

    .line 90
    .line 91
    iget v0, v0, Lll4;->z:I

    .line 92
    .line 93
    and-int/lit8 v0, v0, 0x8

    .line 94
    .line 95
    if-eqz v0, :cond_e

    .line 96
    .line 97
    iget-object p0, p0, Lo00;->f:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lib7;

    .line 100
    .line 101
    :goto_0
    if-eqz p0, :cond_e

    .line 102
    .line 103
    iget v0, p0, Lll4;->y:I

    .line 104
    .line 105
    and-int/lit8 v0, v0, 0x8

    .line 106
    .line 107
    if-eqz v0, :cond_d

    .line 108
    .line 109
    move-object v0, p0

    .line 110
    move-object v6, v1

    .line 111
    :goto_1
    if-eqz v0, :cond_d

    .line 112
    .line 113
    instance-of v7, v0, Ldk6;

    .line 114
    .line 115
    if-eqz v7, :cond_6

    .line 116
    .line 117
    check-cast v0, Ldk6;

    .line 118
    .line 119
    invoke-interface {v0}, Ldk6;->J()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_4

    .line 124
    .line 125
    new-instance v7, Lak6;

    .line 126
    .line 127
    invoke-direct {v7}, Lak6;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v7, v5, Lh06;->w:Ljava/lang/Object;

    .line 131
    .line 132
    iput-boolean v3, v7, Lak6;->z:Z

    .line 133
    .line 134
    :cond_4
    invoke-interface {v0}, Ldk6;->G0()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_5

    .line 139
    .line 140
    iget-object v7, v5, Lh06;->w:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v7, Lak6;

    .line 143
    .line 144
    iput-boolean v3, v7, Lak6;->y:Z

    .line 145
    .line 146
    :cond_5
    iget-object v7, v5, Lh06;->w:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v7, Lok6;

    .line 149
    .line 150
    invoke-interface {v0, v7}, Ldk6;->D0(Lok6;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    iget v7, v0, Lll4;->y:I

    .line 155
    .line 156
    and-int/lit8 v7, v7, 0x8

    .line 157
    .line 158
    if-eqz v7, :cond_c

    .line 159
    .line 160
    instance-of v7, v0, Lwo1;

    .line 161
    .line 162
    if-eqz v7, :cond_c

    .line 163
    .line 164
    move-object v7, v0

    .line 165
    check-cast v7, Lwo1;

    .line 166
    .line 167
    iget-object v7, v7, Lwo1;->L:Lll4;

    .line 168
    .line 169
    move v8, v2

    .line 170
    :goto_2
    if-eqz v7, :cond_b

    .line 171
    .line 172
    iget v9, v7, Lll4;->y:I

    .line 173
    .line 174
    and-int/lit8 v9, v9, 0x8

    .line 175
    .line 176
    if-eqz v9, :cond_a

    .line 177
    .line 178
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    if-ne v8, v3, :cond_7

    .line 181
    .line 182
    move-object v0, v7

    .line 183
    goto :goto_3

    .line 184
    :cond_7
    if-nez v6, :cond_8

    .line 185
    .line 186
    new-instance v6, Leq4;

    .line 187
    .line 188
    const/16 v9, 0x10

    .line 189
    .line 190
    new-array v9, v9, [Lll4;

    .line 191
    .line 192
    invoke-direct {v6, v9}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_8
    if-eqz v0, :cond_9

    .line 196
    .line 197
    invoke-virtual {v6, v0}, Leq4;->b(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v0, v1

    .line 201
    :cond_9
    invoke-virtual {v6, v7}, Leq4;->b(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_a
    :goto_3
    iget-object v7, v7, Lll4;->B:Lll4;

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_b
    if-ne v8, v3, :cond_c

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_c
    :goto_4
    invoke-static {v6}, Lrc9;->j(Leq4;)Lll4;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    goto :goto_1

    .line 215
    :cond_d
    iget-object p0, p0, Lll4;->A:Lll4;

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_e
    return-object v4

    .line 219
    :pswitch_1
    check-cast p0, Lc03;

    .line 220
    .line 221
    check-cast v5, Lll4;

    .line 222
    .line 223
    invoke-virtual {p0, v5}, Lc03;->d(Lll4;)V

    .line 224
    .line 225
    .line 226
    return-object v4

    .line 227
    :pswitch_2
    check-cast p0, Lh06;

    .line 228
    .line 229
    check-cast v5, Lvk2;

    .line 230
    .line 231
    invoke-virtual {v5}, Lvk2;->X0()Lmk2;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iput-object v0, p0, Lh06;->w:Ljava/lang/Object;

    .line 236
    .line 237
    return-object v4

    .line 238
    :pswitch_3
    check-cast p0, Lbh0;

    .line 239
    .line 240
    iget-object p0, p0, Lbh0;->M:Lvr2;

    .line 241
    .line 242
    check-cast v5, Lch0;

    .line 243
    .line 244
    invoke-interface {p0, v5}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    return-object v4

    .line 248
    :pswitch_4
    check-cast p0, Lsr2;

    .line 249
    .line 250
    if-eqz p0, :cond_10

    .line 251
    .line 252
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    check-cast p0, Lly5;

    .line 257
    .line 258
    if-nez p0, :cond_f

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_f
    move-object v1, p0

    .line 262
    goto :goto_7

    .line 263
    :cond_10
    :goto_5
    check-cast v5, Lxz4;

    .line 264
    .line 265
    invoke-virtual {v5}, Lxz4;->c1()Lll4;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-boolean p0, p0, Lll4;->J:Z

    .line 270
    .line 271
    if-eqz p0, :cond_11

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_11
    move-object v5, v1

    .line 275
    :goto_6
    if-eqz v5, :cond_12

    .line 276
    .line 277
    iget-wide v0, v5, Leh5;->y:J

    .line 278
    .line 279
    invoke-static {v0, v1}, Lpv8;->O(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v0

    .line 283
    const-wide/16 v2, 0x0

    .line 284
    .line 285
    invoke-static {v2, v3, v0, v1}, Lz85;->c(JJ)Lly5;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :cond_12
    :goto_7
    return-object v1

    .line 290
    :pswitch_5
    check-cast v5, Loe;

    .line 291
    .line 292
    check-cast p0, Ldh6;

    .line 293
    .line 294
    iget-object v0, p0, Ldh6;->A:Lvg6;

    .line 295
    .line 296
    iget-object v1, p0, Ldh6;->B:Lvg6;

    .line 297
    .line 298
    iget-object v2, p0, Ldh6;->y:Ljava/lang/Float;

    .line 299
    .line 300
    iget-object v3, p0, Ldh6;->z:Ljava/lang/Float;

    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    if-eqz v0, :cond_13

    .line 304
    .line 305
    if-eqz v2, :cond_13

    .line 306
    .line 307
    iget-object v7, v0, Lvg6;->a:Lsr2;

    .line 308
    .line 309
    invoke-interface {v7}, Lsr2;->b()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    check-cast v7, Ljava/lang/Number;

    .line 314
    .line 315
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    sub-float/2addr v7, v2

    .line 324
    goto :goto_8

    .line 325
    :cond_13
    move v7, v6

    .line 326
    :goto_8
    if-eqz v1, :cond_14

    .line 327
    .line 328
    if-eqz v3, :cond_14

    .line 329
    .line 330
    iget-object v2, v1, Lvg6;->a:Lsr2;

    .line 331
    .line 332
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    check-cast v2, Ljava/lang/Number;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    sub-float/2addr v2, v3

    .line 347
    goto :goto_9

    .line 348
    :cond_14
    move v2, v6

    .line 349
    :goto_9
    cmpg-float v3, v7, v6

    .line 350
    .line 351
    if-nez v3, :cond_15

    .line 352
    .line 353
    cmpg-float v2, v2, v6

    .line 354
    .line 355
    if-nez v2, :cond_15

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_15
    iget v2, p0, Ldh6;->w:I

    .line 359
    .line 360
    invoke-virtual {v5, v2}, Loe;->z(I)I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-virtual {v5}, Loe;->r()Lme3;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    iget v6, v5, Loe;->G:I

    .line 369
    .line 370
    invoke-virtual {v3, v6}, Lme3;->b(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    check-cast v3, Lhk6;

    .line 375
    .line 376
    if-eqz v3, :cond_16

    .line 377
    .line 378
    :try_start_0
    iget-object v6, v5, Loe;->I:Lc5;

    .line 379
    .line 380
    if-eqz v6, :cond_16

    .line 381
    .line 382
    invoke-virtual {v5, v3}, Loe;->k(Lhk6;)Landroid/graphics/Rect;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    iget-object v6, v6, Lc5;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 387
    .line 388
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 389
    .line 390
    .line 391
    :catch_0
    :cond_16
    invoke-virtual {v5}, Loe;->r()Lme3;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    iget v6, v5, Loe;->H:I

    .line 396
    .line 397
    invoke-virtual {v3, v6}, Lme3;->b(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    check-cast v3, Lhk6;

    .line 402
    .line 403
    if-eqz v3, :cond_17

    .line 404
    .line 405
    :try_start_1
    iget-object v6, v5, Loe;->J:Lc5;

    .line 406
    .line 407
    if-eqz v6, :cond_17

    .line 408
    .line 409
    invoke-virtual {v5, v3}, Loe;->k(Lhk6;)Landroid/graphics/Rect;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    iget-object v6, v6, Lc5;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 414
    .line 415
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 416
    .line 417
    .line 418
    :catch_1
    :cond_17
    iget-object v3, v5, Loe;->z:Lje;

    .line 419
    .line 420
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5}, Loe;->r()Lme3;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {v3, v2}, Lme3;->b(I)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    check-cast v3, Lhk6;

    .line 432
    .line 433
    if-eqz v3, :cond_1a

    .line 434
    .line 435
    iget-object v3, v3, Lhk6;->a:Lfk6;

    .line 436
    .line 437
    if-eqz v3, :cond_1a

    .line 438
    .line 439
    iget-object v3, v3, Lfk6;->c:Luy3;

    .line 440
    .line 441
    if-eqz v3, :cond_1a

    .line 442
    .line 443
    if-eqz v0, :cond_18

    .line 444
    .line 445
    iget-object v6, v5, Loe;->L:Lyo4;

    .line 446
    .line 447
    invoke-virtual {v6, v2, v0}, Lyo4;->i(ILjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_18
    if-eqz v1, :cond_19

    .line 451
    .line 452
    iget-object v6, v5, Loe;->M:Lyo4;

    .line 453
    .line 454
    invoke-virtual {v6, v2, v1}, Lyo4;->i(ILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_19
    invoke-virtual {v5, v3}, Loe;->v(Luy3;)V

    .line 458
    .line 459
    .line 460
    :cond_1a
    :goto_a
    if-eqz v0, :cond_1b

    .line 461
    .line 462
    iget-object v0, v0, Lvg6;->a:Lsr2;

    .line 463
    .line 464
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    check-cast v0, Ljava/lang/Float;

    .line 469
    .line 470
    iput-object v0, p0, Ldh6;->y:Ljava/lang/Float;

    .line 471
    .line 472
    :cond_1b
    if-eqz v1, :cond_1c

    .line 473
    .line 474
    iget-object v0, v1, Lvg6;->a:Lsr2;

    .line 475
    .line 476
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    check-cast v0, Ljava/lang/Float;

    .line 481
    .line 482
    iput-object v0, p0, Ldh6;->z:Ljava/lang/Float;

    .line 483
    .line 484
    :cond_1c
    return-object v4

    .line 485
    :pswitch_6
    check-cast p0, Lje;

    .line 486
    .line 487
    check-cast v5, Landroid/view/KeyEvent;

    .line 488
    .line 489
    invoke-static {p0, v5}, Lje;->c(Lje;Landroid/view/KeyEvent;)Z

    .line 490
    .line 491
    .line 492
    move-result p0

    .line 493
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    return-object p0

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
