.class public final synthetic Ln17;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Ln17;->w:I

    iput-object p2, p0, Ln17;->x:Ljava/lang/Object;

    iput-object p3, p0, Ln17;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lfg7;Lul;Lhj;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput p1, p0, Ln17;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ln17;->x:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Ln17;->y:Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget v0, p0, Ln17;->w:I

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
    iget-object v5, p0, Ln17;->y:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ln17;->x:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lay4;

    .line 16
    .line 17
    check-cast v5, Ll8;

    .line 18
    .line 19
    iget-object p0, p0, Lay4;->x:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ln98;

    .line 22
    .line 23
    invoke-interface {p0, v5}, Ln98;->b(Ll8;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    check-cast v5, Lio/ktor/http/Url;

    .line 30
    .line 31
    invoke-static {p0, v5}, Lio/ktor/http/Url;->b(Ljava/util/List;Lio/ktor/http/Url;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p0, Lul;

    .line 37
    .line 38
    check-cast v5, Lhj;

    .line 39
    .line 40
    iget-object p0, p0, Lul;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lb74;

    .line 43
    .line 44
    instance-of v0, p0, La74;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    :try_start_0
    check-cast p0, La74;

    .line 49
    .line 50
    iget-object p0, p0, La74;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v5, p0}, Lhj;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    :catch_0
    :cond_0
    return-object v4

    .line 56
    :pswitch_2
    check-cast p0, Lze7;

    .line 57
    .line 58
    check-cast v5, Laq4;

    .line 59
    .line 60
    invoke-interface {v5}, La37;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lwe3;

    .line 65
    .line 66
    iget-wide v4, v0, Lwe3;->a:J

    .line 67
    .line 68
    invoke-virtual {p0}, Lze7;->i()Ll35;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    if-eqz v0, :cond_8

    .line 78
    .line 79
    iget-wide v8, v0, Ll35;->a:J

    .line 80
    .line 81
    invoke-virtual {p0}, Lze7;->m()Lvl;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iget-object v0, v0, Lvl;->x:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_1

    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_1
    iget-object v0, p0, Lze7;->r:Led5;

    .line 98
    .line 99
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lcy2;

    .line 104
    .line 105
    const/4 v10, -0x1

    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    move v0, v10

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    sget-object v11, Lbf7;->a:[I

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    aget v0, v11, v0

    .line 117
    .line 118
    :goto_0
    if-eq v0, v10, :cond_8

    .line 119
    .line 120
    const-wide v10, 0xffffffffL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    const/4 v12, 0x2

    .line 126
    const/16 v13, 0x20

    .line 127
    .line 128
    if-eq v0, v3, :cond_4

    .line 129
    .line 130
    if-eq v0, v12, :cond_4

    .line 131
    .line 132
    const/4 v3, 0x3

    .line 133
    if-ne v0, v3, :cond_3

    .line 134
    .line 135
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-wide v2, v0, Lhf7;->b:J

    .line 140
    .line 141
    sget v0, Llg7;->c:I

    .line 142
    .line 143
    and-long/2addr v2, v10

    .line 144
    :goto_1
    long-to-int v0, v2

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    invoke-static {}, Lh;->c()V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_4
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-wide v2, v0, Lhf7;->b:J

    .line 156
    .line 157
    sget v0, Llg7;->c:I

    .line 158
    .line 159
    shr-long/2addr v2, v13

    .line 160
    goto :goto_1

    .line 161
    :goto_2
    iget-object v2, p0, Lze7;->d:Lu44;

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    invoke-virtual {v2}, Lu44;->d()Lcg7;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-nez v2, :cond_5

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    iget-object v3, p0, Lze7;->d:Lu44;

    .line 173
    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    iget-object v3, v3, Lu44;->a:Ltd7;

    .line 177
    .line 178
    iget-object v3, v3, Ltd7;->a:Lvl;

    .line 179
    .line 180
    if-nez v3, :cond_6

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    iget-object p0, p0, Lze7;->b:Lv35;

    .line 184
    .line 185
    invoke-interface {p0, v0}, Lv35;->p(I)I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    iget-object v0, v3, Lvl;->x:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-static {p0, v1, v0}, Lz65;->p(III)I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    invoke-virtual {v2, v8, v9}, Lcg7;->d(J)J

    .line 200
    .line 201
    .line 202
    move-result-wide v0

    .line 203
    shr-long/2addr v0, v13

    .line 204
    long-to-int v0, v0

    .line 205
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iget-object v1, v2, Lcg7;->a:Lbg7;

    .line 210
    .line 211
    iget-object v2, v1, Lbg7;->b:Lpn4;

    .line 212
    .line 213
    invoke-virtual {v2, p0}, Lpn4;->d(I)I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    invoke-virtual {v1, p0}, Lbg7;->e(I)F

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-virtual {v1, p0}, Lbg7;->f(I)F

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-static {v0, v8, v1}, Lz65;->o(FFF)F

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    const-wide/16 v8, 0x0

    .line 238
    .line 239
    invoke-static {v4, v5, v8, v9}, Lwe3;->a(JJ)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-nez v3, :cond_7

    .line 244
    .line 245
    sub-float/2addr v0, v1

    .line 246
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    shr-long v3, v4, v13

    .line 251
    .line 252
    long-to-int v3, v3

    .line 253
    div-int/2addr v3, v12

    .line 254
    int-to-float v3, v3

    .line 255
    cmpl-float v0, v0, v3

    .line 256
    .line 257
    if-lez v0, :cond_7

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_7
    invoke-virtual {v2, p0}, Lpn4;->f(I)F

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    invoke-virtual {v2, p0}, Lpn4;->b(I)F

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    sub-float/2addr p0, v0

    .line 269
    const/high16 v2, 0x40000000    # 2.0f

    .line 270
    .line 271
    div-float/2addr p0, v2

    .line 272
    add-float/2addr p0, v0

    .line 273
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    int-to-long v0, v0

    .line 278
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    int-to-long v2, p0

    .line 283
    shl-long/2addr v0, v13

    .line 284
    and-long/2addr v2, v10

    .line 285
    or-long v6, v0, v2

    .line 286
    .line 287
    :cond_8
    :goto_3
    new-instance v2, Ll35;

    .line 288
    .line 289
    invoke-direct {v2, v6, v7}, Ll35;-><init>(J)V

    .line 290
    .line 291
    .line 292
    :goto_4
    return-object v2

    .line 293
    :pswitch_3
    check-cast p0, Lo81;

    .line 294
    .line 295
    check-cast v5, Lvr2;

    .line 296
    .line 297
    new-instance v0, Lgw6;

    .line 298
    .line 299
    const/4 v1, 0x5

    .line 300
    invoke-direct {v0, v5, v2, v1}, Lgw6;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 301
    .line 302
    .line 303
    sget-object v1, Lr81;->z:Lr81;

    .line 304
    .line 305
    invoke-static {p0, v2, v1, v0, v3}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 306
    .line 307
    .line 308
    return-object v4

    .line 309
    :pswitch_4
    check-cast p0, Landroid/content/Context;

    .line 310
    .line 311
    check-cast v5, Landroid/view/textclassifier/TextClassification;

    .line 312
    .line 313
    invoke-static {v5}, Lpc7;->l(Landroid/view/textclassifier/TextClassification;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_9

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    :cond_9
    invoke-static {v5}, Lpc7;->f(Landroid/view/textclassifier/TextClassification;)Landroid/content/Intent;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const/high16 v2, 0xc000000

    .line 328
    .line 329
    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-static {p0}, Lj45;->p(Landroid/app/PendingIntent;)V

    .line 334
    .line 335
    .line 336
    return-object v4

    .line 337
    :pswitch_5
    check-cast p0, Lr11;

    .line 338
    .line 339
    check-cast v5, Laq4;

    .line 340
    .line 341
    invoke-interface {v5, p0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    return-object v4

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
