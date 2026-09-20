.class public final synthetic Lmr4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic y:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

.field public final synthetic z:Landroid/view/WindowManager;


# direct methods
.method public synthetic constructor <init>(Landroid/view/WindowManager$LayoutParams;Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;Landroid/view/WindowManager;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lmr4;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmr4;->x:Landroid/view/WindowManager$LayoutParams;

    .line 8
    .line 9
    iput-object p2, p0, Lmr4;->y:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 10
    .line 11
    iput-object p3, p0, Lmr4;->z:Landroid/view/WindowManager;

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

.method public synthetic constructor <init>(Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lmr4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr4;->y:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    iput-object p2, p0, Lmr4;->x:Landroid/view/WindowManager$LayoutParams;

    iput-object p3, p0, Lmr4;->z:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmr4;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v3, v0, Lmr4;->z:Landroid/view/WindowManager;

    .line 8
    .line 9
    iget-object v4, v0, Lmr4;->x:Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Float;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    move-object/from16 v5, p2

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Float;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sget-object v6, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->K:Ld37;

    .line 31
    .line 32
    iget v6, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 33
    .line 34
    invoke-static {v1}, Ldh4;->C(F)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v6

    .line 39
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 40
    .line 41
    iget v1, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 42
    .line 43
    invoke-static {v5}, Ldh4;->C(F)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    add-int/2addr v5, v1

    .line 48
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 49
    .line 50
    iget-object v0, v0, Lmr4;->y:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 51
    .line 52
    iget-object v0, v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->C:Lvx0;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-interface {v3, v0, v4}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-object v2

    .line 60
    :pswitch_0
    move-object/from16 v13, p1

    .line 61
    .line 62
    check-cast v13, Lyt2;

    .line 63
    .line 64
    move-object/from16 v1, p2

    .line 65
    .line 66
    check-cast v1, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sget-object v5, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->K:Ld37;

    .line 73
    .line 74
    and-int/lit8 v5, v1, 0x3

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x1

    .line 78
    if-eq v5, v6, :cond_1

    .line 79
    .line 80
    move v5, v7

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/4 v5, 0x0

    .line 83
    :goto_0
    and-int/2addr v1, v7

    .line 84
    invoke-virtual {v13, v1, v5}, Lyt2;->V(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_a

    .line 89
    .line 90
    iget-object v0, v0, Lmr4;->y:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 91
    .line 92
    iget-object v1, v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->H:Ld37;

    .line 93
    .line 94
    invoke-static {v1, v13}, Lu55;->f(Lb37;Lyt2;)Laq4;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v5, v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->I:Ld37;

    .line 99
    .line 100
    invoke-static {v5, v13}, Lu55;->f(Lb37;Lyt2;)Laq4;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-interface {v1}, La37;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    invoke-interface {v5}, La37;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v8

    .line 124
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    sget-object v10, Lay0;->a:Ld63;

    .line 133
    .line 134
    if-nez v1, :cond_2

    .line 135
    .line 136
    if-ne v5, v10, :cond_3

    .line 137
    .line 138
    :cond_2
    new-instance v5, Lzh;

    .line 139
    .line 140
    const/16 v1, 0x1b

    .line 141
    .line 142
    invoke-direct {v5, v1, v0}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13, v5}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    check-cast v5, Lsr2;

    .line 149
    .line 150
    invoke-virtual {v13, v4}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    or-int/2addr v1, v11

    .line 159
    invoke-virtual {v13, v3}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    or-int/2addr v1, v11

    .line 164
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    if-nez v1, :cond_4

    .line 169
    .line 170
    if-ne v11, v10, :cond_5

    .line 171
    .line 172
    :cond_4
    new-instance v11, Lmr4;

    .line 173
    .line 174
    invoke-direct {v11, v4, v0, v3}, Lmr4;-><init>(Landroid/view/WindowManager$LayoutParams;Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;Landroid/view/WindowManager;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v11}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    check-cast v11, Lgs2;

    .line 181
    .line 182
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-virtual {v13, v4}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    or-int/2addr v1, v3

    .line 191
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-nez v1, :cond_6

    .line 196
    .line 197
    if-ne v3, v10, :cond_7

    .line 198
    .line 199
    :cond_6
    new-instance v3, Lqm3;

    .line 200
    .line 201
    const/4 v1, 0x4

    .line 202
    invoke-direct {v3, v1, v0, v4}, Lqm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v13, v3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    check-cast v3, Lsr2;

    .line 209
    .line 210
    invoke-virtual {v13, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    if-nez v1, :cond_8

    .line 219
    .line 220
    if-ne v4, v10, :cond_9

    .line 221
    .line 222
    :cond_8
    new-instance v14, Lyd;

    .line 223
    .line 224
    const/16 v21, 0x0

    .line 225
    .line 226
    const/16 v22, 0x15

    .line 227
    .line 228
    const/4 v15, 0x0

    .line 229
    const-class v17, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 230
    .line 231
    const-string v18, "openAppInNauta"

    .line 232
    .line 233
    const-string v19, "openAppInNauta()V"

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    move-object/from16 v16, v0

    .line 238
    .line 239
    invoke-direct/range {v14 .. v22}, Lyd;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13, v14}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    move-object v4, v14

    .line 246
    :cond_9
    check-cast v4, Lzq3;

    .line 247
    .line 248
    move-object v12, v4

    .line 249
    check-cast v12, Lsr2;

    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    move-wide/from16 v23, v8

    .line 253
    .line 254
    move-object v9, v5

    .line 255
    move-wide v5, v6

    .line 256
    move-wide/from16 v7, v23

    .line 257
    .line 258
    move-object v10, v11

    .line 259
    move-object v11, v3

    .line 260
    invoke-static/range {v5 .. v14}, Lrc9;->d(JJLsr2;Lgs2;Lsr2;Lsr2;Lyt2;I)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_a
    invoke-virtual {v13}, Lyt2;->Y()V

    .line 265
    .line 266
    .line 267
    :goto_1
    return-object v2

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
